package com.hj.Talktalk.service;
import com.hj.Talktalk.domain.User;
import com.hj.Talktalk.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testRegisterUser() {
        User user = new User();
        user.setUsername("t4");
        user.setPassword("password");

        User user1 = new User();
        user1.setUsername("t5");
        user1.setPassword("password");

        // db 반영
        User registeredUser = userService.registerUser(user);
        User r2 = userService.registerUser(user1);

        // 테스트 검증 로직
        // assertNotNull(registeredUser.getId());
    }

    @Test
    public void testWithdrawUser(){
        //userService.deleteUser("testUser");
        userService.deleteUser("t3");
    }
}
