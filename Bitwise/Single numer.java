/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Input: [2,2,1]
Output: 1

Input: [4,1,2,1,2]
Output: 4
*/
package lc;
import java.util.*;
public class Singlenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		int a[]=new int[cases];
		for(int i=0;i<cases;i++) {
			a[i]=sc.nextInt();
		}
		int z=find(a);
		System.out.println(z);
	}
	static int find(int a[]){
		int c=0;
		for(int i=0;i<a.length;i++) {
			c^=a[i];  // XOR of a number with itself is 0.
                // XOR of a number with 0 is number itself.
		}
		return c;
	}

}

