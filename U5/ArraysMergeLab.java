import java.util.Arrays;

public class ArraysMergeLab
{
    public static void main ( String args[] )
    {
        int [ ] x = { 2,3, 11,56,350};
        int [ ] y = { 4,6, 17,18,20, 100,200, 300, 400, 1350};
        System.out.println("Arrays before merge");
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        System.out.println("Merged Array");
        System.out.println(Arrays.toString(merge(y,x)));
    }
    public static int [] merge( int [] a, int [] b )
    {
        int[] merged = new int[a.length+b.length];
        int ai = 0;
        int bi = 0;

        int i;
        for (i = 0; bi != b.length && ai != a.length; i++)
        {
            if (a[ai] < b[bi])
            {
                merged[i] = a[ai];
                ai++;
            } else {
                merged[i] = b[bi];
                bi++;
            }
        }

        if (ai == a.length)
        {
            for (int j = bi; j < b.length; j++)
            {
                merged[i] = b[j];
                i++;
            }
        } else {
            for (int j = ai; j < a.length; j++)
            {
                merged[i] = a[j];
                i++;
            }
        }

        return merged;
    }
}