package com.media.common.view.video;

import java.util.Date;

import io.swagger.annotations.ApiModel;

/**
 * Created by lihaiqiang on 2018/11/05.
 */
@ApiModel(value = "VideoAttributeOptionView", description = "属性可选项视图")
public class VideoAttributeOptionView {

    private String pkVideoAttributeOptionId;

    private String optionName;

    private String pkAttributeId;

    private String videoAttrName;

    private Integer optionNo;

    private Integer status;

    private String createUserId;

    private String createUserName;

    private Date createTime;

    private String lastModifyUserId;

    private String lastModifyUserName;

    private Date lastModifyTime;

    public String getPkVideoAttributeOptionId() {
        return pkVideoAttributeOptionId;
    }

    public void setPkVideoAttributeOptionId(String pkVideoAttributeOptionId) {
        this.pkVideoAttributeOptionId = pkVideoAttributeOptionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getPkAttributeId() {
        return pkAttributeId;
    }

    public void setPkAttributeId(String pkAttributeId) {
        this.pkAttributeId = pkAttributeId;
    }

    public String getVideoAttrName() {
        return videoAttrName;
    }

    public void setVideoAttrName(String videoAttrName) {
        this.videoAttrName = videoAttrName;
    }

    public Integer getOptionNo() {
        return optionNo;
    }

    public void setOptionNo(Integer optionNo) {
        this.optionNo = optionNo;
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
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
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
        this.lastModifyUserId = lastModifyUserId;
    }

    public String getLastModifyUserName() {
        return lastModifyUserName;
    }

    public void setLastModifyUserName(String lastModifyUserName) {
        this.lastModifyUserName = lastModifyUserName;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    @Override
    public String toString() {
        return "VideoAttributeOptionView{" +
                "pkVideoAttributeOptionId='" + pkVideoAttributeOptionId + '\'' +
                ", optionName='" + optionName + '\'' +
                ", pkAttributeId='" + pkAttributeId + '\'' +
                ", optionNo=" + optionNo +
                ", status=" + status +
                ", createUserId='" + createUserId + '\'' +
                ", createTime=" + createTime +
                ", lastModifyUserId='" + lastModifyUserId + '\'' +
                ", lastModifyTime=" + lastModifyTime +
                '}';
    }
}