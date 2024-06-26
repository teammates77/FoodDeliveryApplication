package com.Userservice.DTO;


import com.Userservice.model.Address;

import jakarta.persistence.Embedded;
import lombok.Data;

@Data
public class RegistrationDTO {
	private int userid;
	private String firstName;
	private String lastName;
	private String email;
	private String phNumber;
	private String password;
	@Embedded
	private Address address;
	
	//@CreationTimestamp
    //@Column(name = "created_at", nullable = false, updatable = false)
    //private LocalDateTime created_at;
	
	//@UpdateTimestamp
	//@Column(name = "updated_at")
	//private LocalDateTime updated_at;

}
