package com.aiolos.news.dao;

import com.aiolos.news.pojo.CourseChapterVideo;
import com.aiolos.news.pojo.CourseChapterVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseChapterVideoMapper {
    long countByExample(CourseChapterVideoExample example);

    int deleteByExample(CourseChapterVideoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CourseChapterVideo record);

    int insertSelective(CourseChapterVideo record);

    List<CourseChapterVideo> selectByExample(CourseChapterVideoExample example);

    CourseChapterVideo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CourseChapterVideo record, @Param("example") CourseChapterVideoExample example);

    int updateByExample(@Param("record") CourseChapterVideo record, @Param("example") CourseChapterVideoExample example);

    int updateByPrimaryKeySelective(CourseChapterVideo record);

    int updateByPrimaryKey(CourseChapterVideo record);
}