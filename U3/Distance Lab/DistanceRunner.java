//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add a Scanner for keyboard input
		Scanner kb = new Scanner( System.in );
		System.out.print( "Enter X1 :: " );
		int x1 = kb.nextInt();
		System.out.print( "Enter Y1 :: " );
		int y1 = kb.nextInt();
		System.out.print( "Enter X2 :: " );
		int x2 = kb.nextInt();
		System.out.print( "Enter Y2 :: " );
		int y2 = kb.nextInt();
		System.out.printf("Distance :: %.3f", Distance.getDistance(x1, y1, x2, y2));

		kb.close();
		
		//add test cases					
	}
}

/*

Sample Data :
1 1 2 1
1 1 -2 2
1 1 0 0 
 


Sample Output : 
Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 2
Enter Y2 :: 1
distance == 1.000


Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: -2
Enter Y2 :: 2
distance == 3.162


Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 0
Enter Y2 :: 0
distance == 1.414

*/