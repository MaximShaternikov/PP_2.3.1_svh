package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    void delete(long id);

    void update(User user);

    List<User> getAllUsers();

    User getUserById(long id);
}
