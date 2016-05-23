package serikov.userManager.service;

import serikov.userManager.domain.User;

import java.util.List;

public interface UserService {

	void addUser(User user);

	List<User> listUser();

	void removeUser(Integer id);
}
