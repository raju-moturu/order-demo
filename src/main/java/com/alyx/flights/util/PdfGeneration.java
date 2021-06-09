package com.alyx.flights.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.alyx.flights.entities.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class PdfGeneration {

	
	public void generatePDF(Reservation reservation,String filePath) {
		
		Document document=new Document();
		
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filePath));
			document.open();
			document.add(generateTable(reservation));
			document.close();
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
		
	}
	

	private PdfPTable generateTable(Reservation reservation) {
		
		PdfPTable table=new PdfPTable(2);
		
		PdfPCell cell;
		cell=new PdfPCell(new Phrase("flight Itinerary"));
		cell.setColspan(2);
		table.addCell(cell);
		
		cell=new PdfPCell(new Phrase("Flight details"));
		cell.setColspan(2);
		table.addCell(cell);
		
		table.addCell("Air Lines");
		table.addCell(reservation.getFlight().getOperatingAirlines());
		
		table.addCell("Departure City");
		table.addCell(reservation.getFlight().getDepartureCity());
		
		table.addCell("Arrival City");
		table.addCell(reservation.getFlight().getArrivalCity());
		
		table.addCell("Flight Number");
		table.addCell(reservation.getFlight().getFlightNumber());
		
		table.addCell("Departure Date");
		table.addCell(reservation.getFlight().getDateOfDeparture().toString());
		
		table.addCell("Departure Time");
		table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());
		
		cell=new PdfPCell(new Phrase("Passenger details"));
		cell.setColspan(2);
		table.addCell(cell);
		
		table.addCell("First Name");
		table.addCell(reservation.getPassenger().getFirstName());
		
		table.addCell("Last Name");
		table.addCell(reservation.getPassenger().getLastName()); 
		
		table.addCell("Email");
		table.addCell(reservation.getPassenger().getEmail());
		
		table.addCell("Phone Number");
		table.addCell(reservation.getPassenger().getPhone());
		
		
		return table;
	}
	
}
