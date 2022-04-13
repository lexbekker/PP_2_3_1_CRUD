package web.dao;

import org.hibernate.Session;
import web.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

//@Repository
public class HibernateUserDaoImpl implements UserDao {

   private final SessionFactory sessionFactory;

   @Autowired
   public HibernateUserDaoImpl(SessionFactory sessionFactory) {
      this.sessionFactory = sessionFactory;
   }


   @Override
   public void save(User user) {
      sessionFactory.getCurrentSession().save(user);
   }

   @Override
   public List<User> getAll() {
      TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }

   @Override
   public User show(Long id) {
      Query query = sessionFactory.getCurrentSession().createQuery("FROM User where id = :id");
      query.setParameter("id", id);
      return (User) query.getSingleResult();
   }

   @Override
   public void update(Long id, User updatedUser) {
      updatedUser.setId(id);
      sessionFactory.getCurrentSession().saveOrUpdate(updatedUser);
   }

   @Override
   public void delete(Long id) {
      Query query =sessionFactory.getCurrentSession().createQuery("delete User Where id = :id");
      query.setParameter("id", id);
      int rows = query.executeUpdate();
   }
}
