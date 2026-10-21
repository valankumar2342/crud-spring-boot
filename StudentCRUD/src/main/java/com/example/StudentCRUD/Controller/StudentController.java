package com.example.StudentCRUD.Controller;

import com.example.StudentCRUD.Service.StudentService;
import com.example.StudentCRUD.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("student")
    public List<Student> getStudents()  {
        return studentService.getstudents();
    }
    @GetMapping("student/{rno}")
    public Student getStudentrno (@PathVariable("rno") int rno)  {
        return studentService.getstudentrno(rno);
    }
    @PostMapping("student")
    public String addStudent(@RequestBody Student student)  {
        return "Student added successfully";
    }
    @PutMapping("student")
    public String updateStudent(@RequestBody Student student)  {
        return "Student updated successfully";
    }
}