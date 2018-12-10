package ie.gmit.sw;

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

import ie.gmit.sw.Order;

public class DBServiceImpl extends UnicastRemoteObject implements DBService {

	private static final long serialVersionUID = 1L;
	private Connection conn;
	private Statement stmt;

	protected DBServiceImpl() throws RemoteException, SQLException {
		super();
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/car?useSSL=false", "root", "");
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Order> read() throws RemoteException, SQLException {
		System.out.println("In read");

		stmt = conn.createStatement();

		List<Order> List = new ArrayList<Order>();
		String strSelect = "select * from orders";

		ResultSet rset = stmt.executeQuery(strSelect);

		while (rset.next()) { 
			int OrderID = rset.getInt("OrderID");
			Date Date = rset.getDate("Date");
			int cust = rset.getInt("CustID");
			int car = rset.getInt("CarID");
			
			Order s = new Order(OrderID, Date,cust,car);
			List.add(s);
		}
		return List;
	}

}
