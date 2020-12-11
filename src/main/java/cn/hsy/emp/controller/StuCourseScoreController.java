package cn.hsy.emp.controller;

import cn.hsy.emp.entities.StuCourseScoreEntity;
import cn.hsy.emp.entities.StudentEntity;
import cn.hsy.emp.service.StuCourseScoreService;
import cn.hsy.emp.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;


@Controller
public class StuCourseScoreController {
    private final Logger logger = LoggerFactory.getLogger(StuCourseScoreController.class);

    @Autowired
    StuCourseScoreService stuCourseScoreService;
    @Autowired
    StudentService studentService;

    @PostMapping("/score/{id}")
    public String submitScore(@PathVariable("id")Integer id, StuCourseScoreEntity stuCourseScoreEntity) {
        StudentEntity stu = studentService.getById(id);
        stuCourseScoreEntity.setStuId(stu.getId());
        stuCourseScoreEntity.setStuName(stu.getName());
        stuCourseScoreEntity.setStuGender(stu.getGender());
        stuCourseScoreEntity.setStuMajor(stu.getMajor());
        stuCourseScoreService.addScore(stuCourseScoreEntity);
        logger.info(stuCourseScoreEntity.getStuCourse()+stuCourseScoreEntity.getStuScore());
        return "redirect:/students";
    }

    @GetMapping("/query")
    public String query(Model model) {
        logger.info("正在执行query请求");
        List<StuCourseScoreEntity> stuName = stuCourseScoreService.getStuName();
        model.addAttribute("queryList",stuName);
        return "emp/query";
    }

    @PostMapping("/query/{stuName}")
    public String queryScore(@PathVariable("stuName")String stuName, StuCourseScoreEntity stuCourseScoreEntity, Model model){
        logger.info("正在查询学生成绩!");
        logger.info(stuName);
        List<StuCourseScoreEntity> stuCourseScore = stuCourseScoreService.queryScore(stuName);
        model.addAttribute("courSc",stuCourseScore);
        List<StuCourseScoreEntity> stuName1 = stuCourseScoreService.getStuName();
        model.addAttribute("queryList",stuName1);
        return "emp/query";
    }
}
