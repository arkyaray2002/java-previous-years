package Batch1;

import java.util.*;
public class Gradient_check {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyPoint p1=new MyPoint();
		p1.getData();
		
		System.out.println("Enter X and Y coordinate:");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		MyPoint p2=new MyPoint(x1,y1);
		
		double gradient=MyPoint.linesegment(p1,p2);
		System.out.println("Gradient is:"+gradient);
	}

}