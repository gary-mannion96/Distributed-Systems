package ie.gmit.sw.DS_Project;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class BookingClient
{

	public static void main(String[] args) throws NotBoundException, RemoteException
	{
		// try/catch
		try
		{
			// Create stub
			BookingInterface bookingServiceStub = new BookingRmiServerImpl();
			Naming.rebind("databaseService", bookingServiceStub);

			// Remote method
			bookingServiceStub.createBooking(null);

		}
		catch (Exception e)
		{
			System.out.println("Error here!!! " + e);
		}
	}
}