package com.media.common.model.review;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaorong on 2018/11/08.
 */
public class ReviewTotalExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewTotalExample() {
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

        public Criteria andPkTotalIdIsNull() {
            addCriterion("pk_total_id is null");
            return (Criteria) this;
        }

        public Criteria andPkTotalIdIsNotNull() {
            addCriterion("pk_total_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkTotalIdEqualTo(String value) {
            addCriterion("pk_total_id =", value, "pkTotalId");
            return (Criteria) this;
        }

        public Criteria andPkTotalIdNotEqualTo(String value) {
            addCriterion("pk_total_id <>", value, "pkTotalId");
            return (Criteria) this;
        }

        public Criteria andPkTotalIdGreaterThan(String value) {
            addCriterion("pk_total_id >", value, "pkTotalId");
            return (Criteria) this;
        }

        public Criteria andPkTotalIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_total_id >=", value, "pkTotalId");
            return (Criteria) this;
        }

        public Criteria andPkTotalIdLessThan(String value) {
            addCriterion("pk_total_id <", value, "pkTotalId");
            return (Criteria) this;
        }

        public Criteria andPkTotalIdLessThanOrEqualTo(String value) {
            addCriterion("pk_total_id <=", value, "pkTotalId");
            return (Criteria) this;
        }

        public Criteria andPkTotalIdLike(String value) {
            addCriterion("pk_total_id like", value, "pkTotalId");
            return (Criteria) this;
        }

        public Criteria andPkTotalIdNotLike(String value) {
            addCriterion("pk_total_id not like", value, "pkTotalId");
            return (Criteria) this;
        }

        public Criteria andPkTotalIdIn(List<String> values) {
            addCriterion("pk_total_id in", values, "pkTotalId");
            return (Criteria) this;
        }

        public Criteria andPkTotalIdNotIn(List<String> values) {
            addCriterion("pk_total_id not in", values, "pkTotalId");
            return (Criteria) this;
        }

        public Criteria andPkTotalIdBetween(String value1, String value2) {
            addCriterion("pk_total_id between", value1, value2, "pkTotalId");
            return (Criteria) this;
        }

        public Criteria andPkTotalIdNotBetween(String value1, String value2) {
            addCriterion("pk_total_id not between", value1, value2, "pkTotalId");
            return (Criteria) this;
        }

        public Criteria andReviewObjectIdIsNull() {
            addCriterion("review_object_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewObjectIdIsNotNull() {
            addCriterion("review_object_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewObjectIdEqualTo(String value) {
            addCriterion("review_object_id =", value, "reviewObjectId");
            return (Criteria) this;
        }

        public Criteria andReviewObjectIdNotEqualTo(String value) {
            addCriterion("review_object_id <>", value, "reviewObjectId");
            return (Criteria) this;
        }

        public Criteria andReviewObjectIdGreaterThan(String value) {
            addCriterion("review_object_id >", value, "reviewObjectId");
            return (Criteria) this;
        }

        public Criteria andReviewObjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("review_object_id >=", value, "reviewObjectId");
            return (Criteria) this;
        }

        public Criteria andReviewObjectIdLessThan(String value) {
            addCriterion("review_object_id <", value, "reviewObjectId");
            return (Criteria) this;
        }

        public Criteria andReviewObjectIdLessThanOrEqualTo(String value) {
            addCriterion("review_object_id <=", value, "reviewObjectId");
            return (Criteria) this;
        }

        public Criteria andReviewObjectIdLike(String value) {
            addCriterion("review_object_id like", value, "reviewObjectId");
            return (Criteria) this;
        }

        public Criteria andReviewObjectIdNotLike(String value) {
            addCriterion("review_object_id not like", value, "reviewObjectId");
            return (Criteria) this;
        }

        public Criteria andReviewObjectIdIn(List<String> values) {
            addCriterion("review_object_id in", values, "reviewObjectId");
            return (Criteria) this;
        }

        public Criteria andReviewObjectIdNotIn(List<String> values) {
            addCriterion("review_object_id not in", values, "reviewObjectId");
            return (Criteria) this;
        }

        public Criteria andReviewObjectIdBetween(String value1, String value2) {
            addCriterion("review_object_id between", value1, value2, "reviewObjectId");
            return (Criteria) this;
        }

        public Criteria andReviewObjectIdNotBetween(String value1, String value2) {
            addCriterion("review_object_id not between", value1, value2, "reviewObjectId");
            return (Criteria) this;
        }

        public Criteria andReviewCountIsNull() {
            addCriterion("review_count is null");
            return (Criteria) this;
        }

        public Criteria andReviewCountIsNotNull() {
            addCriterion("review_count is not null");
            return (Criteria) this;
        }

        public Criteria andReviewCountEqualTo(Integer value) {
            addCriterion("review_count =", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountNotEqualTo(Integer value) {
            addCriterion("review_count <>", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountGreaterThan(Integer value) {
            addCriterion("review_count >", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_count >=", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountLessThan(Integer value) {
            addCriterion("review_count <", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountLessThanOrEqualTo(Integer value) {
            addCriterion("review_count <=", value, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountIn(List<Integer> values) {
            addCriterion("review_count in", values, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountNotIn(List<Integer> values) {
            addCriterion("review_count not in", values, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountBetween(Integer value1, Integer value2) {
            addCriterion("review_count between", value1, value2, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andReviewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("review_count not between", value1, value2, "reviewCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountIsNull() {
            addCriterion("browse_count is null");
            return (Criteria) this;
        }

        public Criteria andBrowseCountIsNotNull() {
            addCriterion("browse_count is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseCountEqualTo(Integer value) {
            addCriterion("browse_count =", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountNotEqualTo(Integer value) {
            addCriterion("browse_count <>", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountGreaterThan(Integer value) {
            addCriterion("browse_count >", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("browse_count >=", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountLessThan(Integer value) {
            addCriterion("browse_count <", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountLessThanOrEqualTo(Integer value) {
            addCriterion("browse_count <=", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountIn(List<Integer> values) {
            addCriterion("browse_count in", values, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountNotIn(List<Integer> values) {
            addCriterion("browse_count not in", values, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountBetween(Integer value1, Integer value2) {
            addCriterion("browse_count between", value1, value2, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("browse_count not between", value1, value2, "browseCount");
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