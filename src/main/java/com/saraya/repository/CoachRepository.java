package com.saraya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saraya.dto.CoachDto;
import com.saraya.dto.LoginDto;
import com.saraya.entity.Coach;


@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {
	
public CoachDto findByCoachId(String coachId);

public List<Coach> findAll(coachDto);



}
