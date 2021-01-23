package com.aiolos.news.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "course_chapter_video")
public class CourseChapterVideo implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Long id;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 状态(1:正常，0:禁用)
     */
    @Column(name = "status_id")
    private Integer statusId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 课程ID
     */
    @Column(name = "course_id")
    private Long courseId;

    /**
     * 章节ID
     */
    @Column(name = "chapter_id")
    private Long chapterId;

    /**
     * 章节视频名称
     */
    @Column(name = "chapter_video_name")
    private String chapterVideoName;

    /**
     * 章节视频描述
     */
    @Column(name = "chapter_video_desc")
    private String chapterVideoDesc;

    /**
     * 是否存在视频(1存在，0否)
     */
    @Column(name = "is_video")
    private Integer isVideo;

    /**
     * 视频ID
     */
    @Column(name = "video_id")
    private Long videoId;

    /**
     * 视频名称
     */
    @Column(name = "video_name")
    private String videoName;

    /**
     * 时长
     */
    @Column(name = "video_length")
    private String videoLength;

    /**
     * 视频VID
     */
    @Column(name = "video_vid")
    private String videoVid;

    /**
     * 直播回放url
     */
    private String playback;

    /**
     * 直播结束返回的vid
     */
    @Column(name = "live_vid")
    private String liveVid;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取修改时间
     *
     * @return gmt_modified - 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取状态(1:正常，0:禁用)
     *
     * @return status_id - 状态(1:正常，0:禁用)
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * 设置状态(1:正常，0:禁用)
     *
     * @param statusId 状态(1:正常，0:禁用)
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取课程ID
     *
     * @return course_id - 课程ID
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * 设置课程ID
     *
     * @param courseId 课程ID
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * 获取章节ID
     *
     * @return chapter_id - 章节ID
     */
    public Long getChapterId() {
        return chapterId;
    }

    /**
     * 设置章节ID
     *
     * @param chapterId 章节ID
     */
    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    /**
     * 获取章节视频名称
     *
     * @return chapter_video_name - 章节视频名称
     */
    public String getChapterVideoName() {
        return chapterVideoName;
    }

    /**
     * 设置章节视频名称
     *
     * @param chapterVideoName 章节视频名称
     */
    public void setChapterVideoName(String chapterVideoName) {
        this.chapterVideoName = chapterVideoName == null ? null : chapterVideoName.trim();
    }

    /**
     * 获取章节视频描述
     *
     * @return chapter_video_desc - 章节视频描述
     */
    public String getChapterVideoDesc() {
        return chapterVideoDesc;
    }

    /**
     * 设置章节视频描述
     *
     * @param chapterVideoDesc 章节视频描述
     */
    public void setChapterVideoDesc(String chapterVideoDesc) {
        this.chapterVideoDesc = chapterVideoDesc == null ? null : chapterVideoDesc.trim();
    }

    /**
     * 获取是否存在视频(1存在，0否)
     *
     * @return is_video - 是否存在视频(1存在，0否)
     */
    public Integer getIsVideo() {
        return isVideo;
    }

    /**
     * 设置是否存在视频(1存在，0否)
     *
     * @param isVideo 是否存在视频(1存在，0否)
     */
    public void setIsVideo(Integer isVideo) {
        this.isVideo = isVideo;
    }

    /**
     * 获取视频ID
     *
     * @return video_id - 视频ID
     */
    public Long getVideoId() {
        return videoId;
    }

    /**
     * 设置视频ID
     *
     * @param videoId 视频ID
     */
    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    /**
     * 获取视频名称
     *
     * @return video_name - 视频名称
     */
    public String getVideoName() {
        return videoName;
    }

    /**
     * 设置视频名称
     *
     * @param videoName 视频名称
     */
    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    /**
     * 获取时长
     *
     * @return video_length - 时长
     */
    public String getVideoLength() {
        return videoLength;
    }

    /**
     * 设置时长
     *
     * @param videoLength 时长
     */
    public void setVideoLength(String videoLength) {
        this.videoLength = videoLength == null ? null : videoLength.trim();
    }

    /**
     * 获取视频VID
     *
     * @return video_vid - 视频VID
     */
    public String getVideoVid() {
        return videoVid;
    }

    /**
     * 设置视频VID
     *
     * @param videoVid 视频VID
     */
    public void setVideoVid(String videoVid) {
        this.videoVid = videoVid == null ? null : videoVid.trim();
    }

    /**
     * 获取直播回放url
     *
     * @return playback - 直播回放url
     */
    public String getPlayback() {
        return playback;
    }

    /**
     * 设置直播回放url
     *
     * @param playback 直播回放url
     */
    public void setPlayback(String playback) {
        this.playback = playback == null ? null : playback.trim();
    }

    /**
     * 获取直播结束返回的vid
     *
     * @return live_vid - 直播结束返回的vid
     */
    public String getLiveVid() {
        return liveVid;
    }

    /**
     * 设置直播结束返回的vid
     *
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
        sb.append(", liveVid=").append(liveVid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}