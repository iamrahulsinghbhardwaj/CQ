/*
Problem URL: https://www.codechef.com/LRNDSA01/problems/CARVANS
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int cases=sc.nextInt();
	    while(cases!=0){
	        int c1=sc.nextInt();
	        int a[]=new int[c1];
	        for(int i=0;i<c1;i++){
	            a[i]=sc.nextInt();
	        }
	        System.out.println(find(a));
	        cases--;
	    }
	}
	static int find(int a[]){
	    int c=1;
	    int base_case=a[0];
	    for(int i=1;i<a.length;i++){
	        if(base_case>a[i]){
	            c++;
	            base_case=a[i];
	        }
	    }
	    return c;
	}
}
