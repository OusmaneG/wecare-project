package com.saraya.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bookingId;	
	private String appointmentDate;
	private String slot;
	
	@OneToOne
	private User user;
	@OneToOne
	private Coach coach;


	public Booking() {}


	public long getBookingId() {
		return bookingId;
	}


	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}


	public String getAppointmentDate() {
		return appointmentDate;
	}


	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}


	public String getSlot() {
		return slot;
	}


	public void setSlot(String slot) {
		this.slot = slot;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Coach getCoach() {
		return coach;
	}


	public void setCoach(Coach coach) {
		this.coach = coach;
	}


	protected Booking(long bookingId, String appointmentDate, String slot, User user, Coach coach) {
		super();
		this.bookingId = bookingId;
		this.appointmentDate = appointmentDate;
		this.slot = slot;
		this.user = user;
		this.coach = coach;
	}


	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", appointmentDate=" + appointmentDate + ", slot=" + slot
				+ ", user=" + user + ", coach=" + coach + "]";
	}

	
	
}
	
	
