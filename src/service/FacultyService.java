package service;

import domain.Faculty;

import java.util.ArrayList;
import java.util.List;

public interface FacultyService {
    List<Faculty> FACULTIES = new ArrayList<>();

    void addFaculty(Faculty faculty);
    void showFaculty(Integer id);
    void deleteFaculty(Faculty faculty);
}
