package com.example.primaApp.repositories;

import com.example.primaApp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDBRepository extends JpaRepository<Student, Integer> {
}
