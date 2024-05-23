package demo;

import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float units, bill = 0, surcharge, totalBill;
// units to store the no of units consumed
        // bill to store the nitial bill
        // surcharge to store the additional surcharge 
        //total bill to store the finall bill
        System.out.println("Enter the number of units consumed: ");
        units = sc.nextFloat();
        if (units <= 50) 
        {
            bill = units * 0.50f;
        } 
        else if (units <= 150)
        {
            bill = 50 * 0.50f + (units - 50) * 0.75f;
        }
        else if (units <= 250)
        {
            bill = 50 * 0.50f + 100 * 0.75f + (units - 150) * 1.20f;
        } 
        else 
        {
            bill = 50 * 0.50f + 100 * 0.75f + 100 * 1.20f + (units - 250) * 1.50f;
        }

        surcharge = bill * 0.20f;
        totalBill = bill + surcharge;       
        System.out.println("Total electricity bill: Rs. " + totalBill);
        sc.close();
    }
}
