package isi.tn.entities;

import java.io.Serializable; 
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import isi.tn.enumerations.Roles;

@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private Long id;
	private String email;
	private String login;
	private String password;
	private String firstName;
	private String lastName;
	private Roles role;

	public User() {
		super();
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Long getId() {
		return id;
	}

	public User(Long id, String email, String login, String password, String fname, String lname, Roles role) {
		super();
		this.id = id;
		this.email = email;
		this.login = login;
		this.password = password;
		this.firstName = fname;
		this.lastName = lname;
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Roles getRole() {
		return role;
	}


	public void setRole(Roles role) {
		this.role = role;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
