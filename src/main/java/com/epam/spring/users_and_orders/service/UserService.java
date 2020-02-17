package com.epam.spring.users_and_orders.service;

import com.epam.spring.users_and_orders.model.User;
import com.epam.spring.users_and_orders.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> getAll() {
    return userRepository.getUsers();
  }
}
