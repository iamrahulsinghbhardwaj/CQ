package DP;
import java.util.*;
public class Minstepsto1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		
		System.out.println(ans(x));
	}
	
	public static int ans(int x) {
		if(x==1) {
			return 0;
		}
		
		int a1=ans(x-1);
		System.out.println("a1 "+a1+" "+x);
		int b1=Integer.MAX_VALUE;
		int c1=Integer.MAX_VALUE;
		
		if(x%3==0) {
			b1=ans(x/3);
		}
		
		if(x%2==0) {
			c1=ans(x/2);
		}
		
		return 1+Math.min(a1, Math.min(b1, c1));
	}

}
