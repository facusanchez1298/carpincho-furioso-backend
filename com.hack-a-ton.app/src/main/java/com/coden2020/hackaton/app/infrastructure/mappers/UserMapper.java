package com.coden2020.hackaton.app.infrastructure.mappers;

import com.coden2020.hackaton.app.domain.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserMapper {

  public User map(com.coden2020.hackaton.app.infrastructure.entities.User userRepo){
    User user = new User();
    user.setName(userRepo.getUserName());
    user.setLastName(userRepo.getUserLastName());
    user.setDni(userRepo.getUserDni());
    user.setEmail(userRepo.getUserEmail());
    return user;
  }

  public List<User> map(List<com.coden2020.hackaton.app.infrastructure.entities.User> userRepo){
    List<User> users = new ArrayList<>();
    for (com.coden2020.hackaton.app.infrastructure.entities.User user : userRepo) {
      users.add(map(user));
    }
    return users;
  }
}
