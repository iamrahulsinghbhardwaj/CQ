package DP;

public class MinCostPath {
	
	public static int minCostPath(int a[][]) {
		return	minCostPath(a,0,0);
	}
	
	public static int minCostPath(int a[][],int i,int j) {
		int m=a.length; //length of rows
		int n=a[0].length; // length of colm
		
		//base case
		
		if(i==m-1 && j==n-1) {	
			return a[i][j];
		}
		
		//out of boundary cases
		if(i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}
		
		int op1=minCostPath(a,i,j+1);
		int op2=minCostPath(a,i+1,j+1);
		int op3=minCostPath(a,i+1,j);
		
		return a[i][j]+Math.min(op1,Math.min(op2, op3));
		
	}
	
	public static int minCostPathM(int a[][]) {
		int m=a.length;
		int n=a[0].length;
		
		int storage[][]=new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				storage[i][j]=-1;
			}
		}
	
	
		return minCostPathM(a,0,0,storage);
		
	}
	
	public static int minCostPathM(int a[][],int i,int j,int storage[][]) {
		int m=a.length;
		int n=a[0].length;
		
		if(i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}
		
		if(i==m-1 && j==n-1) {
			storage[m-1][n-1]=a[i][j];
			return storage[i][j];
		}
		
		
		if(storage[i][j]!=-1) {
			return storage[i][j];
		}
		
		int op1=minCostPathM(a,i,j+1,storage);
		int op2=minCostPathM(a,i+1,j+1,storage);
		int op3=minCostPathM(a,i+1,j,storage);
		
		storage[i][j]=a[i][j]+Math.min(op1,Math.min(op2, op3));
		
		return storage[i][j];
		
	}
	
	public static int minCostPathDP(int a[][]) {
		int m=a.length;
		int n=a[0].length;
		
		int storage[][]=new int[m][n];
		
		storage[m-1][n-1]=a[m-1][n-1];//Last Element
		
		//Last Row
		for(int i=n-2;i>=0;i--) {
			storage[m-1][i]=storage[m-1][i+1]+a[m-1][i];
		}
		
		//Last Colmn
		
		for(int j=m-2;j>=0;j--) {
			storage[j][n-1]=storage[j+1][n-1]+a[j][n-1];
		}
		
		for(int i=m-2;i>=0;i--) {
			for(int j=n-2;j>=0;j--) {
				storage[i][j]=a[i][j]+Math.min(storage[i][j+1],
						Math.min(storage[i+1][j+1],storage[i+1][j]));
			}
		}
		
		return storage[0][0];
	}

	public static void main(String[] args) {
		int a[][]= {{1,1,1},{4,5,2},{7,8,9}};
		
		System.out.println(minCostPath(a)); //Using Recursion
		System.out.println(minCostPathM(a)); //Using Memoization
		System.out.println(minCostPathDP(a));//Using DP
	}
	
}
