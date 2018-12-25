package com.media.common.model.stuff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhaorong on 2018/11/25.
 */
public class StuffExpenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuffExpenseExample() {
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

        public Criteria andPkExpenseIdIsNull() {
            addCriterion("pk_expense_id is null");
            return (Criteria) this;
        }

        public Criteria andPkExpenseIdIsNotNull() {
            addCriterion("pk_expense_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkExpenseIdEqualTo(String value) {
            addCriterion("pk_expense_id =", value, "pkExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkExpenseIdNotEqualTo(String value) {
            addCriterion("pk_expense_id <>", value, "pkExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkExpenseIdGreaterThan(String value) {
            addCriterion("pk_expense_id >", value, "pkExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkExpenseIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_expense_id >=", value, "pkExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkExpenseIdLessThan(String value) {
            addCriterion("pk_expense_id <", value, "pkExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkExpenseIdLessThanOrEqualTo(String value) {
            addCriterion("pk_expense_id <=", value, "pkExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkExpenseIdLike(String value) {
            addCriterion("pk_expense_id like", value, "pkExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkExpenseIdNotLike(String value) {
            addCriterion("pk_expense_id not like", value, "pkExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkExpenseIdIn(List<String> values) {
            addCriterion("pk_expense_id in", values, "pkExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkExpenseIdNotIn(List<String> values) {
            addCriterion("pk_expense_id not in", values, "pkExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkExpenseIdBetween(String value1, String value2) {
            addCriterion("pk_expense_id between", value1, value2, "pkExpenseId");
            return (Criteria) this;
        }

        public Criteria andPkExpenseIdNotBetween(String value1, String value2) {
            addCriterion("pk_expense_id not between", value1, value2, "pkExpenseId");
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

        public Criteria andExpenseRuleIdIsNull() {
            addCriterion("expense_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andExpenseRuleIdIsNotNull() {
            addCriterion("expense_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseRuleIdEqualTo(String value) {
            addCriterion("expense_rule_id =", value, "expenseRuleId");
            return (Criteria) this;
        }

        public Criteria andExpenseRuleIdNotEqualTo(String value) {
            addCriterion("expense_rule_id <>", value, "expenseRuleId");
            return (Criteria) this;
        }

        public Criteria andExpenseRuleIdGreaterThan(String value) {
            addCriterion("expense_rule_id >", value, "expenseRuleId");
            return (Criteria) this;
        }

        public Criteria andExpenseRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("expense_rule_id >=", value, "expenseRuleId");
            return (Criteria) this;
        }

        public Criteria andExpenseRuleIdLessThan(String value) {
            addCriterion("expense_rule_id <", value, "expenseRuleId");
            return (Criteria) this;
        }

        public Criteria andExpenseRuleIdLessThanOrEqualTo(String value) {
            addCriterion("expense_rule_id <=", value, "expenseRuleId");
            return (Criteria) this;
        }

        public Criteria andExpenseRuleIdLike(String value) {
            addCriterion("expense_rule_id like", value, "expenseRuleId");
            return (Criteria) this;
        }

        public Criteria andExpenseRuleIdNotLike(String value) {
            addCriterion("expense_rule_id not like", value, "expenseRuleId");
            return (Criteria) this;
        }

        public Criteria andExpenseRuleIdIn(List<String> values) {
            addCriterion("expense_rule_id in", values, "expenseRuleId");
            return (Criteria) this;
        }

        public Criteria andExpenseRuleIdNotIn(List<String> values) {
            addCriterion("expense_rule_id not in", values, "expenseRuleId");
            return (Criteria) this;
        }

        public Criteria andExpenseRuleIdBetween(String value1, String value2) {
            addCriterion("expense_rule_id between", value1, value2, "expenseRuleId");
            return (Criteria) this;
        }

        public Criteria andExpenseRuleIdNotBetween(String value1, String value2) {
            addCriterion("expense_rule_id not between", value1, value2, "expenseRuleId");
            return (Criteria) this;
        }

        public Criteria andExpenseCountIsNull() {
            addCriterion("expense_count is null");
            return (Criteria) this;
        }

        public Criteria andExpenseCountIsNotNull() {
            addCriterion("expense_count is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseCountEqualTo(BigDecimal value) {
            addCriterion("expense_count =", value, "expenseCount");
            return (Criteria) this;
        }

        public Criteria andExpenseCountNotEqualTo(BigDecimal value) {
            addCriterion("expense_count <>", value, "expenseCount");
            return (Criteria) this;
        }

        public Criteria andExpenseCountGreaterThan(BigDecimal value) {
            addCriterion("expense_count >", value, "expenseCount");
            return (Criteria) this;
        }

        public Criteria andExpenseCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expense_count >=", value, "expenseCount");
            return (Criteria) this;
        }

        public Criteria andExpenseCountLessThan(BigDecimal value) {
            addCriterion("expense_count <", value, "expenseCount");
            return (Criteria) this;
        }

        public Criteria andExpenseCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expense_count <=", value, "expenseCount");
            return (Criteria) this;
        }

        public Criteria andExpenseCountIn(List<BigDecimal> values) {
            addCriterion("expense_count in", values, "expenseCount");
            return (Criteria) this;
        }

        public Criteria andExpenseCountNotIn(List<BigDecimal> values) {
            addCriterion("expense_count not in", values, "expenseCount");
            return (Criteria) this;
        }

        public Criteria andExpenseCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expense_count between", value1, value2, "expenseCount");
            return (Criteria) this;
        }

        public Criteria andExpenseCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expense_count not between", value1, value2, "expenseCount");
            return (Criteria) this;
        }

        public Criteria andExpenseRealityCountIsNull() {
            addCriterion("expense_reality_count is null");
            return (Criteria) this;
        }

        public Criteria andExpenseRealityCountIsNotNull() {
            addCriterion("expense_reality_count is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseRealityCountEqualTo(BigDecimal value) {
            addCriterion("expense_reality_count =", value, "expenseRealityCount");
            return (Criteria) this;
        }

        public Criteria andExpenseRealityCountNotEqualTo(BigDecimal value) {
            addCriterion("expense_reality_count <>", value, "expenseRealityCount");
            return (Criteria) this;
        }

        public Criteria andExpenseRealityCountGreaterThan(BigDecimal value) {
            addCriterion("expense_reality_count >", value, "expenseRealityCount");
            return (Criteria) this;
        }

        public Criteria andExpenseRealityCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expense_reality_count >=", value, "expenseRealityCount");
            return (Criteria) this;
        }

        public Criteria andExpenseRealityCountLessThan(BigDecimal value) {
            addCriterion("expense_reality_count <", value, "expenseRealityCount");
            return (Criteria) this;
        }

        public Criteria andExpenseRealityCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expense_reality_count <=", value, "expenseRealityCount");
            return (Criteria) this;
        }

        public Criteria andExpenseRealityCountIn(List<BigDecimal> values) {
            addCriterion("expense_reality_count in", values, "expenseRealityCount");
            return (Criteria) this;
        }

        public Criteria andExpenseRealityCountNotIn(List<BigDecimal> values) {
            addCriterion("expense_reality_count not in", values, "expenseRealityCount");
            return (Criteria) this;
        }

        public Criteria andExpenseRealityCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expense_reality_count between", value1, value2, "expenseRealityCount");
            return (Criteria) this;
        }

        public Criteria andExpenseRealityCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expense_reality_count not between", value1, value2, "expenseRealityCount");
            return (Criteria) this;
        }

        public Criteria andExpenseStatusIsNull() {
            addCriterion("expense_status is null");
            return (Criteria) this;
        }

        public Criteria andExpenseStatusIsNotNull() {
            addCriterion("expense_status is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseStatusEqualTo(Integer value) {
            addCriterion("expense_status =", value, "expenseStatus");
            return (Criteria) this;
        }

        public Criteria andExpenseStatusNotEqualTo(Integer value) {
            addCriterion("expense_status <>", value, "expenseStatus");
            return (Criteria) this;
        }

        public Criteria andExpenseStatusGreaterThan(Integer value) {
            addCriterion("expense_status >", value, "expenseStatus");
            return (Criteria) this;
        }

        public Criteria andExpenseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("expense_status >=", value, "expenseStatus");
            return (Criteria) this;
        }

        public Criteria andExpenseStatusLessThan(Integer value) {
            addCriterion("expense_status <", value, "expenseStatus");
            return (Criteria) this;
        }

        public Criteria andExpenseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("expense_status <=", value, "expenseStatus");
            return (Criteria) this;
        }

        public Criteria andExpenseStatusIn(List<Integer> values) {
            addCriterion("expense_status in", values, "expenseStatus");
            return (Criteria) this;
        }

        public Criteria andExpenseStatusNotIn(List<Integer> values) {
            addCriterion("expense_status not in", values, "expenseStatus");
            return (Criteria) this;
        }

        public Criteria andExpenseStatusBetween(Integer value1, Integer value2) {
            addCriterion("expense_status between", value1, value2, "expenseStatus");
            return (Criteria) this;
        }

        public Criteria andExpenseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("expense_status not between", value1, value2, "expenseStatus");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeIsNull() {
            addCriterion("expense_time is null");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeIsNotNull() {
            addCriterion("expense_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeEqualTo(Date value) {
            addCriterion("expense_time =", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeNotEqualTo(Date value) {
            addCriterion("expense_time <>", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeGreaterThan(Date value) {
            addCriterion("expense_time >", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expense_time >=", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeLessThan(Date value) {
            addCriterion("expense_time <", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeLessThanOrEqualTo(Date value) {
            addCriterion("expense_time <=", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeIn(List<Date> values) {
            addCriterion("expense_time in", values, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeNotIn(List<Date> values) {
            addCriterion("expense_time not in", values, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeBetween(Date value1, Date value2) {
            addCriterion("expense_time between", value1, value2, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeNotBetween(Date value1, Date value2) {
            addCriterion("expense_time not between", value1, value2, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseDetailIsNull() {
            addCriterion("expense_detail is null");
            return (Criteria) this;
        }

        public Criteria andExpenseDetailIsNotNull() {
            addCriterion("expense_detail is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseDetailEqualTo(String value) {
            addCriterion("expense_detail =", value, "expenseDetail");
            return (Criteria) this;
        }

        public Criteria andExpenseDetailNotEqualTo(String value) {
            addCriterion("expense_detail <>", value, "expenseDetail");
            return (Criteria) this;
        }

        public Criteria andExpenseDetailGreaterThan(String value) {
            addCriterion("expense_detail >", value, "expenseDetail");
            return (Criteria) this;
        }

        public Criteria andExpenseDetailGreaterThanOrEqualTo(String value) {
            addCriterion("expense_detail >=", value, "expenseDetail");
            return (Criteria) this;
        }

        public Criteria andExpenseDetailLessThan(String value) {
            addCriterion("expense_detail <", value, "expenseDetail");
            return (Criteria) this;
        }

        public Criteria andExpenseDetailLessThanOrEqualTo(String value) {
            addCriterion("expense_detail <=", value, "expenseDetail");
            return (Criteria) this;
        }

        public Criteria andExpenseDetailLike(String value) {
            addCriterion("expense_detail like", value, "expenseDetail");
            return (Criteria) this;
        }

        public Criteria andExpenseDetailNotLike(String value) {
            addCriterion("expense_detail not like", value, "expenseDetail");
            return (Criteria) this;
        }

        public Criteria andExpenseDetailIn(List<String> values) {
            addCriterion("expense_detail in", values, "expenseDetail");
            return (Criteria) this;
        }

        public Criteria andExpenseDetailNotIn(List<String> values) {
            addCriterion("expense_detail not in", values, "expenseDetail");
            return (Criteria) this;
        }

        public Criteria andExpenseDetailBetween(String value1, String value2) {
            addCriterion("expense_detail between", value1, value2, "expenseDetail");
            return (Criteria) this;
        }

        public Criteria andExpenseDetailNotBetween(String value1, String value2) {
            addCriterion("expense_detail not between", value1, value2, "expenseDetail");
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

        public Criteria andExpenseCountSumEqualTo(Long value) {
            addCriterion("expense_count_sum =", value, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumNotEqualTo(Long value) {
            addCriterion("expense_count_sum <>", value, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumGreaterThan(Long value) {
            addCriterion("expense_count_sum >", value, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumGreaterThanOrEqualTo(Long value) {
            addCriterion("expense_count_sum >=", value, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumLessThan(Long value) {
            addCriterion("expense_count_sum <", value, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumLessThanOrEqualTo(Long value) {
            addCriterion("expense_count_sum <=", value, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumIn(List<Long> values) {
            addCriterion("expense_count_sum in", values, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumNotIn(List<Long> values) {
            addCriterion("expense_count_sum not in", values, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumBetween(Long value1, Long value2) {
            addCriterion("expense_count_sum between", value1, value2, "expenseCountSum");
            return (Criteria) this;
        }

        public Criteria andExpenseCountSumNotBetween(Long value1, Long value2) {
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