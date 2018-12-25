package com.media.common.model.stuff;

import com.media.common.base.BaseModel;
import java.util.Date;

public class VideoTicket extends BaseModel {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String pkVideoTicket;

    private String stuffId;

    private String productId;

    private Date lastModifyTime;

    private Integer videoTicket;

    private String memo;

    public String getPkVideoTicket() {
        return pkVideoTicket;
    }

    public void setPkVideoTicket(String pkVideoTicket) {
        this.pkVideoTicket = pkVideoTicket == null ? null : pkVideoTicket.trim();
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId == null ? null : stuffId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getVideoTicket() {
        return videoTicket;
    }

    public void setVideoTicket(Integer videoTicket) {
        this.videoTicket = videoTicket;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}