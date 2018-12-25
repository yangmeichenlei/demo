package com.media.common.view.filedirectory;

import com.media.common.hadoop.hbase.HbaseColumn;
import com.media.common.hadoop.hbase.HbaseTable;

/**
 * Created by lihaiqiang on 2018/08/14.
 */
@HbaseTable(tableName="file") 
public class FileDirectoryTreeView {
    @HbaseColumn(family="rowkey", qualifier="rowkey")
    private String id;
    
    @HbaseColumn(family="pkFileDirectory", qualifier="directoryName")
    private String name;
    
    @HbaseColumn(family="pkFileDirectory", qualifier="directoryPath")
    private String path;
    
    @HbaseColumn(family="pkFileDirectory", qualifier="isParent")
    private boolean isParent;
    
    @HbaseColumn(family="pkFileDirectory", qualifier="parentFileDirectory")
    private String pId;
    
    @HbaseColumn(family="pkFileDirectory", qualifier="fileType")
    private Integer fileType;
    
    @HbaseColumn(family="pkFileDirectory", qualifier="directoryCode")
    private String directoryCode;
    
    @HbaseColumn(family="pkFileDirectory", qualifier="directoryNo")
    private Integer directoryNo;
    
    @HbaseColumn(family="pkFileDirectory", qualifier="layerDirectoryCode")
    private String layerDirectoryCode;
    
    @HbaseColumn(family="pkFileDirectory", qualifier="directoryDesc")
    private String directoryDesc;
    private boolean open;
    
    private boolean zAsync;
    
    private boolean isSelected;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(boolean parent) {
        isParent = parent;
    }

    public String getPId() {
        return pId;
    }

    public void setPId(String pId) {
        this.pId = pId;
    }

    public String getDirectoryCode() {
        return directoryCode;
    }

    public void setDirectoryCode(String directoryCode) {
        this.directoryCode = directoryCode;
    }

    public Integer getDirectoryNo() {
        return directoryNo;
    }

    public void setDirectoryNo(Integer directoryNo) {
        this.directoryNo = directoryNo;
    }

    public String getDirectoryDesc() {
        return directoryDesc;
    }

    public void setDirectoryDesc(String directoryDesc) {
        this.directoryDesc = directoryDesc;
    }

    public String getLayerDirectoryCode() {
        return layerDirectoryCode;
    }

    public void setLayerDirectoryCode(String layerDirectoryCode) {
        this.layerDirectoryCode = layerDirectoryCode;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean iszAsync() {
        return zAsync;
    }

    public void setzAsync(boolean zAsync) {
        this.zAsync = zAsync;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }
}
