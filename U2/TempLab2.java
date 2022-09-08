// Mrs. Lorena

import java.util.Scanner;

public class TempLab2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		boolean PlayAgain = true;

		while (PlayAgain)
		{
			System.out.print("OK, mate, what's the temperature outside? ");
			int temp = in.nextInt();

			System.out.println("Looks good for ......");

			if (temp >= 75)
				System.out.println("Swimming");

			if (temp > 60 && temp <= 85)
				System.out.println("Tennis");

			if (temp > 10 && temp <= 32)
				System.out.println("Skiing");

			if (temp <= 10)
				System.out.println("Checkers");

			if (temp > 32 && temp <= 70)
				System.out.println("Soccer");

			// Asking again
			System.out.print("Want to try again? ");
			String response = in.next();
			if (response.equals("n"))
				PlayAgain = false;
		}

		// If I dont close my IDE yells at me
		in.close();

	}
}
