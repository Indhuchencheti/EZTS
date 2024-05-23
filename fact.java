package demo;
import java.util.Scanner;
public class fact {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		int factorial=1;
		System.out.println("Enter any number:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			 factorial=factorial*i;
			System.out.println("The factorial of the number is:" +factorial);
		}
		;
		
		// TODO Auto-generated method stub

	}

}
