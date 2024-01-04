package enums;

public enum FacultyEnum {
    IT_Faculty(1),
    Dentistry_Faculty(2),
    Pharmacy_Faculty(3),
    Law_Faculty(4),
    Medicine_Faculty(5);

    private Integer index = 0;

    FacultyEnum(Integer index) {
        this.index = index;
    }

    public static void showCardType(){
        for (FacultyEnum facultyEnum : FacultyEnum.values()){
            System.out.println(facultyEnum + " : " + facultyEnum.index);
        }
    }

    public static FacultyEnum getByIndex(Integer index){
        for (FacultyEnum facultyEnum : FacultyEnum.values()){
            if (facultyEnum.index.equals(index)){
                return facultyEnum;
            }
        }
        return IT_Faculty;
    }
}
