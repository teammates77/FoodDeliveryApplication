package com.Userservice.DTO;
import java.util.List;

import com.Userservice.model.Address;

import jakarta.persistence.Embedded;
import lombok.Data;
@Data
public class LoginResponseDTO {


	private int userid;
	private String firstName;
	private String lastName;
	private String email;
	private String phNumber;
	@Embedded
	private Address address;
}