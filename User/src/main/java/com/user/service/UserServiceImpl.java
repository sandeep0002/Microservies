package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

   // private Long userId;
    List<User> list  = List.of(
          new User(1311L, "sandeep","89377"),
          new User(1312L, "aman","89277"),
          new User(1314L, "Rahul","8977")
    );


    @Override
    public User getUser(Long id)
    {
        return list.stream().filter(user -> user.getUserId().equals(id )).findAny().orElse(null);
    }
}
