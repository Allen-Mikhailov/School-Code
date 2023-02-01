//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = null;

		int c = 0;
		int num = number;

		while (num > 0)
		{
			num /= 10;
			c++;
		}

		num = number;
		sorted = new int[c];
		c = 0;
		while (num > 0)
		{
			sorted[c] = num%10;
			num /= 10;
			c++;
		}

		for (int i = 0; i < sorted.length-1; i++)
		{
			int min = i;
			for (int k = i+1; k < sorted.length; k++)
			{
				if (sorted[min] > sorted[k])
					min = k;
			}
			int temp = sorted[i];
			sorted[i] = sorted[min];
			sorted[min] = temp;
		}

		return sorted;
	}
}