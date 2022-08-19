import java.util.Scanner;

public class RectPerimeter
{

    private static float getPerimeter(float length, float width)
    {
        return length*2 + width*2;
    }

    public static void main(String[] notUsed) {
        Scanner input = new Scanner(System.in);

System.out.print("*");   // Line 1
System.out.println("**");   // Line 2
System.out.println("***"); // Line 3
System.out.print("****");  // Line 4

        while (true)
        {
            // Getting base input
            System.out.println("Input the length and width");
            String str = input.nextLine();

            // When user wants to quit
            if (str.startsWith("s"))
                break;

            // Converting line to length and width for use
            String[] args = str.split(" ");
            float length = Float.parseFloat(args[0]);
            float width = Float.parseFloat(args[1]);

            // Getting and outputing Perimeter
            float perimeter = getPerimeter(length, width);
            System.out.println("The Perimeter is: " + Float.toString(perimeter));
        }

        input.close();
    }
}