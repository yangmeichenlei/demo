package com.media.common.model.stuff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhaorong on 2018/10/29.
 */
public class StuffScoreDetailExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuffScoreDetailExample() {
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

        public Criteria andPkScoreDetailIdIsNull() {
            addCriterion("pk_score_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andPkScoreDetailIdIsNotNull() {
            addCriterion("pk_score_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkScoreDetailIdEqualTo(String value) {
            addCriterion("pk_score_detail_id =", value, "pkScoreDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreDetailIdNotEqualTo(String value) {
            addCriterion("pk_score_detail_id <>", value, "pkScoreDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreDetailIdGreaterThan(String value) {
            addCriterion("pk_score_detail_id >", value, "pkScoreDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_score_detail_id >=", value, "pkScoreDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreDetailIdLessThan(String value) {
            addCriterion("pk_score_detail_id <", value, "pkScoreDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreDetailIdLessThanOrEqualTo(String value) {
            addCriterion("pk_score_detail_id <=", value, "pkScoreDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreDetailIdLike(String value) {
            addCriterion("pk_score_detail_id like", value, "pkScoreDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreDetailIdNotLike(String value) {
            addCriterion("pk_score_detail_id not like", value, "pkScoreDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreDetailIdIn(List<String> values) {
            addCriterion("pk_score_detail_id in", values, "pkScoreDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreDetailIdNotIn(List<String> values) {
            addCriterion("pk_score_detail_id not in", values, "pkScoreDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreDetailIdBetween(String value1, String value2) {
            addCriterion("pk_score_detail_id between", value1, value2, "pkScoreDetailId");
            return (Criteria) this;
        }

        public Criteria andPkScoreDetailIdNotBetween(String value1, String value2) {
            addCriterion("pk_score_detail_id not between", value1, value2, "pkScoreDetailId");
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

        public Criteria andScoreTimeIsNull() {
            addCriterion("score_time is null");
            return (Criteria) this;
        }

        public Criteria andScoreTimeIsNotNull() {
            addCriterion("score_time is not null");
            return (Criteria) this;
        }

        public Criteria andScoreTimeEqualTo(Date value) {
            addCriterion("score_time =", value, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeNotEqualTo(Date value) {
            addCriterion("score_time <>", value, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeGreaterThan(Date value) {
            addCriterion("score_time >", value, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("score_time >=", value, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeLessThan(Date value) {
            addCriterion("score_time <", value, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeLessThanOrEqualTo(Date value) {
            addCriterion("score_time <=", value, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeIn(List<Date> values) {
            addCriterion("score_time in", values, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeNotIn(List<Date> values) {
            addCriterion("score_time not in", values, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeBetween(Date value1, Date value2) {
            addCriterion("score_time between", value1, value2, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeNotBetween(Date value1, Date value2) {
            addCriterion("score_time not between", value1, value2, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreContentIsNull() {
            addCriterion("score_content is null");
            return (Criteria) this;
        }

        public Criteria andScoreContentIsNotNull() {
            addCriterion("score_content is not null");
            return (Criteria) this;
        }

        public Criteria andScoreContentEqualTo(String value) {
            addCriterion("score_content =", value, "scoreContent");
            return (Criteria) this;
        }

        public Criteria andScoreContentNotEqualTo(String value) {
            addCriterion("score_content <>", value, "scoreContent");
            return (Criteria) this;
        }

        public Criteria andScoreContentGreaterThan(String value) {
            addCriterion("score_content >", value, "scoreContent");
            return (Criteria) this;
        }

        public Criteria andScoreContentGreaterThanOrEqualTo(String value) {
            addCriterion("score_content >=", value, "scoreContent");
            return (Criteria) this;
        }

        public Criteria andScoreContentLessThan(String value) {
            addCriterion("score_content <", value, "scoreContent");
            return (Criteria) this;
        }

        public Criteria andScoreContentLessThanOrEqualTo(String value) {
            addCriterion("score_content <=", value, "scoreContent");
            return (Criteria) this;
        }

        public Criteria andScoreContentLike(String value) {
            addCriterion("score_content like", value, "scoreContent");
            return (Criteria) this;
        }

        public Criteria andScoreContentNotLike(String value) {
            addCriterion("score_content not like", value, "scoreContent");
            return (Criteria) this;
        }

        public Criteria andScoreContentIn(List<String> values) {
            addCriterion("score_content in", values, "scoreContent");
            return (Criteria) this;
        }

        public Criteria andScoreContentNotIn(List<String> values) {
            addCriterion("score_content not in", values, "scoreContent");
            return (Criteria) this;
        }

        public Criteria andScoreContentBetween(String value1, String value2) {
            addCriterion("score_content between", value1, value2, "scoreContent");
            return (Criteria) this;
        }

        public Criteria andScoreContentNotBetween(String value1, String value2) {
            addCriterion("score_content not between", value1, value2, "scoreContent");
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

        public Criteria andScoreRuleDetailIdIsNull() {
            addCriterion("score_rule_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andScoreRuleDetailIdIsNotNull() {
            addCriterion("score_rule_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andScoreRuleDetailIdEqualTo(String value) {
            addCriterion("score_rule_detail_id =", value, "scoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleDetailIdNotEqualTo(String value) {
            addCriterion("score_rule_detail_id <>", value, "scoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleDetailIdGreaterThan(String value) {
            addCriterion("score_rule_detail_id >", value, "scoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("score_rule_detail_id >=", value, "scoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleDetailIdLessThan(String value) {
            addCriterion("score_rule_detail_id <", value, "scoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleDetailIdLessThanOrEqualTo(String value) {
            addCriterion("score_rule_detail_id <=", value, "scoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleDetailIdLike(String value) {
            addCriterion("score_rule_detail_id like", value, "scoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleDetailIdNotLike(String value) {
            addCriterion("score_rule_detail_id not like", value, "scoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleDetailIdIn(List<String> values) {
            addCriterion("score_rule_detail_id in", values, "scoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleDetailIdNotIn(List<String> values) {
            addCriterion("score_rule_detail_id not in", values, "scoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleDetailIdBetween(String value1, String value2) {
            addCriterion("score_rule_detail_id between", value1, value2, "scoreRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andScoreRuleDetailIdNotBetween(String value1, String value2) {
            addCriterion("score_rule_detail_id not between", value1, value2, "scoreRuleDetailId");
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

        public Criteria andSumScoreIsNull() {
            addCriterion("sum_score is null");
            return (Criteria) this;
        }

        public Criteria andSumScoreIsNotNull() {
            addCriterion("sum_score is not null");
            return (Criteria) this;
        }

        public Criteria andSumScoreEqualTo(BigDecimal value) {
            addCriterion("sum_score =", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreNotEqualTo(BigDecimal value) {
            addCriterion("sum_score <>", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreGreaterThan(BigDecimal value) {
            addCriterion("sum_score >", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_score >=", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreLessThan(BigDecimal value) {
            addCriterion("sum_score <", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_score <=", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreIn(List<BigDecimal> values) {
            addCriterion("sum_score in", values, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreNotIn(List<BigDecimal> values) {
            addCriterion("sum_score not in", values, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_score between", value1, value2, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_score not between", value1, value2, "sumScore");
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
     * the database table md_stuff_score_detail
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
     * the database table md_stuff_score_detail
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