package com.hj.Talktalk.service;

import java.util.ArrayList;
import com.hj.Talktalk.domain.User;
import com.hj.Talktalk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        if(userRepository.findByUsername(user.getUsername()) == null) {
            return userRepository.save(user);
        }
        else {
            throw new RuntimeException("이미 존재하는 회원입니다.");
        }
    }

    public void deleteUser(String userName) {
        User user = userRepository.findByUsername(userName);
        if(user != null) {
            userRepository.delete(user);
        }
        else{
            throw new RuntimeException("회원을 찾지 못하였습니다.");
        }
    }
}
