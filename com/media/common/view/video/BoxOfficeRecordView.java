package com.media.common.view.video;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "BoxOfficeRecordView", description = "详细票房记录视图")
public class BoxOfficeRecordView {

    private String pkBoxOfficeRecordId;

    private String videoId;

    private String videoName;

    private String stuffId;

    private String stuffName;

    private BigDecimal ticketPrice;

    private String ticketPriceRuleId;

    private BigDecimal actualPay;

    private Date payTime;

    private String memo;

    public String getPkBoxOfficeRecordId() {
        return pkBoxOfficeRecordId;
    }

    public void setPkBoxOfficeRecordId(String pkBoxOfficeRecordId) {
        this.pkBoxOfficeRecordId = pkBoxOfficeRecordId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId;
    }

    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName;
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
        this.ticketPriceRuleId = ticketPriceRuleId;
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
        this.memo = memo;
    }

}
