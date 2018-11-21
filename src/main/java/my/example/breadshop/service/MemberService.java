package my.example.breadshop.service;

import my.example.breadshop.domain.Member;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    public Member getMember(String memberId);
}
