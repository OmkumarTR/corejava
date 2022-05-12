package com.chainsys.classesmethods;

public class Car {

	private final String regNo;
	private int yearofPurchase;
	private String color;
	private String fuel;
	
	public Car(String rno)
	{
		this.regNo=rno;
	}

	public String getRegNo() {
		return regNo;
	}

	public int getYearofPurchase() {
		return yearofPurchase;
	}

	public void setYearofPurchase(int yearofPurchase) {
		this.yearofPurchase = yearofPurchase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
}
