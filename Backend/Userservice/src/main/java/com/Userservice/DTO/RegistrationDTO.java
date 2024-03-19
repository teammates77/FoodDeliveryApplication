package com.Userservice.DTO;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class RegistrationDTO {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	//@Pattern(regexp = "(^$|[0-9]{10})", message="phonenumber must contain 10 digits")
	private String phNumber;
	//@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%^&*()_+])[A-Za-z\\d!@#$%^&*()_+]{8,}$", message="password should contain min 8 characters with alphabets,numeric and special character ")
	private String password;
	
	@CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime created_at;
	
	@UpdateTimestamp
	@Column(name = "updated_at")
	private LocalDateTime updated_at;

}
