package ie.gmit.sw;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import ie.gmit.sw.Order;

public interface DBService extends Remote {

	public List<Order> read() throws RemoteException, SQLException;

}
