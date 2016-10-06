/**

   Daniel Szewczyk
   2/22/16

*/

// Insert any necessary import statements here.
import java.util.Scanner;

public class AreaRectangle

{

   public static void main(String[] args)

   {
       
       
      double length,    // The rectangle's length

             width,     // The rectangle's width

             area;      // The rectangle's area

      

      // Get the rectangle's length from the user.

      do{
          
          length = getLength();
          width = getWidth();
          
          if(length < 0 || width < 0){
              System.out.println("\nInvalid Length/Width! Try again...");
          }else{ 
              area = getArea(length, width);
              displayData(length, width, area);
          }
          
      } while(length < 0 || width < 0);
      
      

      // Get the rectangle's area.

      

   }
   public static boolean isPositive(double x)
   {
       if(x < 0){
           return false;
       }else{
           return true;
       }
   }
   
   public static double getLength(){
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter the length: ");
       return keyboard.nextDouble();
   }
   
   public static double getWidth(){
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter the width: ");
       return keyboard.nextDouble();
   }
   
   public static double getArea(double length, double width){
       
       return length * width;
   }
   
   public static void displayData(double length, double width, double area){
       System.out.println("\nThe length is: " + length + " units");
       System.out.println("The width is: " + width + " units");
       System.out.println("The area is: " + area + " units squared");
   }

}
/*
 * 
 *  Your job is to complete the program. When it is complete, the program

will ask the user to enter the width and length of a rectangle, and then display the 

rectangle's area. The program calls the following methods, which have not been 

written:

 getLength—This method should ask the user to enter the rectangle's length, 

and then return that value as a double.

 getWidth—This method should ask the user to enter the rectangle's width, 

and then return that value as a double.

 getArea—This method should accept the rectangle's length and width as 

arguments, and return the rectangle's area. The area is calculated by 

multiplying the length by the width.

 diaplayData—This method should accept the rectangle's length, width, and 

area as arguments, and display them in an appropriate message on the 

screen.
*/
