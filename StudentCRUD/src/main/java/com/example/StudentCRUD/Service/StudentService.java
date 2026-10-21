package com.example.StudentCRUD.Service;

import com.example.StudentCRUD.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Valan","zoology"),
                    new Student(2,"Smart","Botony")
            )
    );

    public List<Student> getstudents() {
        return students;

    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getstudentrno(int rno) {
        for (Student student : students) {
            if (student.getRno() == rno) {
                return student;
            }
        }
        return null;
    }
}
