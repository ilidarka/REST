package task.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import task.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findByGroupId(Long id);

	List<Student> findBySurname(String name);

}
