package task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import task.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {

	Group findByName(String name);

}
