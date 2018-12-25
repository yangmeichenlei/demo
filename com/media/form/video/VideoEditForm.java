package com.media.form.video;

import io.swagger.annotations.ApiModel;

import java.util.List;
/**
 * Created by lihaiqiang on 2018/11/06.
 */
@ApiModel(value = "VideoEditForm", description = "视频编辑form")
public class VideoEditForm {

    private Integer editResult;//编辑结果

    private String pkVideoId;

    private String pkFileDirectoryId;

    private String pkVideoClassId;
    
    private String pkVideoClassIdList;

    private Integer videoType;

    private String videoNameCh;

    private String videoNameEn;
    
    private String videoDescrible;

    private String videoCode;

    private List<VideoAttributeEditForm> videoAttributeEditFormList;


	public String getPkVideoClassIdList() {
		return pkVideoClassIdList;
	}

	public void setPkVideoClassIdList(String pkVideoClassIdList) {
		this.pkVideoClassIdList = pkVideoClassIdList;
	}

	public String getVideoDescrible() {
		return videoDescrible;
	}

	public void setVideoDescrible(String videoDescrible) {
		this.videoDescrible = videoDescrible;
	}

	public Integer getEditResult() {
        return editResult;
    }

    public void setEditResult(Integer editResult) {
        this.editResult = editResult;
    }

    public String getPkVideoId() {
        return pkVideoId;
    }

    public void setPkVideoId(String pkVideoId) {
        this.pkVideoId = pkVideoId;
    }

    public String getPkFileDirectoryId() {
        return pkFileDirectoryId;
    }

    public void setPkFileDirectoryId(String pkFileDirectoryId) {
        this.pkFileDirectoryId = pkFileDirectoryId;
    }

    public String getPkVideoClassId() {
        return pkVideoClassId;
    }

    public void setPkVideoClassId(String pkVideoClassId) {
        this.pkVideoClassId = pkVideoClassId;
    }

    public Integer getVideoType() {
        return videoType;
    }

    public void setVideoType(Integer videoType) {
        this.videoType = videoType;
    }

    public String getVideoNameCh() {
        return videoNameCh;
    }

    public void setVideoNameCh(String videoNameCh) {
        this.videoNameCh = videoNameCh;
    }

    public String getVideoNameEn() {
        return videoNameEn;
    }

    public void setVideoNameEn(String videoNameEn) {
        this.videoNameEn = videoNameEn;
    }

    public String getVideoCode() {
        return videoCode;
    }

    public void setVideoCode(String videoCode) {
        this.videoCode = videoCode;
    }

    public List<VideoAttributeEditForm> getVideoAttributeEditFormList() {
        return videoAttributeEditFormList;
    }

    public void setVideoAttributeEditFormList(List<VideoAttributeEditForm> videoAttributeEditFormList) {
        this.videoAttributeEditFormList = videoAttributeEditFormList;
    }

	@Override
	public String toString() {
		return "VideoEditForm [editResult=" + editResult + ", pkVideoId=" + pkVideoId + ", pkFileDirectoryId="
				+ pkFileDirectoryId + ", pkVideoClassId=" + pkVideoClassId + ", pkVideoClassIdList="
				+ pkVideoClassIdList + ", videoType=" + videoType + ", videoNameCh=" + videoNameCh + ", videoNameEn="
				+ videoNameEn + ", videoDescrible=" + videoDescrible + ", videoCode=" + videoCode
				+ ", videoAttributeEditFormList=" + videoAttributeEditFormList + "]";
	}
    
}