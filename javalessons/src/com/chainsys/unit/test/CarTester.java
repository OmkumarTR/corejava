package com.chainsys.unit.test;

import com.chainsys.classesmethods.Car;

/**
 * 
 * @author omku3118
 *
 */
public class CarTester {

	public static void testCar()
	{
		Car firstCar = new Car("TN 10A 2345");
		firstCar.setColor("Red");
		firstCar.setFuel("Petrol");
		firstCar.setYearofPurchase(2021);
		System.out.println(firstCar.getRegNo());
		System.out.println(firstCar.getColor());
		System.out.println(firstCar.getFuel());
		System.out.println(firstCar.getYearofPurchase());
		
	}
}
