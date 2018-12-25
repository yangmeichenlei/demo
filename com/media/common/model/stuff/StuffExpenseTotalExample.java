package com.media.common.model.stuff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaorong on 2018/11/27.
 */
public class StuffExpenseTotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuffExpenseTotalExample() {
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

        public Criteria andPkTotalExpenseIdIsNull() {
            addCriterion("pk_total_expense_id is null");
            return (Criteria) this;
        }

        public Criteria andPkTotalExpenseIdIsNotNull() {
            addCriterion("pk_total_expense_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkTotalExpenseIdEqualTo(String value) {
            addCriterion("pk_total_expense_id =", value, "pkTotalExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkTotalExpenseIdNotEqualTo(String value) {
            addCriterion("pk_total_expense_id <>", value, "pkTotalExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkTotalExpenseIdGreaterThan(String value) {
            addCriterion("pk_total_expense_id >", value, "pkTotalExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkTotalExpenseIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_total_expense_id >=", value, "pkTotalExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkTotalExpenseIdLessThan(String value) {
            addCriterion("pk_total_expense_id <", value, "pkTotalExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkTotalExpenseIdLessThanOrEqualTo(String value) {
            addCriterion("pk_total_expense_id <=", value, "pkTotalExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkTotalExpenseIdLike(String value) {
            addCriterion("pk_total_expense_id like", value, "pkTotalExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkTotalExpenseIdNotLike(String value) {
            addCriterion("pk_total_expense_id not like", value, "pkTotalExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkTotalExpenseIdIn(List<String> values) {
            addCriterion("pk_total_expense_id in", values, "pkTotalExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkTotalExpenseIdNotIn(List<String> values) {
            addCriterion("pk_total_expense_id not in", values, "pkTotalExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkTotalExpenseIdBetween(String value1, String value2) {
            addCriterion("pk_total_expense_id between", value1, value2, "pkTotalExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkTotalExpenseIdNotBetween(String value1, String value2) {
            addCriterion("pk_total_expense_id not between", value1, value2, "pkTotalExpenseId");
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

        public Criteria andExpenseCountSumIsNull() {
            addCriterion("expense_count_sum is null");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumIsNotNull() {
            addCriterion("expense_count_sum is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumEqualTo(BigDecimal value) {
            addCriterion("expense_count_sum =", value, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumNotEqualTo(BigDecimal value) {
            addCriterion("expense_count_sum <>", value, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumGreaterThan(BigDecimal value) {
            addCriterion("expense_count_sum >", value, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expense_count_sum >=", value, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumLessThan(BigDecimal value) {
            addCriterion("expense_count_sum <", value, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expense_count_sum <=", value, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumIn(List<BigDecimal> values) {
            addCriterion("expense_count_sum in", values, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumNotIn(List<BigDecimal> values) {
            addCriterion("expense_count_sum not in", values, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expense_count_sum between", value1, value2, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expense_count_sum not between", value1, value2, "expenseCountSum");
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