package my.example.breadshop.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncodeTest {
    private PasswordEncoder passwordEncoder;

    @Test
    public void passwordEncoderTest() throws Exception{
        passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        String encode = passwordEncoder.encode("1234");
        System.out.println(encode);

        //{bcrypt}$2a$10$VN7c3s7EevNi/FlXJcQ2GOiPKL7g6UGkjJT7W/AnkmtJXWSCrJi.C
        //{bcrypt}$2a$10$zPMvOYErmuRa0vYLz3V0u.lkf35ViH5yyQtN4Lm6dgT4O8zGWR4Ki
        //{bcrypt}$2a$10$9m8jlI2i3hV3itZGoI4KJexA038OblQA85f4ztkdCeTxKG5qWqCie

        boolean matches = passwordEncoder.matches("1234","{bcrypt}$2a$10$9m8jlI2i3hV3itZGoI4KJexA038OblQA85f4ztkdCeTxKG5qWqCie");
        Assert.assertTrue(matches);
    }
}
