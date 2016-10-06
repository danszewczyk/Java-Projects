
/**
 * Write a description of class LandCalculation here.
 * 
 * @author Daniel Szewczyk (1044007)
 * @version 01/26/16
 */
public class LandCalculation
{
    public static void main(String[] args)
    {
        double squareFeetPerAcre;
        double squareFeet;
        double acres;
        
        squareFeetPerAcre = 43560;
        squareFeet = 389767;
        
        acres = squareFeet / squareFeetPerAcre;
       
        System.out.println("There are " + acres + " acres in a " + squareFeet + " sqare foot plot of land");
        
        
    }
}

/* 7. Land Calculation 

One acre of land is equivalent to 43,560 square feet. Write a program that calculates 

and prints the number of acres in a plot of land with 389,767 square feet. Hint: Divide 

the size of the plot of land by the size of an acre to net the number of acres. Declare 

variable squareFeetPerAcre=43560 and squareFeet =389767. Use variable acres to 

hold the result.
*/
 
