package curie;

import java.util.Scanner;

public class loopwhile {
public static void main(String[] args) {
	int num,sum=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("pls enter a value less than 10");
	
	num=scan.nextInt();
	
	while(num<=10)
	{
		sum=sum+num;
		num++;
	}
	System.out.format(" Sum of the Numbers From the While Loop is: %d ",+sum);
}
}
