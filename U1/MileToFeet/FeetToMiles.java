import java.util.Scanner;

public class FeetToMiles
{
    final private static int InchesPerMile = 63360;
    final private static int InchesPerYard = 36;
    final private static int InchesPerFoot = 12;

    public static void main(String[] notUsed) {
        // Constants
        // final int InchesPerMile = 63360;


        Scanner input = new Scanner(System.in);

        while (true)
        {
            // Getting base input
            System.out.println("Input the number of inches");
            System.out.print("Starting Inches: ");
            String str = input.nextLine();

            // When user wants to quit
            if (str.startsWith("s"))
                break;

            // Converting line to inches integer
            long StartingInches = Long.parseLong(str);
            long inches = StartingInches;

            // Miles
            long miles = inches / InchesPerMile;
            inches %= InchesPerMile;

            // Yards
            long yards = inches / InchesPerYard;
            inches %= InchesPerYard;

            // Feet
            long feet = inches / InchesPerFoot;
            inches %= InchesPerFoot;

            System.out.println(String.format("Miles: %d", miles));
            System.out.println(String.format("Yards: %d", yards));
            System.out.println(String.format("Feet: %d", feet));
            System.out.println(String.format("Inches: %d", inches));
            System.out.println();
        }

        input.close();
    }
}