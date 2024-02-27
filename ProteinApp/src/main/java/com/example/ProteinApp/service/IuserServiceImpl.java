package com.example.ProteinApp.service;

import com.example.ProteinApp.entities.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.ProteinApp.enumerations.Roles;
import com.example.ProteinApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IuserServiceImpl implements IuserService {

    @Autowired
    UserRepository urepos;

    @Override
    public User saveUser(User user) {
        // TODO Auto-generated method stub
        return urepos.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        // TODO Auto-generated method stub
        return urepos.findAll();
    }

    @Override
    public String remove(Long id) {
        urepos.deleteById(id);
        return "deleted";
    }
    @Override
    public String updateUser(Long id ,User user) {
        User updatedUser = urepos.findById(id).get();
        updatedUser.setEmail(user.getEmail());
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setLogin(user.getLogin());
        updatedUser.setPassword(user.getPassword());
        urepos.save(updatedUser);
        return "Updated";
    }
    @Override
    public Optional<User> findUserById(Long id) {
        return urepos.findById(id);
    }

    @Override
    public Optional<User> findUserByLogin(String login) {
        List<User> users = urepos.findAll();
        User result = null;

        for (User user : users) {
            if (user.getLogin().equals(login)) {
                result = user;
                break;
            }
        }

        return Optional.ofNullable(result);
    }
    @Override
    public Optional<User> findUserByEmail(String email) {
        List<User> users = urepos.findAll();
        User result = null;

        for (User user : users) {
            if (user.getEmail().equals(email)) {
                result = user;
                break;
            }
        }

        return Optional.ofNullable(result);
    }


    @Override
    public List<User> findUserByFname(String fname) {
        List<User> users = urepos.findAll();
        List<User> result = new ArrayList<>();

        for (User user : users) {
            if (user.getFirstName().equals(fname)) {
                result.add(user);
            }
        }

        return result;
    }
    @Override
    public List<User> findUserByLname(String lname) {
        List<User> users = urepos.findAll();
        List<User> result = new ArrayList<>();

        for (User user : users) {
            if (user.getLastName().equals(lname)) {
                result.add(user);
            }
        }

        return result;
    }
    @Override
    public List<User> findUserByName(String firstName, String lastName) {
        List<User> users = urepos.findAll();
        List<User> result = new ArrayList<>();

        for (User user : users) {
            if (user.getLastName().equals(lastName) && user.getFirstName().equals(firstName)) {
                result.add(user);
            }
        }

        return result;
    }
    @Override
    public List<User> findUserByRoles(String role) {
        List<User> users = urepos.findAll();
        List<User> result = new ArrayList<>();

        for (User user : users) {
            if (user.getRole() == Roles.valueOf(role)) {
                result.add(user);
            }
        }

        return result;
    }

}
