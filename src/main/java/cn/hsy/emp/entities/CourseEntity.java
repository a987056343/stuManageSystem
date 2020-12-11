package cn.hsy.emp.entities;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("course")
public class CourseEntity implements Serializable {

    private static final long serialVersionUID = 9012390221L;

    private String courseId;
    private String courseName;
    private int courseCredit;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    @Override
    public String toString() {
        return "CourseEntity{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseCredit=" + courseCredit +
                '}';
    }
}
