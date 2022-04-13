package web.service;

import web.dao.UserDao;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   @Override
   public void save(User user) {
      userDao.save(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> index() {
      return userDao.getAll();
   }

   @Transactional
   @Override
   public User show(Long id) {
      return userDao.show(id);
   }

   @Transactional
   @Override
   public void update(Long id, User updatedUser) {
      userDao.update(id, updatedUser);
   }

   @Transactional
   @Override
   public void delete(Long id) {
      userDao.delete(id);

   }
}
