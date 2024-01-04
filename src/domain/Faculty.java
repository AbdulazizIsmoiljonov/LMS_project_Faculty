package domain;

import enums.FacultyEnum;

public class Faculty {
    private static Integer sequence = 0;

    {
        sequence++;
    }

    private Integer FacultyID = sequence;
    private String name;
    private FacultyEnum facultyEnum;
    private Student id;

    public Faculty(String name, FacultyEnum facultyEnum, Student id) {
        this.name = name;
        this.facultyEnum = facultyEnum;
        this.id = id;
    }

    public Integer getFacultyID() {
        return FacultyID;
    }

    public void setFacultyID(Integer facultyID) {
        FacultyID = facultyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FacultyEnum getFacultyEnum() {
        return facultyEnum;
    }

    public void setFacultyEnum(FacultyEnum facultyEnum) {
        this.facultyEnum = facultyEnum;
    }

    @Override
    public String toString() {
        return "Name '" + name + "\'" +
                "Faculty :" + facultyEnum +
                "ID " + id;
    }
}
