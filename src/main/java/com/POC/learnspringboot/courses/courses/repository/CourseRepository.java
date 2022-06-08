package com.POC.learnspringboot.courses.courses.repository;

import com.POC.learnspringboot.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
