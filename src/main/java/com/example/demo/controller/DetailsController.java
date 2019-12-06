package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.ProfessorRepository;
import com.example.demo.repository.StudentRepository;

@RestController
public class DetailsController {

	@Autowired
	ProfessorRepository professorRepository;

	@Autowired
	StudentRepository studentRepository;

	@GetMapping("professor/{id}")
	public Professor getListOfStudents(@PathVariable Integer id) {
		Optional<Professor> findById = professorRepository.findById(id);
		if (findById.isPresent())
			return findById.get();
		return new Professor();
	}

	@GetMapping("student/{id}")
	public Student getProfessor(@PathVariable Integer id) {
		Optional<Student> findById = studentRepository.findById(id);
		if (findById.isPresent())
			return findById.get();
		return new Student();
	}
}
