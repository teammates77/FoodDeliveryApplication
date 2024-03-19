package com.app.entity;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


 
@Entity
@Table(name = "merchants")
public class Merchant {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "First name is required")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    @Column(name = "first_name")
    private String firstName;
 
    @NotBlank(message = "Last name is required")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
    @Column(name = "last_name")
    private String lastName;
 
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Column(unique = true)
    private String email;
    
    @NotBlank(message = "Password is required")
    @Size( max = 6, message = "Password must be 6 characters")
    @Column(name = "password")
    private String password;
 
    @NotBlank(message = "Mobile number is required")
    @Size( max = 10, message = "mobile number must be 10 digits")
    
    @Pattern(regexp = "\\d+", message = "Mobile number must contain only numeric characters")
    @Column(name = "mobile_number")
    private String mobileNumber;
 
	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
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
 
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}
 
	public String getMobileNumber() {
		return mobileNumber;
	}
 
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
 
	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	@Override
	public String toString() {
		return "Merchant [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", mobileNumber=" + mobileNumber + "]";
	}
 
    // Getters and setters, constructor, and toString method
    
}



