package com.saraya.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saraya.dto.UserDto;
import com.saraya.entity.User;
import com.saraya.service.UserService;

@RestController
@RequestMapping("/wecare")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getAllUser() {
		return userService.getAllUser();
	}
	
	
//	@PostMapping
//	public void  User(@RequestBody UserDto userDto) {
//		  userService.createUser(userDto);
	//}
	
	@GetMapping(value="/{userId}")
	public Optional<User> getOne(@PathVariable("userId") String userId ) {
		return userService.getUserProfile(userId);
	}
	
	@PostMapping()
	public ResponseEntity <UserDto>createUser (@RequestBody UserDto userDto) {
		return new ResponseEntity<UserDto> (HttpStatus.CREATED);
	}
	

}
