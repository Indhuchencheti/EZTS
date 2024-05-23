package demo;
import java.util.Scanner;
public class average {
// average of 10 numbers
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int sum=0;
		System.out.println("Enter any 10 numbers:");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			sum+=n;
		}
		float avg = (float)sum/10;
		System.out.println("The average of 10 numbers is:" +avg);
	}
	
}
