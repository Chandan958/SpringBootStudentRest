package com.rk.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rk.model.Student;
import com.rk.repo.StudenttRepo;

@RestController
public class StudentController {
	@Autowired
	private StudenttRepo repo;

	@GetMapping(value = "/all")
	public List<Student> getallStudents() {
		return repo.findAll();
	}
	
	

	@PostMapping("/save")
	public String add(@RequestBody Student student) {
		Student insertStudent = repo.save(student);
		return "Studnet save" + insertStudent;
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		repo.deleteById(id);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateStudent(@RequestBody Student student, @PathVariable Integer id) {

		Optional<Student> studentOptional = repo.findById(id);

		if (!studentOptional.isPresent())
			return ResponseEntity.notFound().build();

		student.setsId(id);

		repo.save(student);

		return ResponseEntity.noContent().build();
	}

}
