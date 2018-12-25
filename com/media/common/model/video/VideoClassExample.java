package com.media.common.model.video;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Created by lihaiqiang on 2018/11/01.
 */
public class VideoClassExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoClassExample() {
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

        public Criteria andPkVideoClassIdIsNull() {
            addCriterion("pk_video_class_id is null");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdIsNotNull() {
            addCriterion("pk_video_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdEqualTo(String value) {
            addCriterion("pk_video_class_id =", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdNotEqualTo(String value) {
            addCriterion("pk_video_class_id <>", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdGreaterThan(String value) {
            addCriterion("pk_video_class_id >", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_video_class_id >=", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdLessThan(String value) {
            addCriterion("pk_video_class_id <", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdLessThanOrEqualTo(String value) {
            addCriterion("pk_video_class_id <=", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdLike(String value) {
            addCriterion("pk_video_class_id like", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdNotLike(String value) {
            addCriterion("pk_video_class_id not like", value, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdIn(List<String> values) {
            addCriterion("pk_video_class_id in", values, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdNotIn(List<String> values) {
            addCriterion("pk_video_class_id not in", values, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdBetween(String value1, String value2) {
            addCriterion("pk_video_class_id between", value1, value2, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andPkVideoClassIdNotBetween(String value1, String value2) {
            addCriterion("pk_video_class_id not between", value1, value2, "pkVideoClassId");
            return (Criteria) this;
        }

        public Criteria andVideoClassCodeIsNull() {
            addCriterion("video_class_code is null");
            return (Criteria) this;
        }

        public Criteria andVideoClassCodeIsNotNull() {
            addCriterion("video_class_code is not null");
            return (Criteria) this;
        }

        public Criteria andVideoClassCodeEqualTo(String value) {
            addCriterion("video_class_code =", value, "videoClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoClassCodeNotEqualTo(String value) {
            addCriterion("video_class_code <>", value, "videoClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoClassCodeGreaterThan(String value) {
            addCriterion("video_class_code >", value, "videoClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoClassCodeGreaterThanOrEqualTo(String value) {
            addCriterion("video_class_code >=", value, "videoClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoClassCodeLessThan(String value) {
            addCriterion("video_class_code <", value, "videoClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoClassCodeLessThanOrEqualTo(String value) {
            addCriterion("video_class_code <=", value, "videoClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoClassCodeLike(String value) {
            addCriterion("video_class_code like", value, "videoClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoClassCodeNotLike(String value) {
            addCriterion("video_class_code not like", value, "videoClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoClassCodeIn(List<String> values) {
            addCriterion("video_class_code in", values, "videoClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoClassCodeNotIn(List<String> values) {
            addCriterion("video_class_code not in", values, "videoClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoClassCodeBetween(String value1, String value2) {
            addCriterion("video_class_code between", value1, value2, "videoClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoClassCodeNotBetween(String value1, String value2) {
            addCriterion("video_class_code not between", value1, value2, "videoClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoClassNameIsNull() {
            addCriterion("video_class_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoClassNameIsNotNull() {
            addCriterion("video_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoClassNameEqualTo(String value) {
            addCriterion("video_class_name =", value, "videoClassName");
            return (Criteria) this;
        }

        public Criteria andVideoClassNameNotEqualTo(String value) {
            addCriterion("video_class_name <>", value, "videoClassName");
            return (Criteria) this;
        }

        public Criteria andVideoClassNameGreaterThan(String value) {
            addCriterion("video_class_name >", value, "videoClassName");
            return (Criteria) this;
        }

        public Criteria andVideoClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_class_name >=", value, "videoClassName");
            return (Criteria) this;
        }

        public Criteria andVideoClassNameLessThan(String value) {
            addCriterion("video_class_name <", value, "videoClassName");
            return (Criteria) this;
        }

        public Criteria andVideoClassNameLessThanOrEqualTo(String value) {
            addCriterion("video_class_name <=", value, "videoClassName");
            return (Criteria) this;
        }

        public Criteria andVideoClassNameLike(String value) {
            addCriterion("video_class_name like", value, "videoClassName");
            return (Criteria) this;
        }

        public Criteria andVideoClassNameNotLike(String value) {
            addCriterion("video_class_name not like", value, "videoClassName");
            return (Criteria) this;
        }

        public Criteria andVideoClassNameIn(List<String> values) {
            addCriterion("video_class_name in", values, "videoClassName");
            return (Criteria) this;
        }

        public Criteria andVideoClassNameNotIn(List<String> values) {
            addCriterion("video_class_name not in", values, "videoClassName");
            return (Criteria) this;
        }

        public Criteria andVideoClassNameBetween(String value1, String value2) {
            addCriterion("video_class_name between", value1, value2, "videoClassName");
            return (Criteria) this;
        }

        public Criteria andVideoClassNameNotBetween(String value1, String value2) {
            addCriterion("video_class_name not between", value1, value2, "videoClassName");
            return (Criteria) this;
        }

        public Criteria andVideoClassLevelIsNull() {
            addCriterion("video_class_level is null");
            return (Criteria) this;
        }

        public Criteria andVideoClassLevelIsNotNull() {
            addCriterion("video_class_level is not null");
            return (Criteria) this;
        }

        public Criteria andVideoClassLevelEqualTo(Integer value) {
            addCriterion("video_class_level =", value, "videoClassLevel");
            return (Criteria) this;
        }

        public Criteria andVideoClassLevelNotEqualTo(Integer value) {
            addCriterion("video_class_level <>", value, "videoClassLevel");
            return (Criteria) this;
        }

        public Criteria andVideoClassLevelGreaterThan(Integer value) {
            addCriterion("video_class_level >", value, "videoClassLevel");
            return (Criteria) this;
        }

        public Criteria andVideoClassLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_class_level >=", value, "videoClassLevel");
            return (Criteria) this;
        }

        public Criteria andVideoClassLevelLessThan(Integer value) {
            addCriterion("video_class_level <", value, "videoClassLevel");
            return (Criteria) this;
        }

        public Criteria andVideoClassLevelLessThanOrEqualTo(Integer value) {
            addCriterion("video_class_level <=", value, "videoClassLevel");
            return (Criteria) this;
        }

        public Criteria andVideoClassLevelIn(List<Integer> values) {
            addCriterion("video_class_level in", values, "videoClassLevel");
            return (Criteria) this;
        }

        public Criteria andVideoClassLevelNotIn(List<Integer> values) {
            addCriterion("video_class_level not in", values, "videoClassLevel");
            return (Criteria) this;
        }

        public Criteria andVVideoClassLevelBetween(Integer value1, Integer value2) {
            addCriterion("video_class_level between", value1, value2, "videoClassLevel");
            return (Criteria) this;
        }

        public Criteria andVideoClassLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("video_class_level not between", value1, value2, "videoClassLevel");
            return (Criteria) this;
        }
        
        public Criteria andParentVideoClassIdIsNull() {
            addCriterion("parent_video_class_id is null");
            return (Criteria) this;
        }

        public Criteria andParentVideoClassIdIsNotNull() {
            addCriterion("parent_video_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentVideoClassIdEqualTo(String value) {
            addCriterion("parent_video_class_id =", value, "parentVideoClassId");
            return (Criteria) this;
        }

        public Criteria andParentVideoClassIdNotEqualTo(String value) {
            addCriterion("parent_video_class_id <>", value, "parentVideoClassId");
            return (Criteria) this;
        }

        public Criteria andParentVideoClassIdGreaterThan(String value) {
            addCriterion("parent_video_class_id >", value, "parentVideoClassId");
            return (Criteria) this;
        }

        public Criteria andParentVideoClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_video_class_id >=", value, "parentVideoClassId");
            return (Criteria) this;
        }

        public Criteria andParentVideoClassIdLessThan(String value) {
            addCriterion("parent_video_class_id <", value, "parentVideoClassId");
            return (Criteria) this;
        }

        public Criteria andParentVideoClassIdLessThanOrEqualTo(String value) {
            addCriterion("parent_video_class_id <=", value, "parentVideoClassId");
            return (Criteria) this;
        }

        public Criteria andParentVideoClassIdLike(String value) {
            addCriterion("parent_video_class_id like", value, "parentVideoClassId");
            return (Criteria) this;
        }

        public Criteria andParentVideoClassIdNotLike(String value) {
            addCriterion("parent_video_class_id not like", value, "parentVideoClassId");
            return (Criteria) this;
        }

        public Criteria andParentVideoClassIdIn(List<String> values) {
            addCriterion("parent_video_class_id in", values, "parentVideoClassId");
            return (Criteria) this;
        }

        public Criteria andParentVideoClassIdNotIn(List<String> values) {
            addCriterion("parent_video_class_id not in", values, "parentVideoClassId");
            return (Criteria) this;
        }

        public Criteria andParentVideoClassIdBetween(String value1, String value2) {
            addCriterion("parent_video_class_id between", value1, value2, "parentVideoClassId");
            return (Criteria) this;
        }

        public Criteria andParentVideoClassIdNotBetween(String value1, String value2) {
            addCriterion("parent_video_class_id not between", value1, value2, "parentVideoClassId");
            return (Criteria) this;
        }

        public Criteria andVideoClassNoIsNull() {
            addCriterion("video_class_no is null");
            return (Criteria) this;
        }

        public Criteria andVideoClassNoIsNotNull() {
            addCriterion("video_class_no is not null");
            return (Criteria) this;
        }

        public Criteria andVideoClassNoEqualTo(Integer value) {
            addCriterion("video_class_no =", value, "videoClassNo");
            return (Criteria) this;
        }

        public Criteria andVideoClassNoNotEqualTo(Integer value) {
            addCriterion("video_class_no <>", value, "videoClassNo");
            return (Criteria) this;
        }

        public Criteria andVideoClassNoGreaterThan(Integer value) {
            addCriterion("video_class_no >", value, "videoClassNo");
            return (Criteria) this;
        }

        public Criteria andVideoClassNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_class_no >=", value, "videoClassNo");
            return (Criteria) this;
        }

        public Criteria andVideoClassNoLessThan(Integer value) {
            addCriterion("video_class_no <", value, "videoClassNo");
            return (Criteria) this;
        }

        public Criteria andVideoClassNoLessThanOrEqualTo(Integer value) {
            addCriterion("video_class_no <=", value, "videoClassNo");
            return (Criteria) this;
        }

        public Criteria andVideoClassNoIn(List<Integer> values) {
            addCriterion("video_class_no in", values, "videoClassNo");
            return (Criteria) this;
        }

        public Criteria andVideoClassNoNotIn(List<Integer> values) {
            addCriterion("video_class_no not in", values, "videoClassNo");
            return (Criteria) this;
        }

        public Criteria andVideoClassNoBetween(Integer value1, Integer value2) {
            addCriterion("video_class_no between", value1, value2, "videoClassNo");
            return (Criteria) this;
        }

        public Criteria andVideoClassNoNotBetween(Integer value1, Integer value2) {
            addCriterion("video_class_no not between", value1, value2, "videoClassNo");
            return (Criteria) this;
        }
      
        public Criteria andVideoLayerClassCodeIsNull() {
            addCriterion("video_layer_class_code is null");
            return (Criteria) this;
        }

        public Criteria andVideoLayerClassCodeIsNotNull() {
            addCriterion("video_layer_class_code is not null");
            return (Criteria) this;
        }

        public Criteria andVideoLayerClassCodeEqualTo(String value) {
            addCriterion("video_layer_class_code =", value, "videoLayerClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoLayerClassCodeNotEqualTo(String value) {
            addCriterion("video_layer_class_code <>", value, "videoLayerClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoLayerClassCodeGreaterThan(String value) {
            addCriterion("video_layer_class_code >", value, "videoLayerClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoLayerClassCodeGreaterThanOrEqualTo(String value) {
            addCriterion("video_layer_class_code >=", value, "videoLayerClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoLayerClassCodeLessThan(String value) {
            addCriterion("video_layer_class_code <", value, "videoLayerClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoLayerClassCodecLessThanOrEqualTo(String value) {
            addCriterion("video_layer_class_code <=", value, "videoLayerClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoLayerClassCodeDescLike(String value) {
            addCriterion("video_layer_class_code like", value, "videoLayerClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoLayerClassCodeNotLike(String value) {
            addCriterion("video_layer_class_code not like", value, "videoLayerClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoLayerClassCodecIn(List<String> values) {
            addCriterion("video_layer_class_code in", values, "videoLayerClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoLayerClassCodeNotIn(List<String> values) {
            addCriterion("video_layer_class_code not in", values, "videoLayerClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoLayerClassCodeBetween(String value1, String value2) {
            addCriterion("video_layer_class_code between", value1, value2, "videoLayerClassCode");
            return (Criteria) this;
        }

        public Criteria andVideoLayerClassCodeNotBetween(String value1, String value2) {
            addCriterion("video_layer_class_code not between", value1, value2, "videoLayerClassCode");
            return (Criteria) this;
        }        
  
        public Criteria andVideoClassDescIsNull() {
            addCriterion("video_class_desc is null");
            return (Criteria) this;
        }

        public Criteria andVideoClassDescIsNotNull() {
            addCriterion("video_class_desc is not null");
            return (Criteria) this;
        }

        public Criteria andVideoClassDescEqualTo(String value) {
            addCriterion("video_class_desc =", value, "videoClassDesc");
            return (Criteria) this;
        }

        public Criteria andVideoClassDescNotEqualTo(String value) {
            addCriterion("video_class_desc <>", value, "videoClassDesc");
            return (Criteria) this;
        }

        public Criteria andVideoClassDescGreaterThan(String value) {
            addCriterion("video_class_desc >", value, "videoClassDesc");
            return (Criteria) this;
        }

        public Criteria andVideoClassDescGreaterThanOrEqualTo(String value) {
            addCriterion("video_class_desc >=", value, "videoClassDesc");
            return (Criteria) this;
        }

        public Criteria andVideoClassDescLessThan(String value) {
            addCriterion("video_class_desc <", value, "videoClassDesc");
            return (Criteria) this;
        }

        public Criteria andVideoClassDescLessThanOrEqualTo(String value) {
            addCriterion("video_class_desc <=", value, "videoClassDesc");
            return (Criteria) this;
        }

        public Criteria andVideoClassDescLike(String value) {
            addCriterion("video_class_desc like", value, "videoClassDesc");
            return (Criteria) this;
        }

        public Criteria andVideoClassDescNotLike(String value) {
            addCriterion("video_class_desc not like", value, "videoClassDesc");
            return (Criteria) this;
        }

        public Criteria andVideoClassDescIn(List<String> values) {
            addCriterion("video_class_desc in", values, "videoClassDesc");
            return (Criteria) this;
        }

        public Criteria andVideoClassDescNotIn(List<String> values) {
            addCriterion("video_class_desc not in", values, "videoClassDesc");
            return (Criteria) this;
        }

        public Criteria andVideoClassDescBetween(String value1, String value2) {
            addCriterion("video_class_desc between", value1, value2, "videoClassDesc");
            return (Criteria) this;
        }

        public Criteria andVideoClassDescNotBetween(String value1, String value2) {
            addCriterion("video_class_desc not between", value1, value2, "videoClassDesc");
            return (Criteria) this;
        }

        public Criteria andEndNodeIsNull() {
            addCriterion("end_node is null");
            return (Criteria) this;
        }

        public Criteria andEndNodeIsNotNull() {
            addCriterion("end_node is not null");
            return (Criteria) this;
        }

        public Criteria andEndNodeEqualTo(Integer value) {
            addCriterion("end_node =", value, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeNotEqualTo(Integer value) {
            addCriterion("end_node <>", value, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeGreaterThan(Integer value) {
            addCriterion("end_node >", value, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_node >=", value, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeLessThan(Integer value) {
            addCriterion("end_node <", value, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeLessThanOrEqualTo(Integer value) {
            addCriterion("end_node <=", value, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeIn(List<Integer> values) {
            addCriterion("end_node in", values, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeNotIn(List<Integer> values) {
            addCriterion("end_node not in", values, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeBetween(Integer value1, Integer value2) {
            addCriterion("end_node between", value1, value2, "endNode");
            return (Criteria) this;
        }

        public Criteria andEndNodeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_node not between", value1, value2, "endNode");
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