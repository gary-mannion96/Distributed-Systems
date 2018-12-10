package ie.gmit.sw.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;

// setup to interact with the database
public class ServiceSetup {
	public static void main(String[] args) throws Exception {
		// Set an instance of DatabaseService
		DatabaseService ds = new DBServiceImpl();
		LocateRegistry.createRegistry(1099);
		Naming.rebind("database", ds);
		System.out.println("Server ready.");
	}
}