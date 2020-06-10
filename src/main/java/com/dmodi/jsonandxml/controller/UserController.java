package com.dmodi.jsonandxml.controller;

import com.dmodi.jsonandxml.wire.User;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @GetMapping(produces = { "application/json", "application/xml" })
  User getUser() {
    User user = new User(UUID.randomUUID(), "testUser");
    return user;
  }
}
