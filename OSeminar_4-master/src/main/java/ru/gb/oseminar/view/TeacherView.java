package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudentGroup;
import ru.gb.oseminar.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher> {
    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teacherList) {
        for (Teacher user : teacherList) {
            logger.info(user.toString());
            System.out.println(user.toString());
        }
    }
}
