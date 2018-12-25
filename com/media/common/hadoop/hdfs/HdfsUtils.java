package com.media.common.hadoop.hdfs;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;

import org.apache.hadoop.fs.CommonConfigurationKeysPublic;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocalFileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import com.media.common.config.HadoopConfiguration;

/**
 * Created by lihaiqiang on 2018/08/24.
 */

public class HdfsUtils {
    
    public static LocalFileSystem getLocalFileSystem() throws Exception {
        LocalFileSystem fileSystem = FileSystem.getLocal(HadoopConfiguration.getConf());
        return fileSystem;
    }

    public static FileSystem getFileSystem() throws Exception {
        FileSystem fileSystem = FileSystem.get(HadoopConfiguration.getConf());
        return fileSystem;
    }

    public static FileSystem getFileSystemUser(String user) throws Exception {
        FileSystem fileSystem = FileSystem.get(
                new URI("hdfs://server-603:8020"),
                HadoopConfiguration.getConf(), user);
        return fileSystem;
    }
    

    
    /**
     * read from HDFS path
     * @throws Exception
     */
    public static void read(String fileUri) throws Exception {
        FSDataInputStream inStream = getFileSystem().open(new Path(fileUri));
        try {
            IOUtils.copyBytes(inStream, System.out, CommonConfigurationKeysPublic.IO_FILE_BUFFER_SIZE_DEFAULT, false);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeStream(inStream);
        }
    }
    
    /**
     * read from LocalFileSystem path
     * @throws Exception
     */
    public static void readFromLocal(String fileUri) throws Exception {
        FSDataInputStream inStream = getFileSystem().open(new Path(fileUri));
        try {
            IOUtils.copyBytes(inStream, System.out, CommonConfigurationKeysPublic.IO_FILE_BUFFER_SIZE_DEFAULT, false);
        } catch (Exception e) {
        } finally {
            IOUtils.closeStream(inStream);
        }
    }
    
    /**
     * write to HDFS
     * @throws Exception
     */
    public static void write(String remoteUri,String localUri) throws Exception {
        FSDataOutputStream outStream = getFileSystem().create(new Path(remoteUri));
        FileInputStream instream = new FileInputStream(new File(localUri));
        try {
            IOUtils.copyBytes(instream, outStream, CommonConfigurationKeysPublic.IO_FILE_BUFFER_SIZE_DEFAULT, false);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeStream(instream);
            IOUtils.closeStream(outStream);
        }
    }
    
    /**
     * write to HDFS from LocalFileSystem
     * @throws Exception
     */
    public static void write2Remote(String remoteUri,String localUri) throws Exception {
        FSDataOutputStream outStream = getFileSystem().create(new Path(remoteUri));
        InputStream instream = getLocalFileSystem().open(new Path(localUri));
        try {
            IOUtils.copyBytes(instream, outStream, CommonConfigurationKeysPublic.IO_FILE_BUFFER_SIZE_DEFAULT, false);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeStream(instream);
            IOUtils.closeStream(outStream);
        }
    }
    

}
