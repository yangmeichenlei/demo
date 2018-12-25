package com.media.form.stuff;

import java.util.Date;
import java.util.List;

public class StuffVideoCollectForm {
	private String pkCollectId;

    private String videoId;

    private String stuffId;

    private Date collectTime;
    
    private List<String> videoIdList;

	public List<String> getVideoIdList() {
		return videoIdList;
	}
	public void setVideoIdList(List<String> videoIdList) {
		this.videoIdList = videoIdList;
	}
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
