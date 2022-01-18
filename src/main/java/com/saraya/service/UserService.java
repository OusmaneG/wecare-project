package com.saraya.service;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.saraya.dto.UserDto;
import com.saraya.entity.User;

@Service
public interface UserService  {
	
	public void createUser(UserDto userDto);
	
	public List<User> getAllUser();
	
	public Boolean loginUser(UserDto userDto);
	public Optional<UserDto> findByUserId(Long UserId);
	public Optional<User> getUserProfile(String userId);
	

	
//	public UserDto findById(String userId);
	
//	public Boolean loginUser(LoginDto loginDto)
	
	

	
}
