// Name
// Date
/* Complete the main method below
 * Write code to generate a random number between 1 and 3 inclusive
 * based on the number generated perform the corresponding calculation
 *
 */

public class MathClassLab
{
	public static void main (String args[])
	{
		int n = 1 + (int) Math.floor(Math.random()*3);
		// int n= // generate a random number between 1 and 3 inclusive
		
		if (n==1)
		{
			//write code to find and display the area of a circle with radius 10 units. Must use Math.PI
			double r = 10;
			double radius = Math.PI*r*r;
			System.out.println("Radius: "+ radius);
		}
		
		if (n==2)
		{
			//write code to find and display the volume of a sphere with radius 10 units. Must use Math.PI
			double r = 10;
			double volume = Math.PI*Math.pow(r, 3) * 4.0/3;
			System.out.println("Volume: "+ volume);
		}
		
		if (n==3)
		{
			//write code to find and display the distance between (5, 5) and (12, 6)
			// use the distance formula 
			double distance = Math.sqrt(Math.pow(5-12, 2) + Math.pow(5-6, 2)); 
			System.out.println("Distance: "+ distance);
		}
			
			
	}
}

