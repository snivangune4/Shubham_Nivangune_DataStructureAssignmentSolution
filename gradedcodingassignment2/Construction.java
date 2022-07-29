package com.gl.gradedcodingassignment2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Construction {

	private Queue<Integer> floor=new LinkedList<Integer>();
	private Stack<Integer> temp=new Stack<Integer>();
	int i=0;
	
	public void pushFloor(int data) {
			floor.add(data);
		}
	
	public int popFloor() {
		if(floor.isEmpty()) {
			throw new RuntimeException("No floors available for construction");
		}
		return floor.remove();
	}
	
	public void display(int totalFloors) {
		int remainingFloors=totalFloors;
		if(floor.isEmpty())
			System.out.println("No floors available for construction");
		else {
			System.out.println("The order of construction is as follows");
				while(!floor.isEmpty() || !temp.isEmpty()) {
					
					if(floor.peek()==remainingFloors) {
						System.out.println("\nDay "+(i+1));
						System.out.print(popFloor()+" ");
						remainingFloors--;
						int size=temp.size();
						for(int i=0;i<size;i++) {
							if(temp.peek()==remainingFloors) {
							System.out.print(temp.pop()+" ");
							remainingFloors--;
							}
						}
						i++;								
				}
					else {
					while(floor.peek()<remainingFloors) {
							temp.add(popFloor());							
							System.out.println("\nDay "+(i+1));
							i++;
						}
					} 				
			}
		}
	}
}

