package com.chainsys.interfac;

public interface IVehicle 
{
	public final int MAXSPEED=150;
	abstract void echo();
	abstract void start();
	abstract void move();
	abstract void stop();
}
/**
 * All interfaces are contract and markers
 */
// Null interface can be only markers not a contract
interface IPetrol
{
	
}
