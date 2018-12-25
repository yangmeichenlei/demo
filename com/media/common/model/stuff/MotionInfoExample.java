package com.media.common.model.stuff;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MotionInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table md_motioninfo
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table md_motioninfo
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table md_motioninfo
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_motioninfo
     *
     * @mbg.generated
     */
    public MotionInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_motioninfo
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_motioninfo
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_motioninfo
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_motioninfo
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_motioninfo
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_motioninfo
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_motioninfo
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_motioninfo
     *
     * @mbg.generated
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
     * This method corresponds to the database table md_motioninfo
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_motioninfo
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table md_motioninfo
     *
     * @mbg.generated
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

        public Criteria andPkStuffIdIsNull() {
            addCriterion("pk_stuff_id is null");
            return (Criteria) this;
        }

        public Criteria andPkStuffIdIsNotNull() {
            addCriterion("pk_stuff_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkStuffIdEqualTo(String value) {
            addCriterion("pk_stuff_id =", value, "pkStuffId");
            return (Criteria) this;
        }

        public Criteria andPkStuffIdNotEqualTo(String value) {
            addCriterion("pk_stuff_id <>", value, "pkStuffId");
            return (Criteria) this;
        }

        public Criteria andPkStuffIdGreaterThan(String value) {
            addCriterion("pk_stuff_id >", value, "pkStuffId");
            return (Criteria) this;
        }

        public Criteria andPkStuffIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_stuff_id >=", value, "pkStuffId");
            return (Criteria) this;
        }

        public Criteria andPkStuffIdLessThan(String value) {
            addCriterion("pk_stuff_id <", value, "pkStuffId");
            return (Criteria) this;
        }

        public Criteria andPkStuffIdLessThanOrEqualTo(String value) {
            addCriterion("pk_stuff_id <=", value, "pkStuffId");
            return (Criteria) this;
        }

        public Criteria andPkStuffIdLike(String value) {
            addCriterion("pk_stuff_id like", value, "pkStuffId");
            return (Criteria) this;
        }

        public Criteria andPkStuffIdNotLike(String value) {
            addCriterion("pk_stuff_id not like", value, "pkStuffId");
            return (Criteria) this;
        }

        public Criteria andPkStuffIdIn(List<String> values) {
            addCriterion("pk_stuff_id in", values, "pkStuffId");
            return (Criteria) this;
        }

        public Criteria andPkStuffIdNotIn(List<String> values) {
            addCriterion("pk_stuff_id not in", values, "pkStuffId");
            return (Criteria) this;
        }

        public Criteria andPkStuffIdBetween(String value1, String value2) {
            addCriterion("pk_stuff_id between", value1, value2, "pkStuffId");
            return (Criteria) this;
        }

        public Criteria andPkStuffIdNotBetween(String value1, String value2) {
            addCriterion("pk_stuff_id not between", value1, value2, "pkStuffId");
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

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginTerminalIsNull() {
            addCriterion("login_terminal is null");
            return (Criteria) this;
        }

        public Criteria andLoginTerminalIsNotNull() {
            addCriterion("login_terminal is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTerminalEqualTo(Integer value) {
            addCriterion("login_terminal =", value, "loginTerminal");
            return (Criteria) this;
        }

        public Criteria andLoginTerminalNotEqualTo(Integer value) {
            addCriterion("login_terminal <>", value, "loginTerminal");
            return (Criteria) this;
        }

        public Criteria andLoginTerminalGreaterThan(Integer value) {
            addCriterion("login_terminal >", value, "loginTerminal");
            return (Criteria) this;
        }

        public Criteria andLoginTerminalGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_terminal >=", value, "loginTerminal");
            return (Criteria) this;
        }

        public Criteria andLoginTerminalLessThan(Integer value) {
            addCriterion("login_terminal <", value, "loginTerminal");
            return (Criteria) this;
        }

        public Criteria andLoginTerminalLessThanOrEqualTo(Integer value) {
            addCriterion("login_terminal <=", value, "loginTerminal");
            return (Criteria) this;
        }

        public Criteria andLoginTerminalIn(List<Integer> values) {
            addCriterion("login_terminal in", values, "loginTerminal");
            return (Criteria) this;
        }

        public Criteria andLoginTerminalNotIn(List<Integer> values) {
            addCriterion("login_terminal not in", values, "loginTerminal");
            return (Criteria) this;
        }

        public Criteria andLoginTerminalBetween(Integer value1, Integer value2) {
            addCriterion("login_terminal between", value1, value2, "loginTerminal");
            return (Criteria) this;
        }

        public Criteria andLoginTerminalNotBetween(Integer value1, Integer value2) {
            addCriterion("login_terminal not between", value1, value2, "loginTerminal");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table md_motioninfo
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table md_motioninfo
     *
     * @mbg.generated
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