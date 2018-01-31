package com.guigu.instructional.po;

public class DisciplineInfo {
    private Integer disciplineId;

    private String disciplineName;

    private Integer disciplineTuition;

    private Integer disciplineBring;

    private String disciplineDesc;

    private String disciplineIsused;

    public Integer getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Integer disciplineId) {
        this.disciplineId = disciplineId;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName == null ? null : disciplineName.trim();
    }

    public Integer getDisciplineTuition() {
        return disciplineTuition;
    }

    public void setDisciplineTuition(Integer disciplineTuition) {
        this.disciplineTuition = disciplineTuition;
    }

    public Integer getDisciplineBring() {
        return disciplineBring;
    }

    public void setDisciplineBring(Integer disciplineBring) {
        this.disciplineBring = disciplineBring;
    }

    public String getDisciplineDesc() {
        return disciplineDesc;
    }

    public void setDisciplineDesc(String disciplineDesc) {
        this.disciplineDesc = disciplineDesc == null ? null : disciplineDesc.trim();
    }

    public String getDisciplineIsused() {
        return disciplineIsused;
    }

    public void setDisciplineIsused(String disciplineIsused) {
        this.disciplineIsused = disciplineIsused == null ? null : disciplineIsused.trim();
    }
}