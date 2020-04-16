package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andFromldIsNull() {
            addCriterion("fromld is null");
            return (Criteria) this;
        }

        public Criteria andFromldIsNotNull() {
            addCriterion("fromld is not null");
            return (Criteria) this;
        }

        public Criteria andFromldEqualTo(Integer value) {
            addCriterion("fromld =", value, "fromld");
            return (Criteria) this;
        }

        public Criteria andFromldNotEqualTo(Integer value) {
            addCriterion("fromld <>", value, "fromld");
            return (Criteria) this;
        }

        public Criteria andFromldGreaterThan(Integer value) {
            addCriterion("fromld >", value, "fromld");
            return (Criteria) this;
        }

        public Criteria andFromldGreaterThanOrEqualTo(Integer value) {
            addCriterion("fromld >=", value, "fromld");
            return (Criteria) this;
        }

        public Criteria andFromldLessThan(Integer value) {
            addCriterion("fromld <", value, "fromld");
            return (Criteria) this;
        }

        public Criteria andFromldLessThanOrEqualTo(Integer value) {
            addCriterion("fromld <=", value, "fromld");
            return (Criteria) this;
        }

        public Criteria andFromldIn(List<Integer> values) {
            addCriterion("fromld in", values, "fromld");
            return (Criteria) this;
        }

        public Criteria andFromldNotIn(List<Integer> values) {
            addCriterion("fromld not in", values, "fromld");
            return (Criteria) this;
        }

        public Criteria andFromldBetween(Integer value1, Integer value2) {
            addCriterion("fromld between", value1, value2, "fromld");
            return (Criteria) this;
        }

        public Criteria andFromldNotBetween(Integer value1, Integer value2) {
            addCriterion("fromld not between", value1, value2, "fromld");
            return (Criteria) this;
        }

        public Criteria andToldIsNull() {
            addCriterion("told is null");
            return (Criteria) this;
        }

        public Criteria andToldIsNotNull() {
            addCriterion("told is not null");
            return (Criteria) this;
        }

        public Criteria andToldEqualTo(Integer value) {
            addCriterion("told =", value, "told");
            return (Criteria) this;
        }

        public Criteria andToldNotEqualTo(Integer value) {
            addCriterion("told <>", value, "told");
            return (Criteria) this;
        }

        public Criteria andToldGreaterThan(Integer value) {
            addCriterion("told >", value, "told");
            return (Criteria) this;
        }

        public Criteria andToldGreaterThanOrEqualTo(Integer value) {
            addCriterion("told >=", value, "told");
            return (Criteria) this;
        }

        public Criteria andToldLessThan(Integer value) {
            addCriterion("told <", value, "told");
            return (Criteria) this;
        }

        public Criteria andToldLessThanOrEqualTo(Integer value) {
            addCriterion("told <=", value, "told");
            return (Criteria) this;
        }

        public Criteria andToldIn(List<Integer> values) {
            addCriterion("told in", values, "told");
            return (Criteria) this;
        }

        public Criteria andToldNotIn(List<Integer> values) {
            addCriterion("told not in", values, "told");
            return (Criteria) this;
        }

        public Criteria andToldBetween(Integer value1, Integer value2) {
            addCriterion("told between", value1, value2, "told");
            return (Criteria) this;
        }

        public Criteria andToldNotBetween(Integer value1, Integer value2) {
            addCriterion("told not between", value1, value2, "told");
            return (Criteria) this;
        }

        public Criteria andInformationIsNull() {
            addCriterion("information is null");
            return (Criteria) this;
        }

        public Criteria andInformationIsNotNull() {
            addCriterion("information is not null");
            return (Criteria) this;
        }

        public Criteria andInformationEqualTo(String value) {
            addCriterion("information =", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotEqualTo(String value) {
            addCriterion("information <>", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationGreaterThan(String value) {
            addCriterion("information >", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationGreaterThanOrEqualTo(String value) {
            addCriterion("information >=", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLessThan(String value) {
            addCriterion("information <", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLessThanOrEqualTo(String value) {
            addCriterion("information <=", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLike(String value) {
            addCriterion("information like", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotLike(String value) {
            addCriterion("information not like", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationIn(List<String> values) {
            addCriterion("information in", values, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotIn(List<String> values) {
            addCriterion("information not in", values, "information");
            return (Criteria) this;
        }

        public Criteria andInformationBetween(String value1, String value2) {
            addCriterion("information between", value1, value2, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotBetween(String value1, String value2) {
            addCriterion("information not between", value1, value2, "information");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andReceivedIsNull() {
            addCriterion("received is null");
            return (Criteria) this;
        }

        public Criteria andReceivedIsNotNull() {
            addCriterion("received is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedEqualTo(String value) {
            addCriterion("received =", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotEqualTo(String value) {
            addCriterion("received <>", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedGreaterThan(String value) {
            addCriterion("received >", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedGreaterThanOrEqualTo(String value) {
            addCriterion("received >=", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedLessThan(String value) {
            addCriterion("received <", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedLessThanOrEqualTo(String value) {
            addCriterion("received <=", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedLike(String value) {
            addCriterion("received like", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotLike(String value) {
            addCriterion("received not like", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedIn(List<String> values) {
            addCriterion("received in", values, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotIn(List<String> values) {
            addCriterion("received not in", values, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedBetween(String value1, String value2) {
            addCriterion("received between", value1, value2, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotBetween(String value1, String value2) {
            addCriterion("received not between", value1, value2, "received");
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