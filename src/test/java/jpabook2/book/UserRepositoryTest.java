package jpabook2.book;


import jpabook2.book.datajpa.entity.Team;
import jpabook2.book.datajpa.entity.User;
import jpabook2.book.datajpa.repository.UserRepository;
import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Optional;
//
//@SpringBootTest
//@Transactional
//public class UserRepositoryTest {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Test
//    void testUser(){
//        Team team = new Team();
//        User user = new User("재형",21,team);
//        User savedUser = userRepository.save(user);
//
//        Optional<User> byId = userRepository.findById(savedUser.getId());
//        User findUser = byId.get();
//
//        Assertions.assertThat(findUser.getId()).isEqualTo(user.getId());
//
//    }
//}
