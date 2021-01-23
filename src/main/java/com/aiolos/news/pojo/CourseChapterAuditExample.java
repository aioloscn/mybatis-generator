package com.aiolos.news.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseChapterAuditExample {
    /**
     * course_chapter_audit
     */
    protected String orderByClause;

    /**
     * course_chapter_audit
     */
    protected boolean distinct;

    /**
     * course_chapter_audit
     */
    protected List<Criteria> oredCriteria;

    public CourseChapterAuditExample() {
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

    /**
     * course_chapter_audit 2021-01-23
     */
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

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("status_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(Integer value) {
            addCriterion("status_id =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(Integer value) {
            addCriterion("status_id <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(Integer value) {
            addCriterion("status_id >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_id >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(Integer value) {
            addCriterion("status_id <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("status_id <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<Integer> values) {
            addCriterion("status_id in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<Integer> values) {
            addCriterion("status_id not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("status_id between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("status_id not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Long value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Long value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Long value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Long value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Long value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Long> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Long> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Long value1, Long value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Long value1, Long value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andChapterNameIsNull() {
            addCriterion("chapter_name is null");
            return (Criteria) this;
        }

        public Criteria andChapterNameIsNotNull() {
            addCriterion("chapter_name is not null");
            return (Criteria) this;
        }

        public Criteria andChapterNameEqualTo(String value) {
            addCriterion("chapter_name =", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotEqualTo(String value) {
            addCriterion("chapter_name <>", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameGreaterThan(String value) {
            addCriterion("chapter_name >", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_name >=", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLessThan(String value) {
            addCriterion("chapter_name <", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLessThanOrEqualTo(String value) {
            addCriterion("chapter_name <=", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLike(String value) {
            addCriterion("chapter_name like", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotLike(String value) {
            addCriterion("chapter_name not like", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameIn(List<String> values) {
            addCriterion("chapter_name in", values, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotIn(List<String> values) {
            addCriterion("chapter_name not in", values, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameBetween(String value1, String value2) {
            addCriterion("chapter_name between", value1, value2, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotBetween(String value1, String value2) {
            addCriterion("chapter_name not between", value1, value2, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterDescIsNull() {
            addCriterion("chapter_desc is null");
            return (Criteria) this;
        }

        public Criteria andChapterDescIsNotNull() {
            addCriterion("chapter_desc is not null");
            return (Criteria) this;
        }

        public Criteria andChapterDescEqualTo(String value) {
            addCriterion("chapter_desc =", value, "chapterDesc");
            return (Criteria) this;
        }

        public Criteria andChapterDescNotEqualTo(String value) {
            addCriterion("chapter_desc <>", value, "chapterDesc");
            return (Criteria) this;
        }

        public Criteria andChapterDescGreaterThan(String value) {
            addCriterion("chapter_desc >", value, "chapterDesc");
            return (Criteria) this;
        }

        public Criteria andChapterDescGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_desc >=", value, "chapterDesc");
            return (Criteria) this;
        }

        public Criteria andChapterDescLessThan(String value) {
            addCriterion("chapter_desc <", value, "chapterDesc");
            return (Criteria) this;
        }

        public Criteria andChapterDescLessThanOrEqualTo(String value) {
            addCriterion("chapter_desc <=", value, "chapterDesc");
            return (Criteria) this;
        }

        public Criteria andChapterDescLike(String value) {
            addCriterion("chapter_desc like", value, "chapterDesc");
            return (Criteria) this;
        }

        public Criteria andChapterDescNotLike(String value) {
            addCriterion("chapter_desc not like", value, "chapterDesc");
            return (Criteria) this;
        }

        public Criteria andChapterDescIn(List<String> values) {
            addCriterion("chapter_desc in", values, "chapterDesc");
            return (Criteria) this;
        }

        public Criteria andChapterDescNotIn(List<String> values) {
            addCriterion("chapter_desc not in", values, "chapterDesc");
            return (Criteria) this;
        }

        public Criteria andChapterDescBetween(String value1, String value2) {
            addCriterion("chapter_desc between", value1, value2, "chapterDesc");
            return (Criteria) this;
        }

        public Criteria andChapterDescNotBetween(String value1, String value2) {
            addCriterion("chapter_desc not between", value1, value2, "chapterDesc");
            return (Criteria) this;
        }

        public Criteria andIsFreeIsNull() {
            addCriterion("is_free is null");
            return (Criteria) this;
        }

        public Criteria andIsFreeIsNotNull() {
            addCriterion("is_free is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreeEqualTo(Integer value) {
            addCriterion("is_free =", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotEqualTo(Integer value) {
            addCriterion("is_free <>", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeGreaterThan(Integer value) {
            addCriterion("is_free >", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_free >=", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeLessThan(Integer value) {
            addCriterion("is_free <", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeLessThanOrEqualTo(Integer value) {
            addCriterion("is_free <=", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeIn(List<Integer> values) {
            addCriterion("is_free in", values, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotIn(List<Integer> values) {
            addCriterion("is_free not in", values, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeBetween(Integer value1, Integer value2) {
            addCriterion("is_free between", value1, value2, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_free not between", value1, value2, "isFree");
            return (Criteria) this;
        }

        public Criteria andChapterOriginalIsNull() {
            addCriterion("chapter_original is null");
            return (Criteria) this;
        }

        public Criteria andChapterOriginalIsNotNull() {
            addCriterion("chapter_original is not null");
            return (Criteria) this;
        }

        public Criteria andChapterOriginalEqualTo(BigDecimal value) {
            addCriterion("chapter_original =", value, "chapterOriginal");
            return (Criteria) this;
        }

        public Criteria andChapterOriginalNotEqualTo(BigDecimal value) {
            addCriterion("chapter_original <>", value, "chapterOriginal");
            return (Criteria) this;
        }

        public Criteria andChapterOriginalGreaterThan(BigDecimal value) {
            addCriterion("chapter_original >", value, "chapterOriginal");
            return (Criteria) this;
        }

        public Criteria andChapterOriginalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("chapter_original >=", value, "chapterOriginal");
            return (Criteria) this;
        }

        public Criteria andChapterOriginalLessThan(BigDecimal value) {
            addCriterion("chapter_original <", value, "chapterOriginal");
            return (Criteria) this;
        }

        public Criteria andChapterOriginalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("chapter_original <=", value, "chapterOriginal");
            return (Criteria) this;
        }

        public Criteria andChapterOriginalIn(List<BigDecimal> values) {
            addCriterion("chapter_original in", values, "chapterOriginal");
            return (Criteria) this;
        }

        public Criteria andChapterOriginalNotIn(List<BigDecimal> values) {
            addCriterion("chapter_original not in", values, "chapterOriginal");
            return (Criteria) this;
        }

        public Criteria andChapterOriginalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chapter_original between", value1, value2, "chapterOriginal");
            return (Criteria) this;
        }

        public Criteria andChapterOriginalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chapter_original not between", value1, value2, "chapterOriginal");
            return (Criteria) this;
        }

        public Criteria andChapterDiscountIsNull() {
            addCriterion("chapter_discount is null");
            return (Criteria) this;
        }

        public Criteria andChapterDiscountIsNotNull() {
            addCriterion("chapter_discount is not null");
            return (Criteria) this;
        }

        public Criteria andChapterDiscountEqualTo(BigDecimal value) {
            addCriterion("chapter_discount =", value, "chapterDiscount");
            return (Criteria) this;
        }

        public Criteria andChapterDiscountNotEqualTo(BigDecimal value) {
            addCriterion("chapter_discount <>", value, "chapterDiscount");
            return (Criteria) this;
        }

        public Criteria andChapterDiscountGreaterThan(BigDecimal value) {
            addCriterion("chapter_discount >", value, "chapterDiscount");
            return (Criteria) this;
        }

        public Criteria andChapterDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("chapter_discount >=", value, "chapterDiscount");
            return (Criteria) this;
        }

        public Criteria andChapterDiscountLessThan(BigDecimal value) {
            addCriterion("chapter_discount <", value, "chapterDiscount");
            return (Criteria) this;
        }

        public Criteria andChapterDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("chapter_discount <=", value, "chapterDiscount");
            return (Criteria) this;
        }

        public Criteria andChapterDiscountIn(List<BigDecimal> values) {
            addCriterion("chapter_discount in", values, "chapterDiscount");
            return (Criteria) this;
        }

        public Criteria andChapterDiscountNotIn(List<BigDecimal> values) {
            addCriterion("chapter_discount not in", values, "chapterDiscount");
            return (Criteria) this;
        }

        public Criteria andChapterDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chapter_discount between", value1, value2, "chapterDiscount");
            return (Criteria) this;
        }

        public Criteria andChapterDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chapter_discount not between", value1, value2, "chapterDiscount");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Integer value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Integer value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Integer value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Integer value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Integer value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Integer> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Integer> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Integer value1, Integer value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
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

        public Criteria andLiveStatusIsNull() {
            addCriterion("live_status is null");
            return (Criteria) this;
        }

        public Criteria andLiveStatusIsNotNull() {
            addCriterion("live_status is not null");
            return (Criteria) this;
        }

        public Criteria andLiveStatusEqualTo(Integer value) {
            addCriterion("live_status =", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusNotEqualTo(Integer value) {
            addCriterion("live_status <>", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusGreaterThan(Integer value) {
            addCriterion("live_status >", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("live_status >=", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusLessThan(Integer value) {
            addCriterion("live_status <", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusLessThanOrEqualTo(Integer value) {
            addCriterion("live_status <=", value, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusIn(List<Integer> values) {
            addCriterion("live_status in", values, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusNotIn(List<Integer> values) {
            addCriterion("live_status not in", values, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusBetween(Integer value1, Integer value2) {
            addCriterion("live_status between", value1, value2, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andLiveStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("live_status not between", value1, value2, "liveStatus");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNull() {
            addCriterion("original_price is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNotNull() {
            addCriterion("original_price is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceEqualTo(BigDecimal value) {
            addCriterion("original_price =", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotEqualTo(BigDecimal value) {
            addCriterion("original_price <>", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThan(BigDecimal value) {
            addCriterion("original_price >", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("original_price >=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThan(BigDecimal value) {
            addCriterion("original_price <", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("original_price <=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIn(List<BigDecimal> values) {
            addCriterion("original_price in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotIn(List<BigDecimal> values) {
            addCriterion("original_price not in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_price between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_price not between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceIsNull() {
            addCriterion("preferential_price is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceIsNotNull() {
            addCriterion("preferential_price is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceEqualTo(BigDecimal value) {
            addCriterion("preferential_price =", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceNotEqualTo(BigDecimal value) {
            addCriterion("preferential_price <>", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceGreaterThan(BigDecimal value) {
            addCriterion("preferential_price >", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("preferential_price >=", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceLessThan(BigDecimal value) {
            addCriterion("preferential_price <", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("preferential_price <=", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceIn(List<BigDecimal> values) {
            addCriterion("preferential_price in", values, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceNotIn(List<BigDecimal> values) {
            addCriterion("preferential_price not in", values, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preferential_price between", value1, value2, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preferential_price not between", value1, value2, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andIsFaceContrasIsNull() {
            addCriterion("is_face_contras is null");
            return (Criteria) this;
        }

        public Criteria andIsFaceContrasIsNotNull() {
            addCriterion("is_face_contras is not null");
            return (Criteria) this;
        }

        public Criteria andIsFaceContrasEqualTo(Integer value) {
            addCriterion("is_face_contras =", value, "isFaceContras");
            return (Criteria) this;
        }

        public Criteria andIsFaceContrasNotEqualTo(Integer value) {
            addCriterion("is_face_contras <>", value, "isFaceContras");
            return (Criteria) this;
        }

        public Criteria andIsFaceContrasGreaterThan(Integer value) {
            addCriterion("is_face_contras >", value, "isFaceContras");
            return (Criteria) this;
        }

        public Criteria andIsFaceContrasGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_face_contras >=", value, "isFaceContras");
            return (Criteria) this;
        }

        public Criteria andIsFaceContrasLessThan(Integer value) {
            addCriterion("is_face_contras <", value, "isFaceContras");
            return (Criteria) this;
        }

        public Criteria andIsFaceContrasLessThanOrEqualTo(Integer value) {
            addCriterion("is_face_contras <=", value, "isFaceContras");
            return (Criteria) this;
        }

        public Criteria andIsFaceContrasIn(List<Integer> values) {
            addCriterion("is_face_contras in", values, "isFaceContras");
            return (Criteria) this;
        }

        public Criteria andIsFaceContrasNotIn(List<Integer> values) {
            addCriterion("is_face_contras not in", values, "isFaceContras");
            return (Criteria) this;
        }

        public Criteria andIsFaceContrasBetween(Integer value1, Integer value2) {
            addCriterion("is_face_contras between", value1, value2, "isFaceContras");
            return (Criteria) this;
        }

        public Criteria andIsFaceContrasNotBetween(Integer value1, Integer value2) {
            addCriterion("is_face_contras not between", value1, value2, "isFaceContras");
            return (Criteria) this;
        }
    }

    /**
     *  * course_chapter_audit
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * course_chapter_audit 2021-01-23
     */
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