package com.POC.learnspringboot.courses.controller;

import com.POC.learnspringboot.courses.bean.Course;
import com.POC.learnspringboot.courses.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository repository;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
//        return repository.findAll();
        return List.of(new Course(1, "Learn MicroService", "NVR Sir"), new Course(2, "Learn Django", "Nanda Kishore"));
    }

    @GetMapping("courses/{id}") //to retrieve some info from the DB
    public Course getCourseDetails(@PathVariable long id) {

        Optional<Course> course= repository.findById(id);

        if (course.isEmpty())
            throw new RuntimeException("Course not found with id : " + id);

        return course.get();

    }

    @PostMapping("/courses") //insert new data item in DB
    public void createCourse(@RequestBody Course course) {
        repository.save(course);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable long id) {
        repository.save(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id) {
        repository.deleteById(id);
    }

}
