package DP;

public class KnapsackMemoization {
	
	public static int find(int wt[],int val[],int w,int n) {
		int a[][]=new int[n+1][w+1];
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				a[i][j]=-1;
			}
		}
		
		return find(wt,val,w,n,a);
	}
	
	public static int find(int wt[],int val[],int w,int n,int a[][]) {
		if(n==0 || w==0) {
			return 0;
		}
		
		if(a[n][w]!=-1) {
			return a[n][w];
		}
		
		if(wt[n-1]>w) {
			return find(wt,val,w,n-1,a);
		}
		
		return a[n][w]=Math.max(val[n-1]+find(wt,val,w-wt[n-1],n-1,a),find(wt,val,w,n-1,a));
	}

	public static void main(String[] args) {
		 int val[] = { 60, 100, 120 };   
		    int wt[] = { 10, 20, 30 };   
		     
		    int W = 50;  
		    int N = val.length;         
		     
		    System.out.println(find(wt,val,W,N));  
	}

}
