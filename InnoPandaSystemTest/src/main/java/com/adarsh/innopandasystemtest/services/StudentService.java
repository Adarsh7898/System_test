package com.adarsh.innopandasystemtest.services;

import com.adarsh.innopandasystemtest.entities.Student;
import com.adarsh.innopandasystemtest.respositories.StudentRepository;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student postStudent(Student student) {
      return   studentRepository.save(student);
    }


    public @Nullable List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    public @Nullable Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(()->new RuntimeException("Couldn't find a student with this id"));
    }


    public Student updateStudentById(Long id, Student student) {
        Student foundStudent = getStudentById(id);
        foundStudent.setName(student.getName());
        foundStudent.setEmail(student.getEmail());
        foundStudent.setAge(student.getAge());
        foundStudent.setClassName(student.getClassName());
        return studentRepository.save(foundStudent);
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }


    public @Nullable List<Student> searchByName(String name) {
       return studentRepository.findByName(name);
    }
}
