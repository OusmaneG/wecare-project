package com.saraya.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.saraya.dto.BookingDto;

@Service
public interface BookingService {
	
	public Boolean bookAppointement(String userId, String coachId, 
			LocalDate apppointementDate, String slot);
	
	public Boolean rescheduleAppointement(Long bookId, 
			LocalDate appointementDate, String slot);
	
	public void cancelAppointement(Long bookingId);
	
	public BookingDto findByBookingId(Long BookingId);
	
	public List<BookingDto> findBookingByUserId(Long userId);
	
	public List<BookingDto> findBookingByCoachId(Long coachId);
	
	
	
}
