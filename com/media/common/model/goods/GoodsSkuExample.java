package com.media.common.model.goods;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsSkuExample() {
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

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(String value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(String value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(String value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(String value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(String value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLike(String value) {
            addCriterion("sku_id like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotLike(String value) {
            addCriterion("sku_id not like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<String> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<String> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(String value1, String value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(String value1, String value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNull() {
            addCriterion("sku_name is null");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNotNull() {
            addCriterion("sku_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualTo(String value) {
            addCriterion("sku_name =", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("sku_name <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("sku_name >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_name >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("sku_name <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("sku_name <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLike(String value) {
            addCriterion("sku_name like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotLike(String value) {
            addCriterion("sku_name not like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameIn(List<String> values) {
            addCriterion("sku_name in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotIn(List<String> values) {
            addCriterion("sku_name not in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameBetween(String value1, String value2) {
            addCriterion("sku_name between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotBetween(String value1, String value2) {
            addCriterion("sku_name not between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNumIsNull() {
            addCriterion("sku_num is null");
            return (Criteria) this;
        }

        public Criteria andSkuNumIsNotNull() {
            addCriterion("sku_num is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNumEqualTo(BigDecimal value) {
            addCriterion("sku_num =", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotEqualTo(BigDecimal value) {
            addCriterion("sku_num <>", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumGreaterThan(BigDecimal value) {
            addCriterion("sku_num >", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sku_num >=", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumLessThan(BigDecimal value) {
            addCriterion("sku_num <", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sku_num <=", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumIn(List<BigDecimal> values) {
            addCriterion("sku_num in", values, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotIn(List<BigDecimal> values) {
            addCriterion("sku_num not in", values, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sku_num between", value1, value2, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sku_num not between", value1, value2, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuUnitIsNull() {
            addCriterion("sku_unit is null");
            return (Criteria) this;
        }

        public Criteria andSkuUnitIsNotNull() {
            addCriterion("sku_unit is not null");
            return (Criteria) this;
        }

        public Criteria andSkuUnitEqualTo(Integer value) {
            addCriterion("sku_unit =", value, "skuUnit");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNotEqualTo(Integer value) {
            addCriterion("sku_unit <>", value, "skuUnit");
            return (Criteria) this;
        }

        public Criteria andSkuUnitGreaterThan(Integer value) {
            addCriterion("sku_unit >", value, "skuUnit");
            return (Criteria) this;
        }

        public Criteria andSkuUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_unit >=", value, "skuUnit");
            return (Criteria) this;
        }

        public Criteria andSkuUnitLessThan(Integer value) {
            addCriterion("sku_unit <", value, "skuUnit");
            return (Criteria) this;
        }

        public Criteria andSkuUnitLessThanOrEqualTo(Integer value) {
            addCriterion("sku_unit <=", value, "skuUnit");
            return (Criteria) this;
        }

        public Criteria andSkuUnitIn(List<Integer> values) {
            addCriterion("sku_unit in", values, "skuUnit");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNotIn(List<Integer> values) {
            addCriterion("sku_unit not in", values, "skuUnit");
            return (Criteria) this;
        }

        public Criteria andSkuUnitBetween(Integer value1, Integer value2) {
            addCriterion("sku_unit between", value1, value2, "skuUnit");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_unit not between", value1, value2, "skuUnit");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNameIsNull() {
            addCriterion("sku_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNameIsNotNull() {
            addCriterion("sku_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNameEqualTo(String value) {
            addCriterion("sku_unit_name =", value, "skuUnitName");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNameNotEqualTo(String value) {
            addCriterion("sku_unit_name <>", value, "skuUnitName");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNameGreaterThan(String value) {
            addCriterion("sku_unit_name >", value, "skuUnitName");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_unit_name >=", value, "skuUnitName");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNameLessThan(String value) {
            addCriterion("sku_unit_name <", value, "skuUnitName");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNameLessThanOrEqualTo(String value) {
            addCriterion("sku_unit_name <=", value, "skuUnitName");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNameLike(String value) {
            addCriterion("sku_unit_name like", value, "skuUnitName");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNameNotLike(String value) {
            addCriterion("sku_unit_name not like", value, "skuUnitName");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNameIn(List<String> values) {
            addCriterion("sku_unit_name in", values, "skuUnitName");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNameNotIn(List<String> values) {
            addCriterion("sku_unit_name not in", values, "skuUnitName");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNameBetween(String value1, String value2) {
            addCriterion("sku_unit_name between", value1, value2, "skuUnitName");
            return (Criteria) this;
        }

        public Criteria andSkuUnitNameNotBetween(String value1, String value2) {
            addCriterion("sku_unit_name not between", value1, value2, "skuUnitName");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIsNull() {
            addCriterion("weight_unit is null");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIsNotNull() {
            addCriterion("weight_unit is not null");
            return (Criteria) this;
        }

        public Criteria andWeightUnitEqualTo(Integer value) {
            addCriterion("weight_unit =", value, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNotEqualTo(Integer value) {
            addCriterion("weight_unit <>", value, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitGreaterThan(Integer value) {
            addCriterion("weight_unit >", value, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight_unit >=", value, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitLessThan(Integer value) {
            addCriterion("weight_unit <", value, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitLessThanOrEqualTo(Integer value) {
            addCriterion("weight_unit <=", value, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIn(List<Integer> values) {
            addCriterion("weight_unit in", values, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNotIn(List<Integer> values) {
            addCriterion("weight_unit not in", values, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitBetween(Integer value1, Integer value2) {
            addCriterion("weight_unit between", value1, value2, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("weight_unit not between", value1, value2, "weightUnit");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNameIsNull() {
            addCriterion("weight_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNameIsNotNull() {
            addCriterion("weight_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNameEqualTo(String value) {
            addCriterion("weight_unit_name =", value, "weightUnitName");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNameNotEqualTo(String value) {
            addCriterion("weight_unit_name <>", value, "weightUnitName");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNameGreaterThan(String value) {
            addCriterion("weight_unit_name >", value, "weightUnitName");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("weight_unit_name >=", value, "weightUnitName");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNameLessThan(String value) {
            addCriterion("weight_unit_name <", value, "weightUnitName");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNameLessThanOrEqualTo(String value) {
            addCriterion("weight_unit_name <=", value, "weightUnitName");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNameLike(String value) {
            addCriterion("weight_unit_name like", value, "weightUnitName");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNameNotLike(String value) {
            addCriterion("weight_unit_name not like", value, "weightUnitName");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNameIn(List<String> values) {
            addCriterion("weight_unit_name in", values, "weightUnitName");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNameNotIn(List<String> values) {
            addCriterion("weight_unit_name not in", values, "weightUnitName");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNameBetween(String value1, String value2) {
            addCriterion("weight_unit_name between", value1, value2, "weightUnitName");
            return (Criteria) this;
        }

        public Criteria andWeightUnitNameNotBetween(String value1, String value2) {
            addCriterion("weight_unit_name not between", value1, value2, "weightUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardWeightIsNull() {
            addCriterion("standard_weight is null");
            return (Criteria) this;
        }

        public Criteria andStandardWeightIsNotNull() {
            addCriterion("standard_weight is not null");
            return (Criteria) this;
        }

        public Criteria andStandardWeightEqualTo(BigDecimal value) {
            addCriterion("standard_weight =", value, "standardWeight");
            return (Criteria) this;
        }

        public Criteria andStandardWeightNotEqualTo(BigDecimal value) {
            addCriterion("standard_weight <>", value, "standardWeight");
            return (Criteria) this;
        }

        public Criteria andStandardWeightGreaterThan(BigDecimal value) {
            addCriterion("standard_weight >", value, "standardWeight");
            return (Criteria) this;
        }

        public Criteria andStandardWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_weight >=", value, "standardWeight");
            return (Criteria) this;
        }

        public Criteria andStandardWeightLessThan(BigDecimal value) {
            addCriterion("standard_weight <", value, "standardWeight");
            return (Criteria) this;
        }

        public Criteria andStandardWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_weight <=", value, "standardWeight");
            return (Criteria) this;
        }

        public Criteria andStandardWeightIn(List<BigDecimal> values) {
            addCriterion("standard_weight in", values, "standardWeight");
            return (Criteria) this;
        }

        public Criteria andStandardWeightNotIn(List<BigDecimal> values) {
            addCriterion("standard_weight not in", values, "standardWeight");
            return (Criteria) this;
        }

        public Criteria andStandardWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_weight between", value1, value2, "standardWeight");
            return (Criteria) this;
        }

        public Criteria andStandardWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_weight not between", value1, value2, "standardWeight");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitIsNull() {
            addCriterion("standard_weight_unit is null");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitIsNotNull() {
            addCriterion("standard_weight_unit is not null");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitEqualTo(Integer value) {
            addCriterion("standard_weight_unit =", value, "standardWeightUnit");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNotEqualTo(Integer value) {
            addCriterion("standard_weight_unit <>", value, "standardWeightUnit");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitGreaterThan(Integer value) {
            addCriterion("standard_weight_unit >", value, "standardWeightUnit");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("standard_weight_unit >=", value, "standardWeightUnit");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitLessThan(Integer value) {
            addCriterion("standard_weight_unit <", value, "standardWeightUnit");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitLessThanOrEqualTo(Integer value) {
            addCriterion("standard_weight_unit <=", value, "standardWeightUnit");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitIn(List<Integer> values) {
            addCriterion("standard_weight_unit in", values, "standardWeightUnit");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNotIn(List<Integer> values) {
            addCriterion("standard_weight_unit not in", values, "standardWeightUnit");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitBetween(Integer value1, Integer value2) {
            addCriterion("standard_weight_unit between", value1, value2, "standardWeightUnit");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("standard_weight_unit not between", value1, value2, "standardWeightUnit");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNameIsNull() {
            addCriterion("standard_weight_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNameIsNotNull() {
            addCriterion("standard_weight_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNameEqualTo(String value) {
            addCriterion("standard_weight_unit_name =", value, "standardWeightUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNameNotEqualTo(String value) {
            addCriterion("standard_weight_unit_name <>", value, "standardWeightUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNameGreaterThan(String value) {
            addCriterion("standard_weight_unit_name >", value, "standardWeightUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("standard_weight_unit_name >=", value, "standardWeightUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNameLessThan(String value) {
            addCriterion("standard_weight_unit_name <", value, "standardWeightUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNameLessThanOrEqualTo(String value) {
            addCriterion("standard_weight_unit_name <=", value, "standardWeightUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNameLike(String value) {
            addCriterion("standard_weight_unit_name like", value, "standardWeightUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNameNotLike(String value) {
            addCriterion("standard_weight_unit_name not like", value, "standardWeightUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNameIn(List<String> values) {
            addCriterion("standard_weight_unit_name in", values, "standardWeightUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNameNotIn(List<String> values) {
            addCriterion("standard_weight_unit_name not in", values, "standardWeightUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNameBetween(String value1, String value2) {
            addCriterion("standard_weight_unit_name between", value1, value2, "standardWeightUnitName");
            return (Criteria) this;
        }

        public Criteria andStandardWeightUnitNameNotBetween(String value1, String value2) {
            addCriterion("standard_weight_unit_name not between", value1, value2, "standardWeightUnitName");
            return (Criteria) this;
        }

        public Criteria andAttrIdStrIsNull() {
            addCriterion("attr_id_str is null");
            return (Criteria) this;
        }

        public Criteria andAttrIdStrIsNotNull() {
            addCriterion("attr_id_str is not null");
            return (Criteria) this;
        }

        public Criteria andAttrIdStrEqualTo(String value) {
            addCriterion("attr_id_str =", value, "attrIdStr");
            return (Criteria) this;
        }

        public Criteria andAttrIdStrNotEqualTo(String value) {
            addCriterion("attr_id_str <>", value, "attrIdStr");
            return (Criteria) this;
        }

        public Criteria andAttrIdStrGreaterThan(String value) {
            addCriterion("attr_id_str >", value, "attrIdStr");
            return (Criteria) this;
        }

        public Criteria andAttrIdStrGreaterThanOrEqualTo(String value) {
            addCriterion("attr_id_str >=", value, "attrIdStr");
            return (Criteria) this;
        }

        public Criteria andAttrIdStrLessThan(String value) {
            addCriterion("attr_id_str <", value, "attrIdStr");
            return (Criteria) this;
        }

        public Criteria andAttrIdStrLessThanOrEqualTo(String value) {
            addCriterion("attr_id_str <=", value, "attrIdStr");
            return (Criteria) this;
        }

        public Criteria andAttrIdStrLike(String value) {
            addCriterion("attr_id_str like", value, "attrIdStr");
            return (Criteria) this;
        }

        public Criteria andAttrIdStrNotLike(String value) {
            addCriterion("attr_id_str not like", value, "attrIdStr");
            return (Criteria) this;
        }

        public Criteria andAttrIdStrIn(List<String> values) {
            addCriterion("attr_id_str in", values, "attrIdStr");
            return (Criteria) this;
        }

        public Criteria andAttrIdStrNotIn(List<String> values) {
            addCriterion("attr_id_str not in", values, "attrIdStr");
            return (Criteria) this;
        }

        public Criteria andAttrIdStrBetween(String value1, String value2) {
            addCriterion("attr_id_str between", value1, value2, "attrIdStr");
            return (Criteria) this;
        }

        public Criteria andAttrIdStrNotBetween(String value1, String value2) {
            addCriterion("attr_id_str not between", value1, value2, "attrIdStr");
            return (Criteria) this;
        }

        public Criteria andAttrNameStrIsNull() {
            addCriterion("attr_name_str is null");
            return (Criteria) this;
        }

        public Criteria andAttrNameStrIsNotNull() {
            addCriterion("attr_name_str is not null");
            return (Criteria) this;
        }

        public Criteria andAttrNameStrEqualTo(String value) {
            addCriterion("attr_name_str =", value, "attrNameStr");
            return (Criteria) this;
        }

        public Criteria andAttrNameStrNotEqualTo(String value) {
            addCriterion("attr_name_str <>", value, "attrNameStr");
            return (Criteria) this;
        }

        public Criteria andAttrNameStrGreaterThan(String value) {
            addCriterion("attr_name_str >", value, "attrNameStr");
            return (Criteria) this;
        }

        public Criteria andAttrNameStrGreaterThanOrEqualTo(String value) {
            addCriterion("attr_name_str >=", value, "attrNameStr");
            return (Criteria) this;
        }

        public Criteria andAttrNameStrLessThan(String value) {
            addCriterion("attr_name_str <", value, "attrNameStr");
            return (Criteria) this;
        }

        public Criteria andAttrNameStrLessThanOrEqualTo(String value) {
            addCriterion("attr_name_str <=", value, "attrNameStr");
            return (Criteria) this;
        }

        public Criteria andAttrNameStrLike(String value) {
            addCriterion("attr_name_str like", value, "attrNameStr");
            return (Criteria) this;
        }

        public Criteria andAttrNameStrNotLike(String value) {
            addCriterion("attr_name_str not like", value, "attrNameStr");
            return (Criteria) this;
        }

        public Criteria andAttrNameStrIn(List<String> values) {
            addCriterion("attr_name_str in", values, "attrNameStr");
            return (Criteria) this;
        }

        public Criteria andAttrNameStrNotIn(List<String> values) {
            addCriterion("attr_name_str not in", values, "attrNameStr");
            return (Criteria) this;
        }

        public Criteria andAttrNameStrBetween(String value1, String value2) {
            addCriterion("attr_name_str between", value1, value2, "attrNameStr");
            return (Criteria) this;
        }

        public Criteria andAttrNameStrNotBetween(String value1, String value2) {
            addCriterion("attr_name_str not between", value1, value2, "attrNameStr");
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