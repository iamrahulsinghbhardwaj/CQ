package Recrssion;
import java.util.*;
public class splitarray {
		static Scanner s = new Scanner(System.in);
		
		public static void main(String[] args) {
			int n = s.nextInt();
			int input[] = new int[n];
			for(int i = 0; i < n; i++) {
				input[i] = s.nextInt();
			}
			System.out.println(splitArray(input));
		}

		public static boolean splitArray(int input[]) {
			return splitArray(input,0,input.length-1,0,0);
		}
		
		public static boolean splitArray(int input[],int start,int end,int lsum,int rsum) {
			if(start>end) {
				return lsum==rsum;
			}
			
			if(input[start]%5==0) {
				return splitArray(input,start+1,end,lsum+input[start],rsum);
			}
			
			else if(input[start]%3==0) {
				return splitArray(input,start+1,end,lsum,rsum+input[start]);
			}else {
				return splitArray(input,start+1,end,lsum+input[start],rsum) || splitArray(input,start+1,end,lsum,rsum+input[start])	;
		}
}
}
