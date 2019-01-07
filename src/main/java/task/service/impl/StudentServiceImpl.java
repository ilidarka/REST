package task.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import task.entity.Student;
import task.repository.StudentRepository;
import task.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public Student read(Long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Student> read() {
		return repository.findAll();
	}

	@Override
	public void save(Student entity) {
		repository.save(entity);
	}

	@Override
	public void delete(Long id) {
		repository.delete(id);
	}

	@Override
	public List<Student> readByGroupId(Long groupId) {
		return repository.findByGroupId(groupId);
	}

	@Override
	public List<Student> readBySurname(String surname) {
		return repository.findBySurname(surname);
	}

}
