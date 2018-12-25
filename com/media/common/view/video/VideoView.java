package com.media.common.view.video;

import java.util.Date;
import java.util.List;

import com.media.common.model.user.User;
import com.media.common.model.video.FileDirectory;
import com.media.common.model.video.VideoClass;
import com.media.common.model.video.VideoTag;

import io.swagger.annotations.ApiModel;

/**
 * Created by lihaiqiang on 2018/11/01.
 */
@ApiModel(value = "VideoView", description = "视频视图")
public class VideoView {

    private String pkVideoId;

    private String pkFileDirectoryId;

    private String pkVideoClassId;
    
    private String gradeAverageValue;

    private String createUserId;

    private String lastModifyUserId;

    private String auditUserId;

    private Integer videoType;

    private String videoNameCh;

    private String videoNameEn;
    
    private String videoDescrible;

    private String videoCode;
    
    private String videoImgPath;
    
    private String videoPath;

    private Integer status;

    private User createUser;

    private Date createTime;

    private User modifyUser;

    private Date auditTime;

    private User auditUser;

    private Date lastModifyTime;

    private String auditOpinion;

    private String memo;

    private FileDirectory fileDirectory;

    private VideoClass videoClass;

    private List<VideoAttributeRefView> videoAttributeList;
    
    private List<VideoClass> videoClassList;
    
    private List<VideoTag> videoTagList;
    
    public String getVideoDescrible() {
		return videoDescrible;
	}

	public void setVideoDescrible(String videoDescrible) {
		this.videoDescrible = videoDescrible;
	}

	public String getVideoImgPath() {
        return videoImgPath;
    }

    public void setVideoImgPath(String videoImgPath) {
        this.videoImgPath = videoImgPath;
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

    public String getGradeAverageValue() {
        return gradeAverageValue;
    }

    public void setGradeAverageValue(String gradeAverageValue) {
        this.gradeAverageValue = gradeAverageValue;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public String getAuditUserId() {
        return auditUserId;
    }

    public void setAuditUserId(String auditUserId) {
        this.auditUserId = auditUserId;
    }

    public FileDirectory getFileDirectory() {
        return fileDirectory;
    }

    public void setFileDirectory(FileDirectory fileDirectory) {
        this.fileDirectory = fileDirectory;
    }


    public VideoClass getVideoClass() {
        return videoClass;
    }

    public void setVideoClass(VideoClass videoClass) {
        this.videoClass = videoClass;
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

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public User getCreateUser() {
        return createUser;
    }

    public void setCreateUser(User createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(User modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public User getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(User auditUser) {
        this.auditUser = auditUser;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public List<VideoAttributeRefView> getVideoAttributeList() {
        return videoAttributeList;
    }

    public void setVideoAttributeList(List<VideoAttributeRefView> videoAttributeList) {
        this.videoAttributeList = videoAttributeList;
    }

    public List<VideoClass> getVideoClassList() {
        return videoClassList;
    }

    public void setVideoClassList(List<VideoClass> videoClassList) {
        this.videoClassList = videoClassList;
    }

	public List<VideoTag> getVideoTagList() {
		return videoTagList;
	}

	public void setVideoTagList(List<VideoTag> videoTagList) {
		this.videoTagList = videoTagList;
	}

	@Override
	public String toString() {
		return "VideoView [pkVideoId=" + pkVideoId + ", pkFileDirectoryId=" + pkFileDirectoryId + ", pkVideoClassId="
				+ pkVideoClassId + ", gradeAverageValue=" + gradeAverageValue + ", createUserId=" + createUserId
				+ ", lastModifyUserId=" + lastModifyUserId + ", auditUserId=" + auditUserId + ", videoType=" + videoType
				+ ", videoNameCh=" + videoNameCh + ", videoNameEn=" + videoNameEn + ", videoDescrible=" + videoDescrible
				+ ", videoCode=" + videoCode + ", videoImgPath=" + videoImgPath + ", videoPath=" + videoPath
				+ ", status=" + status + ", createUser=" + createUser + ", createTime=" + createTime + ", modifyUser="
				+ modifyUser + ", auditTime=" + auditTime + ", auditUser=" + auditUser + ", lastModifyTime="
				+ lastModifyTime + ", auditOpinion=" + auditOpinion + ", memo=" + memo + ", fileDirectory="
				+ fileDirectory + ", videoClass=" + videoClass + ", videoAttributeList=" + videoAttributeList
				+ ", videoClassList=" + videoClassList + "]";
	}


}
