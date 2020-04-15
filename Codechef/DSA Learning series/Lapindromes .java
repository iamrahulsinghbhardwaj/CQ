/*
Problem URL https://www.codechef.com/LRNDSA01/problems/LAPIN
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
	        String str=sc.next();
	        check(str);
	        cases--;
	    }
	}
	static void check(String str){
	    int a[]=new int[26];	 
	    int b[]=new int[26];
        int len=str.length();
        
        for(int i=0;i<len/2;i++){
            a[str.charAt(i)-'a']++;
            b[str.charAt(len-i-1)-'a']++; // taking freq of both half
        }
        boolean flag=true;
        
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){  //then just compare
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
	}
}

