package task.service;

import java.util.List;

import task.entity.Student;

public interface StudentService extends Service<Student> {

	List<Student> readByGroupId(Long groupId);

	List<Student> readBySurname(String surname);

}
