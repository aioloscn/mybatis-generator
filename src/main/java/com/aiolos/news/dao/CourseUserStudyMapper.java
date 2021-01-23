package com.aiolos.news.dao;

import com.aiolos.news.pojo.CourseUserStudy;
import com.aiolos.news.pojo.CourseUserStudyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseUserStudyMapper {
    long countByExample(CourseUserStudyExample example);

    int deleteByExample(CourseUserStudyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CourseUserStudy record);

    int insertSelective(CourseUserStudy record);

    List<CourseUserStudy> selectByExample(CourseUserStudyExample example);

    CourseUserStudy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CourseUserStudy record, @Param("example") CourseUserStudyExample example);

    int updateByExample(@Param("record") CourseUserStudy record, @Param("example") CourseUserStudyExample example);

    int updateByPrimaryKeySelective(CourseUserStudy record);

    int updateByPrimaryKey(CourseUserStudy record);
}