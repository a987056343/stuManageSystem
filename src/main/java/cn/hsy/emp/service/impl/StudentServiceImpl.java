package cn.hsy.emp.service.impl;

import cn.hsy.emp.entities.StudentEntity;
import cn.hsy.emp.mapper.StudentMapper;
import cn.hsy.emp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<StudentEntity> getAll() {
        List<StudentEntity> stuInfo = studentMapper.getStuInfo();
        return stuInfo;
    }

    @Override
    public StudentEntity getById(Integer id) {
        return studentMapper.getById(id);
    }

    @Override
    public void insertStuInfo(StudentEntity studentEntity) {
        final String gender = studentEntity.getGender();
        studentMapper.insertStudentInfo(studentEntity);
    }

    @Override
    public void updateStuInfo(StudentEntity studentEntity) {
        studentMapper.updateStudentInfo(studentEntity);
    }

    @Override
    public void deleteStuInfo(Integer id) {
        studentMapper.deleteStudentInfo(id);
    }
}
