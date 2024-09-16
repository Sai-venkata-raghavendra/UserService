package com.example.UserServices.serviceLayer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserServices.entity.UserDetails;
import com.example.UserServices.repository.UserRepository;

@Service
public class UserService implements UserServiceRepository{

	
	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails saveUsers(UserDetails userDetails) {
		
		String usri = UUID.randomUUID().toString();
		
		userDetails.setUserId(usri);
		return userRepository.save(userDetails);
	}
	
	public List<UserDetails> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public UserDetails getDetails(String userid) {
		
		return userRepository.findById(userid).orElseThrow(null);
	}	
}
