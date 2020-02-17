package com.epam.spring.users_and_orders.controller;

import com.epam.spring.users_and_orders.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  public UserController(final UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/model")
  public String getAllUsers(final Model model) {

    model.addAttribute("users", userService.getAll());

    return "user-page";
  }
}
