import java.util.Scanner;
/**
 * Write a description of class SalesTax here.
 * 
 * @author Daniel Szewczyk (1044007)
 * @version 02/02/16
 */
public class SalesTax
{
    public static void main(String[] args)
    {
        double stateTaxPercent = 0.04;
        double countyTaxPercent = 0.02;
        double purchaseAmount,stateTax, countyTax, totalTax, totalSale;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter amount of purchase $: ");
        purchaseAmount = keyboard.nextDouble();

        //show the purchase amount
        System.out.println("Amount of purchase is $" + purchaseAmount);

        //process sale
        stateTax = purchaseAmount * stateTaxPercent;
        countyTax = purchaseAmount * countyTaxPercent;
        totalTax = stateTax + countyTax;
        totalSale = purchaseAmount + totalTax;

        //show all the information
        System.out.println("Amount of state tax is $" + stateTax);
        System.out.println("Amount of county tax is $" + countyTax);
        System.out.println("Amount of total tax is $" + totalTax);
        System.out.println("Amount of total sale is $" + totalSale);

    }
}

/*
 * 8. Sales Tax

Write a program that will ask the user to enter the amount of a purchase. The program 

should then compute the state and county sales tax. Assume the state sales tax is 4 

percent and the county sales tax is 2 percent. The program should print the amount of 

the purchase, the state sales tax, the county sales tax, the total sales tax, and the total 

of the sale (which is the sum of the amount of purchase plus the total sales tax). Hint: 

Use the value 0.02 to represent 2 percent, and 0.04 to represent 4 percent, Use 

variables stateTaxPercent, countyTaxPercent, purchaseAmount, stateTax, countyTax, 

totalTax, and totalSale.

Enter amount of purchase $: 10.0

Amount of purchase is $10.0

Amount of state tax is $0.4

Amount of county tax is $0.2

Amount of total tax is $0.6

Amount of total sale is $10.6
 */
