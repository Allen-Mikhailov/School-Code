//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static int[] go(int[] ray)
	{
		int[] filled = {0, 0, 0};

		int c = 0;
		for (int i = 0; i < ray.length; i++)
		{
			if (ray[i] > 11)
			{
				filled[c] = ray[i];
				c++;
				if (c == 3)
					break;
			}
		}

		return filled;
	}
}