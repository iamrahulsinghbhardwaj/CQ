package DP;

public class LCS {
	
	public static int lcs(String s1,String s2) {
		if(s1.length()==0 || s2.length()==0) {
			return 0;
		}
		
		if(s1.charAt(0)==s2.charAt(0)) {
			return 1+lcs(s1.substring(1),s2.substring(1));
		}else {
			int l1=lcs(s1.substring(1),s2);
			int l2=lcs(s1,s2.substring(1));
			
			return Math.max(l1, l2);
		}
		
	}
	
	public static int lcsM(String s1,String s2) {
		int a[][]=new int[s1.length()+1][s2.length()+1];
		
		for(int i=0;i<s1.length()+1;i++) {
			for(int j=0;j<s2.length()+1;j++) {
				a[i][j]=-1;
			}
		}
		return lcsM(s1,s2,a);
	}
	
	public static int lcsM(String s1,String s2,int a[][]) {
			int m=s1.length();
			int n=s2.length();
			
			if(a[m][n]!=-1) {
				return a[m][n];
			}
			
			if(m==0 || n==0) {
				a[m][n]=0;
				return a[m][n];
			}
			
			if(s1.charAt(0)==s2.charAt(0)){
					a[m][n]=1+lcsM(s1.substring(1),s2.substring(1),a);
			}else {
				int op1=lcsM(s1.substring(1),s2,a);
				int op2=lcsM(s1,s2.substring(1),a);
				a[m][n]=Math.max(op1, op2);
			}
			
			return a[m][n];
	}
	
	public static int lcsDP(String s1,String s2) {
		int m=s1.length();
		int n=s2.length();
		
		int[][] a=new int[m+1][n+1];
		
		for(int i=0;i<=m;i++) {
			a[i][0]=0;
		}
		
		for(int j=0;j<=n;j++) {
			a[0][j]=0;
		}
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s1.charAt(m-i)==s2.charAt(n-j)) {
					a[i][j]=1+a[i-1][j-1];
				}else {
					a[i][j]=Math.max(a[i][j-1],a[i-1][j]);
				}
			}
		}
		
		return a[m][n];
	}

	public static void main(String[] args) {
		
		String s1="abcdfadsfdsakjfkdlsjaflkjdfasdfds";
		String s2="cdeffdsaffdsfsd";
		
		System.out.println(lcsDP(s1,s2));//DP
		System.out.println(lcsM(s1,s2));// Memoization
		System.out.println(lcs(s1,s2)); //Recurssion

	}

}
