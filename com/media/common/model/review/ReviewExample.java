package com.media.common.model.review;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhaorong on 2018/11/08.
 */
public class ReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewExample() {
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

        public Criteria andPkReviewIdIsNull() {
            addCriterion("pk_review_id is null");
            return (Criteria) this;
        }

        public Criteria andPkReviewIdIsNotNull() {
            addCriterion("pk_review_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkReviewIdEqualTo(String value) {
            addCriterion("pk_review_id =", value, "pkReviewId");
            return (Criteria) this;
        }

        public Criteria andPkReviewIdNotEqualTo(String value) {
            addCriterion("pk_review_id <>", value, "pkReviewId");
            return (Criteria) this;
        }

        public Criteria andPkReviewIdGreaterThan(String value) {
            addCriterion("pk_review_id >", value, "pkReviewId");
            return (Criteria) this;
        }

        public Criteria andPkReviewIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_review_id >=", value, "pkReviewId");
            return (Criteria) this;
        }

        public Criteria andPkReviewIdLessThan(String value) {
            addCriterion("pk_review_id <", value, "pkReviewId");
            return (Criteria) this;
        }

        public Criteria andPkReviewIdLessThanOrEqualTo(String value) {
            addCriterion("pk_review_id <=", value, "pkReviewId");
            return (Criteria) this;
        }

        public Criteria andPkReviewIdLike(String value) {
            addCriterion("pk_review_id like", value, "pkReviewId");
            return (Criteria) this;
        }

        public Criteria andPkReviewIdNotLike(String value) {
            addCriterion("pk_review_id not like", value, "pkReviewId");
            return (Criteria) this;
        }

        public Criteria andPkReviewIdIn(List<String> values) {
            addCriterion("pk_review_id in", values, "pkReviewId");
            return (Criteria) this;
        }

        public Criteria andPkReviewIdNotIn(List<String> values) {
            addCriterion("pk_review_id not in", values, "pkReviewId");
            return (Criteria) this;
        }

        public Criteria andPkReviewIdBetween(String value1, String value2) {
            addCriterion("pk_review_id between", value1, value2, "pkReviewId");
            return (Criteria) this;
        }

        public Criteria andPkReviewIdNotBetween(String value1, String value2) {
            addCriterion("pk_review_id not between", value1, value2, "pkReviewId");
            return (Criteria) this;
        }

        public Criteria andParentReviewIdIsNull() {
            addCriterion("parent_review_id is null");
            return (Criteria) this;
        }

        public Criteria andParentReviewIdIsNotNull() {
            addCriterion("parent_review_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentReviewIdEqualTo(String value) {
            addCriterion("parent_review_id =", value, "parentReviewId");
            return (Criteria) this;
        }

        public Criteria andParentReviewIdNotEqualTo(String value) {
            addCriterion("parent_review_id <>", value, "parentReviewId");
            return (Criteria) this;
        }

        public Criteria andParentReviewIdGreaterThan(String value) {
            addCriterion("parent_review_id >", value, "parentReviewId");
            return (Criteria) this;
        }

        public Criteria andParentReviewIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_review_id >=", value, "parentReviewId");
            return (Criteria) this;
        }

        public Criteria andParentReviewIdLessThan(String value) {
            addCriterion("parent_review_id <", value, "parentReviewId");
            return (Criteria) this;
        }

        public Criteria andParentReviewIdLessThanOrEqualTo(String value) {
            addCriterion("parent_review_id <=", value, "parentReviewId");
            return (Criteria) this;
        }

        public Criteria andParentReviewIdLike(String value) {
            addCriterion("parent_review_id like", value, "parentReviewId");
            return (Criteria) this;
        }

        public Criteria andParentReviewIdNotLike(String value) {
            addCriterion("parent_review_id not like", value, "parentReviewId");
            return (Criteria) this;
        }

        public Criteria andParentReviewIdIn(List<String> values) {
            addCriterion("parent_review_id in", values, "parentReviewId");
            return (Criteria) this;
        }

        public Criteria andParentReviewIdNotIn(List<String> values) {
            addCriterion("parent_review_id not in", values, "parentReviewId");
            return (Criteria) this;
        }

        public Criteria andParentReviewIdBetween(String value1, String value2) {
            addCriterion("parent_review_id between", value1, value2, "parentReviewId");
            return (Criteria) this;
        }

        public Criteria andParentReviewIdNotBetween(String value1, String value2) {
            addCriterion("parent_review_id not between", value1, value2, "parentReviewId");
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

        public Criteria andPraisedNumIsNull() {
            addCriterion("praised_num is null");
            return (Criteria) this;
        }

        public Criteria andPraisedNumIsNotNull() {
            addCriterion("praised_num is not null");
            return (Criteria) this;
        }

        public Criteria andPraisedNumEqualTo(Integer value) {
            addCriterion("praised_num =", value, "praisedNum");
            return (Criteria) this;
        }

        public Criteria andPraisedNumNotEqualTo(Integer value) {
            addCriterion("praised_num <>", value, "praisedNum");
            return (Criteria) this;
        }

        public Criteria andPraisedNumGreaterThan(Integer value) {
            addCriterion("praised_num >", value, "praisedNum");
            return (Criteria) this;
        }

        public Criteria andPraisedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("praised_num >=", value, "praisedNum");
            return (Criteria) this;
        }

        public Criteria andPraisedNumLessThan(Integer value) {
            addCriterion("praised_num <", value, "praisedNum");
            return (Criteria) this;
        }

        public Criteria andPraisedNumLessThanOrEqualTo(Integer value) {
            addCriterion("praised_num <=", value, "praisedNum");
            return (Criteria) this;
        }

        public Criteria andPraisedNumIn(List<Integer> values) {
            addCriterion("praised_num in", values, "praisedNum");
            return (Criteria) this;
        }

        public Criteria andPraisedNumNotIn(List<Integer> values) {
            addCriterion("praised_num not in", values, "praisedNum");
            return (Criteria) this;
        }

        public Criteria andPraisedNumBetween(Integer value1, Integer value2) {
            addCriterion("praised_num between", value1, value2, "praisedNum");
            return (Criteria) this;
        }

        public Criteria andPraisedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("praised_num not between", value1, value2, "praisedNum");
            return (Criteria) this;
        }

        public Criteria andRepliedNumIsNull() {
            addCriterion("replied_num is null");
            return (Criteria) this;
        }

        public Criteria andRepliedNumIsNotNull() {
            addCriterion("replied_num is not null");
            return (Criteria) this;
        }

        public Criteria andRepliedNumEqualTo(Integer value) {
            addCriterion("replied_num =", value, "repliedNum");
            return (Criteria) this;
        }

        public Criteria andRepliedNumNotEqualTo(Integer value) {
            addCriterion("replied_num <>", value, "repliedNum");
            return (Criteria) this;
        }

        public Criteria andRepliedNumGreaterThan(Integer value) {
            addCriterion("replied_num >", value, "repliedNum");
            return (Criteria) this;
        }

        public Criteria andRepliedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("replied_num >=", value, "repliedNum");
            return (Criteria) this;
        }

        public Criteria andRepliedNumLessThan(Integer value) {
            addCriterion("replied_num <", value, "repliedNum");
            return (Criteria) this;
        }

        public Criteria andRepliedNumLessThanOrEqualTo(Integer value) {
            addCriterion("replied_num <=", value, "repliedNum");
            return (Criteria) this;
        }

        public Criteria andRepliedNumIn(List<Integer> values) {
            addCriterion("replied_num in", values, "repliedNum");
            return (Criteria) this;
        }

        public Criteria andRepliedNumNotIn(List<Integer> values) {
            addCriterion("replied_num not in", values, "repliedNum");
            return (Criteria) this;
        }

        public Criteria andRepliedNumBetween(Integer value1, Integer value2) {
            addCriterion("replied_num between", value1, value2, "repliedNum");
            return (Criteria) this;
        }

        public Criteria andRepliedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("replied_num not between", value1, value2, "repliedNum");
            return (Criteria) this;
        }

        public Criteria andIsTopIsNull() {
            addCriterion("is_top is null");
            return (Criteria) this;
        }

        public Criteria andIsTopIsNotNull() {
            addCriterion("is_top is not null");
            return (Criteria) this;
        }

        public Criteria andIsTopEqualTo(Integer value) {
            addCriterion("is_top =", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotEqualTo(Integer value) {
            addCriterion("is_top <>", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopGreaterThan(Integer value) {
            addCriterion("is_top >", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_top >=", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopLessThan(Integer value) {
            addCriterion("is_top <", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopLessThanOrEqualTo(Integer value) {
            addCriterion("is_top <=", value, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopIn(List<Integer> values) {
            addCriterion("is_top in", values, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotIn(List<Integer> values) {
            addCriterion("is_top not in", values, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopBetween(Integer value1, Integer value2) {
            addCriterion("is_top between", value1, value2, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsTopNotBetween(Integer value1, Integer value2) {
            addCriterion("is_top not between", value1, value2, "isTop");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Integer value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Integer value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Integer value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Integer value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Integer value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Integer> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Integer> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNull() {
            addCriterion("data_status is null");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNotNull() {
            addCriterion("data_status is not null");
            return (Criteria) this;
        }

        public Criteria andDataStatusEqualTo(Integer value) {
            addCriterion("data_status =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(Integer value) {
            addCriterion("data_status <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(Integer value) {
            addCriterion("data_status >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_status >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(Integer value) {
            addCriterion("data_status <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(Integer value) {
            addCriterion("data_status <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<Integer> values) {
            addCriterion("data_status in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<Integer> values) {
            addCriterion("data_status not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(Integer value1, Integer value2) {
            addCriterion("data_status between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("data_status not between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNull() {
            addCriterion("review_status is null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNotNull() {
            addCriterion("review_status is not null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusEqualTo(Integer value) {
            addCriterion("review_status =", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotEqualTo(Integer value) {
            addCriterion("review_status <>", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThan(Integer value) {
            addCriterion("review_status >", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_status >=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThan(Integer value) {
            addCriterion("review_status <", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThanOrEqualTo(Integer value) {
            addCriterion("review_status <=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIn(List<Integer> values) {
            addCriterion("review_status in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotIn(List<Integer> values) {
            addCriterion("review_status not in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusBetween(Integer value1, Integer value2) {
            addCriterion("review_status between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("review_status not between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdIsNull() {
            addCriterion("delete_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdIsNotNull() {
            addCriterion("delete_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdEqualTo(String value) {
            addCriterion("delete_user_id =", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdNotEqualTo(String value) {
            addCriterion("delete_user_id <>", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdGreaterThan(String value) {
            addCriterion("delete_user_id >", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("delete_user_id >=", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdLessThan(String value) {
            addCriterion("delete_user_id <", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdLessThanOrEqualTo(String value) {
            addCriterion("delete_user_id <=", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdLike(String value) {
            addCriterion("delete_user_id like", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdNotLike(String value) {
            addCriterion("delete_user_id not like", value, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdIn(List<String> values) {
            addCriterion("delete_user_id in", values, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdNotIn(List<String> values) {
            addCriterion("delete_user_id not in", values, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdBetween(String value1, String value2) {
            addCriterion("delete_user_id between", value1, value2, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteUserIdNotBetween(String value1, String value2) {
            addCriterion("delete_user_id not between", value1, value2, "deleteUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andAuditorUserIdIsNull() {
            addCriterion("auditor_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditorUserIdIsNotNull() {
            addCriterion("auditor_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorUserIdEqualTo(String value) {
            addCriterion("auditor_user_id =", value, "auditorUserId");
            return (Criteria) this;
        }

        public Criteria andAuditorUserIdNotEqualTo(String value) {
            addCriterion("auditor_user_id <>", value, "auditorUserId");
            return (Criteria) this;
        }

        public Criteria andAuditorUserIdGreaterThan(String value) {
            addCriterion("auditor_user_id >", value, "auditorUserId");
            return (Criteria) this;
        }

        public Criteria andAuditorUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("auditor_user_id >=", value, "auditorUserId");
            return (Criteria) this;
        }

        public Criteria andAuditorUserIdLessThan(String value) {
            addCriterion("auditor_user_id <", value, "auditorUserId");
            return (Criteria) this;
        }

        public Criteria andAuditorUserIdLessThanOrEqualTo(String value) {
            addCriterion("auditor_user_id <=", value, "auditorUserId");
            return (Criteria) this;
        }

        public Criteria andAuditorUserIdLike(String value) {
            addCriterion("auditor_user_id like", value, "auditorUserId");
            return (Criteria) this;
        }

        public Criteria andAuditorUserIdNotLike(String value) {
            addCriterion("auditor_user_id not like", value, "auditorUserId");
            return (Criteria) this;
        }

        public Criteria andAuditorUserIdIn(List<String> values) {
            addCriterion("auditor_user_id in", values, "auditorUserId");
            return (Criteria) this;
        }

        public Criteria andAuditorUserIdNotIn(List<String> values) {
            addCriterion("auditor_user_id not in", values, "auditorUserId");
            return (Criteria) this;
        }

        public Criteria andAuditorUserIdBetween(String value1, String value2) {
            addCriterion("auditor_user_id between", value1, value2, "auditorUserId");
            return (Criteria) this;
        }

        public Criteria andAuditorUserIdNotBetween(String value1, String value2) {
            addCriterion("auditor_user_id not between", value1, value2, "auditorUserId");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeIsNull() {
            addCriterion("auditor_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeIsNotNull() {
            addCriterion("auditor_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeEqualTo(Date value) {
            addCriterion("auditor_time =", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeNotEqualTo(Date value) {
            addCriterion("auditor_time <>", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeGreaterThan(Date value) {
            addCriterion("auditor_time >", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auditor_time >=", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeLessThan(Date value) {
            addCriterion("auditor_time <", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeLessThanOrEqualTo(Date value) {
            addCriterion("auditor_time <=", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeIn(List<Date> values) {
            addCriterion("auditor_time in", values, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeNotIn(List<Date> values) {
            addCriterion("auditor_time not in", values, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeBetween(Date value1, Date value2) {
            addCriterion("auditor_time between", value1, value2, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeNotBetween(Date value1, Date value2) {
            addCriterion("auditor_time not between", value1, value2, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andIsAuthorIsNull() {
            addCriterion("is_author is null");
            return (Criteria) this;
        }

        public Criteria andIsAuthorIsNotNull() {
            addCriterion("is_author is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuthorEqualTo(Integer value) {
            addCriterion("is_author =", value, "isAuthor");
            return (Criteria) this;
        }

        public Criteria andIsAuthorNotEqualTo(Integer value) {
            addCriterion("is_author <>", value, "isAuthor");
            return (Criteria) this;
        }

        public Criteria andIsAuthorGreaterThan(Integer value) {
            addCriterion("is_author >", value, "isAuthor");
            return (Criteria) this;
        }

        public Criteria andIsAuthorGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_author >=", value, "isAuthor");
            return (Criteria) this;
        }

        public Criteria andIsAuthorLessThan(Integer value) {
            addCriterion("is_author <", value, "isAuthor");
            return (Criteria) this;
        }

        public Criteria andIsAuthorLessThanOrEqualTo(Integer value) {
            addCriterion("is_author <=", value, "isAuthor");
            return (Criteria) this;
        }

        public Criteria andIsAuthorIn(List<Integer> values) {
            addCriterion("is_author in", values, "isAuthor");
            return (Criteria) this;
        }

        public Criteria andIsAuthorNotIn(List<Integer> values) {
            addCriterion("is_author not in", values, "isAuthor");
            return (Criteria) this;
        }

        public Criteria andIsAuthorBetween(Integer value1, Integer value2) {
            addCriterion("is_author between", value1, value2, "isAuthor");
            return (Criteria) this;
        }

        public Criteria andIsAuthorNotBetween(Integer value1, Integer value2) {
            addCriterion("is_author not between", value1, value2, "isAuthor");
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