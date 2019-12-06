package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>{

}
