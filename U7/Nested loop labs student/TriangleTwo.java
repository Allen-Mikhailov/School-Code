//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class TriangleTwo
{
	public static String go( int size, String let )
	{
		String output="";
		for (int i = 1; i <= size; i++)
		{
			for (int j = 1; j <= size+1-i; j++)
			{
				output+=let;
			}
			output+="\n";
		}
		return output;
	}
}