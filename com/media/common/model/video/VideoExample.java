package com.media.common.model.video;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Created by lihaiqiang on 2018/11/01.
 */
public class VideoExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andPkFileDirectoryIdIsNull() {
            addCriterion("pk_file_directory_id is null");
            return (Criteria) this;
        }

        public Criteria andPkFileDirectoryIdIsNotNull() {
            addCriterion("pk_file_directory_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkFileDirectoryIdEqualTo(String value) {
            addCriterion("pk_file_directory_id =", value, "pkFileDirectoryId");
            return (Criteria) this;
        }

        public Criteria andPkFileDirectoryIdNotEqualTo(String value) {
            addCriterion("pk_file_directory_id <>", value, "pkFileDirectoryId");
            return (Criteria) this;
        }

        public Criteria andPkFileDirectoryIdGreaterThan(String value) {
            addCriterion("pk_file_directory_id >", value, "pkFileDirectoryId");
            return (Criteria) this;
        }

        public Criteria andPkFileDirectoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("pk_file_directory_id >=", value, "pkFileDirectoryId");
            return (Criteria) this;
        }

        public Criteria andPkFileDirectoryIdLessThan(String value) {
            addCriterion("pk_file_directory_id <", value, "pkFileDirectoryId");
            return (Criteria) this;
        }

        public Criteria andPkFileDirectoryIdLessThanOrEqualTo(String value) {
            addCriterion("pk_file_directory_id <=", value, "pkFileDirectoryId");
            return (Criteria) this;
        }

        public Criteria andPkFileDirectoryIdLike(String value) {
            addCriterion("pk_file_directory_id like", value, "pkFileDirectoryId");
            return (Criteria) this;
        }

        public Criteria andPkFileDirectoryIdNotLike(String value) {
            addCriterion("pk_file_directory_id not like", value, "pkFileDirectoryId");
            return (Criteria) this;
        }

        public Criteria andPkFileDirectoryIdIn(List<String> values) {
            addCriterion("pk_file_directory_id in", values, "pkFileDirectoryId");
            return (Criteria) this;
        }

        public Criteria andPkFileDirectoryIdNotIn(List<String> values) {
            addCriterion("pk_file_directory_id not in", values, "pkFileDirectoryId");
            return (Criteria) this;
        }

        public Criteria andPkFileDirectoryIdBetween(String value1, String value2) {
            addCriterion("pk_file_directory_id between", value1, value2, "pkFileDirectoryId");
            return (Criteria) this;
        }

        public Criteria andPkFileDirectoryIdNotBetween(String value1, String value2) {
            addCriterion("pk_file_directory_id not between", value1, value2, "pkFileDirectoryId");
            return (Criteria) this;
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

        public Criteria andVideoTypeIsNull() {
            addCriterion("video_type is null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNotNull() {
            addCriterion("video_type is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeEqualTo(Integer value) {
            addCriterion("video_type =", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotEqualTo(Integer value) {
            addCriterion("video_type <>", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThan(Integer value) {
            addCriterion("video_type >", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_type >=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThan(Integer value) {
            addCriterion("video_type <", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThanOrEqualTo(Integer value) {
            addCriterion("video_type <=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIn(List<Integer> values) {
            addCriterion("video_type in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotIn(List<Integer> values) {
            addCriterion("video_type not in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeBetween(Integer value1, Integer value2) {
            addCriterion("video_type between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("video_type not between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoNameChIsNull() {
            addCriterion("video_name_ch is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameChIsNotNull() {
            addCriterion("video_name_ch is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameChEqualTo(String value) {
            addCriterion("video_name_ch =", value, "videoNameCh");
            return (Criteria) this;
        }

        public Criteria andVideoNameChNotEqualTo(String value) {
            addCriterion("video_name_ch <>", value, "videoNameCh");
            return (Criteria) this;
        }

        public Criteria andVideoNameChGreaterThan(String value) {
            addCriterion("video_name_ch >", value, "videoNameCh");
            return (Criteria) this;
        }

        public Criteria andVideoNameChGreaterThanOrEqualTo(String value) {
            addCriterion("video_name_ch >=", value, "videoNameCh");
            return (Criteria) this;
        }

        public Criteria andVideoNameChLessThan(String value) {
            addCriterion("video_name_ch <", value, "videoNameCh");
            return (Criteria) this;
        }

        public Criteria andVideoNameChLessThanOrEqualTo(String value) {
            addCriterion("video_name_ch <=", value, "videoNameCh");
            return (Criteria) this;
        }

        public Criteria andVideoNameChLike(String value) {
            addCriterion("video_name_ch like", value, "videoNameCh");
            return (Criteria) this;
        }

        public Criteria andVideoNameChNotLike(String value) {
            addCriterion("video_name_ch not like", value, "videoNameCh");
            return (Criteria) this;
        }

        public Criteria andVideoNameChIn(List<String> values) {
            addCriterion("video_name_ch in", values, "videoNameCh");
            return (Criteria) this;
        }

        public Criteria andVideoNameChNotIn(List<String> values) {
            addCriterion("video_name_ch not in", values, "videoNameCh");
            return (Criteria) this;
        }

        public Criteria andVideoNameChBetween(String value1, String value2) {
            addCriterion("video_name_ch between", value1, value2, "videoNameCh");
            return (Criteria) this;
        }

        public Criteria andVideoNameChNotBetween(String value1, String value2) {
            addCriterion("video_name_ch not between", value1, value2, "videoNameCh");
            return (Criteria) this;
        }

        public Criteria andVideoNameEnIsNull() {
            addCriterion("video_name_en is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEnIsNotNull() {
            addCriterion("video_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEnEqualTo(String value) {
            addCriterion("video_name_en =", value, "videoNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoNameEnNotEqualTo(String value) {
            addCriterion("video_name_en <>", value, "videoNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoNameEnGreaterThan(String value) {
            addCriterion("video_name_en >", value, "videoNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("video_name_en >=", value, "videoNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoNameEnLessThan(String value) {
            addCriterion("video_name_en <", value, "videoNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoNameEnLessThanOrEqualTo(String value) {
            addCriterion("video_name_en <=", value, "videoNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoNameEnLike(String value) {
            addCriterion("video_name_en like", value, "videoNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoNameEnNotLike(String value) {
            addCriterion("video_name_en not like", value, "videoNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoNameEnIn(List<String> values) {
            addCriterion("video_name_en in", values, "videoNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoNameEnNotIn(List<String> values) {
            addCriterion("video_name_en not in", values, "videoNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoNameEnBetween(String value1, String value2) {
            addCriterion("video_name_en between", value1, value2, "videoNameEn");
            return (Criteria) this;
        }

        public Criteria andVideoNameEnNotBetween(String value1, String value2) {
            addCriterion("video_name_en not between", value1, value2, "videoNameEn");
            return (Criteria) this;
        }


        public Criteria andVideoDescribleIsNull() {
            addCriterion("video_describle is null");
            return (Criteria) this;
        }

        public Criteria andVideoDescribleIsNotNull() {
            addCriterion("video_describle is not null");
            return (Criteria) this;
        }

        public Criteria andVideoDescribleEqualTo(String value) {
            addCriterion("video_describle =", value, "videoDescrible");
            return (Criteria) this;
        }

        public Criteria andVideoDescribleNotEqualTo(String value) {
            addCriterion("video_describle <>", value, "videoDescrible");
            return (Criteria) this;
        }

        public Criteria andVideoDescribleGreaterThan(String value) {
            addCriterion("video_describle >", value, "videoDescrible");
            return (Criteria) this;
        }

        public Criteria andVideoDescribleGreaterThanOrEqualTo(String value) {
            addCriterion("video_describle >=", value, "videoDescrible");
            return (Criteria) this;
        }

        public Criteria andVideoDescribleLessThan(String value) {
            addCriterion("video_describle <", value, "videoDescrible");
            return (Criteria) this;
        }

        public Criteria andVideoDescribleLessThanOrEqualTo(String value) {
            addCriterion("video_describle <=", value, "videoDescrible");
            return (Criteria) this;
        }

        public Criteria andVideoDescribleLike(String value) {
            addCriterion("video_describle like", value, "videoDescrible");
            return (Criteria) this;
        }

        public Criteria andVideoDescribleNotLike(String value) {
            addCriterion("video_describle not like", value, "videoDescrible");
            return (Criteria) this;
        }

        public Criteria andVideoDescribleIn(List<String> values) {
            addCriterion("video_describle in", values, "videoDescrible");
            return (Criteria) this;
        }

        public Criteria andVideoDescribleNotIn(List<String> values) {
            addCriterion("video_describle not in", values, "videoDescrible");
            return (Criteria) this;
        }

        public Criteria andVideoDescribleBetween(String value1, String value2) {
            addCriterion("video_describle between", value1, value2, "videoDescrible");
            return (Criteria) this;
        }

        public Criteria andVideoDescribleNotBetween(String value1, String value2) {
            addCriterion("video_describle not between", value1, value2, "videoDescrible");
            return (Criteria) this;
        }

        public Criteria andVideoCodeIsNull() {
            addCriterion("video_code is null");
            return (Criteria) this;
        }

        public Criteria andVideoCodeIsNotNull() {
            addCriterion("video_code is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCodeEqualTo(String value) {
            addCriterion("video_code =", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeNotEqualTo(String value) {
            addCriterion("video_code <>", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeGreaterThan(String value) {
            addCriterion("video_code >", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("video_code >=", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeLessThan(String value) {
            addCriterion("video_code <", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeLessThanOrEqualTo(String value) {
            addCriterion("video_code <=", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeLike(String value) {
            addCriterion("video_code like", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeNotLike(String value) {
            addCriterion("video_code not like", value, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeIn(List<String> values) {
            addCriterion("video_code in", values, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeNotIn(List<String> values) {
            addCriterion("video_code not in", values, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeBetween(String value1, String value2) {
            addCriterion("video_code between", value1, value2, "videoCode");
            return (Criteria) this;
        }

        public Criteria andVideoCodeNotBetween(String value1, String value2) {
            addCriterion("video_code not between", value1, value2, "videoCode");
            return (Criteria) this;
        }
        

        public Criteria andVideoImgPathIsNull() {
            addCriterion("video_img_path is null");
            return (Criteria) this;
        }

        public Criteria andVideoImgPathIsNotNull() {
            addCriterion("video_img_path is not null");
            return (Criteria) this;
        }

        public Criteria andVideoImgPathEqualTo(String value) {
            addCriterion("video_img_path =", value, "videoImgPath");
            return (Criteria) this;
        }

        public Criteria andVideoImgPathNotEqualTo(String value) {
            addCriterion("video_img_path <>", value, "videoImgPath");
            return (Criteria) this;
        }

        public Criteria andVideoImgPathGreaterThan(String value) {
            addCriterion("video_img_path >", value, "videoImgPath");
            return (Criteria) this;
        }

        public Criteria andVideoImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("video_img_path >=", value, "videoImgPath");
            return (Criteria) this;
        }

        public Criteria andVideoImgPathLessThan(String value) {
            addCriterion("video_img_path <", value, "videoImgPath");
            return (Criteria) this;
        }

        public Criteria andVideoImgPathLessThanOrEqualTo(String value) {
            addCriterion("video_img_path <=", value, "videoImgPath");
            return (Criteria) this;
        }

        public Criteria andVideoImgPathLike(String value) {
            addCriterion("video_img_path like", value, "videoImgPath");
            return (Criteria) this;
        }

        public Criteria andVideoImgPathNotLike(String value) {
            addCriterion("video_img_path not like", value, "videoImgPath");
            return (Criteria) this;
        }

        public Criteria andVideoImgPathIn(List<String> values) {
            addCriterion("video_img_path in", values, "videoImgPath");
            return (Criteria) this;
        }

        public Criteria andVideoImgPathNotIn(List<String> values) {
            addCriterion("video_img_path not in", values, "videoImgPath");
            return (Criteria) this;
        }

        public Criteria andVideoImgPathBetween(String value1, String value2) {
            addCriterion("video_img_path between", value1, value2, "videoImgPath");
            return (Criteria) this;
        }

        public Criteria andVideoImgPathNotBetween(String value1, String value2) {
            addCriterion("video_img_path not between", value1, value2, "videoImgPath");
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

        public Criteria andAuditOpinionIsNull() {
            addCriterion("audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("audit_opinion not between", value1, value2, "auditOpinion");
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