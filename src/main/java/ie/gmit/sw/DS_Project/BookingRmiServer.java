package ie.gmit.sw.DS_Project;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

// Booking Service
// This class serves as the gateway for our booking client to 
public class BookingRmiServer
{
	public static void main(String[] args) throws Exception
	{
		
		// Create instance of bookingService implementation
		BookingRmiServerImpl bookingServiceImpl = new BookingRmiServerImpl();
		
		// Export the implementation
		System.setProperty("java.rmi.server.hostname","127.0.0.1:1099");

		// Start the RMI Registry 
		try 
		{
			LocateRegistry.createRegistry(1099);
			System.out.println("Creating");
		} 
		catch (Exception e2)
		{
			System.out.println("Error here!!!" + e2);
		}
		
		try 
		{
			Naming.rebind("databaseService", bookingServiceImpl);
			System.out.println("Server start");
		}
		catch (Exception e1) 
		{
			System.out.println("Error here!!! " + e1);
		}
	}
}
