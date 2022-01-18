package com.saraya.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.saraya.dto.BookingDto;
import com.saraya.repository.BookingRepository;

public class BookingServiceImpl implements BookingService {
	
	@Autowired
	private BookingRepository bookingRepository; 

	@Override
	public Boolean bookAppointement(String userId, String coachId, LocalDate apppointementDate, String slot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean rescheduleAppointement(Long bookId, LocalDate appointementDate, String slot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelAppointement(Long bookingId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookingDto findByBookingId(Long BookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookingDto> findBookingByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookingDto> findBookingByCoachId(Long coachId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	
