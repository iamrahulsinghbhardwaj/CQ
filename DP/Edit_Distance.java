package DP;

public class Edit_Distance {
	
	public static int EditDistanceM(String s1,String s2) {
		int m=s1.length();
		int n=s2.length();
		
		int a[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				a[i][j]=-1;
			}
		}
		
		return EditDistanceM(s1,s2,a);
	}

	public static int EditDistanceM(String s1,String s2,int a[][]) {
		int m=s1.length();
		int n=s2.length();
		
		if(a[m][n]!=-1) {
			return a[m][n];
		}
		
		if(m==0) {
			a[m][n]=n;
			return a[m][n];
		}
		
		if(n==0) {
			a[m][n]=m;
			return a[m][n];
		}
		
		if(s1.charAt(0)==s2.charAt(0)) {
			a[m][n]=EditDistanceM(s1.substring(1),s2.substring(1),a);
		}else {
			int op1=EditDistanceM(s1,s2.substring(1),a); // Insert
			int op2=EditDistanceM(s1.substring(1),s2);   //delete
			int op3=EditDistanceM(s1.substring(1),s2.substring(1)); //substitute
			
			a[m][n]=1+Math.min(op1,Math.min(op2,op3));
		}
		
		return a[m][n];
		
	}
	
	public static int EditDistanceDP(String s1,String s2) {
		int m=s1.length();
		int n=s2.length();
		
		int a[][]=new int[m+1][n+1];
		
		for(int i=0;i<=m;i++) {
			a[i][0]=i;
		}
		
		for(int j=0;j<=n;j++) {
			a[0][j]=j;
		}
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s1.charAt(m-i)==s2.charAt(n-j)) {
					a[i][j]=a[i-1][j-1];
				}else {
					a[i][j]=1+Math.min(a[i][j-1],
							Math.min(a[i-1][j],a[i-1][j-1]));
				}
			}
		}
		
		return a[m][n];
		
	}
	
	public static void main(String[] args) {
		String s1="abcdsdvv";
		String s2="abffdsfdsfcfsdaad";
		
		System.out.println(EditDistanceDP(s1,s2));
		System.out.println(EditDistanceM(s1,s2));
	}

}
