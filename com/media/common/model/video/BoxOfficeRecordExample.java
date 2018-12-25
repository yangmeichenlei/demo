package com.media.common.model.video;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhaoRong
 *
 */
public class BoxOfficeRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoxOfficeRecordExample() {
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

        public Criteria andPkBoxOfficeRecordIdIsNull() {
            addCriterion("pk_box_office_record_id is null");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeRecordIdIsNotNull() {
            addCriterion("pk_box_office_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeRecordIdEqualTo(String value) {
            addCriterion("pk_box_office_record_id =", value, "pkBoxOfficeRecordId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeRecordIdNotEqualTo(String value) {
            addCriterion("pk_box_office_record_id <>", value, "pkBoxOfficeRecordId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeRecordIdGreaterThan(String value) {
            addCriterion("pk_box_office_record_id >", value, "pkBoxOfficeRecordId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_box_office_record_id >=", value, "pkBoxOfficeRecordId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeRecordIdLessThan(String value) {
            addCriterion("pk_box_office_record_id <", value, "pkBoxOfficeRecordId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeRecordIdLessThanOrEqualTo(String value) {
            addCriterion("pk_box_office_record_id <=", value, "pkBoxOfficeRecordId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeRecordIdLike(String value) {
            addCriterion("pk_box_office_record_id like", value, "pkBoxOfficeRecordId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeRecordIdNotLike(String value) {
            addCriterion("pk_box_office_record_id not like", value, "pkBoxOfficeRecordId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeRecordIdIn(List<String> values) {
            addCriterion("pk_box_office_record_id in", values, "pkBoxOfficeRecordId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeRecordIdNotIn(List<String> values) {
            addCriterion("pk_box_office_record_id not in", values, "pkBoxOfficeRecordId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeRecordIdBetween(String value1, String value2) {
            addCriterion("pk_box_office_record_id between", value1, value2, "pkBoxOfficeRecordId");
            return (Criteria) this;
        }

        public Criteria andPkBoxOfficeRecordIdNotBetween(String value1, String value2) {
            addCriterion("pk_box_office_record_id not between", value1, value2, "pkBoxOfficeRecordId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(String value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(String value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(String value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(String value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(String value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(String value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLike(String value) {
            addCriterion("video_id like", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotLike(String value) {
            addCriterion("video_id not like", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<String> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<String> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(String value1, String value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(String value1, String value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
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

        public Criteria andTicketPriceIsNull() {
            addCriterion("ticket_price is null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIsNotNull() {
            addCriterion("ticket_price is not null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceEqualTo(BigDecimal value) {
            addCriterion("ticket_price =", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotEqualTo(BigDecimal value) {
            addCriterion("ticket_price <>", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceGreaterThan(BigDecimal value) {
            addCriterion("ticket_price >", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ticket_price >=", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLessThan(BigDecimal value) {
            addCriterion("ticket_price <", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ticket_price <=", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIn(List<BigDecimal> values) {
            addCriterion("ticket_price in", values, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotIn(List<BigDecimal> values) {
            addCriterion("ticket_price not in", values, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ticket_price between", value1, value2, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ticket_price not between", value1, value2, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceRuleIdIsNull() {
            addCriterion("ticket_price_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceRuleIdIsNotNull() {
            addCriterion("ticket_price_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceRuleIdEqualTo(String value) {
            addCriterion("ticket_price_rule_id =", value, "ticketPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andTicketPriceRuleIdNotEqualTo(String value) {
            addCriterion("ticket_price_rule_id <>", value, "ticketPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andTicketPriceRuleIdGreaterThan(String value) {
            addCriterion("ticket_price_rule_id >", value, "ticketPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andTicketPriceRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_price_rule_id >=", value, "ticketPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andTicketPriceRuleIdLessThan(String value) {
            addCriterion("ticket_price_rule_id <", value, "ticketPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andTicketPriceRuleIdLessThanOrEqualTo(String value) {
            addCriterion("ticket_price_rule_id <=", value, "ticketPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andTicketPriceRuleIdLike(String value) {
            addCriterion("ticket_price_rule_id like", value, "ticketPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andTicketPriceRuleIdNotLike(String value) {
            addCriterion("ticket_price_rule_id not like", value, "ticketPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andTicketPriceRuleIdIn(List<String> values) {
            addCriterion("ticket_price_rule_id in", values, "ticketPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andTicketPriceRuleIdNotIn(List<String> values) {
            addCriterion("ticket_price_rule_id not in", values, "ticketPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andTicketPriceRuleIdBetween(String value1, String value2) {
            addCriterion("ticket_price_rule_id between", value1, value2, "ticketPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andTicketPriceRuleIdNotBetween(String value1, String value2) {
            addCriterion("ticket_price_rule_id not between", value1, value2, "ticketPriceRuleId");
            return (Criteria) this;
        }

        public Criteria andActualPayIsNull() {
            addCriterion("actual_pay is null");
            return (Criteria) this;
        }

        public Criteria andActualPayIsNotNull() {
            addCriterion("actual_pay is not null");
            return (Criteria) this;
        }

        public Criteria andActualPayEqualTo(BigDecimal value) {
            addCriterion("actual_pay =", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotEqualTo(BigDecimal value) {
            addCriterion("actual_pay <>", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayGreaterThan(BigDecimal value) {
            addCriterion("actual_pay >", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_pay >=", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayLessThan(BigDecimal value) {
            addCriterion("actual_pay <", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actual_pay <=", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayIn(List<BigDecimal> values) {
            addCriterion("actual_pay in", values, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotIn(List<BigDecimal> values) {
            addCriterion("actual_pay not in", values, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_pay between", value1, value2, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actual_pay not between", value1, value2, "actualPay");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
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