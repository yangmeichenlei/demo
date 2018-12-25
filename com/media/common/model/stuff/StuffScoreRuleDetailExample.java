package com.media.common.model.stuff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaorong on 2018/10/29.
 */
public class StuffScoreRuleDetailExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuffScoreRuleDetailExample() {
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

        public Criteria andPkScoreRuleDetailIdIsNull() {
            addCriterion("pk_score_rule_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andPkScoreRuleDetailIdIsNotNull() {
            addCriterion("pk_score_rule_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkScoreRuleDetailIdEqualTo(String value) {
            addCriterion("pk_score_rule_detail_id =", value, "pkScoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreRuleDetailIdNotEqualTo(String value) {
            addCriterion("pk_score_rule_detail_id <>", value, "pkScoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreRuleDetailIdGreaterThan(String value) {
            addCriterion("pk_score_rule_detail_id >", value, "pkScoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreRuleDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_score_rule_detail_id >=", value, "pkScoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreRuleDetailIdLessThan(String value) {
            addCriterion("pk_score_rule_detail_id <", value, "pkScoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreRuleDetailIdLessThanOrEqualTo(String value) {
            addCriterion("pk_score_rule_detail_id <=", value, "pkScoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreRuleDetailIdLike(String value) {
            addCriterion("pk_score_rule_detail_id like", value, "pkScoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreRuleDetailIdNotLike(String value) {
            addCriterion("pk_score_rule_detail_id not like", value, "pkScoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreRuleDetailIdIn(List<String> values) {
            addCriterion("pk_score_rule_detail_id in", values, "pkScoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreRuleDetailIdNotIn(List<String> values) {
            addCriterion("pk_score_rule_detail_id not in", values, "pkScoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreRuleDetailIdBetween(String value1, String value2) {
            addCriterion("pk_score_rule_detail_id between", value1, value2, "pkScoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreRuleDetailIdNotBetween(String value1, String value2) {
            addCriterion("pk_score_rule_detail_id not between", value1, value2, "pkScoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleIdIsNull() {
            addCriterion("score_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andScoreRuleIdIsNotNull() {
            addCriterion("score_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andScoreRuleIdEqualTo(String value) {
            addCriterion("score_rule_id =", value, "scoreRuleId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleIdNotEqualTo(String value) {
            addCriterion("score_rule_id <>", value, "scoreRuleId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleIdGreaterThan(String value) {
            addCriterion("score_rule_id >", value, "scoreRuleId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("score_rule_id >=", value, "scoreRuleId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleIdLessThan(String value) {
            addCriterion("score_rule_id <", value, "scoreRuleId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleIdLessThanOrEqualTo(String value) {
            addCriterion("score_rule_id <=", value, "scoreRuleId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleIdLike(String value) {
            addCriterion("score_rule_id like", value, "scoreRuleId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleIdNotLike(String value) {
            addCriterion("score_rule_id not like", value, "scoreRuleId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleIdIn(List<String> values) {
            addCriterion("score_rule_id in", values, "scoreRuleId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleIdNotIn(List<String> values) {
            addCriterion("score_rule_id not in", values, "scoreRuleId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleIdBetween(String value1, String value2) {
            addCriterion("score_rule_id between", value1, value2, "scoreRuleId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleIdNotBetween(String value1, String value2) {
            addCriterion("score_rule_id not between", value1, value2, "scoreRuleId");
            return (Criteria) this;
        }

        public Criteria andDimensionTypeIsNull() {
            addCriterion("dimension_type is null");
            return (Criteria) this;
        }

        public Criteria andDimensionTypeIsNotNull() {
            addCriterion("dimension_type is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionTypeEqualTo(Integer value) {
            addCriterion("dimension_type =", value, "dimensionType");
            return (Criteria) this;
        }

        public Criteria andDimensionTypeNotEqualTo(Integer value) {
            addCriterion("dimension_type <>", value, "dimensionType");
            return (Criteria) this;
        }

        public Criteria andDimensionTypeGreaterThan(Integer value) {
            addCriterion("dimension_type >", value, "dimensionType");
            return (Criteria) this;
        }

        public Criteria andDimensionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dimension_type >=", value, "dimensionType");
            return (Criteria) this;
        }

        public Criteria andDimensionTypeLessThan(Integer value) {
            addCriterion("dimension_type <", value, "dimensionType");
            return (Criteria) this;
        }

        public Criteria andDimensionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dimension_type <=", value, "dimensionType");
            return (Criteria) this;
        }

        public Criteria andDimensionTypeIn(List<Integer> values) {
            addCriterion("dimension_type in", values, "dimensionType");
            return (Criteria) this;
        }

        public Criteria andDimensionTypeNotIn(List<Integer> values) {
            addCriterion("dimension_type not in", values, "dimensionType");
            return (Criteria) this;
        }

        public Criteria andDimensionTypeBetween(Integer value1, Integer value2) {
            addCriterion("dimension_type between", value1, value2, "dimensionType");
            return (Criteria) this;
        }

        public Criteria andDimensionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dimension_type not between", value1, value2, "dimensionType");
            return (Criteria) this;
        }

        public Criteria andDimensionBeginIsNull() {
            addCriterion("dimension_begin is null");
            return (Criteria) this;
        }

        public Criteria andDimensionBeginIsNotNull() {
            addCriterion("dimension_begin is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionBeginEqualTo(Double value) {
            addCriterion("dimension_begin =", value, "dimensionBegin");
            return (Criteria) this;
        }

        public Criteria andDimensionBeginNotEqualTo(Double value) {
            addCriterion("dimension_begin <>", value, "dimensionBegin");
            return (Criteria) this;
        }

        public Criteria andDimensionBeginGreaterThan(Double value) {
            addCriterion("dimension_begin >", value, "dimensionBegin");
            return (Criteria) this;
        }

        public Criteria andDimensionBeginGreaterThanOrEqualTo(Double value) {
            addCriterion("dimension_begin >=", value, "dimensionBegin");
            return (Criteria) this;
        }

        public Criteria andDimensionBeginLessThan(Double value) {
            addCriterion("dimension_begin <", value, "dimensionBegin");
            return (Criteria) this;
        }

        public Criteria andDimensionBeginLessThanOrEqualTo(Double value) {
            addCriterion("dimension_begin <=", value, "dimensionBegin");
            return (Criteria) this;
        }

        public Criteria andDimensionBeginIn(List<Double> values) {
            addCriterion("dimension_begin in", values, "dimensionBegin");
            return (Criteria) this;
        }

        public Criteria andDimensionBeginNotIn(List<Double> values) {
            addCriterion("dimension_begin not in", values, "dimensionBegin");
            return (Criteria) this;
        }

        public Criteria andDimensionBeginBetween(Double value1, Double value2) {
            addCriterion("dimension_begin between", value1, value2, "dimensionBegin");
            return (Criteria) this;
        }

        public Criteria andDimensionBeginNotBetween(Double value1, Double value2) {
            addCriterion("dimension_begin not between", value1, value2, "dimensionBegin");
            return (Criteria) this;
        }

        public Criteria andDimensionEndIsNull() {
            addCriterion("dimension_end is null");
            return (Criteria) this;
        }

        public Criteria andDimensionEndIsNotNull() {
            addCriterion("dimension_end is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionEndEqualTo(Double value) {
            addCriterion("dimension_end =", value, "dimensionEnd");
            return (Criteria) this;
        }

        public Criteria andDimensionEndNotEqualTo(Double value) {
            addCriterion("dimension_end <>", value, "dimensionEnd");
            return (Criteria) this;
        }

        public Criteria andDimensionEndGreaterThan(Double value) {
            addCriterion("dimension_end >", value, "dimensionEnd");
            return (Criteria) this;
        }

        public Criteria andDimensionEndGreaterThanOrEqualTo(Double value) {
            addCriterion("dimension_end >=", value, "dimensionEnd");
            return (Criteria) this;
        }

        public Criteria andDimensionEndLessThan(Double value) {
            addCriterion("dimension_end <", value, "dimensionEnd");
            return (Criteria) this;
        }

        public Criteria andDimensionEndLessThanOrEqualTo(Double value) {
            addCriterion("dimension_end <=", value, "dimensionEnd");
            return (Criteria) this;
        }

        public Criteria andDimensionEndIn(List<Double> values) {
            addCriterion("dimension_end in", values, "dimensionEnd");
            return (Criteria) this;
        }

        public Criteria andDimensionEndNotIn(List<Double> values) {
            addCriterion("dimension_end not in", values, "dimensionEnd");
            return (Criteria) this;
        }

        public Criteria andDimensionEndBetween(Double value1, Double value2) {
            addCriterion("dimension_end between", value1, value2, "dimensionEnd");
            return (Criteria) this;
        }

        public Criteria andDimensionEndNotBetween(Double value1, Double value2) {
            addCriterion("dimension_end not between", value1, value2, "dimensionEnd");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andScoreStateIsNull() {
            addCriterion("score_state is null");
            return (Criteria) this;
        }

        public Criteria andScoreStateIsNotNull() {
            addCriterion("score_state is not null");
            return (Criteria) this;
        }

        public Criteria andScoreStateEqualTo(Integer value) {
            addCriterion("score_state =", value, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateNotEqualTo(Integer value) {
            addCriterion("score_state <>", value, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateGreaterThan(Integer value) {
            addCriterion("score_state >", value, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_state >=", value, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateLessThan(Integer value) {
            addCriterion("score_state <", value, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateLessThanOrEqualTo(Integer value) {
            addCriterion("score_state <=", value, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateIn(List<Integer> values) {
            addCriterion("score_state in", values, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateNotIn(List<Integer> values) {
            addCriterion("score_state not in", values, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateBetween(Integer value1, Integer value2) {
            addCriterion("score_state between", value1, value2, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateNotBetween(Integer value1, Integer value2) {
            addCriterion("score_state not between", value1, value2, "scoreState");
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

        public Criteria andIsScoreUpperIsNull() {
            addCriterion("is_score_upper is null");
            return (Criteria) this;
        }

        public Criteria andIsScoreUpperIsNotNull() {
            addCriterion("is_score_upper is not null");
            return (Criteria) this;
        }

        public Criteria andIsScoreUpperEqualTo(Integer value) {
            addCriterion("is_score_upper =", value, "isScoreUpper");
            return (Criteria) this;
        }

        public Criteria andIsScoreUpperNotEqualTo(Integer value) {
            addCriterion("is_score_upper <>", value, "isScoreUpper");
            return (Criteria) this;
        }

        public Criteria andIsScoreUpperGreaterThan(Integer value) {
            addCriterion("is_score_upper >", value, "isScoreUpper");
            return (Criteria) this;
        }

        public Criteria andIsScoreUpperGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_score_upper >=", value, "isScoreUpper");
            return (Criteria) this;
        }

        public Criteria andIsScoreUpperLessThan(Integer value) {
            addCriterion("is_score_upper <", value, "isScoreUpper");
            return (Criteria) this;
        }

        public Criteria andIsScoreUpperLessThanOrEqualTo(Integer value) {
            addCriterion("is_score_upper <=", value, "isScoreUpper");
            return (Criteria) this;
        }

        public Criteria andIsScoreUpperIn(List<Integer> values) {
            addCriterion("is_score_upper in", values, "isScoreUpper");
            return (Criteria) this;
        }

        public Criteria andIsScoreUpperNotIn(List<Integer> values) {
            addCriterion("is_score_upper not in", values, "isScoreUpper");
            return (Criteria) this;
        }

        public Criteria andIsScoreUpperBetween(Integer value1, Integer value2) {
            addCriterion("is_score_upper between", value1, value2, "isScoreUpper");
            return (Criteria) this;
        }

        public Criteria andIsScoreUpperNotBetween(Integer value1, Integer value2) {
            addCriterion("is_score_upper not between", value1, value2, "isScoreUpper");
            return (Criteria) this;
        }

        public Criteria andScoreUpperValueIsNull() {
            addCriterion("score_upper_value is null");
            return (Criteria) this;
        }

        public Criteria andScoreUpperValueIsNotNull() {
            addCriterion("score_upper_value is not null");
            return (Criteria) this;
        }

        public Criteria andScoreUpperValueEqualTo(Integer value) {
            addCriterion("score_upper_value =", value, "scoreUpperValue");
            return (Criteria) this;
        }

        public Criteria andScoreUpperValueNotEqualTo(Integer value) {
            addCriterion("score_upper_value <>", value, "scoreUpperValue");
            return (Criteria) this;
        }

        public Criteria andScoreUpperValueGreaterThan(Integer value) {
            addCriterion("score_upper_value >", value, "scoreUpperValue");
            return (Criteria) this;
        }

        public Criteria andScoreUpperValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_upper_value >=", value, "scoreUpperValue");
            return (Criteria) this;
        }

        public Criteria andScoreUpperValueLessThan(Integer value) {
            addCriterion("score_upper_value <", value, "scoreUpperValue");
            return (Criteria) this;
        }

        public Criteria andScoreUpperValueLessThanOrEqualTo(Integer value) {
            addCriterion("score_upper_value <=", value, "scoreUpperValue");
            return (Criteria) this;
        }

        public Criteria andScoreUpperValueIn(List<Integer> values) {
            addCriterion("score_upper_value in", values, "scoreUpperValue");
            return (Criteria) this;
        }

        public Criteria andScoreUpperValueNotIn(List<Integer> values) {
            addCriterion("score_upper_value not in", values, "scoreUpperValue");
            return (Criteria) this;
        }

        public Criteria andScoreUpperValueBetween(Integer value1, Integer value2) {
            addCriterion("score_upper_value between", value1, value2, "scoreUpperValue");
            return (Criteria) this;
        }

        public Criteria andScoreUpperValueNotBetween(Integer value1, Integer value2) {
            addCriterion("score_upper_value not between", value1, value2, "scoreUpperValue");
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
     * the database table md_stuff_score_rule_detail
     *
     * @mbg.generated do_not_delete_during_merge Mon Oct 29 15:38:57 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to
     * the database table md_stuff_score_rule_detail
     *
     * @mbg.generated Mon Oct 29 15:38:57 CST 2018
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