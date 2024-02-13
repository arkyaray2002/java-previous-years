package Batch1;

import java.util.*;
public class Square {
	public double side;
	Square(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side for Square : ");
		this.side=sc.nextDouble();
	}
	double getVolume() {
		return (side*side*side);
	}
}