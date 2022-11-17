package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);   //Optional: 찾는 값이 없으면 null인데 Optional로 감싸서 반환해주는 것
    List<Member> findAll();

}
