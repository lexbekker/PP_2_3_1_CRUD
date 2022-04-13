package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class JpaUserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getAll() {
//        String jpql = "SELECT c FROM User c";
//        TypedQuery<User> query = entityManager.createQuery(jpql, User.class);

        return (List<User>) entityManager.createQuery("FROM User").getResultList();

    }

    @Override
    public User show(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void update(Long id, User updatedUser) {
        updatedUser.setId(id);
        entityManager.merge(updatedUser);

    }

    @Override
    public void delete(Long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }
}
