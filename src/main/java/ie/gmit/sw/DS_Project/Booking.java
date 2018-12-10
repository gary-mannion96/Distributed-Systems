package ie.gmit.sw.DS_Project;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Booking {
	// Variables
	private String firstName;
	private String lastName;
	private int orderID;
	private String carMake;
	private String carReg;

	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getcarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarReg() {
		return carReg;
	}

	public void setCarReg(String carReg) {
		this.carReg = carReg;
	}

	@Override
	public String toString() {
		return "Booking [firstName=" + firstName + ", lastName=" + lastName + ", orderID="
				+ orderID + ", carMake=" + carMake + ", carReg=" + carReg + "]";
	}

}
