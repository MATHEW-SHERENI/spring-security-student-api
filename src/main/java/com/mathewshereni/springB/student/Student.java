package com.mathewshereni.springB.student;

public class Student {
    public final Integer StudentId;
    public final String StudentName;

    public Student(Integer studentId, String studentName) {
        StudentId = studentId;
        StudentName = studentName;

    }

    public Integer getStudentId() {
        return StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }
}
