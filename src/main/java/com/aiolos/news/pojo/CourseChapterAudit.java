package com.aiolos.news.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CourseChapterAudit implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 状态(1:正常，0:禁用)
     */
    private Integer statusId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 章节父节点ID
     */
    private Long parentId;

    /**
     * 课程ID
     */
    private Long courseId;

    /**
     * 章节名称
     */
    private String chapterName;

    /**
     * 章节描述
     */
    private String chapterDesc;

    /**
     * 是否免费：1免费，0收费
     */
    private Integer isFree;

    /**
     * 原价
     */
    private BigDecimal chapterOriginal;

    /**
     * 优惠价
     */
    private BigDecimal chapterDiscount;

    /**
     * 审核状态(0:待审核;1:审核通过;2:审核不通过)
     */
    private Integer auditStatus;

    /**
     * 审核意见
     */
    private String auditOpinion;

    /**
     * 直播状态(未开播/正在直播/已直播)
     */
    private Integer liveStatus;

    /**
     * 原价
     */
    private BigDecimal originalPrice;

    /**
     * 优惠价
     */
    private BigDecimal preferentialPrice;

    /**
     * 直播开始时间
     */
    private Date startTime;

    /**
     * 直播结束时间
     */
    private Date endTime;

    /**
     * 是否需要人脸对比(0:否，1:是)
     */
    private Integer isFaceContras;

    /**
     * course_chapter_audit
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 创建时间
     * @return gmt_create 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 创建时间
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 修改时间
     * @return gmt_modified 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 修改时间
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 状态(1:正常，0:禁用)
     * @return status_id 状态(1:正常，0:禁用)
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * 状态(1:正常，0:禁用)
     * @param statusId 状态(1:正常，0:禁用)
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    /**
     * 排序
     * @return sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 章节父节点ID
     * @return parent_id 章节父节点ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 章节父节点ID
     * @param parentId 章节父节点ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 课程ID
     * @return course_id 课程ID
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * 课程ID
     * @param courseId 课程ID
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * 章节名称
     * @return chapter_name 章节名称
     */
    public String getChapterName() {
        return chapterName;
    }

    /**
     * 章节名称
     * @param chapterName 章节名称
     */
    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
    }

    /**
     * 章节描述
     * @return chapter_desc 章节描述
     */
    public String getChapterDesc() {
        return chapterDesc;
    }

    /**
     * 章节描述
     * @param chapterDesc 章节描述
     */
    public void setChapterDesc(String chapterDesc) {
        this.chapterDesc = chapterDesc == null ? null : chapterDesc.trim();
    }

    /**
     * 是否免费：1免费，0收费
     * @return is_free 是否免费：1免费，0收费
     */
    public Integer getIsFree() {
        return isFree;
    }

    /**
     * 是否免费：1免费，0收费
     * @param isFree 是否免费：1免费，0收费
     */
    public void setIsFree(Integer isFree) {
        this.isFree = isFree;
    }

    /**
     * 原价
     * @return chapter_original 原价
     */
    public BigDecimal getChapterOriginal() {
        return chapterOriginal;
    }

    /**
     * 原价
     * @param chapterOriginal 原价
     */
    public void setChapterOriginal(BigDecimal chapterOriginal) {
        this.chapterOriginal = chapterOriginal;
    }

    /**
     * 优惠价
     * @return chapter_discount 优惠价
     */
    public BigDecimal getChapterDiscount() {
        return chapterDiscount;
    }

    /**
     * 优惠价
     * @param chapterDiscount 优惠价
     */
    public void setChapterDiscount(BigDecimal chapterDiscount) {
        this.chapterDiscount = chapterDiscount;
    }

    /**
     * 审核状态(0:待审核;1:审核通过;2:审核不通过)
     * @return audit_status 审核状态(0:待审核;1:审核通过;2:审核不通过)
     */
    public Integer getAuditStatus() {
        return auditStatus;
    }

    /**
     * 审核状态(0:待审核;1:审核通过;2:审核不通过)
     * @param auditStatus 审核状态(0:待审核;1:审核通过;2:审核不通过)
     */
    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * 审核意见
     * @return audit_opinion 审核意见
     */
    public String getAuditOpinion() {
        return auditOpinion;
    }

    /**
     * 审核意见
     * @param auditOpinion 审核意见
     */
    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion == null ? null : auditOpinion.trim();
    }

    /**
     * 直播状态(未开播/正在直播/已直播)
     * @return live_status 直播状态(未开播/正在直播/已直播)
     */
    public Integer getLiveStatus() {
        return liveStatus;
    }

    /**
     * 直播状态(未开播/正在直播/已直播)
     * @param liveStatus 直播状态(未开播/正在直播/已直播)
     */
    public void setLiveStatus(Integer liveStatus) {
        this.liveStatus = liveStatus;
    }

    /**
     * 原价
     * @return original_price 原价
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 原价
     * @param originalPrice 原价
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * 优惠价
     * @return preferential_price 优惠价
     */
    public BigDecimal getPreferentialPrice() {
        return preferentialPrice;
    }

    /**
     * 优惠价
     * @param preferentialPrice 优惠价
     */
    public void setPreferentialPrice(BigDecimal preferentialPrice) {
        this.preferentialPrice = preferentialPrice;
    }

    /**
     * 直播开始时间
     * @return start_time 直播开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 直播开始时间
     * @param startTime 直播开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 直播结束时间
     * @return end_time 直播结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 直播结束时间
     * @param endTime 直播结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 是否需要人脸对比(0:否，1:是)
     * @return is_face_contras 是否需要人脸对比(0:否，1:是)
     */
    public Integer getIsFaceContras() {
        return isFaceContras;
    }

    /**
     * 是否需要人脸对比(0:否，1:是)
     * @param isFaceContras 是否需要人脸对比(0:否，1:是)
     */
    public void setIsFaceContras(Integer isFaceContras) {
        this.isFaceContras = isFaceContras;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", statusId=").append(statusId);
        sb.append(", sort=").append(sort);
        sb.append(", parentId=").append(parentId);
        sb.append(", courseId=").append(courseId);
        sb.append(", chapterName=").append(chapterName);
        sb.append(", chapterDesc=").append(chapterDesc);
        sb.append(", isFree=").append(isFree);
        sb.append(", chapterOriginal=").append(chapterOriginal);
        sb.append(", chapterDiscount=").append(chapterDiscount);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", auditOpinion=").append(auditOpinion);
        sb.append(", liveStatus=").append(liveStatus);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", preferentialPrice=").append(preferentialPrice);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", isFaceContras=").append(isFaceContras);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}