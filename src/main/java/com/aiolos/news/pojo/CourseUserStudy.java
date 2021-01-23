package com.aiolos.news.pojo;

import java.io.Serializable;
import java.util.Date;

public class CourseUserStudy implements Serializable {
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
     * 课程ID
     */
    private Long courseId;

    /**
     * 用户编号
     */
    private Long userNo;

    /**
     * 总章节视频数
     */
    private Integer chapterVideoTotal;

    /**
     * 已看过章节视频数
     */
    private Integer chapterVideoSeen;

    /**
     * 课程分类：1普通,2直播
     */
    private Integer courseType;

    /**
     * 视频观看进度
     */
    private String watchProgress;

    /**
     * course_user_study
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
     * 用户编号
     * @return user_no 用户编号
     */
    public Long getUserNo() {
        return userNo;
    }

    /**
     * 用户编号
     * @param userNo 用户编号
     */
    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    /**
     * 总章节视频数
     * @return chapter_video_total 总章节视频数
     */
    public Integer getChapterVideoTotal() {
        return chapterVideoTotal;
    }

    /**
     * 总章节视频数
     * @param chapterVideoTotal 总章节视频数
     */
    public void setChapterVideoTotal(Integer chapterVideoTotal) {
        this.chapterVideoTotal = chapterVideoTotal;
    }

    /**
     * 已看过章节视频数
     * @return chapter_video_seen 已看过章节视频数
     */
    public Integer getChapterVideoSeen() {
        return chapterVideoSeen;
    }

    /**
     * 已看过章节视频数
     * @param chapterVideoSeen 已看过章节视频数
     */
    public void setChapterVideoSeen(Integer chapterVideoSeen) {
        this.chapterVideoSeen = chapterVideoSeen;
    }

    /**
     * 课程分类：1普通,2直播
     * @return course_type 课程分类：1普通,2直播
     */
    public Integer getCourseType() {
        return courseType;
    }

    /**
     * 课程分类：1普通,2直播
     * @param courseType 课程分类：1普通,2直播
     */
    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    /**
     * 视频观看进度
     * @return watch_progress 视频观看进度
     */
    public String getWatchProgress() {
        return watchProgress;
    }

    /**
     * 视频观看进度
     * @param watchProgress 视频观看进度
     */
    public void setWatchProgress(String watchProgress) {
        this.watchProgress = watchProgress == null ? null : watchProgress.trim();
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
        sb.append(", courseId=").append(courseId);
        sb.append(", userNo=").append(userNo);
        sb.append(", chapterVideoTotal=").append(chapterVideoTotal);
        sb.append(", chapterVideoSeen=").append(chapterVideoSeen);
        sb.append(", courseType=").append(courseType);
        sb.append(", watchProgress=").append(watchProgress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}