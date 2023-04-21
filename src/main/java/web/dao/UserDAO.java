package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> findAll();
    User findOne(long id);
    void save(User user);
    void deleteById(long id);
    void update(User user);
}
