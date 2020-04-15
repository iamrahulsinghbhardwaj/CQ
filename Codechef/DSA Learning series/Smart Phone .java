/*
Problem URL: https://www.codechef.com/LRNDSA01/problems/ZCO14003
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int cases=sc.nextInt();
	    long arr[]=new long[cases];
	    
	    for(int i=0;i<cases;i++){
	        arr[i]=sc.nextLong();
	    }
	    Arrays.sort(arr);
	    long sum=0,mx=Integer.MIN_VALUE;
	
	    for(int i=0;i<cases;i++){
	        sum=arr[i]*(cases-i);
	        mx=Math.max(sum,mx);
	    }
	    System.out.println(mx);
	}
}
