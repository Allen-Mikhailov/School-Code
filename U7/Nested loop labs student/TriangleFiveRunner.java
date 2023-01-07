//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
      Scanner keyboard = new Scanner(System.in);
         String choice="";
         do{
            out.print("Enter the size of the triangle : ");
            int word = keyboard.nextInt();
            out.print("Enter the letter of the triangle : ");
            char chr = keyboard.next().charAt(0);
   
               //static methods can be called using the class name
            System.out.println( TriangleFive.go(word, chr) );
   
            System.out.print("Do you want to enter more data? ");
            choice=keyboard.next();
         }while(choice.equals("Y")||choice.equals("y"));
	}
}