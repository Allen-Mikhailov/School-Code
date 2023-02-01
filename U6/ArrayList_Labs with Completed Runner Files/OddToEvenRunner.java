//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ListOddToEven s = new ListOddToEven();

		ArrayList<String> arrList = new ArrayList<String>();

arrList.add("A");

arrList.add("B");

arrList.add("C");

arrList.add("D");

for (int i = 0; i < arrList.size(); i++)

{

System.out.print(arrList.remove(i));

}

// System.out.println(syllables);
		
		System.out.println( s.go( Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11) ) );
		System.out.println( s.go( Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7) ) );
		System.out.println( s.go( Arrays.asList(10,20,30,40,5,41,31,20,11,7) ) );
		System.out.println( s.go( Arrays.asList(32767,70,4,5,6,7) ) );
		System.out.println( s.go( Arrays.asList(2,7,11,21,5,7) ) );
		System.out.println( s.go( Arrays.asList(7,255,11,255,100,3,2) ) );
		System.out.println( s.go( Arrays.asList(9,11,11,11,7,1000,3) ) );
		System.out.println( s.go( Arrays.asList(7,7,7,11,2,7,7,11,11,2) ) );
		System.out.println( s.go( Arrays.asList(2,4,6,8,8) ) );	
	}
}



/*

10
8
3
4
-1
6
5
9
-1


*/