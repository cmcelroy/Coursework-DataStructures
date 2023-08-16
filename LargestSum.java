////////////////////////////////////////////////////////////////////////////////////////
//  Chris McElroy
//  9/23/19
//  CSC 220
//  Project 02
//  Creates a grid of arrays, 20x20, and determines the sum of 4 consecutive integers in the array.
////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class LargestSum
{
	public static void main(String[] args)
	{
		//set up scanner
		Scanner in=new Scanner(System.in);
		//create a multi-dimensional array
		int [][]array=new int[20][20];
		//declare variables
		int i,j,sum,largestSum=0,largestI=0,largestJ=0;
		//cycles through the arrays(rows and columns)
		for(i=0;i<20;i++)
			for(j=0;j<20;j++)
			{		
				array[i][j]=in.nextInt();
			}
		//cycles each row, but limits the column to 16(to prevent taking integers from another row.)
		for(i=0;i<20;i++)
			for(j=0;j<17;j++)
			{
				//adds the sum of 4 consecutive numbers
				sum=array[i][j]+array[i][j+1]+array[i][j+2]+array[i][j+3];
				if(sum>largestSum)
				{
					largestI=i;
					largestJ=j;
					largestSum=sum;
				}
			}
		//prints the largest sum.
		System.out.println(largestSum);
	}
}