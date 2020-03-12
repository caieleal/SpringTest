package com.example.springtest.service;

import com.example.springtest.entities.User;
import com.example.springtest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User findById(Long id){
       Optional<User> user = userRepository.findById(id);
        return user.get();
    }
    public User delete(Long id){
        Optional<User> userDelete = userRepository.findById(id);
      if(userDelete.isPresent()){
          userRepository.delete(userDelete.get());
      }
        return userDelete.get();

    }
}
