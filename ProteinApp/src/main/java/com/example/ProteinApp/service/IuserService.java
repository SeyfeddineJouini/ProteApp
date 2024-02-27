package com.example.ProteinApp.service;

import com.example.ProteinApp.entities.User;
import java.util.List;
import java.util.Optional;

public interface IuserService {

    User saveUser(User user);
    List<User> findAllUsers();
    String updateUser(Long id ,User user);
    Optional<User> findUserById(Long id);
    Optional<User> findUserByLogin(String login);
    Optional<User> findUserByEmail(String email);
    List<User> findUserByFname(String fname);
    List<User> findUserByLname(String lname);
    List<User> findUserByName(String lastName,String firstname);
    List<User> findUserByRoles(String role);
    String remove(Long id);

}