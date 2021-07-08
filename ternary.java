package curie;

import java.util.Scanner;

public class ternary {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number=");
	int x=scan.nextInt();
	
	if(x%2==0) {
		System.out.println("number is even");
	}
	else
	{
		System.out.println("number is odd");
	}
	
	
	System.out.println((x%2==0)?"even  number":"odd number");
	
	switch(x%2)
	{
	case 0:
		{
			System.out.println("sw..xeven");
			break;
		}
	case 1:
	{
		System.out.println("sw..xoddd");
		break;
	}
	
	}
}
}
