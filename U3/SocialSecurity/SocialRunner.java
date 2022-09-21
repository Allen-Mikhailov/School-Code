//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class SocialRunner
{
	public static void main( String args[] )
	{
		Social s = new Social();
		s.setWord("456-56-234");
		s.chopAndAdd();
		System.out.println(s);
		
		s.setWord("1-1-1");
		s.chopAndAdd();
		System.out.println(s);

		s.setWord("102-2-12");
		s.chopAndAdd();
		System.out.println(s);

		s.setWord("0-0-0");
		s.chopAndAdd();
		System.out.println(s);
	}
}