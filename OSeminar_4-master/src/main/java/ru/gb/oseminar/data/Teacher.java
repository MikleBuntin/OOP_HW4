package ru.gb.oseminar.data;

import java.util.Comparator;

public class Teacher extends User{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, String dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }
    public Teacher(String firstName, String secondName, String patronymic, String dateOfBirth, Long teacherId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }


    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
    public String toString() {
        return "Teacher: " + '\n' + "{" +
                "TeacherId='" + teacherId +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }
}
