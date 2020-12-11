package cn.hsy.emp.entities;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @author huangsiyu
 */
@TableName("stu_course_score")
public class StuCourseScoreEntity implements Serializable {

    private static final long serialVersionUID = 421993322L;

    private int stuId;
    private String stuName;
    private String stuGender;
    private String stuMajor;
    private String stuCourse;
    private int stuScore;
    private int courseCredit;
    private double gradePoint;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor;
    }

    public String getStuCourse() {
        return stuCourse;
    }

    public void setStuCourse(String stuCourse) {
        this.stuCourse = stuCourse;
    }

    public int getStuScore() {
        return stuScore;
    }

    public void setStuScore(int stuScore) {
        this.stuScore = stuScore;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public double getGradePoint() {
        return gradePoint;
    }

    public void setGradePoint(double gradePoint) {
        this.gradePoint = gradePoint;
    }

    @Override
    public String toString() {
        return "StuCourseScoreEntity{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuGender='" + stuGender + '\'' +
                ", stuMajor='" + stuMajor + '\'' +
                ", stuCourse='" + stuCourse + '\'' +
                ", stuScore=" + stuScore +
                ", courseCredit=" + courseCredit +
                ", gradePoint=" + gradePoint +
                '}';
    }
}
