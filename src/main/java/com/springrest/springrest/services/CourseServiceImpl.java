package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	
	public CourseServiceImpl() {
//		
//		list = new ArrayList<>();
//		list.add(new Course(111,"Java Course","This is java Course"));
//		list.add(new  Course(222,"Spring Course","This is Spring Course"));
//		list.add(new Course(333,"Python Course","This is Python Course"));
	}

	@Override
	public List<Course> getCourses() {
//		return list;
		
		return courseDao.findAll();
	}
	@Override
	public Course getCourse(long courseId) {
		 
//		Course c=null;
//		for(Course course : list)
//		{
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//		}
//		return c;
		
		return courseDao.getOne(courseId);
	}
	
    // add Course
	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}
	
	// update Course
	@Override
	public Course updateCourse(Course course) {
//		
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitel(course.getTitel());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}
    
	
   // Delete Course
	@Override
	public void deleteCourse(long parseLong) {
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	   Course entity = courseDao.getOne(parseLong);
	   courseDao.delete(entity);
	}

}
	

