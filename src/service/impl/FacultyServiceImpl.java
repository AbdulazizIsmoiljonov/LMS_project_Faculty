package service.impl;

import domain.Faculty;
import service.FacultyService;

public class FacultyServiceImpl implements FacultyService {
    @Override
    public void addFaculty(Faculty faculty) {
        FACULTIES.add(faculty);
        System.out.print("Faculty added successfully !");
    }

    @Override
    public void showFaculty(Integer id) {
        for (Faculty faculty : FACULTIES){
            if (faculty.getFacultyID().equals(id)){
                System.out.println(faculty);
            }
        }
    }

    @Override
    public void deleteFaculty(Faculty faculty) {
        FACULTIES.remove(faculty);
        System.out.println("Faculty deleted successfully !");
    }
}
