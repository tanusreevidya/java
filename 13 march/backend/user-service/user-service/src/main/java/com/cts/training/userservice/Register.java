package com.cts.training.userservice;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "register_table")
@XmlRootElement(name="reg")
public class Register implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String email;
	private long phone;
	private String password;
	private String userType = "ROLE_USER";
//	@Transient
//	private String regStatus; 
	private boolean active= false;
	
	
	@Override
	public String toString() {
		return "Register [id=" + id + ", username=" + username + ", email=" + email + ", phone=" + phone + ", password="
				+ password + "]";
	}



	public Register() {		
	}	

    

	public Register(int id, String username, String email, long phone, String password, String userType,
			boolean active) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.userType = userType;
		this.active = active;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}



	public String getUserType() {
		return userType;
	}



	public void setUserType(String userType) {
		this.userType = userType;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}

     

}
