package springdemo.springdemo.post.repository;

import springdemo.springdemo.post.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long>{
    Optional<Member> findByEmail(String userEmail);
}

