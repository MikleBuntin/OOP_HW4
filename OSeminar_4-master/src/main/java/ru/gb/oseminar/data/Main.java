package ru.gb.oseminar.data;

import ru.gb.oseminar.view.StudentView;
import ru.gb.oseminar.view.TeacherView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teat1 = new Teacher("Teacher1-1", "Teacher1-2", "Teacher1-3", "date1");
        Teacher teat2 = new Teacher("Teacher2-1", "Teacher2-2", "Teacher2-3", "date2");
        UserComparator<Teacher> comp = new UserComparator<>();
        System.out.println(comp.compare(teat1, teat2));

        StudentView studentView1 = new StudentView();
        studentView1.sendOnConsole(List.of(new Student("St1", "st2", "st3", "12345")));

        TeacherView teacherView1 = new TeacherView();
        teacherView1.sendOnConsole(List.of(new Teacher("St1", "st2", "st3", "12345")));
    }
}