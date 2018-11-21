package com.ds.DS_G00319609;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Booking {
	// Variables
	private String firstName;
	private String lastName;
	private double orderCost;
	private int orderID;
	private String carName;
	private String carRegistration;

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

	public double getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarRegistration() {
		return carRegistration;
	}

	public void setCarRegistration(String carRegistration) {
		this.carRegistration = carRegistration;
	}

	@Override
	public String toString() {
		return "Booking [firstName=" + firstName + ", lastName=" + lastName + ", orderCost=" + orderCost + ", orderID="
				+ orderID + ", carName=" + carName + ", carRegistration=" + carRegistration + "]";
	}

}
