package PooDojo.heritage;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class Teacher extends Person {

    private List<Student> students;

    public Teacher(String nom, int age, String genre) {
        super(nom, age, genre);
        this.students = new ArrayList<>();
    }

    public Teacher(String nom, int age, String genre, List<Student> students) {
        super(nom, age, genre);
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean isTeacherOf(Student student){
        return students.contains(student);
    }
}
