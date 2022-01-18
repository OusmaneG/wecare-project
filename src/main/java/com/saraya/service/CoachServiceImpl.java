package com.saraya.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.saraya.dto.CoachDto;
import com.saraya.dto.LoginDto;
import com.saraya.entity.Coach;
import com.saraya.repository.CoachRepository;


public class CoachServiceImpl implements CoachService {
	
	@Autowired
	private CoachRepository coachRepository; 

	@Override
	public String createCoach(CoachDto coachDto) {
	     Coach c = new Coach(coachDto.getName(), coachDto.getGender(), coachDto.getDateOfBirth(), 
				coachDto.getPassword(), coachDto.getMobileNumber(), coachDto.getSpeciality());
		coachRepository.save(c);
		return c.getCoachId().toString();		
	}

	@Override
	public Boolean loginCoach(LoginDto loginDto) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public CoachDto getCoachProfile(String coachId) { if (coachId !=
	 * null) { Optional<CoachDto> optional = coachRepository.findByCoachId(coachId);
	 * CoachDto coach = optional.get(); return coach; } else { return null; } }
	 */

//	@Override
//	public List<CoachDto> showAllCoaches(String coachId) {
//		List<CoachDto> coach = coachRepository.findAllCoachId(coachId) ;
//		return coach;
//	}	
	

	@Override
	public List<CoachDto> showAllCoaches(String coachId) {
			return coachRepository.findAll(coachId);
	}

	@Override
	public CoachDto getCoachProfile(String coachId) {
		return coachRepository.findByCoachId(coachId);
	}
}
	

