package com.media.common.hadoop.hdfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.List;

import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileUtil;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DistributedFileSystem;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;

import com.media.common.config.HadoopConfiguration;
import com.media.common.constant.Constant;
import com.media.common.utils.DateUtils;

public class FileSystemUtils {
    
    /**
     * check file is exist
     * @param filename
     * @return
     */
    public static boolean checkFileExist(String filename){
        try {
            Path file = new Path(filename);
            return HdfsUtils.getFileSystem().exists(file);
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    /**
     * make file from HDFS
     * @throws Exception
     */
    public static boolean mkDir(String dirName){
        if (checkFileExist(dirName))
            return true;
        try {
            Path file = new Path(dirName);
            return HdfsUtils.getFileSystem().mkdirs(file);
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    /**
     * creat a null file
     * @param filePath
     * @return
     * @throws Exception 
     */
    public boolean mkFile(String filePath) throws Exception
    {
        try {
            Path file = new Path(filePath);
            FSDataOutputStream os = HdfsUtils.getFileSystem().create(file, true);
            os.close();
            return true;
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    /**
     * copy file to despath
     * @param srcfile  copyed filepath
     * @param desfile  des filepath
     * @return
     */
    public static boolean hdfsCopyUtils(String srcfile, String desfile) {
        Path src = new Path(srcfile);
        Path dst = new Path(desfile);
        try {
            FileUtil.copy(src.getFileSystem(HadoopConfiguration.getConf()), src,
                    dst.getFileSystem(HadoopConfiguration.getConf()), dst, false, HadoopConfiguration.getConf());
        } catch (IOException e) {
            return false;
        }
        return true;
    }
    
    /**
     * move file
     * @param src
     * @param dst
     * @throws Exception
     */
    public static void moveFile(String srcPath, String dstPath) throws Exception{
    
        Path p1 = new Path(srcPath);
        Path p2 = new Path(dstPath);
        HdfsUtils.getFileSystem().rename(p1, p2);
    }
    
    /**
     * del file
     * @param src
     * @throws Exception
     */
    public static void deleteFile(String srcPath) throws Exception{
    
        Path path = new Path(srcPath);
        if (HdfsUtils.getFileSystem().isDirectory(path)){
            HdfsUtils.getFileSystem().delete(path, true);
        }
        else if (HdfsUtils.getFileSystem().isFile(path)) {
            HdfsUtils.getFileSystem().delete(path, false);
        }
    }
    
    /**
     * read localfile to hdfs, filetype:utf-8
     * @param localFilename
     * @param hdfsPath
     * @return
     */
    public static boolean copyLocalFileToHDFS(String localFilename, String hdfsPath) {
        try{// 如果路径不存在就创建文件夹
            mkDir(hdfsPath);
            File file = new File(localFilename);
            FileInputStream is = new FileInputStream(file);
            // 如果hdfs上已经存在文件，那么先删除该文件
            if (FileSystemUtils.checkFileExist(hdfsPath + "/" + file.getName())) {
                deleteFile(hdfsPath + "/" + file.getName());
            }
            Path f = new Path(hdfsPath + "/" + file.getName());
            FSDataOutputStream os = HdfsUtils.getFileSystem().create(f, true);
            byte[] buffer = new byte[Constant.DEFAULT_LENGTH];
            int nCount = 0;
            while (true){
                int bytesRead = is.read(buffer);
                if (bytesRead <= 0)
                    break;
                os.write(buffer, 0, bytesRead);
                nCount++;
                if (nCount % (100) == 0)
                    System.out.println(DateUtils.format(new Date()) + ": Have move " + nCount + " blocks");
            }
            is.close();
            os.close();
            System.out.println(DateUtils.format(new Date()) + ": Write content of file " + file.getName()
                    + " to hdfs file " + f.getName() + " success");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean copyLocalFileToHDFS(File file, String hdfsPath) {
        try{// 如果路径不存在就创建文件夹
            mkDir(hdfsPath);
            FileInputStream is = new FileInputStream(file);
            // 如果hdfs上已经存在文件，那么先删除该文件
            if (FileSystemUtils.checkFileExist(hdfsPath + "/" + file.getName())) {
                deleteFile(hdfsPath + "/" + file.getName());
            }
            Path f = new Path(hdfsPath + "/" + file.getName());
            FSDataOutputStream os = HdfsUtils.getFileSystem().create(f, true);
            byte[] buffer = new byte[Constant.DEFAULT_LENGTH];
            int nCount = 0;
            while (true){
                int bytesRead = is.read(buffer);
                if (bytesRead <= 0)
                    break;
                os.write(buffer, 0, bytesRead);
                nCount++;
                if (nCount % (100) == 0)
                    System.out.println(DateUtils.format(new Date()) + ": Have move " + nCount + " blocks");
            }
            is.close();
            os.close();
            System.out.println(DateUtils.format(new Date()) + ": Write content of file " + file.getName()
                    + " to hdfs file " + f.getName() + " success");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    /**
     * read localDir to hdfs
     * @param localPath
     * @param hdfsPath
     * @return
     */
    public static boolean copyLocalDirTohdfs(String localPath, String hdfsPath) {
        try{
            File root = new File(localPath);
            File[] files = root.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    copyLocalFileToHDFS(file.getPath().toString(), hdfsPath);
                }
                else if(file.isDirectory()) {
                	copyLocalDirTohdfs(localPath+"/"+file.getName(), hdfsPath+"/"+file.getName());
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 从hdfs下载
     * @param hdfsFilename
     * @param localPath
     * @return
     */
    public static boolean downloadFileFromHdfs(String hdfsFilename, String localPath) {
        try{
            Path path = new Path(hdfsFilename);
            FSDataInputStream dis = HdfsUtils.getFileSystem().open(path);
            File file = new File(localPath + "/" + path.getName());
            FileOutputStream os = new FileOutputStream(file);

            byte[] buffer = new byte[Constant.DEFAULT_LENGTH];
            int length = 0;
            while ((length = dis.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            os.close();
            dis.close();
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * HDFS 到 HDFS 的合并 hdfs提供了一种FileUtil.copyMerge（）的方法， 注意下面的 false
     * 这个，如果改为true，就会删除这个目录
     * 
     * @param folder 需要合并的目录
     * @param file 要合并成的文件，完整路径名称
     */
    public static void copyMerge(String folder, String file) {
        Path src = new Path(folder);
        Path dst = new Path(file);
        try {
            FileUtil.copyMerge(src.getFileSystem(HadoopConfiguration.getConf()), src,
                    dst.getFileSystem(HadoopConfiguration.getConf()), dst, false, HadoopConfiguration.getConf(), null);//果改为true，就会删除这个目录
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 列出所有DataNode的名字信息
     */
    public static void listDataNodeInfo() {
        try {
            DistributedFileSystem fs = (DistributedFileSystem) HdfsUtils.getFileSystem();
            DatanodeInfo[] dataNodeStats = fs.getDataNodeStats();
            String[] names = new String[dataNodeStats.length];
            //System.out.println("List of all the datanode in the HDFS cluster:");
            for (int i = 0; i < names.length; i++){
                names[i] = dataNodeStats[i].getHostName();
                //System.out.println(names[i]);
            }
            //System.out.println(hdfs.getUri().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *  check is a sparenode or not
     * @throws Exception
     */
    public static boolean checkStandbyException(String filename) {
        try {
            Path file = new Path(filename);
            HdfsUtils.getFileSystem().exists(file);
        } catch (org.apache.hadoop.ipc.RemoteException e) {
            if(e.getClassName().equals(Constant.HADOOP_OPC_STANDBYEXCEPTION)) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean mergeDirFiles(List<FileStatus> fileList, String tarPath, String rowTerminateFlag) {
        FSDataOutputStream tarFileOutputStream = null;
        FSDataInputStream srcFileInputStream = null;
        try{
            Path tarFile = new Path(tarPath);
            tarFileOutputStream = HdfsUtils.getFileSystem().create(tarFile, true);

            byte[] buffer = new byte[Constant.DEFAULT_LENGTH];
            int length = 0;
            long nTotalLength = 0;
            int nCount = 0;
            boolean bfirst = true;
            for(FileStatus file : fileList) {
                if(file.getPath().equals(tarFile))
                    continue;
                //System.out.println(" merging file from  " + file.getPath() + " to " + tarPath);
                if(!bfirst) {
                    //添加换行符
                    tarFileOutputStream.write(rowTerminateFlag.getBytes(), 0, rowTerminateFlag.length());
                }
                srcFileInputStream = HdfsUtils.getFileSystem().open(file.getPath(), buffer.length);
                while ((length = srcFileInputStream.read(buffer)) > 0) {
                    nCount++;
                    tarFileOutputStream.write(buffer, 0, length);
                    nTotalLength += length;
                    //System.out.println(" file length " + file.getLen() + " read " + length);
                    if (nCount % 1000 == 0) {
                        tarFileOutputStream.flush();
                        System.out.println(DateUtils.format(new Date()) + ": Have move " + (nTotalLength / 1024000) + " MB");
                    }
                }
                srcFileInputStream.close();
                bfirst = false;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            try {
                deleteFile(tarPath);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return false;
        } finally {
            try {
                if(tarFileOutputStream != null) {
                    tarFileOutputStream.flush();
                    tarFileOutputStream.close();
                    srcFileInputStream.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }

    /**
     * 将一个字符串写入某个路径
     *
     * @param text 要保存的字符串
     * @param path 要保存的路径
     */
    public static void writerString(String text,String path){
        try {
            Path newPath = new Path(path);
            FSDataOutputStream os = HdfsUtils.getFileSystem().create(newPath, true);//fs
            BufferedWriter  writer = new BufferedWriter(new OutputStreamWriter(os, "utf-8"));// 以UTF-8格式写入文件，不乱码
            writer.write(text);
            writer.close();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 按行读取文件内容，并且防止乱码
     * @param hdfsFilename
     * @return
     */
    public static boolean readByLine(String hdfsFilename) {
        try {
            Path file = new Path(hdfsFilename);
            FSDataInputStream dis = HdfsUtils.getFileSystem().open(file);
            BufferedReader bf=new BufferedReader(new InputStreamReader(dis));//防止中文乱码
            String line = null;
            while ((line=bf.readLine())!=null) {
                System.out.println(new String(line.getBytes(),"utf-8"));
            }
            dis.close();
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void reNameExistsPath(String srcPath, String tarPath) throws Exception {
        //检测输出目录是否存在，存在就改名
        if(checkFileExist(srcPath)) {
            moveFile(srcPath, tarPath);
        } else {
            tarPath = srcPath;
        }
    }
}
