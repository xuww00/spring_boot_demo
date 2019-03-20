package com.xuww.springbootdemo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YUserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YUserCriteria() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("LOGIN_NAME like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPayPwdIsNull() {
            addCriterion("PAY_PWD is null");
            return (Criteria) this;
        }

        public Criteria andPayPwdIsNotNull() {
            addCriterion("PAY_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andPayPwdEqualTo(String value) {
            addCriterion("PAY_PWD =", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotEqualTo(String value) {
            addCriterion("PAY_PWD <>", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdGreaterThan(String value) {
            addCriterion("PAY_PWD >", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_PWD >=", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLessThan(String value) {
            addCriterion("PAY_PWD <", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLessThanOrEqualTo(String value) {
            addCriterion("PAY_PWD <=", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLike(String value) {
            addCriterion("PAY_PWD like", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotLike(String value) {
            addCriterion("PAY_PWD not like", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdIn(List<String> values) {
            addCriterion("PAY_PWD in", values, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotIn(List<String> values) {
            addCriterion("PAY_PWD not in", values, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdBetween(String value1, String value2) {
            addCriterion("PAY_PWD between", value1, value2, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotBetween(String value1, String value2) {
            addCriterion("PAY_PWD not between", value1, value2, "payPwd");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLastLoginIfIsNull() {
            addCriterion("LAST_LOGIN_IF is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIfIsNotNull() {
            addCriterion("LAST_LOGIN_IF is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIfEqualTo(String value) {
            addCriterion("LAST_LOGIN_IF =", value, "lastLoginIf");
            return (Criteria) this;
        }

        public Criteria andLastLoginIfNotEqualTo(String value) {
            addCriterion("LAST_LOGIN_IF <>", value, "lastLoginIf");
            return (Criteria) this;
        }

        public Criteria andLastLoginIfGreaterThan(String value) {
            addCriterion("LAST_LOGIN_IF >", value, "lastLoginIf");
            return (Criteria) this;
        }

        public Criteria andLastLoginIfGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN_IF >=", value, "lastLoginIf");
            return (Criteria) this;
        }

        public Criteria andLastLoginIfLessThan(String value) {
            addCriterion("LAST_LOGIN_IF <", value, "lastLoginIf");
            return (Criteria) this;
        }

        public Criteria andLastLoginIfLessThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN_IF <=", value, "lastLoginIf");
            return (Criteria) this;
        }

        public Criteria andLastLoginIfLike(String value) {
            addCriterion("LAST_LOGIN_IF like", value, "lastLoginIf");
            return (Criteria) this;
        }

        public Criteria andLastLoginIfNotLike(String value) {
            addCriterion("LAST_LOGIN_IF not like", value, "lastLoginIf");
            return (Criteria) this;
        }

        public Criteria andLastLoginIfIn(List<String> values) {
            addCriterion("LAST_LOGIN_IF in", values, "lastLoginIf");
            return (Criteria) this;
        }

        public Criteria andLastLoginIfNotIn(List<String> values) {
            addCriterion("LAST_LOGIN_IF not in", values, "lastLoginIf");
            return (Criteria) this;
        }

        public Criteria andLastLoginIfBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN_IF between", value1, value2, "lastLoginIf");
            return (Criteria) this;
        }

        public Criteria andLastLoginIfNotBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN_IF not between", value1, value2, "lastLoginIf");
            return (Criteria) this;
        }

        public Criteria andFingerprintIsNull() {
            addCriterion("FINGERPRINT is null");
            return (Criteria) this;
        }

        public Criteria andFingerprintIsNotNull() {
            addCriterion("FINGERPRINT is not null");
            return (Criteria) this;
        }

        public Criteria andFingerprintEqualTo(String value) {
            addCriterion("FINGERPRINT =", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintNotEqualTo(String value) {
            addCriterion("FINGERPRINT <>", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintGreaterThan(String value) {
            addCriterion("FINGERPRINT >", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintGreaterThanOrEqualTo(String value) {
            addCriterion("FINGERPRINT >=", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintLessThan(String value) {
            addCriterion("FINGERPRINT <", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintLessThanOrEqualTo(String value) {
            addCriterion("FINGERPRINT <=", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintLike(String value) {
            addCriterion("FINGERPRINT like", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintNotLike(String value) {
            addCriterion("FINGERPRINT not like", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintIn(List<String> values) {
            addCriterion("FINGERPRINT in", values, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintNotIn(List<String> values) {
            addCriterion("FINGERPRINT not in", values, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintBetween(String value1, String value2) {
            addCriterion("FINGERPRINT between", value1, value2, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintNotBetween(String value1, String value2) {
            addCriterion("FINGERPRINT not between", value1, value2, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintIfIsNull() {
            addCriterion("FINGERPRINT_IF is null");
            return (Criteria) this;
        }

        public Criteria andFingerprintIfIsNotNull() {
            addCriterion("FINGERPRINT_IF is not null");
            return (Criteria) this;
        }

        public Criteria andFingerprintIfEqualTo(String value) {
            addCriterion("FINGERPRINT_IF =", value, "fingerprintIf");
            return (Criteria) this;
        }

        public Criteria andFingerprintIfNotEqualTo(String value) {
            addCriterion("FINGERPRINT_IF <>", value, "fingerprintIf");
            return (Criteria) this;
        }

        public Criteria andFingerprintIfGreaterThan(String value) {
            addCriterion("FINGERPRINT_IF >", value, "fingerprintIf");
            return (Criteria) this;
        }

        public Criteria andFingerprintIfGreaterThanOrEqualTo(String value) {
            addCriterion("FINGERPRINT_IF >=", value, "fingerprintIf");
            return (Criteria) this;
        }

        public Criteria andFingerprintIfLessThan(String value) {
            addCriterion("FINGERPRINT_IF <", value, "fingerprintIf");
            return (Criteria) this;
        }

        public Criteria andFingerprintIfLessThanOrEqualTo(String value) {
            addCriterion("FINGERPRINT_IF <=", value, "fingerprintIf");
            return (Criteria) this;
        }

        public Criteria andFingerprintIfLike(String value) {
            addCriterion("FINGERPRINT_IF like", value, "fingerprintIf");
            return (Criteria) this;
        }

        public Criteria andFingerprintIfNotLike(String value) {
            addCriterion("FINGERPRINT_IF not like", value, "fingerprintIf");
            return (Criteria) this;
        }

        public Criteria andFingerprintIfIn(List<String> values) {
            addCriterion("FINGERPRINT_IF in", values, "fingerprintIf");
            return (Criteria) this;
        }

        public Criteria andFingerprintIfNotIn(List<String> values) {
            addCriterion("FINGERPRINT_IF not in", values, "fingerprintIf");
            return (Criteria) this;
        }

        public Criteria andFingerprintIfBetween(String value1, String value2) {
            addCriterion("FINGERPRINT_IF between", value1, value2, "fingerprintIf");
            return (Criteria) this;
        }

        public Criteria andFingerprintIfNotBetween(String value1, String value2) {
            addCriterion("FINGERPRINT_IF not between", value1, value2, "fingerprintIf");
            return (Criteria) this;
        }

        public Criteria andDribletPayAvoidIsNull() {
            addCriterion("DRIBLET_PAY_AVOID is null");
            return (Criteria) this;
        }

        public Criteria andDribletPayAvoidIsNotNull() {
            addCriterion("DRIBLET_PAY_AVOID is not null");
            return (Criteria) this;
        }

        public Criteria andDribletPayAvoidEqualTo(Integer value) {
            addCriterion("DRIBLET_PAY_AVOID =", value, "dribletPayAvoid");
            return (Criteria) this;
        }

        public Criteria andDribletPayAvoidNotEqualTo(Integer value) {
            addCriterion("DRIBLET_PAY_AVOID <>", value, "dribletPayAvoid");
            return (Criteria) this;
        }

        public Criteria andDribletPayAvoidGreaterThan(Integer value) {
            addCriterion("DRIBLET_PAY_AVOID >", value, "dribletPayAvoid");
            return (Criteria) this;
        }

        public Criteria andDribletPayAvoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DRIBLET_PAY_AVOID >=", value, "dribletPayAvoid");
            return (Criteria) this;
        }

        public Criteria andDribletPayAvoidLessThan(Integer value) {
            addCriterion("DRIBLET_PAY_AVOID <", value, "dribletPayAvoid");
            return (Criteria) this;
        }

        public Criteria andDribletPayAvoidLessThanOrEqualTo(Integer value) {
            addCriterion("DRIBLET_PAY_AVOID <=", value, "dribletPayAvoid");
            return (Criteria) this;
        }

        public Criteria andDribletPayAvoidIn(List<Integer> values) {
            addCriterion("DRIBLET_PAY_AVOID in", values, "dribletPayAvoid");
            return (Criteria) this;
        }

        public Criteria andDribletPayAvoidNotIn(List<Integer> values) {
            addCriterion("DRIBLET_PAY_AVOID not in", values, "dribletPayAvoid");
            return (Criteria) this;
        }

        public Criteria andDribletPayAvoidBetween(Integer value1, Integer value2) {
            addCriterion("DRIBLET_PAY_AVOID between", value1, value2, "dribletPayAvoid");
            return (Criteria) this;
        }

        public Criteria andDribletPayAvoidNotBetween(Integer value1, Integer value2) {
            addCriterion("DRIBLET_PAY_AVOID not between", value1, value2, "dribletPayAvoid");
            return (Criteria) this;
        }

        public Criteria andDribletPayAmountIsNull() {
            addCriterion("DRIBLET_PAY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDribletPayAmountIsNotNull() {
            addCriterion("DRIBLET_PAY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDribletPayAmountEqualTo(Integer value) {
            addCriterion("DRIBLET_PAY_AMOUNT =", value, "dribletPayAmount");
            return (Criteria) this;
        }

        public Criteria andDribletPayAmountNotEqualTo(Integer value) {
            addCriterion("DRIBLET_PAY_AMOUNT <>", value, "dribletPayAmount");
            return (Criteria) this;
        }

        public Criteria andDribletPayAmountGreaterThan(Integer value) {
            addCriterion("DRIBLET_PAY_AMOUNT >", value, "dribletPayAmount");
            return (Criteria) this;
        }

        public Criteria andDribletPayAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("DRIBLET_PAY_AMOUNT >=", value, "dribletPayAmount");
            return (Criteria) this;
        }

        public Criteria andDribletPayAmountLessThan(Integer value) {
            addCriterion("DRIBLET_PAY_AMOUNT <", value, "dribletPayAmount");
            return (Criteria) this;
        }

        public Criteria andDribletPayAmountLessThanOrEqualTo(Integer value) {
            addCriterion("DRIBLET_PAY_AMOUNT <=", value, "dribletPayAmount");
            return (Criteria) this;
        }

        public Criteria andDribletPayAmountIn(List<Integer> values) {
            addCriterion("DRIBLET_PAY_AMOUNT in", values, "dribletPayAmount");
            return (Criteria) this;
        }

        public Criteria andDribletPayAmountNotIn(List<Integer> values) {
            addCriterion("DRIBLET_PAY_AMOUNT not in", values, "dribletPayAmount");
            return (Criteria) this;
        }

        public Criteria andDribletPayAmountBetween(Integer value1, Integer value2) {
            addCriterion("DRIBLET_PAY_AMOUNT between", value1, value2, "dribletPayAmount");
            return (Criteria) this;
        }

        public Criteria andDribletPayAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("DRIBLET_PAY_AMOUNT not between", value1, value2, "dribletPayAmount");
            return (Criteria) this;
        }

        public Criteria andDribletPayLimitIsNull() {
            addCriterion("DRIBLET_PAY_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andDribletPayLimitIsNotNull() {
            addCriterion("DRIBLET_PAY_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andDribletPayLimitEqualTo(Integer value) {
            addCriterion("DRIBLET_PAY_LIMIT =", value, "dribletPayLimit");
            return (Criteria) this;
        }

        public Criteria andDribletPayLimitNotEqualTo(Integer value) {
            addCriterion("DRIBLET_PAY_LIMIT <>", value, "dribletPayLimit");
            return (Criteria) this;
        }

        public Criteria andDribletPayLimitGreaterThan(Integer value) {
            addCriterion("DRIBLET_PAY_LIMIT >", value, "dribletPayLimit");
            return (Criteria) this;
        }

        public Criteria andDribletPayLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("DRIBLET_PAY_LIMIT >=", value, "dribletPayLimit");
            return (Criteria) this;
        }

        public Criteria andDribletPayLimitLessThan(Integer value) {
            addCriterion("DRIBLET_PAY_LIMIT <", value, "dribletPayLimit");
            return (Criteria) this;
        }

        public Criteria andDribletPayLimitLessThanOrEqualTo(Integer value) {
            addCriterion("DRIBLET_PAY_LIMIT <=", value, "dribletPayLimit");
            return (Criteria) this;
        }

        public Criteria andDribletPayLimitIn(List<Integer> values) {
            addCriterion("DRIBLET_PAY_LIMIT in", values, "dribletPayLimit");
            return (Criteria) this;
        }

        public Criteria andDribletPayLimitNotIn(List<Integer> values) {
            addCriterion("DRIBLET_PAY_LIMIT not in", values, "dribletPayLimit");
            return (Criteria) this;
        }

        public Criteria andDribletPayLimitBetween(Integer value1, Integer value2) {
            addCriterion("DRIBLET_PAY_LIMIT between", value1, value2, "dribletPayLimit");
            return (Criteria) this;
        }

        public Criteria andDribletPayLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("DRIBLET_PAY_LIMIT not between", value1, value2, "dribletPayLimit");
            return (Criteria) this;
        }

        public Criteria andDribletPayIfIsNull() {
            addCriterion("DRIBLET_PAY_IF is null");
            return (Criteria) this;
        }

        public Criteria andDribletPayIfIsNotNull() {
            addCriterion("DRIBLET_PAY_IF is not null");
            return (Criteria) this;
        }

        public Criteria andDribletPayIfEqualTo(String value) {
            addCriterion("DRIBLET_PAY_IF =", value, "dribletPayIf");
            return (Criteria) this;
        }

        public Criteria andDribletPayIfNotEqualTo(String value) {
            addCriterion("DRIBLET_PAY_IF <>", value, "dribletPayIf");
            return (Criteria) this;
        }

        public Criteria andDribletPayIfGreaterThan(String value) {
            addCriterion("DRIBLET_PAY_IF >", value, "dribletPayIf");
            return (Criteria) this;
        }

        public Criteria andDribletPayIfGreaterThanOrEqualTo(String value) {
            addCriterion("DRIBLET_PAY_IF >=", value, "dribletPayIf");
            return (Criteria) this;
        }

        public Criteria andDribletPayIfLessThan(String value) {
            addCriterion("DRIBLET_PAY_IF <", value, "dribletPayIf");
            return (Criteria) this;
        }

        public Criteria andDribletPayIfLessThanOrEqualTo(String value) {
            addCriterion("DRIBLET_PAY_IF <=", value, "dribletPayIf");
            return (Criteria) this;
        }

        public Criteria andDribletPayIfLike(String value) {
            addCriterion("DRIBLET_PAY_IF like", value, "dribletPayIf");
            return (Criteria) this;
        }

        public Criteria andDribletPayIfNotLike(String value) {
            addCriterion("DRIBLET_PAY_IF not like", value, "dribletPayIf");
            return (Criteria) this;
        }

        public Criteria andDribletPayIfIn(List<String> values) {
            addCriterion("DRIBLET_PAY_IF in", values, "dribletPayIf");
            return (Criteria) this;
        }

        public Criteria andDribletPayIfNotIn(List<String> values) {
            addCriterion("DRIBLET_PAY_IF not in", values, "dribletPayIf");
            return (Criteria) this;
        }

        public Criteria andDribletPayIfBetween(String value1, String value2) {
            addCriterion("DRIBLET_PAY_IF between", value1, value2, "dribletPayIf");
            return (Criteria) this;
        }

        public Criteria andDribletPayIfNotBetween(String value1, String value2) {
            addCriterion("DRIBLET_PAY_IF not between", value1, value2, "dribletPayIf");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("LAST_LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("LAST_LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("LAST_LOGIN_TIME >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("LAST_LOGIN_TIME <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("LAST_LOGIN_TIME in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("LAST_LOGIN_TIME not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN_TIME between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN_TIME not between", value1, value2, "lastLoginTime");
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