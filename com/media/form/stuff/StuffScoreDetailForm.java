package com.media.form.stuff;

import java.math.BigDecimal;
import java.util.Date;

import com.media.common.base.BaseForm;

/**
 * Created by zhaorong on 2018/10/29.
 */
public class StuffScoreDetailForm extends BaseForm{

    private static final long serialVersionUID = 1L;

    private String pkScoreDetailId;

    private String stuffId;

    private String stuffName;

    private Integer scoreState;

    private Date scoreTime;

    private String scoreContent;

    private String scoreRuleId;

    private String scoreRuleDetailId;

    private BigDecimal score;

    private BigDecimal sumScore;

    private String memo;

    public String getPkScoreDetailId() {
        return pkScoreDetailId;
    }

    public void setPkScoreDetailId(String pkScoreDetailId) {
        this.pkScoreDetailId = pkScoreDetailId == null ? null : pkScoreDetailId.trim();
    }

    public String getStuffId() {
        return stuffId;
    }

    public void setStuffId(String stuffId) {
        this.stuffId = stuffId == null ? null : stuffId.trim();
    }

    public String getStuffName() {
        return stuffName;
    }

    public void setStuffName(String stuffName) {
        this.stuffName = stuffName == null ? null : stuffName.trim();
    }

    public Integer getScoreState() {
        return scoreState;
    }

    public void setScoreState(Integer scoreState) {
        this.scoreState = scoreState;
    }

    public Date getScoreTime() {
        return scoreTime;
    }

    public void setScoreTime(Date scoreTime) {
        this.scoreTime = scoreTime;
    }

    public String getScoreContent() {
        return scoreContent;
    }

    public void setScoreContent(String scoreContent) {
        this.scoreContent = scoreContent == null ? null : scoreContent.trim();
    }

    public String getScoreRuleId() {
        return scoreRuleId;
    }

    public void setScoreRuleId(String scoreRuleId) {
        this.scoreRuleId = scoreRuleId == null ? null : scoreRuleId.trim();
    }

    public String getScoreRuleDetailId() {
        return scoreRuleDetailId;
    }

    public void setScoreRuleDetailId(String scoreRuleDetailId) {
        this.scoreRuleDetailId = scoreRuleDetailId == null ? null : scoreRuleDetailId.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public BigDecimal getSumScore() {
        return sumScore;
    }

    public void setSumScore(BigDecimal sumScore) {
        this.sumScore = sumScore;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
    @Override
    public String toString() {
        return "StuffScoreRuleForm{" +
                "pkScoreDetailId='" + pkScoreDetailId + '\'' +
                ", stuffId='" + stuffId + '\'' +
                ", stuffName='" + stuffName + '\'' +
                ", scoreState='" + scoreState + '\'' +
                ", scoreTime'" + scoreTime + '\'' +
                ", scoreContent='" + scoreContent + '\'' +
                ", scoreRuleId='" + scoreRuleId + '\'' +
                ", scoreRuleDetailId='" + scoreRuleDetailId + '\'' +
                ", score='" + score + '\'' +
                ", sumScore='" + sumScore + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}