package com.media.common.model.stuff;

import com.media.common.base.BaseModel;
import java.util.Date;

public class StuffVideoCollect extends BaseModel {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String pkCollectId;

    private String videoId;

    private String stuffId;

    private Date collectTime;

    public String getPkCollectId() {
        return pkCollectId;
    }
    public void setPkCollectId(String pkCollectId) {
        this.pkCollectId = pkCollectId == null ? null : pkCollectId.trim();
    }
    public String getVideoId() {
        return videoId;
    }
    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId == null ? null : stuffId.trim();
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }
}