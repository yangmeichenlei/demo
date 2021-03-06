package com.media.common.model.video;

import java.util.ArrayList;
import java.util.List;

public class VideoClassRefExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
    public VideoClassRefExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
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

        public Criteria andPkVideoClassRefIsNull() {
            addCriterion("pk_video_class_ref is null");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassRefIsNotNull() {
            addCriterion("pk_video_class_ref is not null");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassRefEqualTo(String value) {
            addCriterion("pk_video_class_ref =", value, "pkVideoClassRef");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassRefNotEqualTo(String value) {
            addCriterion("pk_video_class_ref <>", value, "pkVideoClassRef");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassRefGreaterThan(String value) {
            addCriterion("pk_video_class_ref >", value, "pkVideoClassRef");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassRefGreaterThanOrEqualTo(String value) {
            addCriterion("pk_video_class_ref >=", value, "pkVideoClassRef");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassRefLessThan(String value) {
            addCriterion("pk_video_class_ref <", value, "pkVideoClassRef");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassRefLessThanOrEqualTo(String value) {
            addCriterion("pk_video_class_ref <=", value, "pkVideoClassRef");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassRefLike(String value) {
            addCriterion("pk_video_class_ref like", value, "pkVideoClassRef");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassRefNotLike(String value) {
            addCriterion("pk_video_class_ref not like", value, "pkVideoClassRef");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassRefIn(List<String> values) {
            addCriterion("pk_video_class_ref in", values, "pkVideoClassRef");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassRefNotIn(List<String> values) {
            addCriterion("pk_video_class_ref not in", values, "pkVideoClassRef");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassRefBetween(String value1, String value2) {
            addCriterion("pk_video_class_ref between", value1, value2, "pkVideoClassRef");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassRefNotBetween(String value1, String value2) {
            addCriterion("pk_video_class_ref not between", value1, value2, "pkVideoClassRef");
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

        public Criteria andPkVideoClassIdIsNull() {
            addCriterion("pk_video_class_id is null");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdIsNotNull() {
            addCriterion("pk_video_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdEqualTo(String value) {
            addCriterion("pk_video_class_id =", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdNotEqualTo(String value) {
            addCriterion("pk_video_class_id <>", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdGreaterThan(String value) {
            addCriterion("pk_video_class_id >", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_video_class_id >=", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdLessThan(String value) {
            addCriterion("pk_video_class_id <", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdLessThanOrEqualTo(String value) {
            addCriterion("pk_video_class_id <=", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdLike(String value) {
            addCriterion("pk_video_class_id like", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdNotLike(String value) {
            addCriterion("pk_video_class_id not like", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdIn(List<String> values) {
            addCriterion("pk_video_class_id in", values, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdNotIn(List<String> values) {
            addCriterion("pk_video_class_id not in", values, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdBetween(String value1, String value2) {
            addCriterion("pk_video_class_id between", value1, value2, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdNotBetween(String value1, String value2) {
            addCriterion("pk_video_class_id not between", value1, value2, "pkVideoClassId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table md_video_class_ref
     *
     * @mbg.generated do_not_delete_during_merge Fri Dec 07 09:44:19 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table md_video_class_ref
     *
     * @mbg.generated Fri Dec 07 09:44:19 CST 2018
     */
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