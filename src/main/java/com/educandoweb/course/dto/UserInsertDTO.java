package com.educandoweb.course.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.educandoweb.course.entities.User;

public class UserInsertDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	@NotEmpty(message = "can't be empty")
	@Length(min = 5, max = 80, message = "length must be between 5 and 80")
	private String name;
	
	@NotEmpty(message = "can't be empty")
	@Email(message = "invalid email")
	private String email;

	@NotEmpty(message = "can't be empty")
	@Length(min = 8, max = 20, message = "length must be between 5 and 80")
	private String phone;

	@NotEmpty(message = "can't be empty")
	private String password;

	public UserInsertDTO() {
	}

	public UserInsertDTO(Long id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public UserInsertDTO(User entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.phone = entity.getPhone();
		this.password = entity.getPassword();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User toEntity() {
		return new User(id, name, email, phone, password);
	}
}
