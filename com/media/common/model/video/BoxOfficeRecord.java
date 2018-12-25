package com.media.common.model.video;

import com.media.common.base.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhaoRong
 *
 */
public class BoxOfficeRecord extends BaseModel {
    private static final long serialVersionUID = 1L;

    private String pkBoxOfficeRecordId;

    private String videoId;

    private String stuffId;

    private BigDecimal ticketPrice;

    private String ticketPriceRuleId;

    private BigDecimal actualPay;

    private Date payTime;

    private String memo;

    public String getPkBoxOfficeRecordId() {
        return pkBoxOfficeRecordId;
    }

    public void setPkBoxOfficeRecordId(String pkBoxOfficeRecordId) {
        this.pkBoxOfficeRecordId = pkBoxOfficeRecordId == null ? null : pkBoxOfficeRecordId.trim();
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

    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(BigDecimal ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getTicketPriceRuleId() {
        return ticketPriceRuleId;
    }

    public void setTicketPriceRuleId(String ticketPriceRuleId) {
        this.ticketPriceRuleId = ticketPriceRuleId == null ? null : ticketPriceRuleId.trim();
    }

    public BigDecimal getActualPay() {
        return actualPay;
    }

    public void setActualPay(BigDecimal actualPay) {
        this.actualPay = actualPay;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}