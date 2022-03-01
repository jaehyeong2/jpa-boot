package jpabook2.book.repository;

import jpabook2.book.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public void save(Member member){
        em.persist(member);
    }

    public Member findById(Long memberId){
        return em.find(Member.class,memberId);
    }

    public List<Member> findAll(){
        return em.createQuery("select m from Member m",Member.class)
                .getResultList();
    }

    public List<Member> findByName(String memberName){
        return em.createQuery("select m from Member m where m.name = :memberName",Member.class)
                .setParameter("memberName",memberName)
                .getResultList();

    }
}
