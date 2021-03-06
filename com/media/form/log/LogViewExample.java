package com.media.form.log;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogViewExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public LogViewExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
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
     * This method corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
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

        public Criteria andPkLogIdIsNull() {
            addCriterion("pk_log_id is null");
            return (Criteria) this;
        }

        public Criteria andPkLogIdIsNotNull() {
            addCriterion("pk_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkLogIdEqualTo(String value) {
            addCriterion("pk_log_id =", value, "pkLogId");
            return (Criteria) this;
        }

        public Criteria andPkLogIdNotEqualTo(String value) {
            addCriterion("pk_log_id <>", value, "pkLogId");
            return (Criteria) this;
        }

        public Criteria andPkLogIdGreaterThan(String value) {
            addCriterion("pk_log_id >", value, "pkLogId");
            return (Criteria) this;
        }

        public Criteria andPkLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_log_id >=", value, "pkLogId");
            return (Criteria) this;
        }

        public Criteria andPkLogIdLessThan(String value) {
            addCriterion("pk_log_id <", value, "pkLogId");
            return (Criteria) this;
        }

        public Criteria andPkLogIdLessThanOrEqualTo(String value) {
            addCriterion("pk_log_id <=", value, "pkLogId");
            return (Criteria) this;
        }

        public Criteria andPkLogIdLike(String value) {
            addCriterion("pk_log_id like", value, "pkLogId");
            return (Criteria) this;
        }

        public Criteria andPkLogIdNotLike(String value) {
            addCriterion("pk_log_id not like", value, "pkLogId");
            return (Criteria) this;
        }

        public Criteria andPkLogIdIn(List<String> values) {
            addCriterion("pk_log_id in", values, "pkLogId");
            return (Criteria) this;
        }

        public Criteria andPkLogIdNotIn(List<String> values) {
            addCriterion("pk_log_id not in", values, "pkLogId");
            return (Criteria) this;
        }

        public Criteria andPkLogIdBetween(String value1, String value2) {
            addCriterion("pk_log_id between", value1, value2, "pkLogId");
            return (Criteria) this;
        }

        public Criteria andPkLogIdNotBetween(String value1, String value2) {
            addCriterion("pk_log_id not between", value1, value2, "pkLogId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andMethodnameIsNull() {
            addCriterion("methodName is null");
            return (Criteria) this;
        }

        public Criteria andMethodnameIsNotNull() {
            addCriterion("methodName is not null");
            return (Criteria) this;
        }

        public Criteria andMethodnameEqualTo(String value) {
            addCriterion("methodName =", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameNotEqualTo(String value) {
            addCriterion("methodName <>", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameGreaterThan(String value) {
            addCriterion("methodName >", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameGreaterThanOrEqualTo(String value) {
            addCriterion("methodName >=", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameLessThan(String value) {
            addCriterion("methodName <", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameLessThanOrEqualTo(String value) {
            addCriterion("methodName <=", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameLike(String value) {
            addCriterion("methodName like", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameNotLike(String value) {
            addCriterion("methodName not like", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameIn(List<String> values) {
            addCriterion("methodName in", values, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameNotIn(List<String> values) {
            addCriterion("methodName not in", values, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameBetween(String value1, String value2) {
            addCriterion("methodName between", value1, value2, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameNotBetween(String value1, String value2) {
            addCriterion("methodName not between", value1, value2, "methodname");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andParamsIsNull() {
            addCriterion("params is null");
            return (Criteria) this;
        }

        public Criteria andParamsIsNotNull() {
            addCriterion("params is not null");
            return (Criteria) this;
        }

        public Criteria andParamsEqualTo(String value) {
            addCriterion("params =", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotEqualTo(String value) {
            addCriterion("params <>", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThan(String value) {
            addCriterion("params >", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThanOrEqualTo(String value) {
            addCriterion("params >=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThan(String value) {
            addCriterion("params <", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThanOrEqualTo(String value) {
            addCriterion("params <=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLike(String value) {
            addCriterion("params like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotLike(String value) {
            addCriterion("params not like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsIn(List<String> values) {
            addCriterion("params in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotIn(List<String> values) {
            addCriterion("params not in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsBetween(String value1, String value2) {
            addCriterion("params between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotBetween(String value1, String value2) {
            addCriterion("params not between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNull() {
            addCriterion("loginIP is null");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNotNull() {
            addCriterion("loginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLoginipEqualTo(String value) {
            addCriterion("loginIP =", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotEqualTo(String value) {
            addCriterion("loginIP <>", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThan(String value) {
            addCriterion("loginIP >", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("loginIP >=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThan(String value) {
            addCriterion("loginIP <", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThanOrEqualTo(String value) {
            addCriterion("loginIP <=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLike(String value) {
            addCriterion("loginIP like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotLike(String value) {
            addCriterion("loginIP not like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipIn(List<String> values) {
            addCriterion("loginIP in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotIn(List<String> values) {
            addCriterion("loginIP not in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipBetween(String value1, String value2) {
            addCriterion("loginIP between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotBetween(String value1, String value2) {
            addCriterion("loginIP not between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andRequedateIsNull() {
            addCriterion("requeDate is null");
            return (Criteria) this;
        }

        public Criteria andRequedateIsNotNull() {
            addCriterion("requeDate is not null");
            return (Criteria) this;
        }

        public Criteria andRequedateEqualTo(Date value) {
            addCriterion("requeDate =", value, "requedate");
            return (Criteria) this;
        }

        public Criteria andRequedateNotEqualTo(Date value) {
            addCriterion("requeDate <>", value, "requedate");
            return (Criteria) this;
        }

        public Criteria andRequedateGreaterThan(Date value) {
            addCriterion("requeDate >", value, "requedate");
            return (Criteria) this;
        }

        public Criteria andRequedateGreaterThanOrEqualTo(Date value) {
            addCriterion("requeDate >=", value, "requedate");
            return (Criteria) this;
        }

        public Criteria andRequedateLessThan(Date value) {
            addCriterion("requeDate <", value, "requedate");
            return (Criteria) this;
        }

        public Criteria andRequedateLessThanOrEqualTo(Date value) {
            addCriterion("requeDate <=", value, "requedate");
            return (Criteria) this;
        }

        public Criteria andRequedateIn(List<Date> values) {
            addCriterion("requeDate in", values, "requedate");
            return (Criteria) this;
        }

        public Criteria andRequedateNotIn(List<Date> values) {
            addCriterion("requeDate not in", values, "requedate");
            return (Criteria) this;
        }

        public Criteria andRequedateBetween(Date value1, Date value2) {
            addCriterion("requeDate between", value1, value2, "requedate");
            return (Criteria) this;
        }

        public Criteria andRequedateNotBetween(Date value1, Date value2) {
            addCriterion("requeDate not between", value1, value2, "requedate");
            return (Criteria) this;
        }

        public Criteria andRespdateIsNull() {
            addCriterion("respDate is null");
            return (Criteria) this;
        }

        public Criteria andRespdateIsNotNull() {
            addCriterion("respDate is not null");
            return (Criteria) this;
        }

        public Criteria andRespdateEqualTo(Date value) {
            addCriterion("respDate =", value, "respdate");
            return (Criteria) this;
        }

        public Criteria andRespdateNotEqualTo(Date value) {
            addCriterion("respDate <>", value, "respdate");
            return (Criteria) this;
        }

        public Criteria andRespdateGreaterThan(Date value) {
            addCriterion("respDate >", value, "respdate");
            return (Criteria) this;
        }

        public Criteria andRespdateGreaterThanOrEqualTo(Date value) {
            addCriterion("respDate >=", value, "respdate");
            return (Criteria) this;
        }

        public Criteria andRespdateLessThan(Date value) {
            addCriterion("respDate <", value, "respdate");
            return (Criteria) this;
        }

        public Criteria andRespdateLessThanOrEqualTo(Date value) {
            addCriterion("respDate <=", value, "respdate");
            return (Criteria) this;
        }

        public Criteria andRespdateIn(List<Date> values) {
            addCriterion("respDate in", values, "respdate");
            return (Criteria) this;
        }

        public Criteria andRespdateNotIn(List<Date> values) {
            addCriterion("respDate not in", values, "respdate");
            return (Criteria) this;
        }

        public Criteria andRespdateBetween(Date value1, Date value2) {
            addCriterion("respDate between", value1, value2, "respdate");
            return (Criteria) this;
        }

        public Criteria andRespdateNotBetween(Date value1, Date value2) {
            addCriterion("respDate not between", value1, value2, "respdate");
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

        public Criteria andDelStatusIsNull() {
            addCriterion("del_status is null");
            return (Criteria) this;
        }

        public Criteria andDelStatusIsNotNull() {
            addCriterion("del_status is not null");
            return (Criteria) this;
        }

        public Criteria andDelStatusEqualTo(Integer value) {
            addCriterion("del_status =", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotEqualTo(Integer value) {
            addCriterion("del_status <>", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusGreaterThan(Integer value) {
            addCriterion("del_status >", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_status >=", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusLessThan(Integer value) {
            addCriterion("del_status <", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusLessThanOrEqualTo(Integer value) {
            addCriterion("del_status <=", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusIn(List<Integer> values) {
            addCriterion("del_status in", values, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotIn(List<Integer> values) {
            addCriterion("del_status not in", values, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusBetween(Integer value1, Integer value2) {
            addCriterion("del_status between", value1, value2, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("del_status not between", value1, value2, "delStatus");
            return (Criteria) this;
        }

        public Criteria andLogNumIsNull() {
            addCriterion("log_num is null");
            return (Criteria) this;
        }

        public Criteria andLogNumIsNotNull() {
            addCriterion("log_num is not null");
            return (Criteria) this;
        }

        public Criteria andLogNumEqualTo(String value) {
            addCriterion("log_num =", value, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumNotEqualTo(String value) {
            addCriterion("log_num <>", value, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumGreaterThan(String value) {
            addCriterion("log_num >", value, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumGreaterThanOrEqualTo(String value) {
            addCriterion("log_num >=", value, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumLessThan(String value) {
            addCriterion("log_num <", value, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumLessThanOrEqualTo(String value) {
            addCriterion("log_num <=", value, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumLike(String value) {
            addCriterion("log_num like", value, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumNotLike(String value) {
            addCriterion("log_num not like", value, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumIn(List<String> values) {
            addCriterion("log_num in", values, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumNotIn(List<String> values) {
            addCriterion("log_num not in", values, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumBetween(String value1, String value2) {
            addCriterion("log_num between", value1, value2, "logNum");
            return (Criteria) this;
        }

        public Criteria andLogNumNotBetween(String value1, String value2) {
            addCriterion("log_num not between", value1, value2, "logNum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table md_log
     *
     * @mbg.generated do_not_delete_during_merge Sun Nov 25 11:55:46 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table md_log
     *
     * @mbg.generated Sun Nov 25 11:55:46 CST 2018
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