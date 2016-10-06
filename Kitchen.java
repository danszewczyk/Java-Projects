import java.util.Scanner;
/**
 * Write a description of class Kitchen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kitchen
{
    public static void main (String [] arg)
    {
        double number;
        double sumArea;
        String input;
        
        Rectangle kitchen = new Rectangle();
        Rectangle bedroom = new Rectangle();
        Rectangle den = new Rectangle();
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is the length of the kitchen?");
        number = keyboard.nextDouble();
        kitchen.setLength(number);
        
        System.out.println("What is the width of the kitchen?");
        number = keyboard.nextDouble();
        kitchen.setWidth(number);
        
        System.out.println("What is the length of the bedroom?");
        number = keyboard.nextDouble();
        bedroom.setLength(number);
        
        System.out.println("What is the width of the bedroom?");
        number = keyboard.nextDouble();
        bedroom.setLength(number);
        
        System.out.println("What is the length of the den?");
        number = keyboard.nextDouble();
        den.setLength(number);
        
        System.out.println("What is the width of the den?");
        number = keyboard.nextDouble();
        den.setWidth(number);
        
        sumArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
        System.out.println("the total area is : " + sumArea);
    }
}