package ie.gmit.sw.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ie.gmit.sw.Model.Bookings;


public class DBServiceImpl extends UnicastRemoteObject implements DatabaseService {

	private static final long serialVersionUID = 1L;
	private Connection conn;
	private Statement stmt;

	protected DBServiceImpl() throws RemoteException, SQLException {
		super();
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingservice?useSSL=false", "root", "");
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Bookings> read() throws RemoteException, SQLException {
		System.out.println("In read");

		stmt = conn.createStatement();

		List<Bookings> List = new ArrayList<Bookings>();
		String strSelect = "select * from tasks;";

		ResultSet rset = stmt.executeQuery(strSelect);

		while (rset.next()) { 
			int BookingID = rset.getInt("booking_ID");
			String name = rset.getString("name");
			String startdate = rset.getString("start_date");
			String enddate = rset.getString("end_date");
			String carmake = rset.getString("carmake");
			String carreg = rset.getString("carreg");
			
			Bookings b = new Bookings(BookingID, name,startdate,enddate,carmake, carreg);
			List.add(b);
		}
		return List;
	}

	@Override
	public void create(Bookings booking) throws RemoteException, SQLException {
		stmt = conn.createStatement();
		
		String strSelect = "insert into tasks (name, start_date, end_date, carmake, carreg) values " + "(" + "'" + booking.getName() + "'," +"'" + booking.getStartDate() + "'," + "'" + booking.getEndDate() + "'," + "'" + booking.getCarmake() + "'," + "'" + booking.getCarreg() + "');";
		System.out.println(strSelect);
		
		stmt.execute(strSelect);
		
	}
	
/*	public void create() throws RemoteException, SQLException {
		System.out.println("In read");

		stmt = conn.createStatement();

		List<Bookings> List = new ArrayList<Bookings>();
		String strSelect = "select * from orders";

		ResultSet rset = stmt.executeQuery(strSelect);

		while (rset.next()) { 
			int OrderID = rset.getInt("OrderID");
			Date Date = rset.getDate("Date");
			int cust = rset.getInt("CustID");
			int car = rset.getInt("CarID");
			
			Bookings b = new Bookings(OrderID, Date,cust,car);
			List.add(b);
		}
		return List;
	}*/

}
