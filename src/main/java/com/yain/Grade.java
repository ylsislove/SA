package com.yain;

/**
 * 学生成绩
 *
 * @author Apple_Coco
 * @version V1.0 2019/10/11 0:25
 */
public class Grade {

    private String name;
    private float grade;
    private String level;

    public Grade() {
    }

    public Grade(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
