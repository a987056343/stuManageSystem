package cn.hsy.emp.service;

import cn.hsy.emp.entities.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> getAll();

    StudentEntity getById(Integer id);

    void insertStuInfo(StudentEntity studentEntity);

    void updateStuInfo(StudentEntity studentEntity);

    void deleteStuInfo(Integer id);
}
