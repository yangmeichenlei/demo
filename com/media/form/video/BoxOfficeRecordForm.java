package com.media.form.video;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

import io.swagger.annotations.ApiModel;

/**
 * @author zhaoRong
 *
 */
@ApiModel(value = "BoxOfficeRecordForm", description = "票房记录form")
public class BoxOfficeRecordForm extends BaseForm {

    private static final long serialVersionUID = 1L;
    private String pkBoxOfficeRecordId;

    private String videoId;

    private String stuffId;

    private BigDecimal ticketPrice;

    private String ticketPriceRuleId;

    private BigDecimal actualPay;

    private Date payTime;

    private String memo;

    private String stuffName;

    private String videoName;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;

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

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId;
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

    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "BoxOfficeRecordForm [pkBoxOfficeRecordId=" + pkBoxOfficeRecordId + ", videoId=" + videoId + ", stuffId="
                + stuffId + ", ticketPrice=" + ticketPrice + ", ticketPriceRuleId=" + ticketPriceRuleId + ", actualPay="
                + actualPay + ", payTime=" + payTime + ", memo=" + memo + ", stuffName=" + stuffName + ", videoName="
                + videoName + ", startTime=" + startTime + ", endTime=" + endTime + "]";
    }

}
