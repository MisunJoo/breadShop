package my.example.breadshop.security;


import my.example.breadshop.domain.Member;
import my.example.breadshop.domain.Role;
import my.example.breadshop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class BreadshopUserDetailsService implements UserDetailsService {
    @Autowired
    MemberService memberService;

    public UserDetails loadUserByUsername(String memberId) throws UsernameNotFoundException {
        Member member = memberService.getMember(memberId);
        if (member == null)
            throw new UsernameNotFoundException(memberId + "is not found");

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        for(Role role : member.getRoles()){
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
        }

        UserDetails userDetails = new User(memberId, member.getPassword(), authorities);

        return userDetails;
    }

}
