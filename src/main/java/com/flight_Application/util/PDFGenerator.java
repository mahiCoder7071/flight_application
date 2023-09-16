package com.flight_Application.util;

import java.io.File;
import java.io.FileOutputStream;


import org.springframework.stereotype.Component;

import com.flight_Application.entity.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
@Component
public class PDFGenerator {

	    public void generatePdf(Reservation reservation,String filepath) {
	        
	   

	        Document document = new Document();

	        try {

	            PdfWriter.getInstance(document, new FileOutputStream (filepath));

	            //open
	            document.open();

	            Paragraph p = new Paragraph();
	            p.add("Mahi Flight Handling Service");
	            p.setAlignment(Element.ALIGN_CENTER);

	            document.add(p);
	            Font f = new Font();
	            f.setStyle(Font.BOLD);
	            f.setSize(8);

	        
	            
	            PdfPTable table = new    PdfPTable(2);   
	            table.setWidthPercentage(100);
	            table.setSpacingBefore(10f);
	            table.setSpacingAfter(10f);
	            PdfPCell cell1 = new  PdfPCell(new Paragraph("Flight Details"));
	            cell1.setColspan(2);
	            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
	            // Adding cells to the table  
	            table.addCell(cell1);
	            table.addCell("Departure City");       
	            table.addCell(reservation.getFlight().getDepartureCity());       
	            table.addCell("Arrival City");       
	            table.addCell(reservation.getFlight().getArrivalCity());
	            table.addCell("Flight Number");       
	            table.addCell(reservation.getFlight().getFlightNumber());
	            table.addCell("Operating Airlines");       
	            table.addCell(reservation.getFlight().getOperatingAirlines());
	            table.addCell("Departure Date ");                 
	            table.addCell(reservation.getFlight().getDateOfDeparture().toString());
	            table.addCell("Estimated Departure Date ");   
	            table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());
	            // Adding Table to document   
	            
	            PdfPCell cell2 = new  PdfPCell(new Paragraph("Passenger Details"));
	            cell2.setColspan(2);
	            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
	            table.addCell(cell2);
	            
	            table.addCell("First Name");       
	            table.addCell(reservation.getPassenger().getFirstName());       
	            table.addCell("Middle Name");       
	            table.addCell(reservation.getPassenger().getMiddleName());
	            table.addCell("Last Name");       
	            table.addCell(reservation.getPassenger().getLastName());
	            table.addCell("Email");       
	            table.addCell(reservation.getPassenger().getEmail());
	            table.addCell("Mobile");                 
	            table.addCell(reservation.getPassenger().getMobile());
	            document.add(table);                  
	            
	            
	            //close
	            document.close();

	            System.out.println("Done");
	         
	        } catch (Exception  e) {
	            e.printStackTrace();
	        } 
}
}