package com.media.common.model.video;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WatchVideoRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WatchVideoRecordExample() {
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

        public Criteria andPkWatchRecordIdIsNull() {
            addCriterion("pk_watch_record_id is null");
            return (Criteria) this;
        }

        public Criteria andPkWatchRecordIdIsNotNull() {
            addCriterion("pk_watch_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkWatchRecordIdEqualTo(String value) {
            addCriterion("pk_watch_record_id =", value, "pkWatchRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchRecordIdNotEqualTo(String value) {
            addCriterion("pk_watch_record_id <>", value, "pkWatchRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchRecordIdGreaterThan(String value) {
            addCriterion("pk_watch_record_id >", value, "pkWatchRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_watch_record_id >=", value, "pkWatchRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchRecordIdLessThan(String value) {
            addCriterion("pk_watch_record_id <", value, "pkWatchRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchRecordIdLessThanOrEqualTo(String value) {
            addCriterion("pk_watch_record_id <=", value, "pkWatchRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchRecordIdLike(String value) {
            addCriterion("pk_watch_record_id like", value, "pkWatchRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchRecordIdNotLike(String value) {
            addCriterion("pk_watch_record_id not like", value, "pkWatchRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchRecordIdIn(List<String> values) {
            addCriterion("pk_watch_record_id in", values, "pkWatchRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchRecordIdNotIn(List<String> values) {
            addCriterion("pk_watch_record_id not in", values, "pkWatchRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchRecordIdBetween(String value1, String value2) {
            addCriterion("pk_watch_record_id between", value1, value2, "pkWatchRecordId");
            return (Criteria) this;
        }

        public Criteria andPkWatchRecordIdNotBetween(String value1, String value2) {
            addCriterion("pk_watch_record_id not between", value1, value2, "pkWatchRecordId");
            return (Criteria) this;
        }

        public Criteria andVodeoIdIsNull() {
            addCriterion("vodeo_id is null");
            return (Criteria) this;
        }

        public Criteria andVodeoIdIsNotNull() {
            addCriterion("vodeo_id is not null");
            return (Criteria) this;
        }

        public Criteria andVodeoIdEqualTo(String value) {
            addCriterion("vodeo_id =", value, "vodeoId");
            return (Criteria) this;
        }

        public Criteria andVodeoIdNotEqualTo(String value) {
            addCriterion("vodeo_id <>", value, "vodeoId");
            return (Criteria) this;
        }

        public Criteria andVodeoIdGreaterThan(String value) {
            addCriterion("vodeo_id >", value, "vodeoId");
            return (Criteria) this;
        }

        public Criteria andVodeoIdGreaterThanOrEqualTo(String value) {
            addCriterion("vodeo_id >=", value, "vodeoId");
            return (Criteria) this;
        }

        public Criteria andVodeoIdLessThan(String value) {
            addCriterion("vodeo_id <", value, "vodeoId");
            return (Criteria) this;
        }

        public Criteria andVodeoIdLessThanOrEqualTo(String value) {
            addCriterion("vodeo_id <=", value, "vodeoId");
            return (Criteria) this;
        }

        public Criteria andVodeoIdLike(String value) {
            addCriterion("vodeo_id like", value, "vodeoId");
            return (Criteria) this;
        }

        public Criteria andVodeoIdNotLike(String value) {
            addCriterion("vodeo_id not like", value, "vodeoId");
            return (Criteria) this;
        }

        public Criteria andVodeoIdIn(List<String> values) {
            addCriterion("vodeo_id in", values, "vodeoId");
            return (Criteria) this;
        }

        public Criteria andVodeoIdNotIn(List<String> values) {
            addCriterion("vodeo_id not in", values, "vodeoId");
            return (Criteria) this;
        }

        public Criteria andVodeoIdBetween(String value1, String value2) {
            addCriterion("vodeo_id between", value1, value2, "vodeoId");
            return (Criteria) this;
        }

        public Criteria andVodeoIdNotBetween(String value1, String value2) {
            addCriterion("vodeo_id not between", value1, value2, "vodeoId");
            return (Criteria) this;
        }

        public Criteria andClickedNumIsNull() {
            addCriterion("clicked_num is null");
            return (Criteria) this;
        }

        public Criteria andClickedNumIsNotNull() {
            addCriterion("clicked_num is not null");
            return (Criteria) this;
        }

        public Criteria andClickedNumEqualTo(Integer value) {
            addCriterion("clicked_num =", value, "clickedNum");
            return (Criteria) this;
        }

        public Criteria andClickedNumNotEqualTo(Integer value) {
            addCriterion("clicked_num <>", value, "clickedNum");
            return (Criteria) this;
        }

        public Criteria andClickedNumGreaterThan(Integer value) {
            addCriterion("clicked_num >", value, "clickedNum");
            return (Criteria) this;
        }

        public Criteria andClickedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("clicked_num >=", value, "clickedNum");
            return (Criteria) this;
        }

        public Criteria andClickedNumLessThan(Integer value) {
            addCriterion("clicked_num <", value, "clickedNum");
            return (Criteria) this;
        }

        public Criteria andClickedNumLessThanOrEqualTo(Integer value) {
            addCriterion("clicked_num <=", value, "clickedNum");
            return (Criteria) this;
        }

        public Criteria andClickedNumIn(List<Integer> values) {
            addCriterion("clicked_num in", values, "clickedNum");
            return (Criteria) this;
        }

        public Criteria andClickedNumNotIn(List<Integer> values) {
            addCriterion("clicked_num not in", values, "clickedNum");
            return (Criteria) this;
        }

        public Criteria andClickedNumBetween(Integer value1, Integer value2) {
            addCriterion("clicked_num between", value1, value2, "clickedNum");
            return (Criteria) this;
        }

        public Criteria andClickedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("clicked_num not between", value1, value2, "clickedNum");
            return (Criteria) this;
        }

        public Criteria andPayedNumIsNull() {
            addCriterion("payed_num is null");
            return (Criteria) this;
        }

        public Criteria andPayedNumIsNotNull() {
            addCriterion("payed_num is not null");
            return (Criteria) this;
        }

        public Criteria andPayedNumEqualTo(Integer value) {
            addCriterion("payed_num =", value, "payedNum");
            return (Criteria) this;
        }

        public Criteria andPayedNumNotEqualTo(Integer value) {
            addCriterion("payed_num <>", value, "payedNum");
            return (Criteria) this;
        }

        public Criteria andPayedNumGreaterThan(Integer value) {
            addCriterion("payed_num >", value, "payedNum");
            return (Criteria) this;
        }

        public Criteria andPayedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("payed_num >=", value, "payedNum");
            return (Criteria) this;
        }

        public Criteria andPayedNumLessThan(Integer value) {
            addCriterion("payed_num <", value, "payedNum");
            return (Criteria) this;
        }

        public Criteria andPayedNumLessThanOrEqualTo(Integer value) {
            addCriterion("payed_num <=", value, "payedNum");
            return (Criteria) this;
        }

        public Criteria andPayedNumIn(List<Integer> values) {
            addCriterion("payed_num in", values, "payedNum");
            return (Criteria) this;
        }

        public Criteria andPayedNumNotIn(List<Integer> values) {
            addCriterion("payed_num not in", values, "payedNum");
            return (Criteria) this;
        }

        public Criteria andPayedNumBetween(Integer value1, Integer value2) {
            addCriterion("payed_num between", value1, value2, "payedNum");
            return (Criteria) this;
        }

        public Criteria andPayedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("payed_num not between", value1, value2, "payedNum");
            return (Criteria) this;
        }

        public Criteria andAvgTimeWatchedIsNull() {
            addCriterion("avg_time_watched is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimeWatchedIsNotNull() {
            addCriterion("avg_time_watched is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimeWatchedEqualTo(String value) {
            addCriterion("avg_time_watched =", value, "avgTimeWatched");
            return (Criteria) this;
        }

        public Criteria andAvgTimeWatchedNotEqualTo(String value) {
            addCriterion("avg_time_watched <>", value, "avgTimeWatched");
            return (Criteria) this;
        }

        public Criteria andAvgTimeWatchedGreaterThan(String value) {
            addCriterion("avg_time_watched >", value, "avgTimeWatched");
            return (Criteria) this;
        }

        public Criteria andAvgTimeWatchedGreaterThanOrEqualTo(String value) {
            addCriterion("avg_time_watched >=", value, "avgTimeWatched");
            return (Criteria) this;
        }

        public Criteria andAvgTimeWatchedLessThan(String value) {
            addCriterion("avg_time_watched <", value, "avgTimeWatched");
            return (Criteria) this;
        }

        public Criteria andAvgTimeWatchedLessThanOrEqualTo(String value) {
            addCriterion("avg_time_watched <=", value, "avgTimeWatched");
            return (Criteria) this;
        }

        public Criteria andAvgTimeWatchedLike(String value) {
            addCriterion("avg_time_watched like", value, "avgTimeWatched");
            return (Criteria) this;
        }

        public Criteria andAvgTimeWatchedNotLike(String value) {
            addCriterion("avg_time_watched not like", value, "avgTimeWatched");
            return (Criteria) this;
        }

        public Criteria andAvgTimeWatchedIn(List<String> values) {
            addCriterion("avg_time_watched in", values, "avgTimeWatched");
            return (Criteria) this;
        }

        public Criteria andAvgTimeWatchedNotIn(List<String> values) {
            addCriterion("avg_time_watched not in", values, "avgTimeWatched");
            return (Criteria) this;
        }

        public Criteria andAvgTimeWatchedBetween(String value1, String value2) {
            addCriterion("avg_time_watched between", value1, value2, "avgTimeWatched");
            return (Criteria) this;
        }

        public Criteria andAvgTimeWatchedNotBetween(String value1, String value2) {
            addCriterion("avg_time_watched not between", value1, value2, "avgTimeWatched");
            return (Criteria) this;
        }

        public Criteria andReviewedNumIsNull() {
            addCriterion("reviewed_num is null");
            return (Criteria) this;
        }

        public Criteria andReviewedNumIsNotNull() {
            addCriterion("reviewed_num is not null");
            return (Criteria) this;
        }

        public Criteria andReviewedNumEqualTo(Integer value) {
            addCriterion("reviewed_num =", value, "reviewedNum");
            return (Criteria) this;
        }

        public Criteria andReviewedNumNotEqualTo(Integer value) {
            addCriterion("reviewed_num <>", value, "reviewedNum");
            return (Criteria) this;
        }

        public Criteria andReviewedNumGreaterThan(Integer value) {
            addCriterion("reviewed_num >", value, "reviewedNum");
            return (Criteria) this;
        }

        public Criteria andReviewedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviewed_num >=", value, "reviewedNum");
            return (Criteria) this;
        }

        public Criteria andReviewedNumLessThan(Integer value) {
            addCriterion("reviewed_num <", value, "reviewedNum");
            return (Criteria) this;
        }

        public Criteria andReviewedNumLessThanOrEqualTo(Integer value) {
            addCriterion("reviewed_num <=", value, "reviewedNum");
            return (Criteria) this;
        }

        public Criteria andReviewedNumIn(List<Integer> values) {
            addCriterion("reviewed_num in", values, "reviewedNum");
            return (Criteria) this;
        }

        public Criteria andReviewedNumNotIn(List<Integer> values) {
            addCriterion("reviewed_num not in", values, "reviewedNum");
            return (Criteria) this;
        }

        public Criteria andReviewedNumBetween(Integer value1, Integer value2) {
            addCriterion("reviewed_num between", value1, value2, "reviewedNum");
            return (Criteria) this;
        }

        public Criteria andReviewedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("reviewed_num not between", value1, value2, "reviewedNum");
            return (Criteria) this;
        }

        public Criteria andSharedNumIsNull() {
            addCriterion("shared_num is null");
            return (Criteria) this;
        }

        public Criteria andSharedNumIsNotNull() {
            addCriterion("shared_num is not null");
            return (Criteria) this;
        }

        public Criteria andSharedNumEqualTo(Integer value) {
            addCriterion("shared_num =", value, "sharedNum");
            return (Criteria) this;
        }

        public Criteria andSharedNumNotEqualTo(Integer value) {
            addCriterion("shared_num <>", value, "sharedNum");
            return (Criteria) this;
        }

        public Criteria andSharedNumGreaterThan(Integer value) {
            addCriterion("shared_num >", value, "sharedNum");
            return (Criteria) this;
        }

        public Criteria andSharedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("shared_num >=", value, "sharedNum");
            return (Criteria) this;
        }

        public Criteria andSharedNumLessThan(Integer value) {
            addCriterion("shared_num <", value, "sharedNum");
            return (Criteria) this;
        }

        public Criteria andSharedNumLessThanOrEqualTo(Integer value) {
            addCriterion("shared_num <=", value, "sharedNum");
            return (Criteria) this;
        }

        public Criteria andSharedNumIn(List<Integer> values) {
            addCriterion("shared_num in", values, "sharedNum");
            return (Criteria) this;
        }

        public Criteria andSharedNumNotIn(List<Integer> values) {
            addCriterion("shared_num not in", values, "sharedNum");
            return (Criteria) this;
        }

        public Criteria andSharedNumBetween(Integer value1, Integer value2) {
            addCriterion("shared_num between", value1, value2, "sharedNum");
            return (Criteria) this;
        }

        public Criteria andSharedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("shared_num not between", value1, value2, "sharedNum");
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

        public Criteria andGoodEvaluateNumIsNull() {
            addCriterion("good_evaluate_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodEvaluateNumIsNotNull() {
            addCriterion("good_evaluate_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodEvaluateNumEqualTo(Integer value) {
            addCriterion("good_evaluate_num =", value, "goodEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGoodEvaluateNumNotEqualTo(Integer value) {
            addCriterion("good_evaluate_num <>", value, "goodEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGoodEvaluateNumGreaterThan(Integer value) {
            addCriterion("good_evaluate_num >", value, "goodEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGoodEvaluateNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_evaluate_num >=", value, "goodEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGoodEvaluateNumLessThan(Integer value) {
            addCriterion("good_evaluate_num <", value, "goodEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGoodEvaluateNumLessThanOrEqualTo(Integer value) {
            addCriterion("good_evaluate_num <=", value, "goodEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGoodEvaluateNumIn(List<Integer> values) {
            addCriterion("good_evaluate_num in", values, "goodEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGoodEvaluateNumNotIn(List<Integer> values) {
            addCriterion("good_evaluate_num not in", values, "goodEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGoodEvaluateNumBetween(Integer value1, Integer value2) {
            addCriterion("good_evaluate_num between", value1, value2, "goodEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGoodEvaluateNumNotBetween(Integer value1, Integer value2) {
            addCriterion("good_evaluate_num not between", value1, value2, "goodEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluateNumIsNull() {
            addCriterion("general_evaluate_num is null");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluateNumIsNotNull() {
            addCriterion("general_evaluate_num is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluateNumEqualTo(Integer value) {
            addCriterion("general_evaluate_num =", value, "generalEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluateNumNotEqualTo(Integer value) {
            addCriterion("general_evaluate_num <>", value, "generalEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluateNumGreaterThan(Integer value) {
            addCriterion("general_evaluate_num >", value, "generalEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluateNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("general_evaluate_num >=", value, "generalEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluateNumLessThan(Integer value) {
            addCriterion("general_evaluate_num <", value, "generalEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluateNumLessThanOrEqualTo(Integer value) {
            addCriterion("general_evaluate_num <=", value, "generalEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluateNumIn(List<Integer> values) {
            addCriterion("general_evaluate_num in", values, "generalEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluateNumNotIn(List<Integer> values) {
            addCriterion("general_evaluate_num not in", values, "generalEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluateNumBetween(Integer value1, Integer value2) {
            addCriterion("general_evaluate_num between", value1, value2, "generalEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andGeneralEvaluateNumNotBetween(Integer value1, Integer value2) {
            addCriterion("general_evaluate_num not between", value1, value2, "generalEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andNegativeEvaluateNumIsNull() {
            addCriterion("\"negative _evaluate_num\" is null");
            return (Criteria) this;
        }

        public Criteria andNegativeEvaluateNumIsNotNull() {
            addCriterion("\"negative _evaluate_num\" is not null");
            return (Criteria) this;
        }

        public Criteria andNegativeEvaluateNumEqualTo(Integer value) {
            addCriterion("\"negative _evaluate_num\" =", value, "negativeEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andNegativeEvaluateNumNotEqualTo(Integer value) {
            addCriterion("\"negative _evaluate_num\" <>", value, "negativeEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andNegativeEvaluateNumGreaterThan(Integer value) {
            addCriterion("\"negative _evaluate_num\" >", value, "negativeEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andNegativeEvaluateNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"negative _evaluate_num\" >=", value, "negativeEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andNegativeEvaluateNumLessThan(Integer value) {
            addCriterion("\"negative _evaluate_num\" <", value, "negativeEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andNegativeEvaluateNumLessThanOrEqualTo(Integer value) {
            addCriterion("\"negative _evaluate_num\" <=", value, "negativeEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andNegativeEvaluateNumIn(List<Integer> values) {
            addCriterion("\"negative _evaluate_num\" in", values, "negativeEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andNegativeEvaluateNumNotIn(List<Integer> values) {
            addCriterion("\"negative _evaluate_num\" not in", values, "negativeEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andNegativeEvaluateNumBetween(Integer value1, Integer value2) {
            addCriterion("\"negative _evaluate_num\" between", value1, value2, "negativeEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andNegativeEvaluateNumNotBetween(Integer value1, Integer value2) {
            addCriterion("\"negative _evaluate_num\" not between", value1, value2, "negativeEvaluateNum");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNull() {
            addCriterion("release_time is null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNotNull() {
            addCriterion("release_time is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeEqualTo(Date value) {
            addCriterion("release_time =", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotEqualTo(Date value) {
            addCriterion("release_time <>", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThan(Date value) {
            addCriterion("release_time >", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("release_time >=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThan(Date value) {
            addCriterion("release_time <", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("release_time <=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIn(List<Date> values) {
            addCriterion("release_time in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotIn(List<Date> values) {
            addCriterion("release_time not in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeBetween(Date value1, Date value2) {
            addCriterion("release_time between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("release_time not between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeIsNull() {
            addCriterion("box_office is null");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeIsNotNull() {
            addCriterion("box_office is not null");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeEqualTo(Double value) {
            addCriterion("box_office =", value, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeNotEqualTo(Double value) {
            addCriterion("box_office <>", value, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeGreaterThan(Double value) {
            addCriterion("box_office >", value, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeGreaterThanOrEqualTo(Double value) {
            addCriterion("box_office >=", value, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeLessThan(Double value) {
            addCriterion("box_office <", value, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeLessThanOrEqualTo(Double value) {
            addCriterion("box_office <=", value, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeIn(List<Double> values) {
            addCriterion("box_office in", values, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeNotIn(List<Double> values) {
            addCriterion("box_office not in", values, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeBetween(Double value1, Double value2) {
            addCriterion("box_office between", value1, value2, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andBoxOfficeNotBetween(Double value1, Double value2) {
            addCriterion("box_office not between", value1, value2, "boxOffice");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table md_watch_video_record
     *
     * @mbg.generated do_not_delete_during_merge Tue Nov 27 20:35:27 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table md_watch_video_record
     *
     * @mbg.generated Tue Nov 27 20:35:27 CST 2018
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