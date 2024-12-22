package com.springrest.springrestdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrestdata.entities.Course;

public interface CourseDao extends JpaRepository<Course,Long>{

}
