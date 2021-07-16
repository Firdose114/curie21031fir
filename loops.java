package curie;
import java.util.Scanner;
public class loops {
public static void main(String[] args) {
	
	int x=5;
	do
	{
		System.out.println("good to see you");
		x--;
	}while(x%2==0);
	
	
	
	int number,sum=0;
	Scanner scan1=new Scanner(System.in);
	System.out.println("enter the value of number");
	number=scan1.nextInt();
	while(number<=10)
	{
		sum+=number;
		number++;
	}
	System.out.format("the output of the while loop is: %d" ,sum);
	
	int z=0;
	do
	{
		System.out.println("value of z"+z);
		z++;
		System.out.println();
		
		
	}while(z<=11);
	
}
}
