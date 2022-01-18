package com.saraya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saraya.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
	
//	public Optional<Booking> findByUserId(String userId);
//	
//	public List<Booking> findBookingByUserId(String userId, LocalDate today);
//	
//	public List<Booking> findBookingByCoachId(String coachId, LocalDate today);
//	
//	public Booking findAllBookings(String userId, LocalDate appointementDate, String slot);
//	
	/*
	 * public Boolean BookAppointment(String userId, String coachId, LocalDate
	 * appointment, String Slot);
	 * 
	 * public Boolean reschuldeAppointment(Integer bookingId, LocalDate
	 * appointmentDate, String slot);
	 * 
	 * public void cancelAppointment(Integer bookingId);
	 * 
	 * public BookingDto findByBookingId(Integer bookingId);
	 * 
	 * public List<BookingDto> findBookingByUserId(String coachId);
	 * 
	 * public List<BookingDto> findBookingByCoachId(String userId);
	 */
}
