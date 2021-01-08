package com.example.protobuf.controller;

import com.example.protobuf.protoFile.Training.Course;
import com.example.protobuf.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CourseController {

	@Autowired
	CourseRepository courseRepository;

	@RequestMapping("/courses/{id}")
	Course customer(@PathVariable Integer id) {
		return courseRepository.getCourse(id);
	}
}
