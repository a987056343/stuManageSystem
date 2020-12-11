package cn.hsy.emp.mapper;

import cn.hsy.emp.entities.CourseEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CourseMapper {
    List<CourseEntity> getAllCourse();

    Integer getCourseCredit(@Param("courseName")String courseName);

}
