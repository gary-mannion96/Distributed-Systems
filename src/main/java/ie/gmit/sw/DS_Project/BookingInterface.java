package ie.gmit.sw.DS_Project;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface BookingInterface extends Remote {
	public List<Booking> getBookings() throws RemoteException;

	public Booking getBooking(int orderID) throws RemoteException;

	public void createBooking(Booking booking) throws RemoteException;

}
