package com.example.UserServices.serviceLayer;

import java.util.List;
import java.util.Optional;

import com.example.UserServices.entity.UserDetails;

public interface UserServiceRepository {

	public UserDetails saveUsers(UserDetails userDetails);
	public List<UserDetails> getAllUser();
	
	public UserDetails getDetails(String userid);

}
