package com.media.common.model.stuff;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhaoRong
 *
 */
public class StuffWatchVideoRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuffWatchVideoRecordExample() {
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

        public Criteria andPkWatchVideoRecordIdIsNull() {
            addCriterion("pk_watch_video_record_id is null");
            return (Criteria) this;
        }

        public Criteria andPkWatchVideoRecordIdIsNotNull() {
            addCriterion("pk_watch_video_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkWatchVideoRecordIdEqualTo(String value) {
            addCriterion("pk_watch_video_record_id =", value, "pkWatchVideoRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchVideoRecordIdNotEqualTo(String value) {
            addCriterion("pk_watch_video_record_id <>", value, "pkWatchVideoRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchVideoRecordIdGreaterThan(String value) {
            addCriterion("pk_watch_video_record_id >", value, "pkWatchVideoRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchVideoRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_watch_video_record_id >=", value, "pkWatchVideoRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchVideoRecordIdLessThan(String value) {
            addCriterion("pk_watch_video_record_id <", value, "pkWatchVideoRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchVideoRecordIdLessThanOrEqualTo(String value) {
            addCriterion("pk_watch_video_record_id <=", value, "pkWatchVideoRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchVideoRecordIdLike(String value) {
            addCriterion("pk_watch_video_record_id like", value, "pkWatchVideoRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchVideoRecordIdNotLike(String value) {
            addCriterion("pk_watch_video_record_id not like", value, "pkWatchVideoRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchVideoRecordIdIn(List<String> values) {
            addCriterion("pk_watch_video_record_id in", values, "pkWatchVideoRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchVideoRecordIdNotIn(List<String> values) {
            addCriterion("pk_watch_video_record_id not in", values, "pkWatchVideoRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchVideoRecordIdBetween(String value1, String value2) {
            addCriterion("pk_watch_video_record_id between", value1, value2, "pkWatchVideoRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchVideoRecordIdNotBetween(String value1, String value2) {
            addCriterion("pk_watch_video_record_id not between", value1, value2, "pkWatchVideoRecordId");
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

        public Criteria andStuffIdIsNull() {
            addCriterion("stuff_id is null");
            return (Criteria) this;
        }

        public Criteria andStuffIdIsNotNull() {
            addCriterion("stuff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuffIdEqualTo(String value) {
            addCriterion("stuff_id =", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdNotEqualTo(String value) {
            addCriterion("stuff_id <>", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdGreaterThan(String value) {
            addCriterion("stuff_id >", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdGreaterThanOrEqualTo(String value) {
            addCriterion("stuff_id >=", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdLessThan(String value) {
            addCriterion("stuff_id <", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdLessThanOrEqualTo(String value) {
            addCriterion("stuff_id <=", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdLike(String value) {
            addCriterion("stuff_id like", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdNotLike(String value) {
            addCriterion("stuff_id not like", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdIn(List<String> values) {
            addCriterion("stuff_id in", values, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdNotIn(List<String> values) {
            addCriterion("stuff_id not in", values, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdBetween(String value1, String value2) {
            addCriterion("stuff_id between", value1, value2, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdNotBetween(String value1, String value2) {
            addCriterion("stuff_id not between", value1, value2, "stuffId");
            return (Criteria) this;
        }

        public Criteria andWatchEndTimeIsNull() {
            addCriterion("watch_end_time is null");
            return (Criteria) this;
        }

        public Criteria andWatchEndTimeIsNotNull() {
            addCriterion("watch_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andWatchEndTimeEqualTo(Date value) {
            addCriterion("watch_end_time =", value, "watchEndTime");
            return (Criteria) this;
        }

        public Criteria andWatchEndTimeNotEqualTo(Date value) {
            addCriterion("watch_end_time <>", value, "watchEndTime");
            return (Criteria) this;
        }

        public Criteria andWatchEndTimeGreaterThan(Date value) {
            addCriterion("watch_end_time >", value, "watchEndTime");
            return (Criteria) this;
        }

        public Criteria andWatchEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("watch_end_time >=", value, "watchEndTime");
            return (Criteria) this;
        }

        public Criteria andWatchEndTimeLessThan(Date value) {
            addCriterion("watch_end_time <", value, "watchEndTime");
            return (Criteria) this;
        }

        public Criteria andWatchEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("watch_end_time <=", value, "watchEndTime");
            return (Criteria) this;
        }

        public Criteria andWatchEndTimeIn(List<Date> values) {
            addCriterion("watch_end_time in", values, "watchEndTime");
            return (Criteria) this;
        }

        public Criteria andWatchEndTimeNotIn(List<Date> values) {
            addCriterion("watch_end_time not in", values, "watchEndTime");
            return (Criteria) this;
        }

        public Criteria andWatchEndTimeBetween(Date value1, Date value2) {
            addCriterion("watch_end_time between", value1, value2, "watchEndTime");
            return (Criteria) this;
        }

        public Criteria andWatchEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("watch_end_time not between", value1, value2, "watchEndTime");
            return (Criteria) this;
        }

        public Criteria andWatchDurationIsNull() {
            addCriterion("watch_duration is null");
            return (Criteria) this;
        }

        public Criteria andWatchDurationIsNotNull() {
            addCriterion("watch_duration is not null");
            return (Criteria) this;
        }

        public Criteria andWatchDurationEqualTo(String value) {
            addCriterion("watch_duration =", value, "watchDuration");
            return (Criteria) this;
        }

        public Criteria andWatchDurationNotEqualTo(String value) {
            addCriterion("watch_duration <>", value, "watchDuration");
            return (Criteria) this;
        }

        public Criteria andWatchDurationGreaterThan(String value) {
            addCriterion("watch_duration >", value, "watchDuration");
            return (Criteria) this;
        }

        public Criteria andWatchDurationGreaterThanOrEqualTo(String value) {
            addCriterion("watch_duration >=", value, "watchDuration");
            return (Criteria) this;
        }

        public Criteria andWatchDurationLessThan(String value) {
            addCriterion("watch_duration <", value, "watchDuration");
            return (Criteria) this;
        }

        public Criteria andWatchDurationLessThanOrEqualTo(String value) {
            addCriterion("watch_duration <=", value, "watchDuration");
            return (Criteria) this;
        }

        public Criteria andWatchDurationLike(String value) {
            addCriterion("watch_duration like", value, "watchDuration");
            return (Criteria) this;
        }

        public Criteria andWatchDurationNotLike(String value) {
            addCriterion("watch_duration not like", value, "watchDuration");
            return (Criteria) this;
        }

        public Criteria andWatchDurationIn(List<String> values) {
            addCriterion("watch_duration in", values, "watchDuration");
            return (Criteria) this;
        }

        public Criteria andWatchDurationNotIn(List<String> values) {
            addCriterion("watch_duration not in", values, "watchDuration");
            return (Criteria) this;
        }

        public Criteria andWatchDurationBetween(String value1, String value2) {
            addCriterion("watch_duration between", value1, value2, "watchDuration");
            return (Criteria) this;
        }

        public Criteria andWatchDurationNotBetween(String value1, String value2) {
            addCriterion("watch_duration not between", value1, value2, "watchDuration");
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