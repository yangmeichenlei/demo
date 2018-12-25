package com.media.form.stuff;

import java.math.BigDecimal;

import com.media.common.base.BaseForm;

/**
 * Created by zhaorong on 2018/10/29.
 */
public class StuffScoreRuleDetailForm extends BaseForm{

    private static final long serialVersionUID = 1L;

    private String pkScoreRuleDetailId;

    private String scoreRuleId;

    private Integer dimensionType;

    private Double dimensionBegin;

    private Double dimensionEnd;

    private String unit;

    private Integer scoreState;

    private BigDecimal score;

    private Integer isScoreUpper;

    private Integer scoreUpperValue;

    private String memo;

    public String getPkScoreRuleDetailId() {
        return pkScoreRuleDetailId;
    }

    public void setPkScoreRuleDetailId(String pkScoreRuleDetailId) {
        this.pkScoreRuleDetailId = pkScoreRuleDetailId == null ? null : pkScoreRuleDetailId.trim();
    }

    public String getScoreRuleId() {
        return scoreRuleId;
    }

    public void setScoreRuleId(String scoreRuleId) {
        this.scoreRuleId = scoreRuleId == null ? null : scoreRuleId.trim();
    }

    public Integer getDimensionType() {
        return dimensionType;
    }

    public void setDimensionType(Integer dimensionType) {
        this.dimensionType = dimensionType;
    }

    public Double getDimensionBegin() {
        return dimensionBegin;
    }

    public void setDimensionBegin(Double dimensionBegin) {
        this.dimensionBegin = dimensionBegin;
    }

    public Double getDimensionEnd() {
        return dimensionEnd;
    }

    public void setDimensionEnd(Double dimensionEnd) {
        this.dimensionEnd = dimensionEnd;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getScoreState() {
        return scoreState;
    }

    public void setScoreState(Integer scoreState) {
        this.scoreState = scoreState;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Integer getIsScoreUpper() {
        return isScoreUpper;
    }

    public void setIsScoreUpper(Integer isScoreUpper) {
        this.isScoreUpper = isScoreUpper;
    }

    public Integer getScoreUpperValue() {
        return scoreUpperValue;
    }

    public void setScoreUpperValue(Integer scoreUpperValue) {
        this.scoreUpperValue = scoreUpperValue;
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
                "pkScoreRuleDetailId='" + pkScoreRuleDetailId + '\'' +
                ", scoreRuleName='" + scoreRuleId + '\'' +
                ", dimensionType='" + dimensionType + '\'' +
                ", dimensionBegin='" + dimensionBegin + '\'' +
                ", dimensionEnd='" + dimensionEnd + '\'' +
                ", unit='" + unit + '\'' +
                ", scoreState='" + scoreState + '\'' +
                ", score='" + score + '\'' +
                ", isScoreUpper='" + isScoreUpper + '\'' +
                ", scoreUpperValue='" + scoreUpperValue + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}