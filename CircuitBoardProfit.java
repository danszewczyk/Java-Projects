import java.util.Scanner;
/**
 * Write a description of class CircuitBoardProfit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CircuitBoardProfit
{
    public static void main(String[] args)
    {
        double percentProfit = 0.4;
        double retailPrice;
        double profit;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is the retail price of a circuit board? (in dollars): $");
        retailPrice = keyboard.nextDouble();
        
        profit = retailPrice * percentProfit;
        
        System.out.print("Your profit is $" + profit);
    }  
}

/*
 * 
 * An electronics company sells circuit boards at a 40 percent

profit. If you know the retail price of a circuit board, you can 

calculate its profit with the following formula:

profit = retailPrice x percentProfit

Make percentProfit=0.4 (40 percent). Write a program that asks 

the user for the retail price of a circuit board, calculates the 

amount of profit earned for that product, and prints the results 

on the screen. Here is an example of the run:

Enter the retail price in $ : 100.0

Your profit is $40.0
 * 
 * 
 */