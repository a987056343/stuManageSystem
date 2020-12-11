package cn.hsy.emp.service.impl;

import cn.hsy.emp.entities.StuCourseScoreEntity;
import cn.hsy.emp.mapper.CourseMapper;
import cn.hsy.emp.mapper.StuCourseScoreMapper;
import cn.hsy.emp.service.StuCourseScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuCourseScoreServiceImpl implements StuCourseScoreService {

    @Autowired
    private StuCourseScoreMapper stuCourseScoreMapper;
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public void addScore(StuCourseScoreEntity stuCourseScoreEntity) {
        double stuScore = stuCourseScoreEntity.getStuScore();
        double gradePoint = stuScore >= 60 ? (stuScore - 50.0) / 10 : 0.0;
        stuCourseScoreEntity.setGradePoint(gradePoint);
        stuCourseScoreEntity.setCourseCredit(courseMapper.getCourseCredit(stuCourseScoreEntity.getStuCourse()));
        StuCourseScoreEntity stuExists = stuCourseScoreMapper.courseScoreExists(stuCourseScoreEntity);
        if(stuExists==null)
            stuCourseScoreMapper.addScore(stuCourseScoreEntity);
        else
            stuCourseScoreMapper.updateScore(stuCourseScoreEntity);

    }

    @Override
    public List<StuCourseScoreEntity> queryScore(String stuName) {
        return stuCourseScoreMapper.queryScore(stuName);
    }

    @Override
    public List<StuCourseScoreEntity> getStuName() {
        return stuCourseScoreMapper.getStuName();
    }
}
