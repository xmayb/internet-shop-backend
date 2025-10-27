package com.example.demo.Service;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired private UserRepository repo;

    public void register(UserDTO dto) {
        User user = new User();
        user.setEmail(dto.getEmail());
        user.setPassword(hash(dto.getPassword()));
        repo.save(user);
    }
}
