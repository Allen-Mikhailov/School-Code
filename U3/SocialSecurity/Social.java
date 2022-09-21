//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
	}

	public Social(String soc)
	{
	}


	public void setWord(String w)
	{
		socialNum = w;
	}

	public void chopAndAdd()
	{
		int newSum = 0;

		String[] sub = socialNum.split("-");

		for (int i = 0; i < sub.length; i++)
			newSum += Integer.parseInt(sub[i]);
		sum = newSum;
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}