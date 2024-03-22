package com.Userservice.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.Userservice.DTO.LoginDTO;
import com.Userservice.DTO.RegistrationDTO;
import com.Userservice.Repository.UserRepo;
import com.Userservice.model.User;

@Service
public class RegistrationServiceImpl implements RegistrationService {
private final UserRepo userRepo;
private final ModelMapper modelMapper;
private final BCryptPasswordEncoder passwordEncoder;

@Autowired
private EmailService email;
  
	@Autowired
	public RegistrationServiceImpl(UserRepo userRepo, ModelMapper modelMapper, BCryptPasswordEncoder passwordEncoder) {
		this.userRepo = userRepo;
		this.modelMapper = modelMapper;
		this.passwordEncoder = passwordEncoder;
		
		}
	
	@Override
	public RegistrationDTO createUser(RegistrationDTO registrationDTO) {
		if (existsByEmail(registrationDTO.getEmail())) {
			throw new IllegalArgumentException("Email already exists");
		}
		registrationDTO.setPassword(passwordEncoder.encode(registrationDTO.getPassword()));
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
		User user = userRepo.findByEmail(email);
		//return res != null && res.getPassword().equals(password);
		if (user != null) {
            // Compare the entered password with the stored encrypted password using BCrypt
            return passwordEncoder.matches(password, user.getPassword());
        } else {
            // User with the provided email doesn't exist
            return false;
        }
	}

	@Override
	public List<RegistrationDTO> getAllRegistrations() {
		return null;
	}
	@Override
    public boolean existsByEmail(String email) {
        return userRepo.existsByEmail(email);
    }
}



