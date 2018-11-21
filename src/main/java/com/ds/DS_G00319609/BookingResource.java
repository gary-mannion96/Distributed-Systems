package com.ds.DS_G00319609;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

@Path("BookingSystem")
public class BookingResource {
	// Variables
	private BookingServiceImpl bookingServiceImpl;

	public BookingResource() throws SQLException, RemoteException {
		bookingServiceImpl = new BookingServiceImpl();
	}

	// Shows all current bookings
	@GET
	@Path("showAllBookings")
	@Produces(MediaType.APPLICATION_XML)
	public List<Booking> getBookings() {
		System.out.println("Inside getBookings!");
		return bookingServiceImpl.getBookings();
	}

	// Creates a booking
	@POST
	@Path("createBooking")
	public Booking createBooking(Booking booking1) {
		try {
			bookingServiceImpl.createBooking(booking1);
		} catch (RemoteException e) {
			System.out.println("Resource Error: " + e);
		}

		// Return the createdBooking
		return booking1;
	}

	// Shows bookings with a specified ID
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("booking/{orderID}")
	public Booking getBooking(@PathParam("orderID") int orderID) {
		try {
			return bookingServiceImpl.getBooking(orderID);
		} catch (RemoteException e) {
			System.out.println("Resource Error: " + e);
		}
		return null;
	}

}
