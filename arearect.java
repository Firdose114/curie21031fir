package curie;

import java.util.Scanner;

public class arearect {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter length of rectangle");
	double length=scan.nextDouble();
	System.out.println("enter width of rectangle");
	double width=scan.nextDouble();
	double area=length*width;
	System.out.println("th area of rectangle is "+area);
	
	
	
	///araea of square
	System.out.println("enter side of rectangle");
	double side=scan.nextDouble();

	double area1=side*side;
	System.out.println("th area of square is "+area1);
	
	// area of trianhgle
	System.out.println("enter base of triangle");
	double base=scan.nextDouble();
	System.out.println("enter height of rectangle");
	double height=scan.nextDouble();	
	double area2=(base*height)/2;
	System.out.println("area of tri is : "+area2);
	
	//area of circle
	
	System.out.println("enter the value of r");
	double rad=scan.nextDouble();
	
	double area3=Math.PI*rad*rad;
	System.out.println("enter the value of area3"+area3);
	
	

}
}
