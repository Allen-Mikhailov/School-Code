//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class MergeSort
{
	private static int passCount;

	public static void display(Comparable[] list)
	{
		String out = "Pass: "+passCount+" [ ";
		for (int i = 0; i < list.length; i++)
		{
			out+= list[i].toString()+", ";
		}
		System.out.println(out+"]\n");
	}

	public static Comparable[] mergeSort(Comparable[] list)
	{


		passCount=0;
		mergeSort(list, 0, list.length);
		System.out.println();
		return list;
	}

	private static void mergeSort( Comparable[] list, int front, int back)  //O( Log N )
	{

		int mid = (front+back)/2;
		if(mid==front) return;
		mergeSort(list, front, mid);
		mergeSort(list, mid, back);
		merge(list, front, back);

		display(list);
		passCount++;
	}

	private static void merge(Comparable[] stuff, int front, int back)  //O(N)
	{
			int dif = back-front, spot = 0;
			Comparable[] temp = new Comparable[ dif ];
			int beg = front;
			int mid = (front+back)/2;
			int saveMid = mid;
			while( beg<saveMid && mid<back ) {
				if(stuff[ beg ].compareTo(stuff[ mid ]) < 0)
					temp[ spot++ ]= stuff[ beg++ ];
				else
					temp[ spot++ ]= stuff[ mid++ ];
			}
			while( beg < saveMid )
				temp[ spot++ ]= stuff[ beg++ ];
			while( mid < back )
				temp[ spot++ ]= stuff[ mid++ ];
			for(int i = 0; i < dif; ++i)
				stuff[front+i]=temp[i];
	}
}