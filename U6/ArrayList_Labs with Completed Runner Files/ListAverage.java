//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListAverage
{
	public static double go( List<Integer> ray)
	{
		int smallest = ray.get(0);
		int largest = ray.get(0);

		for (int i : ray)
		{
			smallest = Math.min(smallest, i);
			largest = Math.max(largest, i);
		}

		return (double) (smallest + largest)/2;
	}
}