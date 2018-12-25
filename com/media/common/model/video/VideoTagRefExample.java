package com.media.common.model.video;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Created by lihaiqiang on 2018/11/01.
 */
public class VideoTagRefExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoTagRefExample() {
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

        public Criteria andPkVideoRefIdIsNull() {
            addCriterion("pk_video_ref_id is null");
            return (Criteria) this;
        }

        public Criteria andPkVideoRefIdIsNotNull() {
            addCriterion("pk_video_ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkVideoRefIdEqualTo(String value) {
            addCriterion("pk_video_ref_id =", value, "pkVideoRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoRefIdNotEqualTo(String value) {
            addCriterion("pk_video_ref_id <>", value, "pkVideoRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoRefIdGreaterThan(String value) {
            addCriterion("pk_video_ref_id >", value, "pkVideoRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoRefIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_video_ref_id >=", value, "pkVideoRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoRefIdLessThan(String value) {
            addCriterion("pk_video_ref_id <", value, "pkVideoRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoRefIdLessThanOrEqualTo(String value) {
            addCriterion("pk_video_ref_id <=", value, "pkVideoRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoRefIdLike(String value) {
            addCriterion("pk_video_ref_id like", value, "pkVideoRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoRefIdNotLike(String value) {
            addCriterion("pk_video_ref_id not like", value, "pkVideoRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoRefIdIn(List<String> values) {
            addCriterion("pk_video_ref_id in", values, "pkVideoRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoRefIdNotIn(List<String> values) {
            addCriterion("pk_video_ref_id not in", values, "pkVideoRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoRefIdBetween(String value1, String value2) {
            addCriterion("pk_video_ref_id between", value1, value2, "pkVideoRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoRefIdNotBetween(String value1, String value2) {
            addCriterion("pk_video_ref_id not between", value1, value2, "pkVideoRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdIsNull() {
            addCriterion("pk_video_id is null");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdIsNotNull() {
            addCriterion("pk_video_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdEqualTo(String value) {
            addCriterion("pk_video_id =", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdNotEqualTo(String value) {
            addCriterion("pk_video_id <>", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdGreaterThan(String value) {
            addCriterion("pk_video_id >", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_video_id >=", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdLessThan(String value) {
            addCriterion("pk_video_id <", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdLessThanOrEqualTo(String value) {
            addCriterion("pk_video_id <=", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdLike(String value) {
            addCriterion("pk_video_id like", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdNotLike(String value) {
            addCriterion("pk_video_id not like", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdIn(List<String> values) {
            addCriterion("pk_video_id in", values, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdNotIn(List<String> values) {
            addCriterion("pk_video_id not in", values, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdBetween(String value1, String value2) {
            addCriterion("pk_video_id between", value1, value2, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdNotBetween(String value1, String value2) {
            addCriterion("pk_video_id not between", value1, value2, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkTagIdIsNull() {
            addCriterion("pk_tag_id is null");
            return (Criteria) this;
        }

        public Criteria andPkTagIdIsNotNull() {
            addCriterion("pk_tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkTagIdEqualTo(String value) {
            addCriterion("pk_tag_id =", value, "pkTagId");
            return (Criteria) this;
        }

        public Criteria andPkTagIdNotEqualTo(String value) {
            addCriterion("pk_tag_id <>", value, "pkTagId");
            return (Criteria) this;
        }

        public Criteria andPkTagIdGreaterThan(String value) {
            addCriterion("pk_tag_id >", value, "pkTagId");
            return (Criteria) this;
        }

        public Criteria andPkTagIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_tag_id >=", value, "pkTagId");
            return (Criteria) this;
        }

        public Criteria andPkTagIdLessThan(String value) {
            addCriterion("pk_tag_id <", value, "pkTagId");
            return (Criteria) this;
        }

        public Criteria andPkTagIdLessThanOrEqualTo(String value) {
            addCriterion("pk_tag_id <=", value, "pkTagId");
            return (Criteria) this;
        }

        public Criteria andPkTagIdLike(String value) {
            addCriterion("pk_tag_id like", value, "pkTagId");
            return (Criteria) this;
        }

        public Criteria andPkTagIdNotLike(String value) {
            addCriterion("pk_tag_id not like", value, "pkTagId");
            return (Criteria) this;
        }

        public Criteria andPkTagIdIn(List<String> values) {
            addCriterion("pk_tag_id in", values, "pkTagId");
            return (Criteria) this;
        }

        public Criteria andPkTagIdNotIn(List<String> values) {
            addCriterion("pk_tag_id not in", values, "pkTagId");
            return (Criteria) this;
        }

        public Criteria andPkTagIdBetween(String value1, String value2) {
            addCriterion("pk_tag_id between", value1, value2, "pkTagId");
            return (Criteria) this;
        }

        public Criteria andPkTagIdNotBetween(String value1, String value2) {
            addCriterion("pk_tag_id not between", value1, value2, "pkTagId");
            return (Criteria) this;
        }

        public Criteria andTagNoIsNull() {
            addCriterion("tag_no is null");
            return (Criteria) this;
        }

        public Criteria andTagNoIsNotNull() {
            addCriterion("tag_no is not null");
            return (Criteria) this;
        }

        public Criteria andTagNoEqualTo(Integer value) {
            addCriterion("tag_no =", value, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoNotEqualTo(Integer value) {
            addCriterion("tag_no <>", value, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoGreaterThan(Integer value) {
            addCriterion("tag_no >", value, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("tag_no >=", value, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoLessThan(Integer value) {
            addCriterion("tag_no <", value, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoLessThanOrEqualTo(Integer value) {
            addCriterion("tag_no <=", value, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoIn(List<Integer> values) {
            addCriterion("tag_no in", values, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoNotIn(List<Integer> values) {
            addCriterion("tag_no not in", values, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoBetween(Integer value1, Integer value2) {
            addCriterion("tag_no between", value1, value2, "tagNo");
            return (Criteria) this;
        }

        public Criteria andTagNoNotBetween(Integer value1, Integer value2) {
            addCriterion("tag_no not between", value1, value2, "tagNo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("create_user_id like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("create_user_id not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdIsNull() {
            addCriterion("last_modify_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdIsNotNull() {
            addCriterion("last_modify_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdEqualTo(String value) {
            addCriterion("last_modify_user_id =", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdNotEqualTo(String value) {
            addCriterion("last_modify_user_id <>", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdGreaterThan(String value) {
            addCriterion("last_modify_user_id >", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("last_modify_user_id >=", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdLessThan(String value) {
            addCriterion("last_modify_user_id <", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdLessThanOrEqualTo(String value) {
            addCriterion("last_modify_user_id <=", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdLike(String value) {
            addCriterion("last_modify_user_id like", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdNotLike(String value) {
            addCriterion("last_modify_user_id not like", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdIn(List<String> values) {
            addCriterion("last_modify_user_id in", values, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdNotIn(List<String> values) {
            addCriterion("last_modify_user_id not in", values, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdBetween(String value1, String value2) {
            addCriterion("last_modify_user_id between", value1, value2, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdNotBetween(String value1, String value2) {
            addCriterion("last_modify_user_id not between", value1, value2, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("last_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("last_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("last_modify_time =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("last_modify_time <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("last_modify_time >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify_time >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("last_modify_time <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modify_time <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("last_modify_time in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("last_modify_time not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_modify_time between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modify_time not between", value1, value2, "lastModifyTime");
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