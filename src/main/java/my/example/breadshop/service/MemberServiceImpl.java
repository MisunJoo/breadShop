package my.example.breadshop.service;

import my.example.breadshop.domain.Member;
import my.example.breadshop.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//Impl에 @Repository 잊지말기!
@Repository
public class MemberServiceImpl implements MemberService{
    @Autowired
    MemberRepository memberRepository;

    @Override
    public Member getMember(String memberId) {
        return memberRepository.getMember(memberId);
    }
}
