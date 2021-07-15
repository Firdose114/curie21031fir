package curie;

public class nestedlooopcheck {
public static void main(String[] args) {
	for(int i=0;i<5;i++)//5 times
	{
		for(int j=0;j<5;j++)//25 times
			{
			System.out.print("*"+"\t");
			}
		System.out.println();
	}
	for(int i=0;i<10;i++)
	{
		if(i%2==0)
		{
			continue;
		}
		System.out.println("number is odd"+i);
	}
	
}
}
