package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{

    private final List<Teacher> teacherList;

    public TeacherService() {
        this.teacherList = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher: teacherList){
            if (teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teacherList.add(teacher);
    }
}
