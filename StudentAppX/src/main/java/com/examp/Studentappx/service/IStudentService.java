package com.examp.Studentappx.service;

import java.util.*;

import com.examp.Studentappx.model.Student;

public interface IStudentService {
Student addStudent(Student student);
List<Student> getStudents();
Student updateStudent(Student student,Long id);
Student getStudentById(Long id);
void deleteStudent(Long id) ;



}
