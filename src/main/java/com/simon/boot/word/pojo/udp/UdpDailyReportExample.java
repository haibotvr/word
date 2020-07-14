package com.simon.boot.word.pojo.udp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UdpDailyReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UdpDailyReportExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReportTitleIsNull() {
            addCriterion("report_title is null");
            return (Criteria) this;
        }

        public Criteria andReportTitleIsNotNull() {
            addCriterion("report_title is not null");
            return (Criteria) this;
        }

        public Criteria andReportTitleEqualTo(String value) {
            addCriterion("report_title =", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleNotEqualTo(String value) {
            addCriterion("report_title <>", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleGreaterThan(String value) {
            addCriterion("report_title >", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleGreaterThanOrEqualTo(String value) {
            addCriterion("report_title >=", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleLessThan(String value) {
            addCriterion("report_title <", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleLessThanOrEqualTo(String value) {
            addCriterion("report_title <=", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleLike(String value) {
            addCriterion("report_title like", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleNotLike(String value) {
            addCriterion("report_title not like", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleIn(List<String> values) {
            addCriterion("report_title in", values, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleNotIn(List<String> values) {
            addCriterion("report_title not in", values, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleBetween(String value1, String value2) {
            addCriterion("report_title between", value1, value2, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleNotBetween(String value1, String value2) {
            addCriterion("report_title not between", value1, value2, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("report_time is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("report_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(Date value) {
            addCriterion("report_time =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(Date value) {
            addCriterion("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(Date value) {
            addCriterion("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(Date value) {
            addCriterion("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<Date> values) {
            addCriterion("report_time in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<Date> values) {
            addCriterion("report_time not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(Date value1, Date value2) {
            addCriterion("report_time between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(Date value1, Date value2) {
            addCriterion("report_time not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andFeedbackIsNull() {
            addCriterion("feedback is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIsNotNull() {
            addCriterion("feedback is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackEqualTo(String value) {
            addCriterion("feedback =", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotEqualTo(String value) {
            addCriterion("feedback <>", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackGreaterThan(String value) {
            addCriterion("feedback >", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackGreaterThanOrEqualTo(String value) {
            addCriterion("feedback >=", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLessThan(String value) {
            addCriterion("feedback <", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLessThanOrEqualTo(String value) {
            addCriterion("feedback <=", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLike(String value) {
            addCriterion("feedback like", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotLike(String value) {
            addCriterion("feedback not like", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackIn(List<String> values) {
            addCriterion("feedback in", values, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotIn(List<String> values) {
            addCriterion("feedback not in", values, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackBetween(String value1, String value2) {
            addCriterion("feedback between", value1, value2, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotBetween(String value1, String value2) {
            addCriterion("feedback not between", value1, value2, "feedback");
            return (Criteria) this;
        }

        public Criteria andTomorrowPlanIsNull() {
            addCriterion("tomorrow_plan is null");
            return (Criteria) this;
        }

        public Criteria andTomorrowPlanIsNotNull() {
            addCriterion("tomorrow_plan is not null");
            return (Criteria) this;
        }

        public Criteria andTomorrowPlanEqualTo(String value) {
            addCriterion("tomorrow_plan =", value, "tomorrowPlan");
            return (Criteria) this;
        }

        public Criteria andTomorrowPlanNotEqualTo(String value) {
            addCriterion("tomorrow_plan <>", value, "tomorrowPlan");
            return (Criteria) this;
        }

        public Criteria andTomorrowPlanGreaterThan(String value) {
            addCriterion("tomorrow_plan >", value, "tomorrowPlan");
            return (Criteria) this;
        }

        public Criteria andTomorrowPlanGreaterThanOrEqualTo(String value) {
            addCriterion("tomorrow_plan >=", value, "tomorrowPlan");
            return (Criteria) this;
        }

        public Criteria andTomorrowPlanLessThan(String value) {
            addCriterion("tomorrow_plan <", value, "tomorrowPlan");
            return (Criteria) this;
        }

        public Criteria andTomorrowPlanLessThanOrEqualTo(String value) {
            addCriterion("tomorrow_plan <=", value, "tomorrowPlan");
            return (Criteria) this;
        }

        public Criteria andTomorrowPlanLike(String value) {
            addCriterion("tomorrow_plan like", value, "tomorrowPlan");
            return (Criteria) this;
        }

        public Criteria andTomorrowPlanNotLike(String value) {
            addCriterion("tomorrow_plan not like", value, "tomorrowPlan");
            return (Criteria) this;
        }

        public Criteria andTomorrowPlanIn(List<String> values) {
            addCriterion("tomorrow_plan in", values, "tomorrowPlan");
            return (Criteria) this;
        }

        public Criteria andTomorrowPlanNotIn(List<String> values) {
            addCriterion("tomorrow_plan not in", values, "tomorrowPlan");
            return (Criteria) this;
        }

        public Criteria andTomorrowPlanBetween(String value1, String value2) {
            addCriterion("tomorrow_plan between", value1, value2, "tomorrowPlan");
            return (Criteria) this;
        }

        public Criteria andTomorrowPlanNotBetween(String value1, String value2) {
            addCriterion("tomorrow_plan not between", value1, value2, "tomorrowPlan");
            return (Criteria) this;
        }

        public Criteria andLearnGainsIsNull() {
            addCriterion("learn_gains is null");
            return (Criteria) this;
        }

        public Criteria andLearnGainsIsNotNull() {
            addCriterion("learn_gains is not null");
            return (Criteria) this;
        }

        public Criteria andLearnGainsEqualTo(String value) {
            addCriterion("learn_gains =", value, "learnGains");
            return (Criteria) this;
        }

        public Criteria andLearnGainsNotEqualTo(String value) {
            addCriterion("learn_gains <>", value, "learnGains");
            return (Criteria) this;
        }

        public Criteria andLearnGainsGreaterThan(String value) {
            addCriterion("learn_gains >", value, "learnGains");
            return (Criteria) this;
        }

        public Criteria andLearnGainsGreaterThanOrEqualTo(String value) {
            addCriterion("learn_gains >=", value, "learnGains");
            return (Criteria) this;
        }

        public Criteria andLearnGainsLessThan(String value) {
            addCriterion("learn_gains <", value, "learnGains");
            return (Criteria) this;
        }

        public Criteria andLearnGainsLessThanOrEqualTo(String value) {
            addCriterion("learn_gains <=", value, "learnGains");
            return (Criteria) this;
        }

        public Criteria andLearnGainsLike(String value) {
            addCriterion("learn_gains like", value, "learnGains");
            return (Criteria) this;
        }

        public Criteria andLearnGainsNotLike(String value) {
            addCriterion("learn_gains not like", value, "learnGains");
            return (Criteria) this;
        }

        public Criteria andLearnGainsIn(List<String> values) {
            addCriterion("learn_gains in", values, "learnGains");
            return (Criteria) this;
        }

        public Criteria andLearnGainsNotIn(List<String> values) {
            addCriterion("learn_gains not in", values, "learnGains");
            return (Criteria) this;
        }

        public Criteria andLearnGainsBetween(String value1, String value2) {
            addCriterion("learn_gains between", value1, value2, "learnGains");
            return (Criteria) this;
        }

        public Criteria andLearnGainsNotBetween(String value1, String value2) {
            addCriterion("learn_gains not between", value1, value2, "learnGains");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNull() {
            addCriterion("report_status is null");
            return (Criteria) this;
        }

        public Criteria andReportStatusIsNotNull() {
            addCriterion("report_status is not null");
            return (Criteria) this;
        }

        public Criteria andReportStatusEqualTo(Integer value) {
            addCriterion("report_status =", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotEqualTo(Integer value) {
            addCriterion("report_status <>", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThan(Integer value) {
            addCriterion("report_status >", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_status >=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThan(Integer value) {
            addCriterion("report_status <", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusLessThanOrEqualTo(Integer value) {
            addCriterion("report_status <=", value, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusIn(List<Integer> values) {
            addCriterion("report_status in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotIn(List<Integer> values) {
            addCriterion("report_status not in", values, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusBetween(Integer value1, Integer value2) {
            addCriterion("report_status between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andReportStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("report_status not between", value1, value2, "reportStatus");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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