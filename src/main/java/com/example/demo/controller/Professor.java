package com.example.demo.controller;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professor {

	private Integer id;

	private String department;

	private String qualification;

	@JsonIgnore
	private Integer salary;

	private List<Student> students;
}
