package Batch1;

import java.util.*;
public class MyPoint {
	int x,y;
	MyPoint(){
		x=0;
		y=0;
	}
	MyPoint(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X and Y coordinate:");
		x=sc.nextInt();
		y=sc.nextInt();
	}
	static double linesegment(MyPoint m,MyPoint n) {
		double gradient;
		gradient=(n.y-m.y)/(n.x-m.x);
		return gradient;
	}
}