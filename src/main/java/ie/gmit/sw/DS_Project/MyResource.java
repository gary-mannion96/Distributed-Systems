package ie.gmit.sw.DS_Project;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ie.gmit.sw.DS_Project.Booking;
import ie.gmit.sw.DS_Project.BookingRmiServerImpl;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;


@Path("BookingSystem")
public class MyResource {
	// Variables
	private BookingRmiServerImpl bookingServiceImpl;

	public MyResource() throws SQLException, RemoteException
	{
		bookingServiceImpl = new BookingRmiServerImpl();
	}
		
	// Shows all current bookings
	@GET
	@Path("showAllBookings")
	@Produces(MediaType.APPLICATION_XML)
	public List<Booking> getBookings() 
	{
		return bookingServiceImpl.getBookings();
	}
	
	// Creates a booking
	@POST
	@Path("createBooking")
	public Booking createBooking(Booking booking1)
	{
		try
		{
			bookingServiceImpl.createBooking(booking1);
		} 
		catch (RemoteException e)
		{
			System.out.println("Resource Error: " + e);
		}
		return booking1;
	}
	
	// Shows bookings with a specified ID
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("booking/{orderID}")
	public Booking getBooking(@PathParam("orderID") int orderID) 
	{
		try
		{
			return bookingServiceImpl.getBooking(orderID);
		} 
		catch (RemoteException e)
		{
			System.out.println("Resource Error: " + e);
		}
		return null;
	}
}