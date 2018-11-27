package ie.gmit.sw.DS_Project;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class BookingServices {
	public static void main(String[] args) throws Exception {
		// Create instance of bookingService implementation
		BookingServiceImpl bookingServiceImpl = new BookingServiceImpl();

		// Export the implementation
		System.setProperty("java.rmi.server.hostname", "192.168.137.1");

		BookingInterface stub = (BookingInterface) UnicastRemoteObject.exportObject(bookingServiceImpl,
				0);

		// Start the RMI Registry
		LocateRegistry.createRegistry(1099);

		// Bind the bookingService object to the registry
		try {
			Naming.rebind("databaseService", stub);
			System.out.println("Server started...");
		} catch (Exception e) {
			System.out.println("Server error: " + e);
		}
	}

}
