package curie;

import java.util.Scanner;
public class enter_a_number {
public static void main(String[] args) {
	//creates a user reader interface as input from keyboard
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter a number");
	int number= reader.nextInt();
	System.out.println("You entered a number:"+number);
	
	
}
}