package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.entity.Course;
import demo.service.CourseService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {
	@Autowired
	CourseService courseService;

	// Get All Course
	@GetMapping("/courses")
	public List<Course> findAllCourse() {
		return courseService.getAll();
	}

	// Get Course by Id
	@GetMapping("/courses/{id}")
	public Course findById(@PathVariable int id) {
		return courseService.findById(id);
	}

	// Create new course
	@PostMapping("/courses")
	public Course create(@RequestBody Course course) {
		return courseService.create(course);
	}

	// Update course
	@PutMapping("/courses/{id}")
	public Course update(@RequestBody Course course, @PathVariable int id) {
		return courseService.update(course);
	}

	@DeleteMapping("/courses/{id}")
	public void detele(@PathVariable int id) {
		courseService.delete(id);
	}
}