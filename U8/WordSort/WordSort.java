//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   wordRay = line.split(" ");
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
		for (int i = 0; i < wordRay.length-1; i++)
		{
			int min = i;
			for (int k = i+1; k < wordRay.length; k++)
			{
				if (wordRay[min].compareTo(wordRay[k]) > 0)
					min = k;
			}
			String temp = wordRay[i];
			wordRay[i] = wordRay[min];
			wordRay[min] = temp;
		}
	}

	public String toString( )
	{
		String output="";
		for (int i = 0; i < wordRay.length; i++)
		{
			output += "word :: "+i+ " "+wordRay[i] + "\n";
		} 
		return output+"\n\n";
	}
}