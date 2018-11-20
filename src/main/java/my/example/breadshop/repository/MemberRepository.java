package my.example.breadshop.repository;

import my.example.breadshop.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    @Query("SELECT m FROM Member m JOIN fetch m.roles WHERE m.id = :id ")
    public Member getMember(@Param("id") String memberId);

}
