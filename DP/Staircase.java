package DP;
import java.util.*;
public class Staircase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pos=sc.nextInt();
		System.out.println(StairCaseR(pos));
	}
	
	public static int StairCaseR(int pos) {
		if(pos<0) {
			return 0;
		}
		
		if(pos==0) {
			return 1;
		}
		
		return StairCaseR(pos-1)+StairCaseR(pos-2)+StairCaseR(pos-3);
	}

}
