//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Box
{
	public static String go( int size )
	{
		String output="";
		for (int i = 1; i <= size; i++)
		{
			for (int j = 1; j <= size+1-i; j++)
			{
				output+="*";
			}
			for (int j = 1; j <= i; j++)
			{
				output+="#";
			}
			output+="\n";
		}
		return output;
	}
}