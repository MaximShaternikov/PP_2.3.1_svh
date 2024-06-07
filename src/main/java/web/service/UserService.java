package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    void delete(long id);

    void update(long id, User user);

    List<User> getAllUsers();

    User getUserById(long id);
}
