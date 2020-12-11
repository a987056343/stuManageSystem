package cn.hsy.emp.mapper;

import cn.hsy.emp.entities.StuCourseScoreEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StuCourseScoreMapper {
    void addScore(StuCourseScoreEntity stuCourseScoreEntity);

    List<StuCourseScoreEntity> queryScore(@Param("stuName")String stuName);

    List<StuCourseScoreEntity> getStuName();

    StuCourseScoreEntity courseScoreExists(StuCourseScoreEntity stuCourseScoreEntity);

    void updateScore(StuCourseScoreEntity stuCourseScoreEntity);
}
