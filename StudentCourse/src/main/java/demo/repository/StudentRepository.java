package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
