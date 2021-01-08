package com.example.protobuf.repository;

import com.example.protobuf.protoFile.Training;

import java.util.Map;

public class CourseRepository {

	private final Map<Integer, Training.Course> courses;

	public CourseRepository(Map<Integer, Training.Course> courses) {
		this.courses = courses;
	}

	public Training.Course getCourse(int id) {
		return courses.get(id);
	}
}
