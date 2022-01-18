package com.saraya.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.saraya.dto.CoachDto;
import com.saraya.dto.LoginDto;


@Service
public interface CoachService {
		
	public String createCoach(CoachDto userDto);
	
	public Boolean loginCoach(LoginDto loginDto) ;
	
	public CoachDto getCoachProfile(String coachId);
	
	public List<CoachDto> showAllCoaches(String coachId);

}
