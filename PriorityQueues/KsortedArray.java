package PriorityQueues;
import java.util.*;
import java.util.PriorityQueue;
public class KsortedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {2,4,1,9,6,8};
		int k=sc.nextInt();
		sort(a,k);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void sort(int a[],int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int i=0;
		for( ;i<k;i++) {
			pq.add(a[i]);
		}
		
		for( ;i<a.length;i++) {
			a[i-k]=pq.remove();
			pq.add(a[i]);
		}
		
		for(int j=a.length-k;j<a.length;j++) {
			a[j]=pq.remove();
		}
		
	}

}
