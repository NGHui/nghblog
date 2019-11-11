package com.hui.blog.bean;

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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoIsNull() {
            addCriterion("user_profile_photo is null");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoIsNotNull() {
            addCriterion("user_profile_photo is not null");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoEqualTo(String value) {
            addCriterion("user_profile_photo =", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoNotEqualTo(String value) {
            addCriterion("user_profile_photo <>", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoGreaterThan(String value) {
            addCriterion("user_profile_photo >", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("user_profile_photo >=", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoLessThan(String value) {
            addCriterion("user_profile_photo <", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoLessThanOrEqualTo(String value) {
            addCriterion("user_profile_photo <=", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoLike(String value) {
            addCriterion("user_profile_photo like", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoNotLike(String value) {
            addCriterion("user_profile_photo not like", value, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoIn(List<String> values) {
            addCriterion("user_profile_photo in", values, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoNotIn(List<String> values) {
            addCriterion("user_profile_photo not in", values, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoBetween(String value1, String value2) {
            addCriterion("user_profile_photo between", value1, value2, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserProfilePhotoNotBetween(String value1, String value2) {
            addCriterion("user_profile_photo not between", value1, value2, "userProfilePhoto");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeIsNull() {
            addCriterion("user_registration_time is null");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeIsNotNull() {
            addCriterion("user_registration_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeEqualTo(Long value) {
            addCriterion("user_registration_time =", value, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeNotEqualTo(Long value) {
            addCriterion("user_registration_time <>", value, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeGreaterThan(Long value) {
            addCriterion("user_registration_time >", value, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("user_registration_time >=", value, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeLessThan(Long value) {
            addCriterion("user_registration_time <", value, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeLessThanOrEqualTo(Long value) {
            addCriterion("user_registration_time <=", value, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeIn(List<Long> values) {
            addCriterion("user_registration_time in", values, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeNotIn(List<Long> values) {
            addCriterion("user_registration_time not in", values, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeBetween(Long value1, Long value2) {
            addCriterion("user_registration_time between", value1, value2, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserRegistrationTimeNotBetween(Long value1, Long value2) {
            addCriterion("user_registration_time not between", value1, value2, "userRegistrationTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIsNull() {
            addCriterion("user_update_time is null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIsNotNull() {
            addCriterion("user_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeEqualTo(Long value) {
            addCriterion("user_update_time =", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotEqualTo(Long value) {
            addCriterion("user_update_time <>", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeGreaterThan(Long value) {
            addCriterion("user_update_time >", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("user_update_time >=", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeLessThan(Long value) {
            addCriterion("user_update_time <", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("user_update_time <=", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIn(List<Long> values) {
            addCriterion("user_update_time in", values, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotIn(List<Long> values) {
            addCriterion("user_update_time not in", values, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("user_update_time between", value1, value2, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("user_update_time not between", value1, value2, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNull() {
            addCriterion("user_age is null");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNotNull() {
            addCriterion("user_age is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgeEqualTo(Long value) {
            addCriterion("user_age =", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotEqualTo(Long value) {
            addCriterion("user_age <>", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThan(Long value) {
            addCriterion("user_age >", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThanOrEqualTo(Long value) {
            addCriterion("user_age >=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThan(Long value) {
            addCriterion("user_age <", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThanOrEqualTo(Long value) {
            addCriterion("user_age <=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeIn(List<Long> values) {
            addCriterion("user_age in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotIn(List<Long> values) {
            addCriterion("user_age not in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeBetween(Long value1, Long value2) {
            addCriterion("user_age between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotBetween(Long value1, Long value2) {
            addCriterion("user_age not between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberIsNull() {
            addCriterion("user_telephone_number is null");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberIsNotNull() {
            addCriterion("user_telephone_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberEqualTo(Long value) {
            addCriterion("user_telephone_number =", value, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberNotEqualTo(Long value) {
            addCriterion("user_telephone_number <>", value, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberGreaterThan(Long value) {
            addCriterion("user_telephone_number >", value, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("user_telephone_number >=", value, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberLessThan(Long value) {
            addCriterion("user_telephone_number <", value, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberLessThanOrEqualTo(Long value) {
            addCriterion("user_telephone_number <=", value, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberIn(List<Long> values) {
            addCriterion("user_telephone_number in", values, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberNotIn(List<Long> values) {
            addCriterion("user_telephone_number not in", values, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberBetween(Long value1, Long value2) {
            addCriterion("user_telephone_number between", value1, value2, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberNotBetween(Long value1, Long value2) {
            addCriterion("user_telephone_number not between", value1, value2, "userTelephoneNumber");
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