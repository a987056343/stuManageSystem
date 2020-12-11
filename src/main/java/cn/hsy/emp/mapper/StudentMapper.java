package cn.hsy.emp.mapper;

import cn.hsy.emp.entities.StudentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author huangsiyu
 */
@Mapper
public interface StudentMapper {

    List<StudentEntity> getStuInfo();

    StudentEntity getById(@Param("id") Integer id);

    void insertStudentInfo(StudentEntity studentEntity);

    void updateStudentInfo(StudentEntity studentEntity);

    void deleteStudentInfo(Integer id);
}
