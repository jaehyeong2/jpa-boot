package jpabook2.book.datajpa.repository;

import jpabook2.book.datajpa.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class UserJpaRepository {

    @PersistenceContext
    private EntityManager em;

    public User save(User user) {
        em.persist(user);
        return user;
    }

    public void delete(User user) {
        em.remove(user);
    }

    public User find(Long id) {
        return em.find(User.class, id);
    }

    public Optional<User> findById(Long userId) {
        User findUser = em.find(User.class, userId);
        return Optional.ofNullable(findUser);
    }

    public long count() {
        return em.createQuery("select count(u) from User u", Long.class)
                .getSingleResult();
    }

    public List<User> findAll() {
        return em.createQuery("select u from User u", User.class)
                .getResultList();
    }
}
