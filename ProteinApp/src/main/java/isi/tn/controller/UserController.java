package isi.tn.controller;
 
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import isi.tn.entities.Roles;
import isi.tn.entities.User;
import isi.tn.service.IuserService;

@RestController
@RequestMapping("/protein")
public class UserController {
	@Autowired
	IuserService userv;
	
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		List<User> pro = userv.findAllUsers();

        return pro;
	    
	}
	@GetMapping("/user")
	public List<User> getAllUser() {
		List<User> pro = userv.findAllUsers();

        return pro;
	    
	}

	@DeleteMapping("/delete/user/{id}")
public String delete(@PathVariable Long id) {
		String res = userv.remove(id);
		return res;
	}	

	@PostMapping("/addusert")
	public User createUser(@Valid @RequestBody User user) {
	    return userv.saveUser(user);
	}
	@PutMapping("/updateUser/{id}")
	public String updateUser(@PathVariable Long id ,@Valid @RequestBody User user) {
	    return userv.updateUser(id,user);
	}
	@GetMapping("/getclient_id/{id}")
	public Optional<User> getClient_id(@PathVariable Long id) {
		return userv.findUserById(id);
	}
	@GetMapping("/getclient_login/{login}")
	public Optional<User> getClient_login(@PathVariable String login) {
		return userv.findUserByLogin(login);
	}
	@GetMapping("/getclient_email/{email}")
	public Optional<User> getClient_email(@PathVariable String email) {
		return userv.findUserByEmail(email);
	}
	@GetMapping("/getclient_fname/{fname}")
	public List<User> getClient_Firstname(@PathVariable String fname) {
		return userv.findUserByFname(fname);
	}
	@GetMapping("/getclient_lname/{lname}")
	public List<User> getClient_Lastname(@PathVariable String lname) {
		return userv.findUserByLname(lname);
	}
	@GetMapping("/getuser_role/{role}")
	public List<User> getClient_Role(@PathVariable String role) {
		return userv.findUserByRoles(role);
	}

}