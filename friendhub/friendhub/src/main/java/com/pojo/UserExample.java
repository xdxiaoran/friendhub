package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andProvenceIsNull() {
            addCriterion("provence is null");
            return (Criteria) this;
        }

        public Criteria andProvenceIsNotNull() {
            addCriterion("provence is not null");
            return (Criteria) this;
        }

        public Criteria andProvenceEqualTo(String value) {
            addCriterion("provence =", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceNotEqualTo(String value) {
            addCriterion("provence <>", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceGreaterThan(String value) {
            addCriterion("provence >", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceGreaterThanOrEqualTo(String value) {
            addCriterion("provence >=", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceLessThan(String value) {
            addCriterion("provence <", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceLessThanOrEqualTo(String value) {
            addCriterion("provence <=", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceLike(String value) {
            addCriterion("provence like", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceNotLike(String value) {
            addCriterion("provence not like", value, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceIn(List<String> values) {
            addCriterion("provence in", values, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceNotIn(List<String> values) {
            addCriterion("provence not in", values, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceBetween(String value1, String value2) {
            addCriterion("provence between", value1, value2, "provence");
            return (Criteria) this;
        }

        public Criteria andProvenceNotBetween(String value1, String value2) {
            addCriterion("provence not between", value1, value2, "provence");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andHairColorIsNull() {
            addCriterion("hairColor is null");
            return (Criteria) this;
        }

        public Criteria andHairColorIsNotNull() {
            addCriterion("hairColor is not null");
            return (Criteria) this;
        }

        public Criteria andHairColorEqualTo(String value) {
            addCriterion("hairColor =", value, "hairColor");
            return (Criteria) this;
        }

        public Criteria andHairColorNotEqualTo(String value) {
            addCriterion("hairColor <>", value, "hairColor");
            return (Criteria) this;
        }

        public Criteria andHairColorGreaterThan(String value) {
            addCriterion("hairColor >", value, "hairColor");
            return (Criteria) this;
        }

        public Criteria andHairColorGreaterThanOrEqualTo(String value) {
            addCriterion("hairColor >=", value, "hairColor");
            return (Criteria) this;
        }

        public Criteria andHairColorLessThan(String value) {
            addCriterion("hairColor <", value, "hairColor");
            return (Criteria) this;
        }

        public Criteria andHairColorLessThanOrEqualTo(String value) {
            addCriterion("hairColor <=", value, "hairColor");
            return (Criteria) this;
        }

        public Criteria andHairColorLike(String value) {
            addCriterion("hairColor like", value, "hairColor");
            return (Criteria) this;
        }

        public Criteria andHairColorNotLike(String value) {
            addCriterion("hairColor not like", value, "hairColor");
            return (Criteria) this;
        }

        public Criteria andHairColorIn(List<String> values) {
            addCriterion("hairColor in", values, "hairColor");
            return (Criteria) this;
        }

        public Criteria andHairColorNotIn(List<String> values) {
            addCriterion("hairColor not in", values, "hairColor");
            return (Criteria) this;
        }

        public Criteria andHairColorBetween(String value1, String value2) {
            addCriterion("hairColor between", value1, value2, "hairColor");
            return (Criteria) this;
        }

        public Criteria andHairColorNotBetween(String value1, String value2) {
            addCriterion("hairColor not between", value1, value2, "hairColor");
            return (Criteria) this;
        }

        public Criteria andHairLengthIsNull() {
            addCriterion("hairLength is null");
            return (Criteria) this;
        }

        public Criteria andHairLengthIsNotNull() {
            addCriterion("hairLength is not null");
            return (Criteria) this;
        }

        public Criteria andHairLengthEqualTo(Integer value) {
            addCriterion("hairLength =", value, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthNotEqualTo(Integer value) {
            addCriterion("hairLength <>", value, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthGreaterThan(Integer value) {
            addCriterion("hairLength >", value, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("hairLength >=", value, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthLessThan(Integer value) {
            addCriterion("hairLength <", value, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthLessThanOrEqualTo(Integer value) {
            addCriterion("hairLength <=", value, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthIn(List<Integer> values) {
            addCriterion("hairLength in", values, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthNotIn(List<Integer> values) {
            addCriterion("hairLength not in", values, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthBetween(Integer value1, Integer value2) {
            addCriterion("hairLength between", value1, value2, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("hairLength not between", value1, value2, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
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

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andShapeIsNull() {
            addCriterion("shape is null");
            return (Criteria) this;
        }

        public Criteria andShapeIsNotNull() {
            addCriterion("shape is not null");
            return (Criteria) this;
        }

        public Criteria andShapeEqualTo(String value) {
            addCriterion("shape =", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeNotEqualTo(String value) {
            addCriterion("shape <>", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeGreaterThan(String value) {
            addCriterion("shape >", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeGreaterThanOrEqualTo(String value) {
            addCriterion("shape >=", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeLessThan(String value) {
            addCriterion("shape <", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeLessThanOrEqualTo(String value) {
            addCriterion("shape <=", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeLike(String value) {
            addCriterion("shape like", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeNotLike(String value) {
            addCriterion("shape not like", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeIn(List<String> values) {
            addCriterion("shape in", values, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeNotIn(List<String> values) {
            addCriterion("shape not in", values, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeBetween(String value1, String value2) {
            addCriterion("shape between", value1, value2, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeNotBetween(String value1, String value2) {
            addCriterion("shape not between", value1, value2, "shape");
            return (Criteria) this;
        }

        public Criteria andDrinkingIsNull() {
            addCriterion("drinking is null");
            return (Criteria) this;
        }

        public Criteria andDrinkingIsNotNull() {
            addCriterion("drinking is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkingEqualTo(String value) {
            addCriterion("drinking =", value, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingNotEqualTo(String value) {
            addCriterion("drinking <>", value, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingGreaterThan(String value) {
            addCriterion("drinking >", value, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingGreaterThanOrEqualTo(String value) {
            addCriterion("drinking >=", value, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingLessThan(String value) {
            addCriterion("drinking <", value, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingLessThanOrEqualTo(String value) {
            addCriterion("drinking <=", value, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingLike(String value) {
            addCriterion("drinking like", value, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingNotLike(String value) {
            addCriterion("drinking not like", value, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingIn(List<String> values) {
            addCriterion("drinking in", values, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingNotIn(List<String> values) {
            addCriterion("drinking not in", values, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingBetween(String value1, String value2) {
            addCriterion("drinking between", value1, value2, "drinking");
            return (Criteria) this;
        }

        public Criteria andDrinkingNotBetween(String value1, String value2) {
            addCriterion("drinking not between", value1, value2, "drinking");
            return (Criteria) this;
        }

        public Criteria andSmokingIsNull() {
            addCriterion("smoking is null");
            return (Criteria) this;
        }

        public Criteria andSmokingIsNotNull() {
            addCriterion("smoking is not null");
            return (Criteria) this;
        }

        public Criteria andSmokingEqualTo(String value) {
            addCriterion("smoking =", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingNotEqualTo(String value) {
            addCriterion("smoking <>", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingGreaterThan(String value) {
            addCriterion("smoking >", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingGreaterThanOrEqualTo(String value) {
            addCriterion("smoking >=", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingLessThan(String value) {
            addCriterion("smoking <", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingLessThanOrEqualTo(String value) {
            addCriterion("smoking <=", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingLike(String value) {
            addCriterion("smoking like", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingNotLike(String value) {
            addCriterion("smoking not like", value, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingIn(List<String> values) {
            addCriterion("smoking in", values, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingNotIn(List<String> values) {
            addCriterion("smoking not in", values, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingBetween(String value1, String value2) {
            addCriterion("smoking between", value1, value2, "smoking");
            return (Criteria) this;
        }

        public Criteria andSmokingNotBetween(String value1, String value2) {
            addCriterion("smoking not between", value1, value2, "smoking");
            return (Criteria) this;
        }

        public Criteria andStayUplateIsNull() {
            addCriterion("stayUplate is null");
            return (Criteria) this;
        }

        public Criteria andStayUplateIsNotNull() {
            addCriterion("stayUplate is not null");
            return (Criteria) this;
        }

        public Criteria andStayUplateEqualTo(String value) {
            addCriterion("stayUplate =", value, "stayUplate");
            return (Criteria) this;
        }

        public Criteria andStayUplateNotEqualTo(String value) {
            addCriterion("stayUplate <>", value, "stayUplate");
            return (Criteria) this;
        }

        public Criteria andStayUplateGreaterThan(String value) {
            addCriterion("stayUplate >", value, "stayUplate");
            return (Criteria) this;
        }

        public Criteria andStayUplateGreaterThanOrEqualTo(String value) {
            addCriterion("stayUplate >=", value, "stayUplate");
            return (Criteria) this;
        }

        public Criteria andStayUplateLessThan(String value) {
            addCriterion("stayUplate <", value, "stayUplate");
            return (Criteria) this;
        }

        public Criteria andStayUplateLessThanOrEqualTo(String value) {
            addCriterion("stayUplate <=", value, "stayUplate");
            return (Criteria) this;
        }

        public Criteria andStayUplateLike(String value) {
            addCriterion("stayUplate like", value, "stayUplate");
            return (Criteria) this;
        }

        public Criteria andStayUplateNotLike(String value) {
            addCriterion("stayUplate not like", value, "stayUplate");
            return (Criteria) this;
        }

        public Criteria andStayUplateIn(List<String> values) {
            addCriterion("stayUplate in", values, "stayUplate");
            return (Criteria) this;
        }

        public Criteria andStayUplateNotIn(List<String> values) {
            addCriterion("stayUplate not in", values, "stayUplate");
            return (Criteria) this;
        }

        public Criteria andStayUplateBetween(String value1, String value2) {
            addCriterion("stayUplate between", value1, value2, "stayUplate");
            return (Criteria) this;
        }

        public Criteria andStayUplateNotBetween(String value1, String value2) {
            addCriterion("stayUplate not between", value1, value2, "stayUplate");
            return (Criteria) this;
        }

        public Criteria andDeclarationIsNull() {
            addCriterion("declaration is null");
            return (Criteria) this;
        }

        public Criteria andDeclarationIsNotNull() {
            addCriterion("declaration is not null");
            return (Criteria) this;
        }

        public Criteria andDeclarationEqualTo(String value) {
            addCriterion("declaration =", value, "declaration");
            return (Criteria) this;
        }

        public Criteria andDeclarationNotEqualTo(String value) {
            addCriterion("declaration <>", value, "declaration");
            return (Criteria) this;
        }

        public Criteria andDeclarationGreaterThan(String value) {
            addCriterion("declaration >", value, "declaration");
            return (Criteria) this;
        }

        public Criteria andDeclarationGreaterThanOrEqualTo(String value) {
            addCriterion("declaration >=", value, "declaration");
            return (Criteria) this;
        }

        public Criteria andDeclarationLessThan(String value) {
            addCriterion("declaration <", value, "declaration");
            return (Criteria) this;
        }

        public Criteria andDeclarationLessThanOrEqualTo(String value) {
            addCriterion("declaration <=", value, "declaration");
            return (Criteria) this;
        }

        public Criteria andDeclarationLike(String value) {
            addCriterion("declaration like", value, "declaration");
            return (Criteria) this;
        }

        public Criteria andDeclarationNotLike(String value) {
            addCriterion("declaration not like", value, "declaration");
            return (Criteria) this;
        }

        public Criteria andDeclarationIn(List<String> values) {
            addCriterion("declaration in", values, "declaration");
            return (Criteria) this;
        }

        public Criteria andDeclarationNotIn(List<String> values) {
            addCriterion("declaration not in", values, "declaration");
            return (Criteria) this;
        }

        public Criteria andDeclarationBetween(String value1, String value2) {
            addCriterion("declaration between", value1, value2, "declaration");
            return (Criteria) this;
        }

        public Criteria andDeclarationNotBetween(String value1, String value2) {
            addCriterion("declaration not between", value1, value2, "declaration");
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