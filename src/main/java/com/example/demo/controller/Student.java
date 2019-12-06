package com.example.demo.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	private int id;
	
	private int marks;
	
	@JsonIgnore
	private String address;
	
	private Professor professor;
}
