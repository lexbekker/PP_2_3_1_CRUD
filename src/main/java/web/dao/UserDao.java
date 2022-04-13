package web.dao;


import web.model.User;

import java.util.List;

public interface UserDao {

   void save(User user);

   List<User> getAll();

   User show(Long id);

   void update(Long id, User updatedUser);

   void delete(Long id);

}
