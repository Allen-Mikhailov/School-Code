//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class BoxWord
{
	public static String go( String word )
	{
		String output="";
		for (int y = 0; y < word.length(); y++)
		{
			for (int x = 0; x < word.length(); x++)
			{
				if (y == 0)
					output+=word.charAt(x);
				else if (y == word.length()-1)
					output+=word.charAt(word.length()-1-x);
				else if (x == 0)
					output+=word.charAt(y);
				else if (x == word.length()-1)
					output+=word.charAt(word.length()-1-y);
				else 
					output+=" ";
			}
			output+="\n";
		}


		return output+"\n";
	}
}