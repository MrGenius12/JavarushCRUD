package serikov.userManager.dao;

import serikov.userManager.domain.User;

import java.util.List;

public interface UserDAO {

    void addUser(User user);

    List<User> listUser();

    void removeUser(Integer id);
}