package demo;
import java.util.*;
public class incometax {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		// TODO Autopackage Basic;
		
				double income,tax=0;
				int age;
				System.out.println("Enter the age:");
		        age=sc.nextInt();
		        System.out.println("Enter the income:");
		        income=sc.nextDouble();
		        if(age<=60)
		        {
		        	if(income<250000) {
		        		tax=0.0f;
		        	}
		        	else if (income <= 500000) {
		                tax = 0.05f * (income - 250000);
		            } else if (income <= 1000000) {
		                tax = 0.05f* 250000 + 0.10f * (income - 500000);
		            } else if (income <= 3000000) {
		                tax = 0.05f * 250000 + 0.10f * 500000 + 0.20f* (income - 1000000);
		            } else {
		                tax = 0.05f * 250000 + 0.10f* 500000 + 0.20f* 2000000 + 0.30f* (income - 3000000);
		            }
		        }
		        else { 
		            if (income <= 300000) {
		                tax = 0.0f;
		            } 
		            else if (income <= 500000) {
		                tax = 0.05f * (income - 300000);
		            } 
		            else if (income <= 2000000) 
		            {
		                tax = 0.05f* 200000 + 0.10f * (income - 500000);
		            }
		            else 
		            {
		                tax = 0.05f* 200000 + 0.10f* 1500000 + 0.20f* (income - 2000000);
		            }
		        }

		        System.out.println("The income Tax is:"+tax);
		        sc.close();
			

	}

}
