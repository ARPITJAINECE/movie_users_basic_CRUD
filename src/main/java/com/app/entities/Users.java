package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/*
 * id - primary key
firstName - user first name
lastName - user last name
email - user email ID
 */
@Entity
@Table(name = "users_movie")
public class Users extends BaseEntity {
	@Column(name = "first_name", length = 20)
	private String firstName;
	@Column(name = "last_name", length = 20)
	private String lastName;
	@Column(length = 30, nullable = false, unique = true)
	private String email;

	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Users [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
