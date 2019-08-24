/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

// import java.util.Scanner;
// uncomment the above line to use input in your program.

import java.util.*;
public class Gravity
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double time,speed,distance;
		double g=9.8;
		System.out.println("enter the time");
		time=sc.nextDouble();
		speed=g*time;
		distance=(g*time*time)/2;
		System.out.println("The speed of the object at "+time+ "seconds after its release is "+speed+ "and the distance the object has travelled in the "+time+ "seconds after the relase is "+distance);
	}
}