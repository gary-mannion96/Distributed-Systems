package ie.gmit.sw.DS_Project;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientBooking {

	public static void main(String[] args) throws NotBoundException {
		try {
			// Gettting ther registryR
			Registry registry = LocateRegistry.getRegistry(null);

			// Looking up registry for remote object
			BookingInterface stub = (BookingInterface) registry.lookup("databaseService");

			// Remote methods
			stub.getBooking(1);
		}

		catch (RemoteException e) {
			System.out.println("Client Exception: " + e);
		}
	}

}
