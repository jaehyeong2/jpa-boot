package jpabook2.book;

import jpabook2.book.datajpa.entity.Team;
import jpabook2.book.datajpa.entity.User;
import jpabook2.book.datajpa.repository.UserJpaRepository;
import jpabook2.book.datajpa.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class RepositoryTest {

    @Autowired
    UserJpaRepository jpaRepository;

    @Autowired
    UserRepository dataJpaRepository;

    @Test
    @Transactional
    void saveTest(){
        Team team = new Team("teamA");

        User user = new User("lee",17,team);
        User saveUser = jpaRepository.save(user);
        User findUser = jpaRepository.find(saveUser.getId());

        Assertions.assertThat(findUser.getId()).isEqualTo(user.getId());
    }

    @Test
    void dataJpaSaveTest(){
        Team team = new Team("teamA");

        User user = new User("lee",17,team);
        User saveUser = dataJpaRepository.save(user);
        User findUser = dataJpaRepository.findById(saveUser.getId()).get();

        Assertions.assertThat(findUser.getId()).isEqualTo(user.getId());
    }
}
