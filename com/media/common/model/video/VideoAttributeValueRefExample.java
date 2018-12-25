package com.media.common.model.video;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by lihaiqiang on 2018/11/12.
 */
public class VideoAttributeValueRefExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoAttributeValueRefExample() {
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

        public Criteria andPkVideoAttributeIdIsNull() {
            addCriterion("pk_video_attribute_id is null");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdIsNotNull() {
            addCriterion("pk_video_attribute_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdEqualTo(String value) {
            addCriterion("pk_video_attribute_id =", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdNotEqualTo(String value) {
            addCriterion("pk_video_attribute_id <>", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdGreaterThan(String value) {
            addCriterion("pk_video_attribute_id >", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_video_attribute_id >=", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdLessThan(String value) {
            addCriterion("pk_video_attribute_id <", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdLessThanOrEqualTo(String value) {
            addCriterion("pk_video_attribute_id <=", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdLike(String value) {
            addCriterion("pk_video_attribute_id like", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdNotLike(String value) {
            addCriterion("pk_video_attribute_id not like", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdIn(List<String> values) {
            addCriterion("pk_video_attribute_id in", values, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdNotIn(List<String> values) {
            addCriterion("pk_video_attribute_id not in", values, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdBetween(String value1, String value2) {
            addCriterion("pk_video_attribute_id between", value1, value2, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdNotBetween(String value1, String value2) {
            addCriterion("pk_video_attribute_id not between", value1, value2, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeValueIsNull() {
            addCriterion("pk_video_attribute_value is null");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeValueIsNotNull() {
            addCriterion("pk_video_attribute_value is not null");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeValueEqualTo(String value) {
            addCriterion("pk_video_attribute_value =", value, "pkVideoAttributeValue");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeValueNotEqualTo(String value) {
            addCriterion("pk_video_attribute_value <>", value, "pkVideoAttributeValue");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeValueGreaterThan(String value) {
            addCriterion("pk_video_attribute_value >", value, "pkVideoAttributeValue");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeValueGreaterThanOrEqualTo(String value) {
            addCriterion("pk_video_attribute_value >=", value, "pkVideoAttributeValue");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeValueLessThan(String value) {
            addCriterion("pk_video_attribute_value <", value, "pkVideoAttributeValue");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeValueLessThanOrEqualTo(String value) {
            addCriterion("pk_video_attribute_value <=", value, "pkVideoAttributeValue");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeValueLike(String value) {
            addCriterion("pk_video_attribute_value like", value, "pkVideoAttributeValue");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeValueNotLike(String value) {
            addCriterion("pk_video_attribute_value not like", value, "pkVideoAttributeValue");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeValueIn(List<String> values) {
            addCriterion("pk_video_attribute_value in", values, "pkVideoAttributeValue");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeValueNotIn(List<String> values) {
            addCriterion("pk_video_attribute_value not in", values, "pkVideoAttributeValue");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeValueBetween(String value1, String value2) {
            addCriterion("pk_video_attribute_value between", value1, value2, "pkVideoAttributeValue");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeValueNotBetween(String value1, String value2) {
            addCriterion("pk_video_attribute_value not between", value1, value2, "pkVideoAttributeValue");
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