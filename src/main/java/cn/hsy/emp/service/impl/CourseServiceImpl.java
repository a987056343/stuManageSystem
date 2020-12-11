package cn.hsy.emp.service.impl;

import cn.hsy.emp.entities.CourseEntity;
import cn.hsy.emp.mapper.CourseMapper;
import cn.hsy.emp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<CourseEntity> getCourseName() {
        return courseMapper.getAllCourse();
    }
}
