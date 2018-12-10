package ie.gmit.sw;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Service {
	public static void main(String[] args) throws Exception {

		// Set an instance of DatabaseService
		DBService ds = new DBServiceImpl();
		LocateRegistry.createRegistry(1099);
		Naming.rebind("database", ds);
		System.out.println("Server ready.");
	}
}

