<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Reservation</title>
</head>
<body>
<h2>Complete Reservation</h2>
Air Line:${flight.operatingAirlines} <br/><br/>
Departure City:${flight.departureCity} <br/><br/>
Arrival City: ${flight.arrivalCity} <br/><br/>

<form action="completeReservation" method="post">

<h2>Passenger Details</h2>
<input type="text" name="PassengerFirstName"  placeholder="First Name" /><br/><br/>
<input type="text" name="PassengerLastName"  placeholder="Last Name" /><br/><br/>
<input type="text" name="PassengerEmail"  placeholder="Passenger Email" /><br/><br/>
<input type="text" name="PassengerPhone"  placeholder="Passenger Phone" /><br/><br/>

<h2>Card Details</h2>

<input type="text" name="nameOnTheCard"    placeholder="Enter name of card"  /><br/><br/>
<input type="text" name="cardNumber"       placeholder="Enter card Number"  /><br/><br/>
<input type="text" name="expirationDate"   placeholder="expire date"  /><br/><br/>
<input type="text" name="securityCode"      placeholder="security code"  /><br/><br/>
<input type="hidden" name="flightId" value="${flight.id}" />
<input type="submit" value="confirm" />

</form>
</body>
</html>