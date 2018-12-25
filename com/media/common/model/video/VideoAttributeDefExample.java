package com.media.common.model.video;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoAttributeDefExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoAttributeDefExample() {
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

        public Criteria andPkVideoAttributeIdIsNull() {
            addCriterion("pk_video_attribute_id is null");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdIsNotNull() {
            addCriterion("pk_video_attribute_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdEqualTo(String value) {
            addCriterion("pk_video_attribute_id =", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdNotEqualTo(String value) {
            addCriterion("pk_video_attribute_id <>", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdGreaterThan(String value) {
            addCriterion("pk_video_attribute_id >", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_video_attribute_id >=", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdLessThan(String value) {
            addCriterion("pk_video_attribute_id <", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdLessThanOrEqualTo(String value) {
            addCriterion("pk_video_attribute_id <=", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdLike(String value) {
            addCriterion("pk_video_attribute_id like", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdNotLike(String value) {
            addCriterion("pk_video_attribute_id not like", value, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdIn(List<String> values) {
            addCriterion("pk_video_attribute_id in", values, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdNotIn(List<String> values) {
            addCriterion("pk_video_attribute_id not in", values, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdBetween(String value1, String value2) {
            addCriterion("pk_video_attribute_id between", value1, value2, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andPkVideoAttributeIdNotBetween(String value1, String value2) {
            addCriterion("pk_video_attribute_id not between", value1, value2, "pkVideoAttributeId");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameIsNull() {
            addCriterion("video_attr_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameIsNotNull() {
            addCriterion("video_attr_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEqualTo(String value) {
            addCriterion("video_attr_name =", value, "videoAttrName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameNotEqualTo(String value) {
            addCriterion("video_attr_name <>", value, "videoAttrName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameGreaterThan(String value) {
            addCriterion("video_attr_name >", value, "videoAttrName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_attr_name >=", value, "videoAttrName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameLessThan(String value) {
            addCriterion("video_attr_name <", value, "videoAttrName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameLessThanOrEqualTo(String value) {
            addCriterion("video_attr_name <=", value, "videoAttrName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameLike(String value) {
            addCriterion("video_attr_name like", value, "videoAttrName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameNotLike(String value) {
            addCriterion("video_attr_name not like", value, "videoAttrName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameIn(List<String> values) {
            addCriterion("video_attr_name in", values, "videoAttrName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameNotIn(List<String> values) {
            addCriterion("video_attr_name not in", values, "videoAttrName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameBetween(String value1, String value2) {
            addCriterion("video_attr_name between", value1, value2, "videoAttrName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameNotBetween(String value1, String value2) {
            addCriterion("video_attr_name not between", value1, value2, "videoAttrName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEnIsNull() {
            addCriterion("video_attr_name_en is null");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEnIsNotNull() {
            addCriterion("video_attr_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEnEqualTo(String value) {
            addCriterion("video_attr_name_en =", value, "videoAttrNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEnNotEqualTo(String value) {
            addCriterion("video_attr_name_en <>", value, "videoAttrNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEnGreaterThan(String value) {
            addCriterion("video_attr_name_en >", value, "videoAttrNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("video_attr_name_en >=", value, "videoAttrNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEnLessThan(String value) {
            addCriterion("video_attr_name_en <", value, "videoAttrNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEnLessThanOrEqualTo(String value) {
            addCriterion("video_attr_name_en <=", value, "videoAttrNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEnLike(String value) {
            addCriterion("video_attr_name_en like", value, "videoAttrNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEnNotLike(String value) {
            addCriterion("video_attr_name_en not like", value, "videoAttrNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEnIn(List<String> values) {
            addCriterion("video_attr_name_en in", values, "videoAttrNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEnNotIn(List<String> values) {
            addCriterion("video_attr_name_en not in", values, "videoAttrNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEnBetween(String value1, String value2) {
            addCriterion("video_attr_name_en between", value1, value2, "videoAttrNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoAttrNameEnNotBetween(String value1, String value2) {
            addCriterion("video_attr_name_en not between", value1, value2, "videoAttrNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoAttrShowNameIsNull() {
            addCriterion("video_attr_show_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoAttrShowNameIsNotNull() {
            addCriterion("video_attr_show_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoAttrShowNameEqualTo(String value) {
            addCriterion("video_attr_show_name =", value, "videoAttrShowName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrShowNameNotEqualTo(String value) {
            addCriterion("video_attr_show_name <>", value, "videoAttrShowName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrShowNameGreaterThan(String value) {
            addCriterion("video_attr_show_name >", value, "videoAttrShowName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrShowNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_attr_show_name >=", value, "videoAttrShowName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrShowNameLessThan(String value) {
            addCriterion("video_attr_show_name <", value, "videoAttrShowName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrShowNameLessThanOrEqualTo(String value) {
            addCriterion("video_attr_show_name <=", value, "videoAttrShowName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrShowNameLike(String value) {
            addCriterion("video_attr_show_name like", value, "videoAttrShowName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrShowNameNotLike(String value) {
            addCriterion("video_attr_show_name not like", value, "videoAttrShowName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrShowNameIn(List<String> values) {
            addCriterion("video_attr_show_name in", values, "videoAttrShowName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrShowNameNotIn(List<String> values) {
            addCriterion("video_attr_show_name not in", values, "videoAttrShowName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrShowNameBetween(String value1, String value2) {
            addCriterion("video_attr_show_name between", value1, value2, "videoAttrShowName");
            return (Criteria) this;
        }

        public Criteria andVideoAttrShowNameNotBetween(String value1, String value2) {
            addCriterion("video_attr_show_name not between", value1, value2, "videoAttrShowName");
            return (Criteria) this;
        }
 
        public Criteria andVideoClassIdIsNull() {
            addCriterion("video_class_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoClassIdIsNotNull() {
            addCriterion("video_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoClassIdEqualTo(String value) {
            addCriterion("video_class_id =", value, "videoClassId");
            return (Criteria) this;
        }

        public Criteria andVideoClassIdNotEqualTo(String value) {
            addCriterion("video_class_id <>", value, "videoClassId");
            return (Criteria) this;
        }

        public Criteria andVideoClassIdGreaterThan(String value) {
            addCriterion("video_class_id >", value, "videoClassId");
            return (Criteria) this;
        }

        public Criteria andVideoClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("video_class_id >=", value, "videoClassId");
            return (Criteria) this;
        }

        public Criteria andVideoClassIdLessThan(String value) {
            addCriterion("video_class_id <", value, "videoClassId");
            return (Criteria) this;
        }

        public Criteria andVideoClassIdLessThanOrEqualTo(String value) {
            addCriterion("video_class_id <=", value, "videoClassId");
            return (Criteria) this;
        }

        public Criteria andVideoClassIdLike(String value) {
            addCriterion("video_class_id like", value, "videoClassId");
            return (Criteria) this;
        }

        public Criteria andVideoClassIdNotLike(String value) {
            addCriterion("video_class_id not like", value, "videoClassId");
            return (Criteria) this;
        }

        public Criteria andVideoClassIdIn(List<String> values) {
            addCriterion("video_class_id in", values, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andVideoClassIdNotIn(List<String> values) {
            addCriterion("video_class_id not in", values, "videoClassId");
            return (Criteria) this;
        }

        public Criteria andVideoClassIdBetween(String value1, String value2) {
            addCriterion("video_class_id between", value1, value2, "videoClassId");
            return (Criteria) this;
        }

        public Criteria andVideoClassIdNotBetween(String value1, String value2) {
            addCriterion("video_class_id not between", value1, value2, "videoClassId");
            return (Criteria) this;
        }
        public Criteria andPkVideoIdIsNull() {
            addCriterion("pk_video_id is null");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdIsNotNull() {
            addCriterion("pk_video_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdEqualTo(String value) {
            addCriterion("pk_video_id =", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdNotEqualTo(String value) {
            addCriterion("pk_video_id <>", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdGreaterThan(String value) {
            addCriterion("pk_video_id >", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_video_id >=", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdLessThan(String value) {
            addCriterion("pk_video_id <", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdLessThanOrEqualTo(String value) {
            addCriterion("pk_video_id <=", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdLike(String value) {
            addCriterion("pk_video_id like", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdNotLike(String value) {
            addCriterion("pk_video_id not like", value, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdIn(List<String> values) {
            addCriterion("pk_video_id in", values, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdNotIn(List<String> values) {
            addCriterion("pk_video_id not in", values, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdBetween(String value1, String value2) {
            addCriterion("pk_video_id between", value1, value2, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andPkVideoIdNotBetween(String value1, String value2) {
            addCriterion("pk_video_id not between", value1, value2, "pkVideoId");
            return (Criteria) this;
        }

        public Criteria andAttrNoIsNull() {
            addCriterion("attr_no is null");
            return (Criteria) this;
        }

        public Criteria andAttrNoIsNotNull() {
            addCriterion("attr_no is not null");
            return (Criteria) this;
        }

        public Criteria andAttrNoEqualTo(Integer value) {
            addCriterion("attr_no =", value, "attrNo");
            return (Criteria) this;
        }

        public Criteria andAttrNoNotEqualTo(Integer value) {
            addCriterion("attr_no <>", value, "attrNo");
            return (Criteria) this;
        }

        public Criteria andAttrNoGreaterThan(Integer value) {
            addCriterion("attr_no >", value, "attrNo");
            return (Criteria) this;
        }

        public Criteria andAttrNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("attr_no >=", value, "attrNo");
            return (Criteria) this;
        }

        public Criteria andAttrNoLessThan(Integer value) {
            addCriterion("attr_no <", value, "attrNo");
            return (Criteria) this;
        }

        public Criteria andAttrNoLessThanOrEqualTo(Integer value) {
            addCriterion("attr_no <=", value, "attrNo");
            return (Criteria) this;
        }

        public Criteria andAttrNoIn(List<Integer> values) {
            addCriterion("attr_no in", values, "attrNo");
            return (Criteria) this;
        }

        public Criteria andAttrNoNotIn(List<Integer> values) {
            addCriterion("attr_no not in", values, "attrNo");
            return (Criteria) this;
        }

        public Criteria andAttrNoBetween(Integer value1, Integer value2) {
            addCriterion("attr_no between", value1, value2, "attrNo");
            return (Criteria) this;
        }

        public Criteria andAttrNoNotBetween(Integer value1, Integer value2) {
            addCriterion("attr_no not between", value1, value2, "attrNo");
            return (Criteria) this;
        }

        public Criteria andDefaultValIsNull() {
            addCriterion("default_val is null");
            return (Criteria) this;
        }

        public Criteria andDefaultValIsNotNull() {
            addCriterion("default_val is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultValEqualTo(String value) {
            addCriterion("default_val =", value, "defaultVal");
            return (Criteria) this;
        }

        public Criteria andDefaultValNotEqualTo(String value) {
            addCriterion("default_val <>", value, "defaultVal");
            return (Criteria) this;
        }

        public Criteria andDefaultValGreaterThan(String value) {
            addCriterion("default_val >", value, "defaultVal");
            return (Criteria) this;
        }

        public Criteria andDefaultValGreaterThanOrEqualTo(String value) {
            addCriterion("default_val >=", value, "defaultVal");
            return (Criteria) this;
        }

        public Criteria andDefaultValLessThan(String value) {
            addCriterion("default_val <", value, "defaultVal");
            return (Criteria) this;
        }

        public Criteria andDefaultValLessThanOrEqualTo(String value) {
            addCriterion("default_val <=", value, "defaultVal");
            return (Criteria) this;
        }

        public Criteria andDefaultValLike(String value) {
            addCriterion("default_val like", value, "defaultVal");
            return (Criteria) this;
        }

        public Criteria andDefaultValNotLike(String value) {
            addCriterion("default_val not like", value, "defaultVal");
            return (Criteria) this;
        }

        public Criteria andDefaultValIn(List<String> values) {
            addCriterion("default_val in", values, "defaultVal");
            return (Criteria) this;
        }

        public Criteria andDefaultValNotIn(List<String> values) {
            addCriterion("default_val not in", values, "defaultVal");
            return (Criteria) this;
        }

        public Criteria andDefaultValBetween(String value1, String value2) {
            addCriterion("default_val between", value1, value2, "defaultVal");
            return (Criteria) this;
        }

        public Criteria andDefaultValNotBetween(String value1, String value2) {
            addCriterion("default_val not between", value1, value2, "defaultVal");
            return (Criteria) this;
        }

        public Criteria andIsEnumIsNull() {
            addCriterion("is_enum is null");
            return (Criteria) this;
        }

        public Criteria andIsEnumIsNotNull() {
            addCriterion("is_enum is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnumEqualTo(Integer value) {
            addCriterion("is_enum =", value, "isEnum");
            return (Criteria) this;
        }

        public Criteria andIsEnumNotEqualTo(Integer value) {
            addCriterion("is_enum <>", value, "isEnum");
            return (Criteria) this;
        }

        public Criteria andIsEnumGreaterThan(Integer value) {
            addCriterion("is_enum >", value, "isEnum");
            return (Criteria) this;
        }

        public Criteria andIsEnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_enum >=", value, "isEnum");
            return (Criteria) this;
        }

        public Criteria andIsEnumLessThan(Integer value) {
            addCriterion("is_enum <", value, "isEnum");
            return (Criteria) this;
        }

        public Criteria andIsEnumLessThanOrEqualTo(Integer value) {
            addCriterion("is_enum <=", value, "isEnum");
            return (Criteria) this;
        }

        public Criteria andIsEnumIn(List<Integer> values) {
            addCriterion("is_enum in", values, "isEnum");
            return (Criteria) this;
        }

        public Criteria andIsEnumNotIn(List<Integer> values) {
            addCriterion("is_enum not in", values, "isEnum");
            return (Criteria) this;
        }

        public Criteria andIsEnumBetween(Integer value1, Integer value2) {
            addCriterion("is_enum between", value1, value2, "isEnum");
            return (Criteria) this;
        }

        public Criteria andIsEnumNotBetween(Integer value1, Integer value2) {
            addCriterion("is_enum not between", value1, value2, "isEnum");
            return (Criteria) this;
        }

        public Criteria andIsInputIsNull() {
            addCriterion("is_input is null");
            return (Criteria) this;
        }

        public Criteria andIsInputIsNotNull() {
            addCriterion("is_input is not null");
            return (Criteria) this;
        }

        public Criteria andIsInputEqualTo(Integer value) {
            addCriterion("is_input =", value, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputNotEqualTo(Integer value) {
            addCriterion("is_input <>", value, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputGreaterThan(Integer value) {
            addCriterion("is_input >", value, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_input >=", value, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputLessThan(Integer value) {
            addCriterion("is_input <", value, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputLessThanOrEqualTo(Integer value) {
            addCriterion("is_input <=", value, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputIn(List<Integer> values) {
            addCriterion("is_input in", values, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputNotIn(List<Integer> values) {
            addCriterion("is_input not in", values, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputBetween(Integer value1, Integer value2) {
            addCriterion("is_input between", value1, value2, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputNotBetween(Integer value1, Integer value2) {
            addCriterion("is_input not between", value1, value2, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsSearchIsNull() {
            addCriterion("is_search is null");
            return (Criteria) this;
        }

        public Criteria andIsSearchIsNotNull() {
            addCriterion("is_search is not null");
            return (Criteria) this;
        }

        public Criteria andIsSearchEqualTo(Integer value) {
            addCriterion("is_search =", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchNotEqualTo(Integer value) {
            addCriterion("is_search <>", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchGreaterThan(Integer value) {
            addCriterion("is_search >", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_search >=", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchLessThan(Integer value) {
            addCriterion("is_search <", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchLessThanOrEqualTo(Integer value) {
            addCriterion("is_search <=", value, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchIn(List<Integer> values) {
            addCriterion("is_search in", values, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchNotIn(List<Integer> values) {
            addCriterion("is_search not in", values, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchBetween(Integer value1, Integer value2) {
            addCriterion("is_search between", value1, value2, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsSearchNotBetween(Integer value1, Integer value2) {
            addCriterion("is_search not between", value1, value2, "isSearch");
            return (Criteria) this;
        }

        public Criteria andIsRequiredIsNull() {
            addCriterion("is_required is null");
            return (Criteria) this;
        }

        public Criteria andIsRequiredIsNotNull() {
            addCriterion("is_required is not null");
            return (Criteria) this;
        }

        public Criteria andIsRequiredEqualTo(Integer value) {
            addCriterion("is_required =", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredNotEqualTo(Integer value) {
            addCriterion("is_required <>", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredGreaterThan(Integer value) {
            addCriterion("is_required >", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_required >=", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredLessThan(Integer value) {
            addCriterion("is_required <", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredLessThanOrEqualTo(Integer value) {
            addCriterion("is_required <=", value, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredIn(List<Integer> values) {
            addCriterion("is_required in", values, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredNotIn(List<Integer> values) {
            addCriterion("is_required not in", values, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredBetween(Integer value1, Integer value2) {
            addCriterion("is_required between", value1, value2, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsRequiredNotBetween(Integer value1, Integer value2) {
            addCriterion("is_required not between", value1, value2, "isRequired");
            return (Criteria) this;
        }

        public Criteria andIsMutilIsNull() {
            addCriterion("is_mutil is null");
            return (Criteria) this;
        }

        public Criteria andIsMutilIsNotNull() {
            addCriterion("is_mutil is not null");
            return (Criteria) this;
        }

        public Criteria andIsMutilEqualTo(Integer value) {
            addCriterion("is_mutil =", value, "isMutil");
            return (Criteria) this;
        }

        public Criteria andIsMutilNotEqualTo(Integer value) {
            addCriterion("is_mutil <>", value, "isMutil");
            return (Criteria) this;
        }

        public Criteria andIsMutilGreaterThan(Integer value) {
            addCriterion("is_mutil >", value, "isMutil");
            return (Criteria) this;
        }

        public Criteria andIsMutilGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_mutil >=", value, "isMutil");
            return (Criteria) this;
        }

        public Criteria andIsMutilLessThan(Integer value) {
            addCriterion("is_mutil <", value, "isMutil");
            return (Criteria) this;
        }

        public Criteria andIsMutilLessThanOrEqualTo(Integer value) {
            addCriterion("is_mutil <=", value, "isMutil");
            return (Criteria) this;
        }

        public Criteria andIsMutilIn(List<Integer> values) {
            addCriterion("is_mutil in", values, "isMutil");
            return (Criteria) this;
        }

        public Criteria andIsMutilNotIn(List<Integer> values) {
            addCriterion("is_mutil not in", values, "isMutil");
            return (Criteria) this;
        }

        public Criteria andIsMutilBetween(Integer value1, Integer value2) {
            addCriterion("is_mutil between", value1, value2, "isMutil");
            return (Criteria) this;
        }

        public Criteria andIsMutilNotBetween(Integer value1, Integer value2) {
            addCriterion("is_mutil not between", value1, value2, "isMutil");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsUserDefinedIsNull() {
            addCriterion("is_user_defined is null");
            return (Criteria) this;
        }

        public Criteria andIsUserDefinedIsNotNull() {
            addCriterion("is_user_defined is not null");
            return (Criteria) this;
        }

        public Criteria andIsUserDefinedEqualTo(Integer value) {
            addCriterion("is_user_defined =", value, "isUserDefined");
            return (Criteria) this;
        }

        public Criteria andIsUserDefinedNotEqualTo(Integer value) {
            addCriterion("is_user_defined <>", value, "isUserDefined");
            return (Criteria) this;
        }

        public Criteria andIsUserDefinedGreaterThan(Integer value) {
            addCriterion("is_user_defined >", value, "isUserDefined");
            return (Criteria) this;
        }

        public Criteria andIsUserDefinedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_user_defined >=", value, "isUserDefined");
            return (Criteria) this;
        }

        public Criteria andIsUserDefinedLessThan(Integer value) {
            addCriterion("is_user_defined <", value, "isUserDefined");
            return (Criteria) this;
        }

        public Criteria andIsUserDefinedLessThanOrEqualTo(Integer value) {
            addCriterion("is_user_defined <=", value, "isUserDefined");
            return (Criteria) this;
        }

        public Criteria andIsUserDefinedIn(List<Integer> values) {
            addCriterion("is_user_defined in", values, "isUserDefined");
            return (Criteria) this;
        }

        public Criteria andIsUserDefinedNotIn(List<Integer> values) {
            addCriterion("is_user_defined not in", values, "isUserDefined");
            return (Criteria) this;
        }

        public Criteria andIsUserDefinedBetween(Integer value1, Integer value2) {
            addCriterion("is_user_defined between", value1, value2, "isUserDefined");
            return (Criteria) this;
        }

        public Criteria andIsUserDefinedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_user_defined not between", value1, value2, "isUserDefined");
            return (Criteria) this;
        }
        public Criteria andIsContactPathIsNull() {
            addCriterion("is_contact_path is null");
            return (Criteria) this;
        }

        public Criteria andIsContactPathIsNotNull() {
            addCriterion("is_contact_path is not null");
            return (Criteria) this;
        }

        public Criteria andIsContactPathEqualTo(Integer value) {
            addCriterion("is_contact_path =", value, "isContactPath");
            return (Criteria) this;
        }

        public Criteria andIsContactPathNotEqualTo(Integer value) {
            addCriterion("is_contact_path <>", value, "isContactPath");
            return (Criteria) this;
        }

        public Criteria andIsContactPathGreaterThan(Integer value) {
            addCriterion("is_contact_path >", value, "isContactPath");
            return (Criteria) this;
        }

        public Criteria andIsContactPathGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_contact_path >=", value, "isContactPath");
            return (Criteria) this;
        }

        public Criteria andIsContactPathLessThan(Integer value) {
            addCriterion("is_contact_path <", value, "isContactPath");
            return (Criteria) this;
        }

        public Criteria andIsContactPathLessThanOrEqualTo(Integer value) {
            addCriterion("is_contact_path <=", value, "isContactPath");
            return (Criteria) this;
        }

        public Criteria andIsContactPathIn(List<Integer> values) {
            addCriterion("is_contact_path in", values, "isContactPath");
            return (Criteria) this;
        }

        public Criteria andIsContactPathNotIn(List<Integer> values) {
            addCriterion("is_contact_path not in", values, "isContactPath");
            return (Criteria) this;
        }

        public Criteria andIsContactPathBetween(Integer value1, Integer value2) {
            addCriterion("is_contact_path between", value1, value2, "isContactPath");
            return (Criteria) this;
        }

        public Criteria andIsContactPathNotBetween(Integer value1, Integer value2) {
            addCriterion("is_contact_path not between", value1, value2, "isContactPath");
            return (Criteria) this;
        }

        public Criteria andAttrDescIsNull() {
            addCriterion("attr_desc is null");
            return (Criteria) this;
        }

        public Criteria andAttrDescIsNotNull() {
            addCriterion("attr_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAttrDescEqualTo(String value) {
            addCriterion("attr_desc =", value, "attrDesc");
            return (Criteria) this;
        }

        public Criteria andAttrDescNotEqualTo(String value) {
            addCriterion("attr_desc <>", value, "attrDesc");
            return (Criteria) this;
        }

        public Criteria andAttrDescGreaterThan(String value) {
            addCriterion("attr_desc >", value, "attrDesc");
            return (Criteria) this;
        }

        public Criteria andAttrDescGreaterThanOrEqualTo(String value) {
            addCriterion("attr_desc >=", value, "attrDesc");
            return (Criteria) this;
        }

        public Criteria andAttrDescLessThan(String value) {
            addCriterion("attr_desc <", value, "attrDesc");
            return (Criteria) this;
        }

        public Criteria andAttrDescLessThanOrEqualTo(String value) {
            addCriterion("attr_desc <=", value, "attrDesc");
            return (Criteria) this;
        }

        public Criteria andAttrDescLike(String value) {
            addCriterion("attr_desc like", value, "attrDesc");
            return (Criteria) this;
        }

        public Criteria andAttrDescNotLike(String value) {
            addCriterion("attr_desc not like", value, "attrDesc");
            return (Criteria) this;
        }

        public Criteria andAttrDescIn(List<String> values) {
            addCriterion("attr_desc in", values, "attrDesc");
            return (Criteria) this;
        }

        public Criteria andAttrDescNotIn(List<String> values) {
            addCriterion("attr_desc not in", values, "attrDesc");
            return (Criteria) this;
        }

        public Criteria andAttrDescBetween(String value1, String value2) {
            addCriterion("attr_desc between", value1, value2, "attrDesc");
            return (Criteria) this;
        }

        public Criteria andAttrDescNotBetween(String value1, String value2) {
            addCriterion("attr_desc not between", value1, value2, "attrDesc");
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

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("create_user_id like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("create_user_id not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
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

        public Criteria andLastModifyUserIdIsNull() {
            addCriterion("last_modify_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdIsNotNull() {
            addCriterion("last_modify_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdEqualTo(String value) {
            addCriterion("last_modify_user_id =", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdNotEqualTo(String value) {
            addCriterion("last_modify_user_id <>", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdGreaterThan(String value) {
            addCriterion("last_modify_user_id >", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("last_modify_user_id >=", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdLessThan(String value) {
            addCriterion("last_modify_user_id <", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdLessThanOrEqualTo(String value) {
            addCriterion("last_modify_user_id <=", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdLike(String value) {
            addCriterion("last_modify_user_id like", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdNotLike(String value) {
            addCriterion("last_modify_user_id not like", value, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdIn(List<String> values) {
            addCriterion("last_modify_user_id in", values, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdNotIn(List<String> values) {
            addCriterion("last_modify_user_id not in", values, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdBetween(String value1, String value2) {
            addCriterion("last_modify_user_id between", value1, value2, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyUserIdNotBetween(String value1, String value2) {
            addCriterion("last_modify_user_id not between", value1, value2, "lastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("last_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("last_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("last_modify_time =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("last_modify_time <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("last_modify_time >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify_time >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("last_modify_time <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modify_time <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("last_modify_time in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("last_modify_time not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_modify_time between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modify_time not between", value1, value2, "lastModifyTime");
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