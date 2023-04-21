package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findOne(long id);
    void save(User user);
    void deleteById(long id);
    void update(long id, User user);
}
