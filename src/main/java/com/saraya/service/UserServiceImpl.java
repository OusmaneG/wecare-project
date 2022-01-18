package com.saraya.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.dto.UserDto;
import com.saraya.entity.User;
import com.saraya.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;
	@Override
	public String createUser(UserDto userDto)  {		
		User u = new User( userDto.getName(), userDto.getGender(), userDto.getDateOfBirth(), 
				userDto.getPassword(), userDto.getMobileNumber(), userDto.getEmail(), 
				userDto.getPinCode(), userDto.getCity(), userDto.getState(), userDto.getCountry()) ;
		userRepository.save(u).toString();
	return u.getUserId().toString();
	
	}
	
	public List<User> getAllUser() {
		return userRepository.findAll() ;
	}
 	
	public Date convertDate(String date) {
		Date d = new Date() ;
		 try  {
			 d = new SimpleDateFormat("dd/mm/yyyy").parse(date);
			 log.info(d.toString());
		 } catch (ParseException e ) {
			 e.printStackTrace();
		 }
		 return d;
	}
	
//	@Override
//	public UserDto getUserProfile(String  userId) {
//		 if (userId != null) {
//			 Optional<UserDto>  optional = userRepository.findByUserId(userId);
//			 UserDto user = optional.get();
//			 return user;
//			 } else {
//			return null;
//		 }
		
	
	
	@Override
	public Boolean loginUser(UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> getUserProfile(String userId) {		
		return userRepository.findById(userId);
	}

	@Override
	public Optional<UserDto> findByUserId(Long UserId) {
		// TODO Auto-generated method stub
		return null;
	}

		
}
