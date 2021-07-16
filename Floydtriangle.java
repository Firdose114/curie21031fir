package curie;

import java.util.Scanner;

public class Floydtriangle {
public static void main(String[] args) {
	int rows,number=1,counter,j=0;
	Scanner input=new Scanner(System.in);
	System.out.println("enter the value for floyds triangle");
	rows=input.nextInt();
	
	System.out.println("floyd's triangle");
    System.out.println("*************");
    
    for(counter=1;counter<=rows;counter++)
    {
    	for(j=1;j<=counter;j++)
    	{
    		System.out.print(number+" ");
    		number++;
    	}
    	System.out.println();
    }
    

}
}
