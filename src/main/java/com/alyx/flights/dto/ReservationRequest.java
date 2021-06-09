package com.alyx.flights.dto;


public class ReservationRequest {
	
	private Long flightId;
	private String PassengerFirstName;
	private String PassengerLastName;
	private String PassengerEmail;
	private String PassengerPhone;
	
	private String nameOnTheCard;
	private String cardNumber;
	private String expirationDate;
	private String securityCode;
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getPassengerFirstName() {
		return PassengerFirstName;
	}
	public void setPassengerFirstName(String passengerFirstName) {
		PassengerFirstName = passengerFirstName;
	}
	public String getPassengerLastName() {
		return PassengerLastName;
	}
	public void setPassengerLastName(String passengerLastName) {
		PassengerLastName = passengerLastName;
	}
	public String getPassengerEmail() {
		return PassengerEmail;
	}
	public void setPassengerEmail(String passengerEmail) {
		PassengerEmail = passengerEmail;
	}
	public String getPassengerPhone() {
		return PassengerPhone;
	}
	public void setPassengerPhone(String passengerPhone) {
		PassengerPhone = passengerPhone;
	}
	public String getNameOnTheCard() {
		return nameOnTheCard;
	}
	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	
}
