package com.simon.boot.word.pojo;

import java.util.ArrayList;
import java.util.List;

public class WordLibraryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WordLibraryExample() {
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

        public Criteria andNameEnglishIsNull() {
            addCriterion("name_english is null");
            return (Criteria) this;
        }

        public Criteria andNameEnglishIsNotNull() {
            addCriterion("name_english is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnglishEqualTo(String value) {
            addCriterion("name_english =", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishNotEqualTo(String value) {
            addCriterion("name_english <>", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishGreaterThan(String value) {
            addCriterion("name_english >", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishGreaterThanOrEqualTo(String value) {
            addCriterion("name_english >=", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishLessThan(String value) {
            addCriterion("name_english <", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishLessThanOrEqualTo(String value) {
            addCriterion("name_english <=", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishLike(String value) {
            addCriterion("name_english like", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishNotLike(String value) {
            addCriterion("name_english not like", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishIn(List<String> values) {
            addCriterion("name_english in", values, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishNotIn(List<String> values) {
            addCriterion("name_english not in", values, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishBetween(String value1, String value2) {
            addCriterion("name_english between", value1, value2, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishNotBetween(String value1, String value2) {
            addCriterion("name_english not between", value1, value2, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andVoiceUkIsNull() {
            addCriterion("voice_uk is null");
            return (Criteria) this;
        }

        public Criteria andVoiceUkIsNotNull() {
            addCriterion("voice_uk is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceUkEqualTo(String value) {
            addCriterion("voice_uk =", value, "voiceUk");
            return (Criteria) this;
        }

        public Criteria andVoiceUkNotEqualTo(String value) {
            addCriterion("voice_uk <>", value, "voiceUk");
            return (Criteria) this;
        }

        public Criteria andVoiceUkGreaterThan(String value) {
            addCriterion("voice_uk >", value, "voiceUk");
            return (Criteria) this;
        }

        public Criteria andVoiceUkGreaterThanOrEqualTo(String value) {
            addCriterion("voice_uk >=", value, "voiceUk");
            return (Criteria) this;
        }

        public Criteria andVoiceUkLessThan(String value) {
            addCriterion("voice_uk <", value, "voiceUk");
            return (Criteria) this;
        }

        public Criteria andVoiceUkLessThanOrEqualTo(String value) {
            addCriterion("voice_uk <=", value, "voiceUk");
            return (Criteria) this;
        }

        public Criteria andVoiceUkLike(String value) {
            addCriterion("voice_uk like", value, "voiceUk");
            return (Criteria) this;
        }

        public Criteria andVoiceUkNotLike(String value) {
            addCriterion("voice_uk not like", value, "voiceUk");
            return (Criteria) this;
        }

        public Criteria andVoiceUkIn(List<String> values) {
            addCriterion("voice_uk in", values, "voiceUk");
            return (Criteria) this;
        }

        public Criteria andVoiceUkNotIn(List<String> values) {
            addCriterion("voice_uk not in", values, "voiceUk");
            return (Criteria) this;
        }

        public Criteria andVoiceUkBetween(String value1, String value2) {
            addCriterion("voice_uk between", value1, value2, "voiceUk");
            return (Criteria) this;
        }

        public Criteria andVoiceUkNotBetween(String value1, String value2) {
            addCriterion("voice_uk not between", value1, value2, "voiceUk");
            return (Criteria) this;
        }

        public Criteria andVoiceUsIsNull() {
            addCriterion("voice_us is null");
            return (Criteria) this;
        }

        public Criteria andVoiceUsIsNotNull() {
            addCriterion("voice_us is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceUsEqualTo(String value) {
            addCriterion("voice_us =", value, "voiceUs");
            return (Criteria) this;
        }

        public Criteria andVoiceUsNotEqualTo(String value) {
            addCriterion("voice_us <>", value, "voiceUs");
            return (Criteria) this;
        }

        public Criteria andVoiceUsGreaterThan(String value) {
            addCriterion("voice_us >", value, "voiceUs");
            return (Criteria) this;
        }

        public Criteria andVoiceUsGreaterThanOrEqualTo(String value) {
            addCriterion("voice_us >=", value, "voiceUs");
            return (Criteria) this;
        }

        public Criteria andVoiceUsLessThan(String value) {
            addCriterion("voice_us <", value, "voiceUs");
            return (Criteria) this;
        }

        public Criteria andVoiceUsLessThanOrEqualTo(String value) {
            addCriterion("voice_us <=", value, "voiceUs");
            return (Criteria) this;
        }

        public Criteria andVoiceUsLike(String value) {
            addCriterion("voice_us like", value, "voiceUs");
            return (Criteria) this;
        }

        public Criteria andVoiceUsNotLike(String value) {
            addCriterion("voice_us not like", value, "voiceUs");
            return (Criteria) this;
        }

        public Criteria andVoiceUsIn(List<String> values) {
            addCriterion("voice_us in", values, "voiceUs");
            return (Criteria) this;
        }

        public Criteria andVoiceUsNotIn(List<String> values) {
            addCriterion("voice_us not in", values, "voiceUs");
            return (Criteria) this;
        }

        public Criteria andVoiceUsBetween(String value1, String value2) {
            addCriterion("voice_us between", value1, value2, "voiceUs");
            return (Criteria) this;
        }

        public Criteria andVoiceUsNotBetween(String value1, String value2) {
            addCriterion("voice_us not between", value1, value2, "voiceUs");
            return (Criteria) this;
        }

        public Criteria andPresentIsNull() {
            addCriterion("present is null");
            return (Criteria) this;
        }

        public Criteria andPresentIsNotNull() {
            addCriterion("present is not null");
            return (Criteria) this;
        }

        public Criteria andPresentEqualTo(String value) {
            addCriterion("present =", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentNotEqualTo(String value) {
            addCriterion("present <>", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentGreaterThan(String value) {
            addCriterion("present >", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentGreaterThanOrEqualTo(String value) {
            addCriterion("present >=", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentLessThan(String value) {
            addCriterion("present <", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentLessThanOrEqualTo(String value) {
            addCriterion("present <=", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentLike(String value) {
            addCriterion("present like", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentNotLike(String value) {
            addCriterion("present not like", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentIn(List<String> values) {
            addCriterion("present in", values, "present");
            return (Criteria) this;
        }

        public Criteria andPresentNotIn(List<String> values) {
            addCriterion("present not in", values, "present");
            return (Criteria) this;
        }

        public Criteria andPresentBetween(String value1, String value2) {
            addCriterion("present between", value1, value2, "present");
            return (Criteria) this;
        }

        public Criteria andPresentNotBetween(String value1, String value2) {
            addCriterion("present not between", value1, value2, "present");
            return (Criteria) this;
        }

        public Criteria andPastIsNull() {
            addCriterion("past is null");
            return (Criteria) this;
        }

        public Criteria andPastIsNotNull() {
            addCriterion("past is not null");
            return (Criteria) this;
        }

        public Criteria andPastEqualTo(String value) {
            addCriterion("past =", value, "past");
            return (Criteria) this;
        }

        public Criteria andPastNotEqualTo(String value) {
            addCriterion("past <>", value, "past");
            return (Criteria) this;
        }

        public Criteria andPastGreaterThan(String value) {
            addCriterion("past >", value, "past");
            return (Criteria) this;
        }

        public Criteria andPastGreaterThanOrEqualTo(String value) {
            addCriterion("past >=", value, "past");
            return (Criteria) this;
        }

        public Criteria andPastLessThan(String value) {
            addCriterion("past <", value, "past");
            return (Criteria) this;
        }

        public Criteria andPastLessThanOrEqualTo(String value) {
            addCriterion("past <=", value, "past");
            return (Criteria) this;
        }

        public Criteria andPastLike(String value) {
            addCriterion("past like", value, "past");
            return (Criteria) this;
        }

        public Criteria andPastNotLike(String value) {
            addCriterion("past not like", value, "past");
            return (Criteria) this;
        }

        public Criteria andPastIn(List<String> values) {
            addCriterion("past in", values, "past");
            return (Criteria) this;
        }

        public Criteria andPastNotIn(List<String> values) {
            addCriterion("past not in", values, "past");
            return (Criteria) this;
        }

        public Criteria andPastBetween(String value1, String value2) {
            addCriterion("past between", value1, value2, "past");
            return (Criteria) this;
        }

        public Criteria andPastNotBetween(String value1, String value2) {
            addCriterion("past not between", value1, value2, "past");
            return (Criteria) this;
        }

        public Criteria andPresentProgressiveIsNull() {
            addCriterion("present_progressive is null");
            return (Criteria) this;
        }

        public Criteria andPresentProgressiveIsNotNull() {
            addCriterion("present_progressive is not null");
            return (Criteria) this;
        }

        public Criteria andPresentProgressiveEqualTo(String value) {
            addCriterion("present_progressive =", value, "presentProgressive");
            return (Criteria) this;
        }

        public Criteria andPresentProgressiveNotEqualTo(String value) {
            addCriterion("present_progressive <>", value, "presentProgressive");
            return (Criteria) this;
        }

        public Criteria andPresentProgressiveGreaterThan(String value) {
            addCriterion("present_progressive >", value, "presentProgressive");
            return (Criteria) this;
        }

        public Criteria andPresentProgressiveGreaterThanOrEqualTo(String value) {
            addCriterion("present_progressive >=", value, "presentProgressive");
            return (Criteria) this;
        }

        public Criteria andPresentProgressiveLessThan(String value) {
            addCriterion("present_progressive <", value, "presentProgressive");
            return (Criteria) this;
        }

        public Criteria andPresentProgressiveLessThanOrEqualTo(String value) {
            addCriterion("present_progressive <=", value, "presentProgressive");
            return (Criteria) this;
        }

        public Criteria andPresentProgressiveLike(String value) {
            addCriterion("present_progressive like", value, "presentProgressive");
            return (Criteria) this;
        }

        public Criteria andPresentProgressiveNotLike(String value) {
            addCriterion("present_progressive not like", value, "presentProgressive");
            return (Criteria) this;
        }

        public Criteria andPresentProgressiveIn(List<String> values) {
            addCriterion("present_progressive in", values, "presentProgressive");
            return (Criteria) this;
        }

        public Criteria andPresentProgressiveNotIn(List<String> values) {
            addCriterion("present_progressive not in", values, "presentProgressive");
            return (Criteria) this;
        }

        public Criteria andPresentProgressiveBetween(String value1, String value2) {
            addCriterion("present_progressive between", value1, value2, "presentProgressive");
            return (Criteria) this;
        }

        public Criteria andPresentProgressiveNotBetween(String value1, String value2) {
            addCriterion("present_progressive not between", value1, value2, "presentProgressive");
            return (Criteria) this;
        }

        public Criteria andComplexDeformationIsNull() {
            addCriterion("complex_deformation is null");
            return (Criteria) this;
        }

        public Criteria andComplexDeformationIsNotNull() {
            addCriterion("complex_deformation is not null");
            return (Criteria) this;
        }

        public Criteria andComplexDeformationEqualTo(String value) {
            addCriterion("complex_deformation =", value, "complexDeformation");
            return (Criteria) this;
        }

        public Criteria andComplexDeformationNotEqualTo(String value) {
            addCriterion("complex_deformation <>", value, "complexDeformation");
            return (Criteria) this;
        }

        public Criteria andComplexDeformationGreaterThan(String value) {
            addCriterion("complex_deformation >", value, "complexDeformation");
            return (Criteria) this;
        }

        public Criteria andComplexDeformationGreaterThanOrEqualTo(String value) {
            addCriterion("complex_deformation >=", value, "complexDeformation");
            return (Criteria) this;
        }

        public Criteria andComplexDeformationLessThan(String value) {
            addCriterion("complex_deformation <", value, "complexDeformation");
            return (Criteria) this;
        }

        public Criteria andComplexDeformationLessThanOrEqualTo(String value) {
            addCriterion("complex_deformation <=", value, "complexDeformation");
            return (Criteria) this;
        }

        public Criteria andComplexDeformationLike(String value) {
            addCriterion("complex_deformation like", value, "complexDeformation");
            return (Criteria) this;
        }

        public Criteria andComplexDeformationNotLike(String value) {
            addCriterion("complex_deformation not like", value, "complexDeformation");
            return (Criteria) this;
        }

        public Criteria andComplexDeformationIn(List<String> values) {
            addCriterion("complex_deformation in", values, "complexDeformation");
            return (Criteria) this;
        }

        public Criteria andComplexDeformationNotIn(List<String> values) {
            addCriterion("complex_deformation not in", values, "complexDeformation");
            return (Criteria) this;
        }

        public Criteria andComplexDeformationBetween(String value1, String value2) {
            addCriterion("complex_deformation between", value1, value2, "complexDeformation");
            return (Criteria) this;
        }

        public Criteria andComplexDeformationNotBetween(String value1, String value2) {
            addCriterion("complex_deformation not between", value1, value2, "complexDeformation");
            return (Criteria) this;
        }

        public Criteria andNameChIsNull() {
            addCriterion("name_ch is null");
            return (Criteria) this;
        }

        public Criteria andNameChIsNotNull() {
            addCriterion("name_ch is not null");
            return (Criteria) this;
        }

        public Criteria andNameChEqualTo(String value) {
            addCriterion("name_ch =", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChNotEqualTo(String value) {
            addCriterion("name_ch <>", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChGreaterThan(String value) {
            addCriterion("name_ch >", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChGreaterThanOrEqualTo(String value) {
            addCriterion("name_ch >=", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChLessThan(String value) {
            addCriterion("name_ch <", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChLessThanOrEqualTo(String value) {
            addCriterion("name_ch <=", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChLike(String value) {
            addCriterion("name_ch like", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChNotLike(String value) {
            addCriterion("name_ch not like", value, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChIn(List<String> values) {
            addCriterion("name_ch in", values, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChNotIn(List<String> values) {
            addCriterion("name_ch not in", values, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChBetween(String value1, String value2) {
            addCriterion("name_ch between", value1, value2, "nameCh");
            return (Criteria) this;
        }

        public Criteria andNameChNotBetween(String value1, String value2) {
            addCriterion("name_ch not between", value1, value2, "nameCh");
            return (Criteria) this;
        }

        public Criteria andExampleSentenceIsNull() {
            addCriterion(" example_sentence is null");
            return (Criteria) this;
        }

        public Criteria andExampleSentenceIsNotNull() {
            addCriterion(" example_sentence is not null");
            return (Criteria) this;
        }

        public Criteria andExampleSentenceEqualTo(String value) {
            addCriterion(" example_sentence =", value, " exampleSentence");
            return (Criteria) this;
        }

        public Criteria andExampleSentenceNotEqualTo(String value) {
            addCriterion(" example_sentence <>", value, " exampleSentence");
            return (Criteria) this;
        }

        public Criteria andExampleSentenceGreaterThan(String value) {
            addCriterion(" example_sentence >", value, " exampleSentence");
            return (Criteria) this;
        }

        public Criteria andExampleSentenceGreaterThanOrEqualTo(String value) {
            addCriterion(" example_sentence >=", value, " exampleSentence");
            return (Criteria) this;
        }

        public Criteria andExampleSentenceLessThan(String value) {
            addCriterion(" example_sentence <", value, " exampleSentence");
            return (Criteria) this;
        }

        public Criteria andExampleSentenceLessThanOrEqualTo(String value) {
            addCriterion(" example_sentence <=", value, " exampleSentence");
            return (Criteria) this;
        }

        public Criteria andExampleSentenceLike(String value) {
            addCriterion(" example_sentence like", value, " exampleSentence");
            return (Criteria) this;
        }

        public Criteria andExampleSentenceNotLike(String value) {
            addCriterion(" example_sentence not like", value, " exampleSentence");
            return (Criteria) this;
        }

        public Criteria andExampleSentenceIn(List<String> values) {
            addCriterion(" example_sentence in", values, " exampleSentence");
            return (Criteria) this;
        }

        public Criteria andExampleSentenceNotIn(List<String> values) {
            addCriterion(" example_sentence not in", values, " exampleSentence");
            return (Criteria) this;
        }

        public Criteria andExampleSentenceBetween(String value1, String value2) {
            addCriterion(" example_sentence between", value1, value2, " exampleSentence");
            return (Criteria) this;
        }

        public Criteria andExampleSentenceNotBetween(String value1, String value2) {
            addCriterion(" example_sentence not between", value1, value2, " exampleSentence");
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