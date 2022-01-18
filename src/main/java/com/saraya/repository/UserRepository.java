package com.saraya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saraya.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	
	
//	public Optional<UserDto> findByUserId(Long UserId);
//
	

//	public Optional<UserDto> findByUserId(String userId);
	
	
		
}
