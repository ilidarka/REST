package task.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import task.entity.Group;
import task.repository.GroupRepository;
import task.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupRepository repository;

	@Override
	public Group read(Long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Group> read() {
		return repository.findAll();
	}

	@Override
	public void save(Group entity) {
		repository.save(entity);
	}

	@Override
	public void delete(Long id) {
		repository.delete(id);
	}

	@Override
	public Group readByName(String name) {
		return repository.findByName(name);
	}

}
