package com.media.common.model.video;

import java.util.List;

import com.media.common.base.BaseModel;

import sun.tools.java.ScannerInputReader;
/**
 * Created by lihaiqiang on 2018/11/12.
 */
public class VideoAttributeValueRef extends BaseModel {

    private static final long serialVersionUID = -6200003944357875306L;

    private String pkVideoAttributeRefId;
    
    private String pkVideoAttributeOptionId;

    private String pkVideoAttributeId;
    private String pkVideoId;

    private String pkVideoAttributeValue;
    
    private VideoAttributeValue videoAttributeValue;

    public String getPkVideoId() {
		return pkVideoId;
	}

	public void setPkVideoId(String pkVideoId) {
		this.pkVideoId = pkVideoId;
	}

	public String getPkVideoAttributeRefId() {
        return pkVideoAttributeRefId;
    }

    public void setPkVideoAttributeRefId(String pkVideoAttributeRefId) {
        this.pkVideoAttributeRefId = pkVideoAttributeRefId == null ? null : pkVideoAttributeRefId.trim();
    }

    public String getPkVideoAttributeOptionId() {
        return pkVideoAttributeOptionId;
    }

    public void setPkVideoAttributeOptionId(String pkVideoAttributeOptionId) {
        this.pkVideoAttributeOptionId = pkVideoAttributeOptionId;
    }

    public String getPkVideoAttributeId() {
        return pkVideoAttributeId;
    }

    public void setPkVideoAttributeId(String pkVideoAttributeId) {
        this.pkVideoAttributeId = pkVideoAttributeId == null ? null : pkVideoAttributeId.trim();
    }

    public String getPkVideoAttributeValue() {
        return pkVideoAttributeValue;
    }

    public void setPkVideoAttributeValue(String pkVideoAttributeValue) {
        this.pkVideoAttributeValue = pkVideoAttributeValue == null ? null : pkVideoAttributeValue.trim();
    }

    public VideoAttributeValue getVideoAttributeValue() {
        return videoAttributeValue;
    }

    public void setVideoAttributeValue(VideoAttributeValue videoAttributeValue) {
        this.videoAttributeValue = videoAttributeValue;
    }

}