package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class UserService {

//    private final TestRepository testRepository;
    @Autowired
    private TestRepository testRepository;


    public void save(final User user) {
        testRepository.save(user);
//        userRepository.save(user);
//        userRepository.findById(user.getId());
    }

}
