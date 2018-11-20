package my.example.breadshop.service;

import my.example.breadshop.domain.Member;
import my.example.breadshop.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberServiceImpl implements MemberService{
    @Autowired
    MemberRepository memberRepository;

    @Override
    public Member getMember(String memberId) {
        return memberRepository.getMember(memberId);
    }
}
