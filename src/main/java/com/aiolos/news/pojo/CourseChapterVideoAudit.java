package com.aiolos.news.pojo;

import java.io.Serializable;
import java.util.Date;

public class CourseChapterVideoAudit implements Serializable {
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
     * 章节ID
     */
    private Long chapterId;

    /**
     * 章节视频名称
     */
    private String chapterVideoName;

    /**
     * 章节视频描述
     */
    private String chapterVideoDesc;

    /**
     * 是否存在视频(1存在，0否)
     */
    private Integer isVideo;

    /**
     * 视频ID
     */
    private Long videoId;

    /**
     * 视频名称
     */
    private String videoName;

    /**
     * 时长
     */
    private String videoLength;

    /**
     * 视频VID
     */
    private String videoVid;

    /**
     * 直播回放url
     */
    private String playback;

    /**
     * 审核状态(0:待审核;1:审核通过;2:审核不通过)
     */
    private Integer auditStatus;

    /**
     * 审核意见
     */
    private String auditOpinion;

    /**
     * 直播结束返回的vid
     */
    private String liveVid;

    /**
     * course_chapter_video_audit
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
     * 章节ID
     * @return chapter_id 章节ID
     */
    public Long getChapterId() {
        return chapterId;
    }

    /**
     * 章节ID
     * @param chapterId 章节ID
     */
    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    /**
     * 章节视频名称
     * @return chapter_video_name 章节视频名称
     */
    public String getChapterVideoName() {
        return chapterVideoName;
    }

    /**
     * 章节视频名称
     * @param chapterVideoName 章节视频名称
     */
    public void setChapterVideoName(String chapterVideoName) {
        this.chapterVideoName = chapterVideoName == null ? null : chapterVideoName.trim();
    }

    /**
     * 章节视频描述
     * @return chapter_video_desc 章节视频描述
     */
    public String getChapterVideoDesc() {
        return chapterVideoDesc;
    }

    /**
     * 章节视频描述
     * @param chapterVideoDesc 章节视频描述
     */
    public void setChapterVideoDesc(String chapterVideoDesc) {
        this.chapterVideoDesc = chapterVideoDesc == null ? null : chapterVideoDesc.trim();
    }

    /**
     * 是否存在视频(1存在，0否)
     * @return is_video 是否存在视频(1存在，0否)
     */
    public Integer getIsVideo() {
        return isVideo;
    }

    /**
     * 是否存在视频(1存在，0否)
     * @param isVideo 是否存在视频(1存在，0否)
     */
    public void setIsVideo(Integer isVideo) {
        this.isVideo = isVideo;
    }

    /**
     * 视频ID
     * @return video_id 视频ID
     */
    public Long getVideoId() {
        return videoId;
    }

    /**
     * 视频ID
     * @param videoId 视频ID
     */
    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    /**
     * 视频名称
     * @return video_name 视频名称
     */
    public String getVideoName() {
        return videoName;
    }

    /**
     * 视频名称
     * @param videoName 视频名称
     */
    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    /**
     * 时长
     * @return video_length 时长
     */
    public String getVideoLength() {
        return videoLength;
    }

    /**
     * 时长
     * @param videoLength 时长
     */
    public void setVideoLength(String videoLength) {
        this.videoLength = videoLength == null ? null : videoLength.trim();
    }

    /**
     * 视频VID
     * @return video_vid 视频VID
     */
    public String getVideoVid() {
        return videoVid;
    }

    /**
     * 视频VID
     * @param videoVid 视频VID
     */
    public void setVideoVid(String videoVid) {
        this.videoVid = videoVid == null ? null : videoVid.trim();
    }

    /**
     * 直播回放url
     * @return playback 直播回放url
     */
    public String getPlayback() {
        return playback;
    }

    /**
     * 直播回放url
     * @param playback 直播回放url
     */
    public void setPlayback(String playback) {
        this.playback = playback == null ? null : playback.trim();
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
     * 直播结束返回的vid
     * @return live_vid 直播结束返回的vid
     */
    public String getLiveVid() {
        return liveVid;
    }

    /**
     * 直播结束返回的vid
     * @param liveVid 直播结束返回的vid
     */
    public void setLiveVid(String liveVid) {
        this.liveVid = liveVid == null ? null : liveVid.trim();
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
        sb.append(", chapterId=").append(chapterId);
        sb.append(", chapterVideoName=").append(chapterVideoName);
        sb.append(", chapterVideoDesc=").append(chapterVideoDesc);
        sb.append(", isVideo=").append(isVideo);
        sb.append(", videoId=").append(videoId);
        sb.append(", videoName=").append(videoName);
        sb.append(", videoLength=").append(videoLength);
        sb.append(", videoVid=").append(videoVid);
        sb.append(", playback=").append(playback);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", auditOpinion=").append(auditOpinion);
        sb.append(", liveVid=").append(liveVid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}