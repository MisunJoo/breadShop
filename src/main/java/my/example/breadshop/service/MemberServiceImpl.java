package my.example.breadshop.service;

import my.example.breadshop.domain.Member;
import my.example.breadshop.repository.MemberRepository;

public class MemberServiceImpl implements MemberService{
    @Override
    public Member getMember(String memberId) {
        return MemberRepository.getMember
    }
}
