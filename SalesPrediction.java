
/**
 * Write a description of class SalesPrediction here.
 * 
 * @author Daniel Szewczyk (1044007) 
 * @version 01/26/16
 */
public class SalesPrediction
{
    public static void main(String[] args)
    {
        int sales;
        double percent;
        double result;
        
        sales = 4600000;
        percent = 0.62;
        
        result = sales * percent;
        
        System.out.println("The East Coast sales division will generate $" + result + " which is " + percent*100 + "% of $" + sales);
    }
}
/*
 * 6. Sales Prediction

The East Coast sales division of a company generates 62 percent of total sales. Based 

on that percentage, write a program that will print how much the East Coast division will 

generate if the company has $4.6 million in sales this year. Hint: declare variable 

percent = 0.62 to represent 62 percent. Use the variable percent when calculating the 

result.
 */