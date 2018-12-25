package com.media.common.model.stuff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaorong on 2018/10/29.
 */
public class StuffScoreExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuffScoreExample() {
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

        public Criteria andPkScoreIdIsNull() {
            addCriterion("pk_score_id is null");
            return (Criteria) this;
        }

        public Criteria andPkScoreIdIsNotNull() {
            addCriterion("pk_score_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkScoreIdEqualTo(String value) {
            addCriterion("pk_score_id =", value, "pkScoreId");
            return (Criteria) this;
        }

        public Criteria andPkScoreIdNotEqualTo(String value) {
            addCriterion("pk_score_id <>", value, "pkScoreId");
            return (Criteria) this;
        }

        public Criteria andPkScoreIdGreaterThan(String value) {
            addCriterion("pk_score_id >", value, "pkScoreId");
            return (Criteria) this;
        }

        public Criteria andPkScoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_score_id >=", value, "pkScoreId");
            return (Criteria) this;
        }

        public Criteria andPkScoreIdLessThan(String value) {
            addCriterion("pk_score_id <", value, "pkScoreId");
            return (Criteria) this;
        }

        public Criteria andPkScoreIdLessThanOrEqualTo(String value) {
            addCriterion("pk_score_id <=", value, "pkScoreId");
            return (Criteria) this;
        }

        public Criteria andPkScoreIdLike(String value) {
            addCriterion("pk_score_id like", value, "pkScoreId");
            return (Criteria) this;
        }

        public Criteria andPkScoreIdNotLike(String value) {
            addCriterion("pk_score_id not like", value, "pkScoreId");
            return (Criteria) this;
        }

        public Criteria andPkScoreIdIn(List<String> values) {
            addCriterion("pk_score_id in", values, "pkScoreId");
            return (Criteria) this;
        }

        public Criteria andPkScoreIdNotIn(List<String> values) {
            addCriterion("pk_score_id not in", values, "pkScoreId");
            return (Criteria) this;
        }

        public Criteria andPkScoreIdBetween(String value1, String value2) {
            addCriterion("pk_score_id between", value1, value2, "pkScoreId");
            return (Criteria) this;
        }

        public Criteria andPkScoreIdNotBetween(String value1, String value2) {
            addCriterion("pk_score_id not between", value1, value2, "pkScoreId");
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

        public Criteria andStuffNameIsNull() {
            addCriterion("stuff_name is null");
            return (Criteria) this;
        }

        public Criteria andStuffNameIsNotNull() {
            addCriterion("stuff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuffNameEqualTo(String value) {
            addCriterion("stuff_name =", value, "stuffName");
            return (Criteria) this;
        }

        public Criteria andStuffNameNotEqualTo(String value) {
            addCriterion("stuff_name <>", value, "stuffName");
            return (Criteria) this;
        }

        public Criteria andStuffNameGreaterThan(String value) {
            addCriterion("stuff_name >", value, "stuffName");
            return (Criteria) this;
        }

        public Criteria andStuffNameGreaterThanOrEqualTo(String value) {
            addCriterion("stuff_name >=", value, "stuffName");
            return (Criteria) this;
        }

        public Criteria andStuffNameLessThan(String value) {
            addCriterion("stuff_name <", value, "stuffName");
            return (Criteria) this;
        }

        public Criteria andStuffNameLessThanOrEqualTo(String value) {
            addCriterion("stuff_name <=", value, "stuffName");
            return (Criteria) this;
        }

        public Criteria andStuffNameLike(String value) {
            addCriterion("stuff_name like", value, "stuffName");
            return (Criteria) this;
        }

        public Criteria andStuffNameNotLike(String value) {
            addCriterion("stuff_name not like", value, "stuffName");
            return (Criteria) this;
        }

        public Criteria andStuffNameIn(List<String> values) {
            addCriterion("stuff_name in", values, "stuffName");
            return (Criteria) this;
        }

        public Criteria andStuffNameNotIn(List<String> values) {
            addCriterion("stuff_name not in", values, "stuffName");
            return (Criteria) this;
        }

        public Criteria andStuffNameBetween(String value1, String value2) {
            addCriterion("stuff_name between", value1, value2, "stuffName");
            return (Criteria) this;
        }

        public Criteria andStuffNameNotBetween(String value1, String value2) {
            addCriterion("stuff_name not between", value1, value2, "stuffName");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
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

    /**
     * This class was generated by MyBatis Generator. This class corresponds to
     * the database table md_stuff_score
     *
     * @mbg.generated do_not_delete_during_merge Mon Oct 29 15:24:27 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to
     * the database table md_stuff_score
     *
     * @mbg.generated Mon Oct 29 15:24:27 CST 2018
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