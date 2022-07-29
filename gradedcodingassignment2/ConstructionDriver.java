package com.gl.gradedcodingassignment2;

import java.util.Scanner;

public class ConstructionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Construction construction = new Construction();
		Scanner sc =  new Scanner (System.in);
		System.out.println("Enter the total number of floors in building.");
		int noOfFloors=sc.nextInt();
		for (int i=0;i<noOfFloors;i++) {
			System.out.println("Enter the floor size gien on day "+(i+1));
			int size =sc.nextInt();
			construction.pushFloor(size);			
		}
		construction.display(noOfFloors);
		sc.close();
	}
}
