package ie.gmit.sw.DS_Project;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookingServiceImpl extends UnicastRemoteObject implements BookingInterface {
	
	String url = "jdbc:mysql://localhost:3306/bookings";
	String username = "gary";
	String password = "gary";
	Statement statement = null;
	Connection connection = null;

	private static final long serialVersionUID = 1L;

	public BookingServiceImpl() throws RemoteException, SQLException {
		// Setup connection to database

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println("Connection error: " + e);
		}

	}

	// All Bookings
	public List<Booking> getBookings() {

		List<Booking> bookings = new ArrayList<>();

		// Create the sql statement 
		System.out.println(url);
		String sql = "select * from bookings;";

		// try/catch
		try {
			Statement statement = connection.createStatement();
			System.out.println(statement);
			System.out.println("Executing statement!");
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String firstName = rs.getString(3);

				System.out.println("ID: " + id + "name: " + name + "firstName: " + firstName);
			}
		} catch (SQLException e) {
			System.out.println("SQL Error: " + e);
		}
		return bookings;
	}

	// Specific bookings
	@Override
	public Booking getBooking(int orderID) throws RemoteException {

		/*
		 * for (Booking booking : bookings) { if (booking.getOrderID() == orderID) {
		 * System.out.println("Booking found!"); return booking; } else { return null; }
		 * }
		 */
		System.out.println("ERROR!!!!");

		return null;

	}

	// Create a booking
	@Override
	public void createBooking(Booking booking) throws RemoteException {
		// Create the sql statement we want to execute
		System.out.println(url);
		String sql = "insert into bookings(id, name, FirstName) VALUES ('1', 'Gary', 'Mannion');";

		System.out.println("STUB INVOCATION!");
		
		try {
			Statement statement = connection.createStatement();
			System.out.println(statement);
			System.out.println("Executing statement!");
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs);
			}
		} catch (SQLException e) {
			System.out.println("MySQL Error: " + e);
		}
	}

}
