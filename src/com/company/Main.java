package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] data = {-4, 11, 7, -12, 6, 1};
        for ( int s = 0; s < data.length; s++)
        {
            int smallestInd = s;
            for (int c = s + 1; c < data.length; c++)
                if ( data[c] < data[smallestInd] )
                    smallestInd = c;
                swap(data, smallestInd, s);
                for (int e : data)
                System.out.print(e + " ");
                System.out.println("");
        }
    }

    static void swap ( int[] array, int ind1,int ind2)
    {
        int tmp = array [ind2];
        array [ind2] = array [ind1];
        array [ind1] = tmp;
    }
}
