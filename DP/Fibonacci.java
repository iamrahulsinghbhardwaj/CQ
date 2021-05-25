package DP;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		System.out.println(fibTB(x));//using DP top to bottom technique
		System.out.println(fibM(x));//using DP bottom to up technique
		System.out.println(fibrec(x));//using Recursion
	}
	
	public static int fibrec(int x) {
		if(x==0 || x==1) {
			return x;
		}
		
		return fibrec(x-1)+fibrec(x-2);
	}
	
	public static int fibM(int x) {
		
		int a[]=new int[x+1];
		
		for(int i=0;i<=x;i++) {
			a[i]=-1;
		}
		
		return fibM(a,x);
		
	}
	
	public static int fibM(int a[],int x) {
		if(x==0 || x==1) {
			a[x]=x;
			return a[x];
		}
		
		if(a[x]!=-1) {
			return a[x];
		}
		
		a[x]=fibM(a,x-1)+fibM(a,x-2);
		
		return a[x];
	}
	
	public static int fibTB(int x) {
		int a[]=new int[x+1];
		a[0]=0;
		a[1]=1;
		
		for(int i=2;i<=x;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		
		return a[x];
	}

}
