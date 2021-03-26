package com.simon.boot.word.pojo.word;

import java.util.ArrayList;
import java.util.List;

public class CallContactsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CallContactsExample() {
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

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealSexIsNull() {
            addCriterion("real_sex is null");
            return (Criteria) this;
        }

        public Criteria andRealSexIsNotNull() {
            addCriterion("real_sex is not null");
            return (Criteria) this;
        }

        public Criteria andRealSexEqualTo(String value) {
            addCriterion("real_sex =", value, "realSex");
            return (Criteria) this;
        }

        public Criteria andRealSexNotEqualTo(String value) {
            addCriterion("real_sex <>", value, "realSex");
            return (Criteria) this;
        }

        public Criteria andRealSexGreaterThan(String value) {
            addCriterion("real_sex >", value, "realSex");
            return (Criteria) this;
        }

        public Criteria andRealSexGreaterThanOrEqualTo(String value) {
            addCriterion("real_sex >=", value, "realSex");
            return (Criteria) this;
        }

        public Criteria andRealSexLessThan(String value) {
            addCriterion("real_sex <", value, "realSex");
            return (Criteria) this;
        }

        public Criteria andRealSexLessThanOrEqualTo(String value) {
            addCriterion("real_sex <=", value, "realSex");
            return (Criteria) this;
        }

        public Criteria andRealSexLike(String value) {
            addCriterion("real_sex like", value, "realSex");
            return (Criteria) this;
        }

        public Criteria andRealSexNotLike(String value) {
            addCriterion("real_sex not like", value, "realSex");
            return (Criteria) this;
        }

        public Criteria andRealSexIn(List<String> values) {
            addCriterion("real_sex in", values, "realSex");
            return (Criteria) this;
        }

        public Criteria andRealSexNotIn(List<String> values) {
            addCriterion("real_sex not in", values, "realSex");
            return (Criteria) this;
        }

        public Criteria andRealSexBetween(String value1, String value2) {
            addCriterion("real_sex between", value1, value2, "realSex");
            return (Criteria) this;
        }

        public Criteria andRealSexNotBetween(String value1, String value2) {
            addCriterion("real_sex not between", value1, value2, "realSex");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobCategoryIsNull() {
            addCriterion("job_category is null");
            return (Criteria) this;
        }

        public Criteria andJobCategoryIsNotNull() {
            addCriterion("job_category is not null");
            return (Criteria) this;
        }

        public Criteria andJobCategoryEqualTo(String value) {
            addCriterion("job_category =", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryNotEqualTo(String value) {
            addCriterion("job_category <>", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryGreaterThan(String value) {
            addCriterion("job_category >", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("job_category >=", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryLessThan(String value) {
            addCriterion("job_category <", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryLessThanOrEqualTo(String value) {
            addCriterion("job_category <=", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryLike(String value) {
            addCriterion("job_category like", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryNotLike(String value) {
            addCriterion("job_category not like", value, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryIn(List<String> values) {
            addCriterion("job_category in", values, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryNotIn(List<String> values) {
            addCriterion("job_category not in", values, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryBetween(String value1, String value2) {
            addCriterion("job_category between", value1, value2, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andJobCategoryNotBetween(String value1, String value2) {
            addCriterion("job_category not between", value1, value2, "jobCategory");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("area_code like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("area_code not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andExtensionNumberIsNull() {
            addCriterion("extension_number is null");
            return (Criteria) this;
        }

        public Criteria andExtensionNumberIsNotNull() {
            addCriterion("extension_number is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionNumberEqualTo(String value) {
            addCriterion("extension_number =", value, "extensionNumber");
            return (Criteria) this;
        }

        public Criteria andExtensionNumberNotEqualTo(String value) {
            addCriterion("extension_number <>", value, "extensionNumber");
            return (Criteria) this;
        }

        public Criteria andExtensionNumberGreaterThan(String value) {
            addCriterion("extension_number >", value, "extensionNumber");
            return (Criteria) this;
        }

        public Criteria andExtensionNumberGreaterThanOrEqualTo(String value) {
            addCriterion("extension_number >=", value, "extensionNumber");
            return (Criteria) this;
        }

        public Criteria andExtensionNumberLessThan(String value) {
            addCriterion("extension_number <", value, "extensionNumber");
            return (Criteria) this;
        }

        public Criteria andExtensionNumberLessThanOrEqualTo(String value) {
            addCriterion("extension_number <=", value, "extensionNumber");
            return (Criteria) this;
        }

        public Criteria andExtensionNumberLike(String value) {
            addCriterion("extension_number like", value, "extensionNumber");
            return (Criteria) this;
        }

        public Criteria andExtensionNumberNotLike(String value) {
            addCriterion("extension_number not like", value, "extensionNumber");
            return (Criteria) this;
        }

        public Criteria andExtensionNumberIn(List<String> values) {
            addCriterion("extension_number in", values, "extensionNumber");
            return (Criteria) this;
        }

        public Criteria andExtensionNumberNotIn(List<String> values) {
            addCriterion("extension_number not in", values, "extensionNumber");
            return (Criteria) this;
        }

        public Criteria andExtensionNumberBetween(String value1, String value2) {
            addCriterion("extension_number between", value1, value2, "extensionNumber");
            return (Criteria) this;
        }

        public Criteria andExtensionNumberNotBetween(String value1, String value2) {
            addCriterion("extension_number not between", value1, value2, "extensionNumber");
            return (Criteria) this;
        }

        public Criteria andAreaCode2IsNull() {
            addCriterion("area_code2 is null");
            return (Criteria) this;
        }

        public Criteria andAreaCode2IsNotNull() {
            addCriterion("area_code2 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCode2EqualTo(String value) {
            addCriterion("area_code2 =", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2NotEqualTo(String value) {
            addCriterion("area_code2 <>", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2GreaterThan(String value) {
            addCriterion("area_code2 >", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2GreaterThanOrEqualTo(String value) {
            addCriterion("area_code2 >=", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2LessThan(String value) {
            addCriterion("area_code2 <", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2LessThanOrEqualTo(String value) {
            addCriterion("area_code2 <=", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2Like(String value) {
            addCriterion("area_code2 like", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2NotLike(String value) {
            addCriterion("area_code2 not like", value, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2In(List<String> values) {
            addCriterion("area_code2 in", values, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2NotIn(List<String> values) {
            addCriterion("area_code2 not in", values, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2Between(String value1, String value2) {
            addCriterion("area_code2 between", value1, value2, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andAreaCode2NotBetween(String value1, String value2) {
            addCriterion("area_code2 not between", value1, value2, "areaCode2");
            return (Criteria) this;
        }

        public Criteria andTelephone2IsNull() {
            addCriterion("telephone2 is null");
            return (Criteria) this;
        }

        public Criteria andTelephone2IsNotNull() {
            addCriterion("telephone2 is not null");
            return (Criteria) this;
        }

        public Criteria andTelephone2EqualTo(String value) {
            addCriterion("telephone2 =", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotEqualTo(String value) {
            addCriterion("telephone2 <>", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2GreaterThan(String value) {
            addCriterion("telephone2 >", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2GreaterThanOrEqualTo(String value) {
            addCriterion("telephone2 >=", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2LessThan(String value) {
            addCriterion("telephone2 <", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2LessThanOrEqualTo(String value) {
            addCriterion("telephone2 <=", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2Like(String value) {
            addCriterion("telephone2 like", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotLike(String value) {
            addCriterion("telephone2 not like", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2In(List<String> values) {
            addCriterion("telephone2 in", values, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotIn(List<String> values) {
            addCriterion("telephone2 not in", values, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2Between(String value1, String value2) {
            addCriterion("telephone2 between", value1, value2, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotBetween(String value1, String value2) {
            addCriterion("telephone2 not between", value1, value2, "telephone2");
            return (Criteria) this;
        }

        public Criteria andExtensionNumber2IsNull() {
            addCriterion("extension_number2 is null");
            return (Criteria) this;
        }

        public Criteria andExtensionNumber2IsNotNull() {
            addCriterion("extension_number2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionNumber2EqualTo(String value) {
            addCriterion("extension_number2 =", value, "extensionNumber2");
            return (Criteria) this;
        }

        public Criteria andExtensionNumber2NotEqualTo(String value) {
            addCriterion("extension_number2 <>", value, "extensionNumber2");
            return (Criteria) this;
        }

        public Criteria andExtensionNumber2GreaterThan(String value) {
            addCriterion("extension_number2 >", value, "extensionNumber2");
            return (Criteria) this;
        }

        public Criteria andExtensionNumber2GreaterThanOrEqualTo(String value) {
            addCriterion("extension_number2 >=", value, "extensionNumber2");
            return (Criteria) this;
        }

        public Criteria andExtensionNumber2LessThan(String value) {
            addCriterion("extension_number2 <", value, "extensionNumber2");
            return (Criteria) this;
        }

        public Criteria andExtensionNumber2LessThanOrEqualTo(String value) {
            addCriterion("extension_number2 <=", value, "extensionNumber2");
            return (Criteria) this;
        }

        public Criteria andExtensionNumber2Like(String value) {
            addCriterion("extension_number2 like", value, "extensionNumber2");
            return (Criteria) this;
        }

        public Criteria andExtensionNumber2NotLike(String value) {
            addCriterion("extension_number2 not like", value, "extensionNumber2");
            return (Criteria) this;
        }

        public Criteria andExtensionNumber2In(List<String> values) {
            addCriterion("extension_number2 in", values, "extensionNumber2");
            return (Criteria) this;
        }

        public Criteria andExtensionNumber2NotIn(List<String> values) {
            addCriterion("extension_number2 not in", values, "extensionNumber2");
            return (Criteria) this;
        }

        public Criteria andExtensionNumber2Between(String value1, String value2) {
            addCriterion("extension_number2 between", value1, value2, "extensionNumber2");
            return (Criteria) this;
        }

        public Criteria andExtensionNumber2NotBetween(String value1, String value2) {
            addCriterion("extension_number2 not between", value1, value2, "extensionNumber2");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNull() {
            addCriterion("phone2 is null");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNotNull() {
            addCriterion("phone2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone2EqualTo(String value) {
            addCriterion("phone2 =", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotEqualTo(String value) {
            addCriterion("phone2 <>", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThan(String value) {
            addCriterion("phone2 >", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("phone2 >=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThan(String value) {
            addCriterion("phone2 <", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThanOrEqualTo(String value) {
            addCriterion("phone2 <=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Like(String value) {
            addCriterion("phone2 like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotLike(String value) {
            addCriterion("phone2 not like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2In(List<String> values) {
            addCriterion("phone2 in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotIn(List<String> values) {
            addCriterion("phone2 not in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Between(String value1, String value2) {
            addCriterion("phone2 between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotBetween(String value1, String value2) {
            addCriterion("phone2 not between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("post_code is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("post_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("post_code =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("post_code <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("post_code >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("post_code >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("post_code <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("post_code <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("post_code like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("post_code not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("post_code in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("post_code not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("post_code between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("post_code not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNewIsNull() {
            addCriterion("industry_new is null");
            return (Criteria) this;
        }

        public Criteria andIndustryNewIsNotNull() {
            addCriterion("industry_new is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryNewEqualTo(String value) {
            addCriterion("industry_new =", value, "industryNew");
            return (Criteria) this;
        }

        public Criteria andIndustryNewNotEqualTo(String value) {
            addCriterion("industry_new <>", value, "industryNew");
            return (Criteria) this;
        }

        public Criteria andIndustryNewGreaterThan(String value) {
            addCriterion("industry_new >", value, "industryNew");
            return (Criteria) this;
        }

        public Criteria andIndustryNewGreaterThanOrEqualTo(String value) {
            addCriterion("industry_new >=", value, "industryNew");
            return (Criteria) this;
        }

        public Criteria andIndustryNewLessThan(String value) {
            addCriterion("industry_new <", value, "industryNew");
            return (Criteria) this;
        }

        public Criteria andIndustryNewLessThanOrEqualTo(String value) {
            addCriterion("industry_new <=", value, "industryNew");
            return (Criteria) this;
        }

        public Criteria andIndustryNewLike(String value) {
            addCriterion("industry_new like", value, "industryNew");
            return (Criteria) this;
        }

        public Criteria andIndustryNewNotLike(String value) {
            addCriterion("industry_new not like", value, "industryNew");
            return (Criteria) this;
        }

        public Criteria andIndustryNewIn(List<String> values) {
            addCriterion("industry_new in", values, "industryNew");
            return (Criteria) this;
        }

        public Criteria andIndustryNewNotIn(List<String> values) {
            addCriterion("industry_new not in", values, "industryNew");
            return (Criteria) this;
        }

        public Criteria andIndustryNewBetween(String value1, String value2) {
            addCriterion("industry_new between", value1, value2, "industryNew");
            return (Criteria) this;
        }

        public Criteria andIndustryNewNotBetween(String value1, String value2) {
            addCriterion("industry_new not between", value1, value2, "industryNew");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailIsNull() {
            addCriterion("industry_detail is null");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailIsNotNull() {
            addCriterion("industry_detail is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailEqualTo(String value) {
            addCriterion("industry_detail =", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailNotEqualTo(String value) {
            addCriterion("industry_detail <>", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailGreaterThan(String value) {
            addCriterion("industry_detail >", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailGreaterThanOrEqualTo(String value) {
            addCriterion("industry_detail >=", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailLessThan(String value) {
            addCriterion("industry_detail <", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailLessThanOrEqualTo(String value) {
            addCriterion("industry_detail <=", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailLike(String value) {
            addCriterion("industry_detail like", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailNotLike(String value) {
            addCriterion("industry_detail not like", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailIn(List<String> values) {
            addCriterion("industry_detail in", values, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailNotIn(List<String> values) {
            addCriterion("industry_detail not in", values, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailBetween(String value1, String value2) {
            addCriterion("industry_detail between", value1, value2, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailNotBetween(String value1, String value2) {
            addCriterion("industry_detail not between", value1, value2, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIsNull() {
            addCriterion("company_nature is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIsNotNull() {
            addCriterion("company_nature is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureEqualTo(String value) {
            addCriterion("company_nature =", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotEqualTo(String value) {
            addCriterion("company_nature <>", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureGreaterThan(String value) {
            addCriterion("company_nature >", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureGreaterThanOrEqualTo(String value) {
            addCriterion("company_nature >=", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureLessThan(String value) {
            addCriterion("company_nature <", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureLessThanOrEqualTo(String value) {
            addCriterion("company_nature <=", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureLike(String value) {
            addCriterion("company_nature like", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotLike(String value) {
            addCriterion("company_nature not like", value, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureIn(List<String> values) {
            addCriterion("company_nature in", values, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotIn(List<String> values) {
            addCriterion("company_nature not in", values, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureBetween(String value1, String value2) {
            addCriterion("company_nature between", value1, value2, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyNatureNotBetween(String value1, String value2) {
            addCriterion("company_nature not between", value1, value2, "companyNature");
            return (Criteria) this;
        }

        public Criteria andCompanyPersonNumberIsNull() {
            addCriterion("company_person_number is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPersonNumberIsNotNull() {
            addCriterion("company_person_number is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPersonNumberEqualTo(Integer value) {
            addCriterion("company_person_number =", value, "companyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyPersonNumberNotEqualTo(Integer value) {
            addCriterion("company_person_number <>", value, "companyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyPersonNumberGreaterThan(Integer value) {
            addCriterion("company_person_number >", value, "companyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyPersonNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_person_number >=", value, "companyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyPersonNumberLessThan(Integer value) {
            addCriterion("company_person_number <", value, "companyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyPersonNumberLessThanOrEqualTo(Integer value) {
            addCriterion("company_person_number <=", value, "companyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyPersonNumberIn(List<Integer> values) {
            addCriterion("company_person_number in", values, "companyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyPersonNumberNotIn(List<Integer> values) {
            addCriterion("company_person_number not in", values, "companyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyPersonNumberBetween(Integer value1, Integer value2) {
            addCriterion("company_person_number between", value1, value2, "companyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyPersonNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("company_person_number not between", value1, value2, "companyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andPcNumberIsNull() {
            addCriterion("pc_number is null");
            return (Criteria) this;
        }

        public Criteria andPcNumberIsNotNull() {
            addCriterion("pc_number is not null");
            return (Criteria) this;
        }

        public Criteria andPcNumberEqualTo(Integer value) {
            addCriterion("pc_number =", value, "pcNumber");
            return (Criteria) this;
        }

        public Criteria andPcNumberNotEqualTo(Integer value) {
            addCriterion("pc_number <>", value, "pcNumber");
            return (Criteria) this;
        }

        public Criteria andPcNumberGreaterThan(Integer value) {
            addCriterion("pc_number >", value, "pcNumber");
            return (Criteria) this;
        }

        public Criteria andPcNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("pc_number >=", value, "pcNumber");
            return (Criteria) this;
        }

        public Criteria andPcNumberLessThan(Integer value) {
            addCriterion("pc_number <", value, "pcNumber");
            return (Criteria) this;
        }

        public Criteria andPcNumberLessThanOrEqualTo(Integer value) {
            addCriterion("pc_number <=", value, "pcNumber");
            return (Criteria) this;
        }

        public Criteria andPcNumberIn(List<Integer> values) {
            addCriterion("pc_number in", values, "pcNumber");
            return (Criteria) this;
        }

        public Criteria andPcNumberNotIn(List<Integer> values) {
            addCriterion("pc_number not in", values, "pcNumber");
            return (Criteria) this;
        }

        public Criteria andPcNumberBetween(Integer value1, Integer value2) {
            addCriterion("pc_number between", value1, value2, "pcNumber");
            return (Criteria) this;
        }

        public Criteria andPcNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("pc_number not between", value1, value2, "pcNumber");
            return (Criteria) this;
        }

        public Criteria andAnnualTurnoverIsNull() {
            addCriterion("annual_turnover is null");
            return (Criteria) this;
        }

        public Criteria andAnnualTurnoverIsNotNull() {
            addCriterion("annual_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualTurnoverEqualTo(String value) {
            addCriterion("annual_turnover =", value, "annualTurnover");
            return (Criteria) this;
        }

        public Criteria andAnnualTurnoverNotEqualTo(String value) {
            addCriterion("annual_turnover <>", value, "annualTurnover");
            return (Criteria) this;
        }

        public Criteria andAnnualTurnoverGreaterThan(String value) {
            addCriterion("annual_turnover >", value, "annualTurnover");
            return (Criteria) this;
        }

        public Criteria andAnnualTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("annual_turnover >=", value, "annualTurnover");
            return (Criteria) this;
        }

        public Criteria andAnnualTurnoverLessThan(String value) {
            addCriterion("annual_turnover <", value, "annualTurnover");
            return (Criteria) this;
        }

        public Criteria andAnnualTurnoverLessThanOrEqualTo(String value) {
            addCriterion("annual_turnover <=", value, "annualTurnover");
            return (Criteria) this;
        }

        public Criteria andAnnualTurnoverLike(String value) {
            addCriterion("annual_turnover like", value, "annualTurnover");
            return (Criteria) this;
        }

        public Criteria andAnnualTurnoverNotLike(String value) {
            addCriterion("annual_turnover not like", value, "annualTurnover");
            return (Criteria) this;
        }

        public Criteria andAnnualTurnoverIn(List<String> values) {
            addCriterion("annual_turnover in", values, "annualTurnover");
            return (Criteria) this;
        }

        public Criteria andAnnualTurnoverNotIn(List<String> values) {
            addCriterion("annual_turnover not in", values, "annualTurnover");
            return (Criteria) this;
        }

        public Criteria andAnnualTurnoverBetween(String value1, String value2) {
            addCriterion("annual_turnover between", value1, value2, "annualTurnover");
            return (Criteria) this;
        }

        public Criteria andAnnualTurnoverNotBetween(String value1, String value2) {
            addCriterion("annual_turnover not between", value1, value2, "annualTurnover");
            return (Criteria) this;
        }

        public Criteria andFax1IsNull() {
            addCriterion("fax1 is null");
            return (Criteria) this;
        }

        public Criteria andFax1IsNotNull() {
            addCriterion("fax1 is not null");
            return (Criteria) this;
        }

        public Criteria andFax1EqualTo(String value) {
            addCriterion("fax1 =", value, "fax1");
            return (Criteria) this;
        }

        public Criteria andFax1NotEqualTo(String value) {
            addCriterion("fax1 <>", value, "fax1");
            return (Criteria) this;
        }

        public Criteria andFax1GreaterThan(String value) {
            addCriterion("fax1 >", value, "fax1");
            return (Criteria) this;
        }

        public Criteria andFax1GreaterThanOrEqualTo(String value) {
            addCriterion("fax1 >=", value, "fax1");
            return (Criteria) this;
        }

        public Criteria andFax1LessThan(String value) {
            addCriterion("fax1 <", value, "fax1");
            return (Criteria) this;
        }

        public Criteria andFax1LessThanOrEqualTo(String value) {
            addCriterion("fax1 <=", value, "fax1");
            return (Criteria) this;
        }

        public Criteria andFax1Like(String value) {
            addCriterion("fax1 like", value, "fax1");
            return (Criteria) this;
        }

        public Criteria andFax1NotLike(String value) {
            addCriterion("fax1 not like", value, "fax1");
            return (Criteria) this;
        }

        public Criteria andFax1In(List<String> values) {
            addCriterion("fax1 in", values, "fax1");
            return (Criteria) this;
        }

        public Criteria andFax1NotIn(List<String> values) {
            addCriterion("fax1 not in", values, "fax1");
            return (Criteria) this;
        }

        public Criteria andFax1Between(String value1, String value2) {
            addCriterion("fax1 between", value1, value2, "fax1");
            return (Criteria) this;
        }

        public Criteria andFax1NotBetween(String value1, String value2) {
            addCriterion("fax1 not between", value1, value2, "fax1");
            return (Criteria) this;
        }

        public Criteria andFax2IsNull() {
            addCriterion("fax2 is null");
            return (Criteria) this;
        }

        public Criteria andFax2IsNotNull() {
            addCriterion("fax2 is not null");
            return (Criteria) this;
        }

        public Criteria andFax2EqualTo(String value) {
            addCriterion("fax2 =", value, "fax2");
            return (Criteria) this;
        }

        public Criteria andFax2NotEqualTo(String value) {
            addCriterion("fax2 <>", value, "fax2");
            return (Criteria) this;
        }

        public Criteria andFax2GreaterThan(String value) {
            addCriterion("fax2 >", value, "fax2");
            return (Criteria) this;
        }

        public Criteria andFax2GreaterThanOrEqualTo(String value) {
            addCriterion("fax2 >=", value, "fax2");
            return (Criteria) this;
        }

        public Criteria andFax2LessThan(String value) {
            addCriterion("fax2 <", value, "fax2");
            return (Criteria) this;
        }

        public Criteria andFax2LessThanOrEqualTo(String value) {
            addCriterion("fax2 <=", value, "fax2");
            return (Criteria) this;
        }

        public Criteria andFax2Like(String value) {
            addCriterion("fax2 like", value, "fax2");
            return (Criteria) this;
        }

        public Criteria andFax2NotLike(String value) {
            addCriterion("fax2 not like", value, "fax2");
            return (Criteria) this;
        }

        public Criteria andFax2In(List<String> values) {
            addCriterion("fax2 in", values, "fax2");
            return (Criteria) this;
        }

        public Criteria andFax2NotIn(List<String> values) {
            addCriterion("fax2 not in", values, "fax2");
            return (Criteria) this;
        }

        public Criteria andFax2Between(String value1, String value2) {
            addCriterion("fax2 between", value1, value2, "fax2");
            return (Criteria) this;
        }

        public Criteria andFax2NotBetween(String value1, String value2) {
            addCriterion("fax2 not between", value1, value2, "fax2");
            return (Criteria) this;
        }

        public Criteria andDataTimeIsNull() {
            addCriterion("data_time is null");
            return (Criteria) this;
        }

        public Criteria andDataTimeIsNotNull() {
            addCriterion("data_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataTimeEqualTo(String value) {
            addCriterion("data_time =", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotEqualTo(String value) {
            addCriterion("data_time <>", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThan(String value) {
            addCriterion("data_time >", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThanOrEqualTo(String value) {
            addCriterion("data_time >=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThan(String value) {
            addCriterion("data_time <", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThanOrEqualTo(String value) {
            addCriterion("data_time <=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLike(String value) {
            addCriterion("data_time like", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotLike(String value) {
            addCriterion("data_time not like", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeIn(List<String> values) {
            addCriterion("data_time in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotIn(List<String> values) {
            addCriterion("data_time not in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeBetween(String value1, String value2) {
            addCriterion("data_time between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotBetween(String value1, String value2) {
            addCriterion("data_time not between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andFromPersonIsNull() {
            addCriterion("from_person is null");
            return (Criteria) this;
        }

        public Criteria andFromPersonIsNotNull() {
            addCriterion("from_person is not null");
            return (Criteria) this;
        }

        public Criteria andFromPersonEqualTo(String value) {
            addCriterion("from_person =", value, "fromPerson");
            return (Criteria) this;
        }

        public Criteria andFromPersonNotEqualTo(String value) {
            addCriterion("from_person <>", value, "fromPerson");
            return (Criteria) this;
        }

        public Criteria andFromPersonGreaterThan(String value) {
            addCriterion("from_person >", value, "fromPerson");
            return (Criteria) this;
        }

        public Criteria andFromPersonGreaterThanOrEqualTo(String value) {
            addCriterion("from_person >=", value, "fromPerson");
            return (Criteria) this;
        }

        public Criteria andFromPersonLessThan(String value) {
            addCriterion("from_person <", value, "fromPerson");
            return (Criteria) this;
        }

        public Criteria andFromPersonLessThanOrEqualTo(String value) {
            addCriterion("from_person <=", value, "fromPerson");
            return (Criteria) this;
        }

        public Criteria andFromPersonLike(String value) {
            addCriterion("from_person like", value, "fromPerson");
            return (Criteria) this;
        }

        public Criteria andFromPersonNotLike(String value) {
            addCriterion("from_person not like", value, "fromPerson");
            return (Criteria) this;
        }

        public Criteria andFromPersonIn(List<String> values) {
            addCriterion("from_person in", values, "fromPerson");
            return (Criteria) this;
        }

        public Criteria andFromPersonNotIn(List<String> values) {
            addCriterion("from_person not in", values, "fromPerson");
            return (Criteria) this;
        }

        public Criteria andFromPersonBetween(String value1, String value2) {
            addCriterion("from_person between", value1, value2, "fromPerson");
            return (Criteria) this;
        }

        public Criteria andFromPersonNotBetween(String value1, String value2) {
            addCriterion("from_person not between", value1, value2, "fromPerson");
            return (Criteria) this;
        }

        public Criteria andDataFromIsNull() {
            addCriterion("data_from is null");
            return (Criteria) this;
        }

        public Criteria andDataFromIsNotNull() {
            addCriterion("data_from is not null");
            return (Criteria) this;
        }

        public Criteria andDataFromEqualTo(String value) {
            addCriterion("data_from =", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotEqualTo(String value) {
            addCriterion("data_from <>", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromGreaterThan(String value) {
            addCriterion("data_from >", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromGreaterThanOrEqualTo(String value) {
            addCriterion("data_from >=", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLessThan(String value) {
            addCriterion("data_from <", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLessThanOrEqualTo(String value) {
            addCriterion("data_from <=", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLike(String value) {
            addCriterion("data_from like", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotLike(String value) {
            addCriterion("data_from not like", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromIn(List<String> values) {
            addCriterion("data_from in", values, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotIn(List<String> values) {
            addCriterion("data_from not in", values, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromBetween(String value1, String value2) {
            addCriterion("data_from between", value1, value2, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotBetween(String value1, String value2) {
            addCriterion("data_from not between", value1, value2, "dataFrom");
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

        public Criteria andDataStatusEqualTo(String value) {
            addCriterion("data_status =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(String value) {
            addCriterion("data_status <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(String value) {
            addCriterion("data_status >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(String value) {
            addCriterion("data_status >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(String value) {
            addCriterion("data_status <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(String value) {
            addCriterion("data_status <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLike(String value) {
            addCriterion("data_status like", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotLike(String value) {
            addCriterion("data_status not like", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<String> values) {
            addCriterion("data_status in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<String> values) {
            addCriterion("data_status not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(String value1, String value2) {
            addCriterion("data_status between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(String value1, String value2) {
            addCriterion("data_status not between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andEmail1IsNull() {
            addCriterion("email1 is null");
            return (Criteria) this;
        }

        public Criteria andEmail1IsNotNull() {
            addCriterion("email1 is not null");
            return (Criteria) this;
        }

        public Criteria andEmail1EqualTo(String value) {
            addCriterion("email1 =", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotEqualTo(String value) {
            addCriterion("email1 <>", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1GreaterThan(String value) {
            addCriterion("email1 >", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1GreaterThanOrEqualTo(String value) {
            addCriterion("email1 >=", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1LessThan(String value) {
            addCriterion("email1 <", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1LessThanOrEqualTo(String value) {
            addCriterion("email1 <=", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1Like(String value) {
            addCriterion("email1 like", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotLike(String value) {
            addCriterion("email1 not like", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1In(List<String> values) {
            addCriterion("email1 in", values, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotIn(List<String> values) {
            addCriterion("email1 not in", values, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1Between(String value1, String value2) {
            addCriterion("email1 between", value1, value2, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotBetween(String value1, String value2) {
            addCriterion("email1 not between", value1, value2, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail2IsNull() {
            addCriterion("email2 is null");
            return (Criteria) this;
        }

        public Criteria andEmail2IsNotNull() {
            addCriterion("email2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmail2EqualTo(String value) {
            addCriterion("email2 =", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotEqualTo(String value) {
            addCriterion("email2 <>", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2GreaterThan(String value) {
            addCriterion("email2 >", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2GreaterThanOrEqualTo(String value) {
            addCriterion("email2 >=", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2LessThan(String value) {
            addCriterion("email2 <", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2LessThanOrEqualTo(String value) {
            addCriterion("email2 <=", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2Like(String value) {
            addCriterion("email2 like", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotLike(String value) {
            addCriterion("email2 not like", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2In(List<String> values) {
            addCriterion("email2 in", values, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotIn(List<String> values) {
            addCriterion("email2 not in", values, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2Between(String value1, String value2) {
            addCriterion("email2 between", value1, value2, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotBetween(String value1, String value2) {
            addCriterion("email2 not between", value1, value2, "email2");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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