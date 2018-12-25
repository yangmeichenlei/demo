package com.media.common.model.video;

import com.media.common.base.BaseModel;
import com.media.common.hadoop.hbase.HbaseColumn;
import com.media.common.hadoop.hbase.HbaseTable;

import java.util.Date;

/**
 * Created by lihaiqiang on 2018/10/07.
 */
@HbaseTable(tableName="file") 
public class FileDirectory extends BaseModel {

    private static final long serialVersionUID = -6579517363010090152L;

    @HbaseColumn(family="rowkey", qualifier="rowkey")
    private String id;

    @HbaseColumn(family="pkFileDirectory", qualifier="pkFileDirectory")
    private String pkFileDirectory;

    @HbaseColumn(family="pkFileDirectory", qualifier="directoryCode")
    private String directoryCode;

    @HbaseColumn(family="pkFileDirectory", qualifier="directoryName")
    private String directoryName;

    @HbaseColumn(family="pkFileDirectory", qualifier="parentFileDirectory")
    private String parentFileDirectory;

    @HbaseColumn(family="pkFileDirectory", qualifier="directoryPath")
    private String directoryPath;
    
    @HbaseColumn(family="pkFileDirectory", qualifier="isParent")
    private Integer isParent;

    @HbaseColumn(family="pkFileDirectory", qualifier="fileType")
    private Integer fileType;
    
    @HbaseColumn(family="pkFileDirectory", qualifier="directoryLevel")
    private Integer directoryLevel;

    @HbaseColumn(family="pkFileDirectory", qualifier="directoryNo")
    private Integer directoryNo;

    @HbaseColumn(family="pkFileDirectory", qualifier="layerDirectoryCode")
    private String layerDirectoryCode;

    @HbaseColumn(family="pkFileDirectory", qualifier="directoryDesc")
    private String directoryDesc;

    private Integer status;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPkFileDirectory() {
        return pkFileDirectory;
    }

    public void setPkFileDirectory(String pkFileDirectory) {
        this.pkFileDirectory = pkFileDirectory == null ? null : pkFileDirectory.trim();
    }

    public String getDirectoryCode() {
        return directoryCode;
    }

    public void setDirectoryCode(String directoryCode) {
        this.directoryCode = directoryCode == null ? null : directoryCode.trim();
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName == null ? null : directoryName.trim();
    }

    public String getParentFileDirectory() {
        return parentFileDirectory;
    }

    public void setParentFileDirectory(String parentFileDirectory) {
        this.parentFileDirectory = parentFileDirectory == null ? null : parentFileDirectory.trim();
    }

    public Integer getDirectoryLevel() {
        return directoryLevel;
    }

    public void setDirectoryLevel(Integer directoryLevel) {
        this.directoryLevel = directoryLevel;
    }

    public Integer getDirectoryNo() {
        return directoryNo;
    }

    public void setDirectoryNo(Integer directoryNo) {
        this.directoryNo = directoryNo;
    }

    public String getDirectoryPath() {
        return directoryPath;
    }

    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath == null ? null : directoryPath.trim();
    }

    public String getLayerDirectoryCode() {
        return layerDirectoryCode;
    }

    public void setLayerDirectoryCode(String layerDirectoryCode) {
        this.layerDirectoryCode = layerDirectoryCode == null ? null : layerDirectoryCode.trim();
    }

    public String getDirectoryDesc() {
        return directoryDesc;
    }

    public void setDirectoryDesc(String directoryDesc) {
        this.directoryDesc = directoryDesc == null ? null : directoryDesc.trim();
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId == null ? null : lastModifyUserId.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}