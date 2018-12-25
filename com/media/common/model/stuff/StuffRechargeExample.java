package com.media.common.model.stuff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhaorong on 2018/11/25.
 */
public class StuffRechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuffRechargeExample() {
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

        public Criteria andPkRechargeIdIsNull() {
            addCriterion("pk_recharge_id is null");
            return (Criteria) this;
        }

        public Criteria andPkRechargeIdIsNotNull() {
            addCriterion("pk_recharge_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkRechargeIdEqualTo(String value) {
            addCriterion("pk_recharge_id =", value, "pkRechargeId");
            return (Criteria) this;
        }

        public Criteria andPkRechargeIdNotEqualTo(String value) {
            addCriterion("pk_recharge_id <>", value, "pkRechargeId");
            return (Criteria) this;
        }

        public Criteria andPkRechargeIdGreaterThan(String value) {
            addCriterion("pk_recharge_id >", value, "pkRechargeId");
            return (Criteria) this;
        }

        public Criteria andPkRechargeIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_recharge_id >=", value, "pkRechargeId");
            return (Criteria) this;
        }

        public Criteria andPkRechargeIdLessThan(String value) {
            addCriterion("pk_recharge_id <", value, "pkRechargeId");
            return (Criteria) this;
        }

        public Criteria andPkRechargeIdLessThanOrEqualTo(String value) {
            addCriterion("pk_recharge_id <=", value, "pkRechargeId");
            return (Criteria) this;
        }

        public Criteria andPkRechargeIdLike(String value) {
            addCriterion("pk_recharge_id like", value, "pkRechargeId");
            return (Criteria) this;
        }

        public Criteria andPkRechargeIdNotLike(String value) {
            addCriterion("pk_recharge_id not like", value, "pkRechargeId");
            return (Criteria) this;
        }

        public Criteria andPkRechargeIdIn(List<String> values) {
            addCriterion("pk_recharge_id in", values, "pkRechargeId");
            return (Criteria) this;
        }

        public Criteria andPkRechargeIdNotIn(List<String> values) {
            addCriterion("pk_recharge_id not in", values, "pkRechargeId");
            return (Criteria) this;
        }

        public Criteria andPkRechargeIdBetween(String value1, String value2) {
            addCriterion("pk_recharge_id between", value1, value2, "pkRechargeId");
            return (Criteria) this;
        }

        public Criteria andPkRechargeIdNotBetween(String value1, String value2) {
            addCriterion("pk_recharge_id not between", value1, value2, "pkRechargeId");
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

        public Criteria andRechargeRuleIdIsNull() {
            addCriterion("recharge_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andRechargeRuleIdIsNotNull() {
            addCriterion("recharge_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeRuleIdEqualTo(String value) {
            addCriterion("recharge_rule_id =", value, "rechargeRuleId");
            return (Criteria) this;
        }

        public Criteria andRechargeRuleIdNotEqualTo(String value) {
            addCriterion("recharge_rule_id <>", value, "rechargeRuleId");
            return (Criteria) this;
        }

        public Criteria andRechargeRuleIdGreaterThan(String value) {
            addCriterion("recharge_rule_id >", value, "rechargeRuleId");
            return (Criteria) this;
        }

        public Criteria andRechargeRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_rule_id >=", value, "rechargeRuleId");
            return (Criteria) this;
        }

        public Criteria andRechargeRuleIdLessThan(String value) {
            addCriterion("recharge_rule_id <", value, "rechargeRuleId");
            return (Criteria) this;
        }

        public Criteria andRechargeRuleIdLessThanOrEqualTo(String value) {
            addCriterion("recharge_rule_id <=", value, "rechargeRuleId");
            return (Criteria) this;
        }

        public Criteria andRechargeRuleIdLike(String value) {
            addCriterion("recharge_rule_id like", value, "rechargeRuleId");
            return (Criteria) this;
        }

        public Criteria andRechargeRuleIdNotLike(String value) {
            addCriterion("recharge_rule_id not like", value, "rechargeRuleId");
            return (Criteria) this;
        }

        public Criteria andRechargeRuleIdIn(List<String> values) {
            addCriterion("recharge_rule_id in", values, "rechargeRuleId");
            return (Criteria) this;
        }

        public Criteria andRechargeRuleIdNotIn(List<String> values) {
            addCriterion("recharge_rule_id not in", values, "rechargeRuleId");
            return (Criteria) this;
        }

        public Criteria andRechargeRuleIdBetween(String value1, String value2) {
            addCriterion("recharge_rule_id between", value1, value2, "rechargeRuleId");
            return (Criteria) this;
        }

        public Criteria andRechargeRuleIdNotBetween(String value1, String value2) {
            addCriterion("recharge_rule_id not between", value1, value2, "rechargeRuleId");
            return (Criteria) this;
        }

        public Criteria andRechargeCountIsNull() {
            addCriterion("recharge_count is null");
            return (Criteria) this;
        }

        public Criteria andRechargeCountIsNotNull() {
            addCriterion("recharge_count is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeCountEqualTo(BigDecimal value) {
            addCriterion("recharge_count =", value, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountNotEqualTo(BigDecimal value) {
            addCriterion("recharge_count <>", value, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountGreaterThan(BigDecimal value) {
            addCriterion("recharge_count >", value, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_count >=", value, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountLessThan(BigDecimal value) {
            addCriterion("recharge_count <", value, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_count <=", value, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountIn(List<BigDecimal> values) {
            addCriterion("recharge_count in", values, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountNotIn(List<BigDecimal> values) {
            addCriterion("recharge_count not in", values, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_count between", value1, value2, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_count not between", value1, value2, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeRealityCountIsNull() {
            addCriterion("recharge_reality_count is null");
            return (Criteria) this;
        }

        public Criteria andRechargeRealityCountIsNotNull() {
            addCriterion("recharge_reality_count is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeRealityCountEqualTo(BigDecimal value) {
            addCriterion("recharge_reality_count =", value, "rechargeRealityCount");
            return (Criteria) this;
        }

        public Criteria andRechargeRealityCountNotEqualTo(BigDecimal value) {
            addCriterion("recharge_reality_count <>", value, "rechargeRealityCount");
            return (Criteria) this;
        }

        public Criteria andRechargeRealityCountGreaterThan(BigDecimal value) {
            addCriterion("recharge_reality_count >", value, "rechargeRealityCount");
            return (Criteria) this;
        }

        public Criteria andRechargeRealityCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_reality_count >=", value, "rechargeRealityCount");
            return (Criteria) this;
        }

        public Criteria andRechargeRealityCountLessThan(BigDecimal value) {
            addCriterion("recharge_reality_count <", value, "rechargeRealityCount");
            return (Criteria) this;
        }

        public Criteria andRechargeRealityCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_reality_count <=", value, "rechargeRealityCount");
            return (Criteria) this;
        }

        public Criteria andRechargeRealityCountIn(List<BigDecimal> values) {
            addCriterion("recharge_reality_count in", values, "rechargeRealityCount");
            return (Criteria) this;
        }

        public Criteria andRechargeRealityCountNotIn(List<BigDecimal> values) {
            addCriterion("recharge_reality_count not in", values, "rechargeRealityCount");
            return (Criteria) this;
        }

        public Criteria andRechargeRealityCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_reality_count between", value1, value2, "rechargeRealityCount");
            return (Criteria) this;
        }

        public Criteria andRechargeRealityCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_reality_count not between", value1, value2, "rechargeRealityCount");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNull() {
            addCriterion("recharge_time is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNotNull() {
            addCriterion("recharge_time is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeEqualTo(Date value) {
            addCriterion("recharge_time =", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotEqualTo(Date value) {
            addCriterion("recharge_time <>", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThan(Date value) {
            addCriterion("recharge_time >", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recharge_time >=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThan(Date value) {
            addCriterion("recharge_time <", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("recharge_time <=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIn(List<Date> values) {
            addCriterion("recharge_time in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotIn(List<Date> values) {
            addCriterion("recharge_time not in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeBetween(Date value1, Date value2) {
            addCriterion("recharge_time between", value1, value2, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("recharge_time not between", value1, value2, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeArriveTimeIsNull() {
            addCriterion("recharge_arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andRechargeArriveTimeIsNotNull() {
            addCriterion("recharge_arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeArriveTimeEqualTo(Date value) {
            addCriterion("recharge_arrive_time =", value, "rechargeArriveTime");
            return (Criteria) this;
        }

        public Criteria andRechargeArriveTimeNotEqualTo(Date value) {
            addCriterion("recharge_arrive_time <>", value, "rechargeArriveTime");
            return (Criteria) this;
        }

        public Criteria andRechargeArriveTimeGreaterThan(Date value) {
            addCriterion("recharge_arrive_time >", value, "rechargeArriveTime");
            return (Criteria) this;
        }

        public Criteria andRechargeArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recharge_arrive_time >=", value, "rechargeArriveTime");
            return (Criteria) this;
        }

        public Criteria andRechargeArriveTimeLessThan(Date value) {
            addCriterion("recharge_arrive_time <", value, "rechargeArriveTime");
            return (Criteria) this;
        }

        public Criteria andRechargeArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("recharge_arrive_time <=", value, "rechargeArriveTime");
            return (Criteria) this;
        }

        public Criteria andRechargeArriveTimeIn(List<Date> values) {
            addCriterion("recharge_arrive_time in", values, "rechargeArriveTime");
            return (Criteria) this;
        }

        public Criteria andRechargeArriveTimeNotIn(List<Date> values) {
            addCriterion("recharge_arrive_time not in", values, "rechargeArriveTime");
            return (Criteria) this;
        }

        public Criteria andRechargeArriveTimeBetween(Date value1, Date value2) {
            addCriterion("recharge_arrive_time between", value1, value2, "rechargeArriveTime");
            return (Criteria) this;
        }

        public Criteria andRechargeArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("recharge_arrive_time not between", value1, value2, "rechargeArriveTime");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusIsNull() {
            addCriterion("recharge_status is null");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusIsNotNull() {
            addCriterion("recharge_status is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusEqualTo(Integer value) {
            addCriterion("recharge_status =", value, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusNotEqualTo(Integer value) {
            addCriterion("recharge_status <>", value, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusGreaterThan(Integer value) {
            addCriterion("recharge_status >", value, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_status >=", value, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusLessThan(Integer value) {
            addCriterion("recharge_status <", value, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_status <=", value, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusIn(List<Integer> values) {
            addCriterion("recharge_status in", values, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusNotIn(List<Integer> values) {
            addCriterion("recharge_status not in", values, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusBetween(Integer value1, Integer value2) {
            addCriterion("recharge_status between", value1, value2, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_status not between", value1, value2, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIsNull() {
            addCriterion("recharge_type is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIsNotNull() {
            addCriterion("recharge_type is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeEqualTo(Integer value) {
            addCriterion("recharge_type =", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotEqualTo(Integer value) {
            addCriterion("recharge_type <>", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeGreaterThan(Integer value) {
            addCriterion("recharge_type >", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_type >=", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLessThan(Integer value) {
            addCriterion("recharge_type <", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_type <=", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIn(List<Integer> values) {
            addCriterion("recharge_type in", values, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotIn(List<Integer> values) {
            addCriterion("recharge_type not in", values, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeBetween(Integer value1, Integer value2) {
            addCriterion("recharge_type between", value1, value2, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_type not between", value1, value2, "rechargeType");
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