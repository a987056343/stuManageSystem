package cn.hsy.emp.controller;

import cn.hsy.emp.entities.CourseEntity;
import cn.hsy.emp.entities.StudentEntity;
import cn.hsy.emp.service.CourseService;
import cn.hsy.emp.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Controller
public class StudentController {
    private final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    StudentService studentService;
    @Autowired
    CourseService courseService;

    @GetMapping("/students")
    public String list(Model model){
        logger.info("正在执行students请求");
        List<StudentEntity> stu = studentService.getAll();
        model.addAttribute("students",stu);
        return "emp/list";
    }

    @GetMapping("/addStu")
    public String toAddPage(){
        return "emp/add";
    }

    @GetMapping("/students/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model){
        StudentEntity stu = studentService.getById(id);
        model.addAttribute("stu",stu);
        return "emp/add";
    }

    @PostMapping("/students")
    public String addStu(StudentEntity studentEntity){
        studentService.insertStuInfo(studentEntity);
        return "redirect:/students";
    }

    @PutMapping("/students")
    public String updateStuInfo(StudentEntity studentEntity){
        studentService.updateStuInfo(studentEntity);
        return "redirect:/students";
    }

    @PostMapping("/students/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        studentService.deleteStuInfo(id);
        return "redirect:/students";
    }

    @GetMapping("/scores/{id}")
    public String toAddScore(@PathVariable("id") Integer id, Model model){
        StudentEntity stu = studentService.getById(id);
        List<CourseEntity> cour = courseService.getCourseName();
        model.addAttribute("stu",stu);
        model.addAttribute("cour",cour);
        return "emp/score";
    }
}
