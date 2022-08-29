import java.util.Scanner;

public class TriangleArea
{

    private static float getArea(float base, float height)
    {
        return ( base * height ) / 2;
    }

    public static void main(String[] notUsed) {
        Scanner input = new Scanner(System.in);

        while (true)
        {
            // Getting base input
            System.out.println("Input the base and height of the triangle");
            String str = input.nextLine();

            // When user wants to quit
            if (str.startsWith("s"))
                break;

            // Converting line to length and width for use
            String[] args = str.split(" ");
            float base = Float.parseFloat(args[0]);
            float height = Float.parseFloat(args[1]);

            // Getting and outputing Perimeter
            float perimeter = getArea(base, height);
            System.out.println("The Area of the triangle is: " + Float.toString(perimeter));
        }

        input.close();
    }
}