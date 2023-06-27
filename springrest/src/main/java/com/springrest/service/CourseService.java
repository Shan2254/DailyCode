package com.springrest.service;

import java.util.List;

import com.springrest.entity.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
}
