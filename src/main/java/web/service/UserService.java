package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserService {
    private final UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }

    public User findOne(int id) {
        return userDAO.findOne(id);
    }

    @Transactional
    public void save(User user) {
        userDAO.save(user);
    }

    @Transactional
    public void delete(int id) {
        userDAO.deleteById(id);
    }

    @Transactional
    public void update(int id, User user) {
        user.setId(id);
        userDAO.update(user);
    }
}
