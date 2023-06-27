package com.springrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.entity.Course;

import java.util.ArrayList;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(101, "Core Java", "This course contains basica of java"));
		list.add(new Course(102, "Spring Boot", "Creating Rest API using spring boot"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	
}
