package task.service;

import task.entity.Group;

public interface GroupService extends Service<Group> {

	Group readByName(String name);

}
