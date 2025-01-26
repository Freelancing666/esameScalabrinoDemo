package com.example.primaApp.repositories;

import com.example.primaApp.entity.Professori;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessoriDBRepository extends JpaRepository<Professori,Integer> {
}
