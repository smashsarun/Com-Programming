/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author INT105
 */
//serializable is a markable interface
public class StudentGrade implements Serializable {

    private String subject;
    private String grade;
    private transient float credit;

    public StudentGrade() {
    }

    public StudentGrade(String subject, String grade, float credit) {
        this.subject = subject;
        this.grade = grade;
        this.credit = credit;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "StudentGrade{" + "subject=" + subject + ", grade=" + grade + ", credit=" + credit + '}';
    }

}
