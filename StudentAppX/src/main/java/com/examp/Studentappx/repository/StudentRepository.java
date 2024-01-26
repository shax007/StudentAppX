package com.examp.Studentappx.repository;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

import com.examp.Studentappx.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

	Optional<Student> findByEmail(String email);

}
