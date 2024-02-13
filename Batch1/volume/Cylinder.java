package Batch1;

import java.util.*;
public class Cylinder extends Square {
	double height;
	public Cylinder() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height for Cylinder : ");
		this.height=sc.nextDouble();
	}
	double getVolume() {
		System.out.println("Volume of Square is : "+super.getVolume());
		return(Math.PI*side*height);
	}
}