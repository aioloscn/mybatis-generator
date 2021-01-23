package com.aiolos.news.dao;

import com.aiolos.news.pojo.CourseChapterVideoAudit;
import com.aiolos.news.pojo.CourseChapterVideoAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseChapterVideoAuditMapper {
    long countByExample(CourseChapterVideoAuditExample example);

    int deleteByExample(CourseChapterVideoAuditExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CourseChapterVideoAudit record);

    int insertSelective(CourseChapterVideoAudit record);

    List<CourseChapterVideoAudit> selectByExample(CourseChapterVideoAuditExample example);

    CourseChapterVideoAudit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CourseChapterVideoAudit record, @Param("example") CourseChapterVideoAuditExample example);

    int updateByExample(@Param("record") CourseChapterVideoAudit record, @Param("example") CourseChapterVideoAuditExample example);

    int updateByPrimaryKeySelective(CourseChapterVideoAudit record);

    int updateByPrimaryKey(CourseChapterVideoAudit record);
}