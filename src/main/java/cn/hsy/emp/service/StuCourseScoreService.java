package cn.hsy.emp.service;

import cn.hsy.emp.entities.StuCourseScoreEntity;

import java.util.List;

public interface StuCourseScoreService {
    void addScore(StuCourseScoreEntity stuCourseScoreEntity);

    List<StuCourseScoreEntity> queryScore(String stuName);

    List<StuCourseScoreEntity> getStuName();
}
