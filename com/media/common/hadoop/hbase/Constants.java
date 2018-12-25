package com.media.common.hadoop.hbase;

public class Constants {
    public static final String currentUserSessionKey="currentUser";
    public static final String[] sufix = {"csv","txt","doc","docx","xls","xlsx","ppt","pptx"};
    
    public static final String TABLE_FILE = "file";
    public static final String TABLE_FILE_KEY = "pkFileDirectory";
    public static final String TABLE_FILE_NAME = "directoryName";
    public static final String FILE_TYPE = "fileType";
    public static final String[] COLUMN_FILE_ORIGINALNAMEANDETC = { "originalName", "name", "isFile", "isDir", "length", "path", "originalPath", "viewflag", "date" };
    
    
}