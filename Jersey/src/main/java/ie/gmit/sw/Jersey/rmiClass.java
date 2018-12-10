package ie.gmit.sw.Jersey;

import java.rmi.Naming;
import java.util.List;

import ie.gmit.sw.Jersey.Order;

public class rmiClass {
	
	private DatabaseService ch;

	public rmiClass() throws Exception {
		ch = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/databaseService");

	}

	// ============== READ ====================
	public List<Order> readData() throws Exception {
		return ch.read();
	}

}