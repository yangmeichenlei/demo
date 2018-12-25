package com.media.common.model.video;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoAttributeRefExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoAttributeRefExample() {
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

        public Criteria andPkVideoAttributeRefIdIsNull() {
            addCriterion("pk_video_attribute_ref_id is null");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeRefIdIsNotNull() {
            addCriterion("pk_video_attribute_ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeRefIdEqualTo(String value) {
            addCriterion("pk_video_attribute_ref_id =", value, "pkVideoAttributeRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeRefIdNotEqualTo(String value) {
            addCriterion("pk_video_attribute_ref_id <>", value, "pkVideoAttributeRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeRefIdGreaterThan(String value) {
            addCriterion("pk_video_attribute_ref_id >", value, "pkVideoAttributeRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeRefIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_video_attribute_ref_id >=", value, "pkVideoAttributeRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeRefIdLessThan(String value) {
            addCriterion("pk_video_attribute_ref_id <", value, "pkVideoAttributeRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeRefIdLessThanOrEqualTo(String value) {
            addCriterion("pk_video_attribute_ref_id <=", value, "pkVideoAttributeRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeRefIdLike(String value) {
            addCriterion("pk_video_attribute_ref_id like", value, "pkVideoAttributeRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeRefIdNotLike(String value) {
            addCriterion("pk_video_attribute_ref_id not like", value, "pkVideoAttributeRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeRefIdIn(List<String> values) {
            addCriterion("pk_video_attribute_ref_id in", values, "pkVideoAttributeRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeRefIdNotIn(List<String> values) {
            addCriterion("pk_video_attribute_ref_id not in", values, "pkVideoAttributeRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeRefIdBetween(String value1, String value2) {
            addCriterion("pk_video_attribute_ref_id between", value1, value2, "pkVideoAttributeRefId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeRefIdNotBetween(String value1, String value2) {
            addCriterion("pk_video_attribute_ref_id not between", value1, value2, "pkVideoAttributeRefId");
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

        public Criteria andVideoAttributeIdIsNull() {
            addCriterion("video_attribute_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoAttributeIdIsNotNull() {
            addCriterion("video_attribute_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoAttributeIdEqualTo(String value) {
            addCriterion("video_attribute_id =", value, "videoAttributeId");
            return (Criteria) this;
        }

        public Criteria andVideoAttributeIdNotEqualTo(String value) {
            addCriterion("video_attribute_id <>", value, "videoAttributeId");
            return (Criteria) this;
        }

        public Criteria andVideoAttributeIdGreaterThan(String value) {
            addCriterion("video_attribute_id >", value, "videoAttributeId");
            return (Criteria) this;
        }

        public Criteria andVideoAttributeIdGreaterThanOrEqualTo(String value) {
            addCriterion("video_attribute_id >=", value, "videoAttributeId");
            return (Criteria) this;
        }

        public Criteria andVideoAttributeIdLessThan(String value) {
            addCriterion("video_attribute_id <", value, "videoAttributeId");
            return (Criteria) this;
        }

        public Criteria andVideoAttributeIdLessThanOrEqualTo(String value) {
            addCriterion("video_attribute_id <=", value, "videoAttributeId");
            return (Criteria) this;
        }

        public Criteria andVideoAttributeIdLike(String value) {
            addCriterion("video_attribute_id like", value, "videoAttributeId");
            return (Criteria) this;
        }

        public Criteria andVideoAttributeIdNotLike(String value) {
            addCriterion("video_attribute_id not like", value, "videoAttributeId");
            return (Criteria) this;
        }

        public Criteria andVideoAttributeIdIn(List<String> values) {
            addCriterion("video_attribute_id in", values, "videoAttributeId");
            return (Criteria) this;
        }

        public Criteria andVideoAttributeIdNotIn(List<String> values) {
            addCriterion("video_attribute_id not in", values, "videoAttributeId");
            return (Criteria) this;
        }

        public Criteria andVideoAttributeIdBetween(String value1, String value2) {
            addCriterion("video_attribute_id between", value1, value2, "videoAttributeId");
            return (Criteria) this;
        }

        public Criteria andVideoAttributeIdNotBetween(String value1, String value2) {
            addCriterion("video_attribute_id not between", value1, value2, "videoAttributeId");
            return (Criteria) this;
        }
        public Criteria andAttrValIdIsNull() {
            addCriterion("attr_val_id is null");
            return (Criteria) this;
        }

        public Criteria andAttrValIdIsNotNull() {
            addCriterion("attr_val_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttrValIdEqualTo(String value) {
            addCriterion("attr_val_id =", value, "attrValId");
            return (Criteria) this;
        }

        public Criteria andAttrValIdNotEqualTo(String value) {
            addCriterion("attr_val_id <>", value, "attrValId");
            return (Criteria) this;
        }

        public Criteria andAttrValIdGreaterThan(String value) {
            addCriterion("attr_val_id >", value, "attrValId");
            return (Criteria) this;
        }

        public Criteria andAttrValIdGreaterThanOrEqualTo(String value) {
            addCriterion("attr_val_id >=", value, "attrValId");
            return (Criteria) this;
        }

        public Criteria andAttrValIdLessThan(String value) {
            addCriterion("attr_val_id <", value, "attrValId");
            return (Criteria) this;
        }

        public Criteria andAttrValIdLessThanOrEqualTo(String value) {
            addCriterion("attr_val_id <=", value, "attrValId");
            return (Criteria) this;
        }

        public Criteria andAttrValIdLike(String value) {
            addCriterion("attr_val_id like", value, "attrValId");
            return (Criteria) this;
        }

        public Criteria andAttrValIdNotLike(String value) {
            addCriterion("attr_val_id not like", value, "attrValId");
            return (Criteria) this;
        }

        public Criteria andAttrValIdIn(List<String> values) {
            addCriterion("attr_val_id in", values, "attrValId");
            return (Criteria) this;
        }

        public Criteria andAttrValIdNotIn(List<String> values) {
            addCriterion("attr_val_id not in", values, "attrValId");
            return (Criteria) this;
        }

        public Criteria andAttrValIdBetween(String value1, String value2) {
            addCriterion("attr_val_id between", value1, value2, "attrValId");
            return (Criteria) this;
        }

        public Criteria andAttrValIdNotBetween(String value1, String value2) {
            addCriterion("attr_val_id not between", value1, value2, "attrValId");
            return (Criteria) this;
        }
        public Criteria andAttrValIsNull() {
            addCriterion("attr_val is null");
            return (Criteria) this;
        }

        public Criteria andAttrValIsNotNull() {
            addCriterion("attr_val is not null");
            return (Criteria) this;
        }

        public Criteria andAttrValEqualTo(String value) {
            addCriterion("attr_val =", value, "attrVal");
            return (Criteria) this;
        }

        public Criteria andAttrValNotEqualTo(String value) {
            addCriterion("attr_val <>", value, "attrVal");
            return (Criteria) this;
        }

        public Criteria andAttrValGreaterThan(String value) {
            addCriterion("attr_val >", value, "attrVal");
            return (Criteria) this;
        }

        public Criteria andAttrValGreaterThanOrEqualTo(String value) {
            addCriterion("attr_val >=", value, "attrVal");
            return (Criteria) this;
        }

        public Criteria andAttrValLessThan(String value) {
            addCriterion("attr_val <", value, "attrVal");
            return (Criteria) this;
        }

        public Criteria andAttrValLessThanOrEqualTo(String value) {
            addCriterion("attr_val <=", value, "attrVal");
            return (Criteria) this;
        }

        public Criteria andAttrValLike(String value) {
            addCriterion("attr_val like", value, "attrVal");
            return (Criteria) this;
        }

        public Criteria andAttrValNotLike(String value) {
            addCriterion("attr_val not like", value, "attrVal");
            return (Criteria) this;
        }

        public Criteria andAttrValIn(List<String> values) {
            addCriterion("attr_val in", values, "attrVal");
            return (Criteria) this;
        }

        public Criteria andAttrValNotIn(List<String> values) {
            addCriterion("attr_val not in", values, "attrVal");
            return (Criteria) this;
        }

        public Criteria andAttrValBetween(String value1, String value2) {
            addCriterion("attr_val between", value1, value2, "attrVal");
            return (Criteria) this;
        }

        public Criteria andAttrValNotBetween(String value1, String value2) {
            addCriterion("attr_val not between", value1, value2, "attrVal");
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

        public Criteria andAuditUserIdIsNull() {
            addCriterion("audit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNotNull() {
            addCriterion("audit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdEqualTo(String value) {
            addCriterion("audit_user_id =", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotEqualTo(String value) {
            addCriterion("audit_user_id <>", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThan(String value) {
            addCriterion("audit_user_id >", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("audit_user_id >=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThan(String value) {
            addCriterion("audit_user_id <", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThanOrEqualTo(String value) {
            addCriterion("audit_user_id <=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLike(String value) {
            addCriterion("audit_user_id like", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotLike(String value) {
            addCriterion("audit_user_id not like", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIn(List<String> values) {
            addCriterion("audit_user_id in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotIn(List<String> values) {
            addCriterion("audit_user_id not in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdBetween(String value1, String value2) {
            addCriterion("audit_user_id between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotBetween(String value1, String value2) {
            addCriterion("audit_user_id not between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("audit_opinion not between", value1, value2, "auditOpinion");
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