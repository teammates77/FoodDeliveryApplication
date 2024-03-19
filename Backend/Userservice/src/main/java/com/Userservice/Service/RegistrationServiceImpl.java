package com.Userservice.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Userservice.DTO.LoginDTO;
import com.Userservice.DTO.RegistrationDTO;
import com.Userservice.Repository.UserRepo;
import com.Userservice.model.User;

@Service
public class RegistrationServiceImpl implements RegistrationService {
private final UserRepo userRepo;
private final ModelMapper modelMapper;

@Autowired
private EmailService email;
  
	@Autowired
	public RegistrationServiceImpl(UserRepo userRepo, ModelMapper modelMapper) {
		this.userRepo = userRepo;
		this.modelMapper = modelMapper;
		}
	
	@Override
	public RegistrationDTO createUser(RegistrationDTO registrationDTO) {
		if (existsByEmail(registrationDTO.getEmail())) {
			throw new IllegalArgumentException("Email already exists");
		}
		User createdUser = userRepo.save(modelMapper.map(registrationDTO, User.class));
		email.sendSimpleEmail(registrationDTO.getEmail(),
				registrationDTO.getFirstName()  +" Welcome to FoodFun Application as a Valued Customer where Delivery is Pleasure and NEVER HAVE A BAD MEAL.",
				"Registration Successful");
		return modelMapper.map(createdUser, RegistrationDTO.class);
		}
	
	@Override
	public List<RegistrationDTO> getAllUsers(){
		List<User> users = userRepo.findAll();
		return users.stream().map(user -> modelMapper.map(user,RegistrationDTO.class)).collect(Collectors.toList());
	}
	@Override
	public boolean validateLogin(LoginDTO loginRequest) {
		String email = loginRequest.getEmail();
		String password = loginRequest.getPassword();
		User res = userRepo.findByEmail(email);
		return res != null && res.getPassword().equals(password);
	}

	
	/*@Override
	public boolean existsByEmail(String email) {
		return UserRepo.existsByEmail(email);
	}*/

	@Override
	public List<RegistrationDTO> getAllRegistrations() {
		return null;
	}
	@Override
    public boolean existsByEmail(String email) {
        return userRepo.existsByEmail(email);
    }
}



