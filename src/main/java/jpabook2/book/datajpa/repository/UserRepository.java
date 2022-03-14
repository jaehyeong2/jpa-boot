package jpabook2.book.datajpa.repository;

import jpabook2.book.datajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
