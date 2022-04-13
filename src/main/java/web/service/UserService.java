package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void save(User user);

    List<User> index();

    User show(Long id);

    void update(Long id, User updatedUser);

    void delete(Long id);
}
