package isi.tn.service;




import java.util.List;
import java.util.Optional;

import isi.tn.entities.Roles;
import isi.tn.entities.User;

public interface IuserService {

	User saveUser(User user);

	List<User> findAllUsers();
	String updateUser(Long id ,User user);
	Optional<User> findUserById(Long id);
	Optional<User> findUserByLogin(String login);
	Optional<User> findUserByEmail(String email);
	List<User> findUserByFname(String fname);
	List<User> findUserByLname(String lname);

	List<User> findUserByRoles(String role);
	String remove(Long id);

}
