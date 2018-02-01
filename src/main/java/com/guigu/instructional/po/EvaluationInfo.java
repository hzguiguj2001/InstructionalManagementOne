package com.guigu.instructional.po;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

public class EvaluationInfo {
    private Integer evaluationId;

    private Integer studentId;

    private Integer staffId;

    private Integer disciplineId;

    @NotEmpty(message="{student.evaluation.evaluationTile.isEmpyt}")
    private String evaluationTile;

    private String evaluationContent;

    private Date evaluationTime;

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Integer disciplineId) {
        this.disciplineId = disciplineId;
    }

    public String getEvaluationTile() {
        return evaluationTile;
    }

    public void setEvaluationTile(String evaluationTile) {
        this.evaluationTile = evaluationTile == null ? null : evaluationTile.trim();
    }

    public String getEvaluationContent() {
        return evaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        this.evaluationContent = evaluationContent == null ? null : evaluationContent.trim();
    }

    public Date getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }
}