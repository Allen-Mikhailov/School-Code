//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleFive
{
	public static String go( int amount, char letter )
	{
		String output="";
		for (int i = 0; i < amount; i++)
		{
			char tempL = letter;
			for (int x = 0; x<amount-i; x++)
			{
				for (int y = 0; y < amount-x; y++)
				{
					output+=tempL;
				}
				tempL++;
				output+=" ";
			}
			output+="\n";
		}
		return output;
	}
}