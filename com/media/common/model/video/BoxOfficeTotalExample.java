package com.media.common.model.video;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhaoRong
 *
 */
public class BoxOfficeTotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoxOfficeTotalExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPkBoxOfficeTotalIdIsNull() {
            addCriterion("pk_box_office_total_id is null");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeTotalIdIsNotNull() {
            addCriterion("pk_box_office_total_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeTotalIdEqualTo(String value) {
            addCriterion("pk_box_office_total_id =", value, "pkBoxOfficeTotalId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeTotalIdNotEqualTo(String value) {
            addCriterion("pk_box_office_total_id <>", value, "pkBoxOfficeTotalId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeTotalIdGreaterThan(String value) {
            addCriterion("pk_box_office_total_id >", value, "pkBoxOfficeTotalId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeTotalIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_box_office_total_id >=", value, "pkBoxOfficeTotalId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeTotalIdLessThan(String value) {
            addCriterion("pk_box_office_total_id <", value, "pkBoxOfficeTotalId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeTotalIdLessThanOrEqualTo(String value) {
            addCriterion("pk_box_office_total_id <=", value, "pkBoxOfficeTotalId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeTotalIdLike(String value) {
            addCriterion("pk_box_office_total_id like", value, "pkBoxOfficeTotalId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeTotalIdNotLike(String value) {
            addCriterion("pk_box_office_total_id not like", value, "pkBoxOfficeTotalId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeTotalIdIn(List<String> values) {
            addCriterion("pk_box_office_total_id in", values, "pkBoxOfficeTotalId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeTotalIdNotIn(List<String> values) {
            addCriterion("pk_box_office_total_id not in", values, "pkBoxOfficeTotalId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeTotalIdBetween(String value1, String value2) {
            addCriterion("pk_box_office_total_id between", value1, value2, "pkBoxOfficeTotalId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeTotalIdNotBetween(String value1, String value2) {
            addCriterion("pk_box_office_total_id not between", value1, value2, "pkBoxOfficeTotalId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(String value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(String value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(String value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(String value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(String value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(String value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLike(String value) {
            addCriterion("video_id like", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotLike(String value) {
            addCriterion("video_id not like", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<String> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<String> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(String value1, String value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(String value1, String value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeTotalIsNull() {
            addCriterion("box_office_total is null");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeTotalIsNotNull() {
            addCriterion("box_office_total is not null");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeTotalEqualTo(BigDecimal value) {
            addCriterion("box_office_total =", value, "boxOfficeTotal");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeTotalNotEqualTo(BigDecimal value) {
            addCriterion("box_office_total <>", value, "boxOfficeTotal");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeTotalGreaterThan(BigDecimal value) {
            addCriterion("box_office_total >", value, "boxOfficeTotal");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("box_office_total >=", value, "boxOfficeTotal");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeTotalLessThan(BigDecimal value) {
            addCriterion("box_office_total <", value, "boxOfficeTotal");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("box_office_total <=", value, "boxOfficeTotal");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeTotalIn(List<BigDecimal> values) {
            addCriterion("box_office_total in", values, "boxOfficeTotal");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeTotalNotIn(List<BigDecimal> values) {
            addCriterion("box_office_total not in", values, "boxOfficeTotal");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("box_office_total between", value1, value2, "boxOfficeTotal");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("box_office_total not between", value1, value2, "boxOfficeTotal");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}