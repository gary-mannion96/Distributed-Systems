package ie.gmit.sw.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;


import ie.gmit.sw.Model.Bookings;

public interface DatabaseService extends Remote {
	public List<Bookings> read() throws RemoteException, SQLException;
	
	public void create(Bookings booking) throws RemoteException, SQLException;
	

}
