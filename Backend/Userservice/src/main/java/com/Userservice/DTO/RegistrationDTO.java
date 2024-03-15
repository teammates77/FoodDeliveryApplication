package com.Userservice.DTO;

import lombok.Data;

@Data
public class RegistrationDTO {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private Long phonenumber;
	private String password;

}
