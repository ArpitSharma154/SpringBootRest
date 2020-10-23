package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<Course>();
		list.add(new Course(145,"Java Course" , "contains basic of java"));
		list.add(new Course(125,"Pyhon Course" , "contains basic of python"));		
	}
	
	
	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourses(long courseId) {
		Course c = null;
		for (Course course : list) {
			if(course.getId() == courseId)
			{
				c= course;
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
