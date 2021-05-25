package Graph;
import java.util.*;
import java.util.Scanner;

public class BFS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(); //no of vertices
		int e=sc.nextInt(); // no of edges
		
		int edges[][]=new int[n][n];
		
		for(int i=0;i<e;i++) {
			int fv=sc.nextInt();
			int sv=sc.nextInt();
			
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
		
		BFS(edges);
		
	}
	
	public static void printBFShelper(int edges[][],int sv,boolean visited[]) {
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(sv);
		
		int n=edges.length;
		visited[sv]=true;
		
		while(!queue.isEmpty()) {
			int front;
			
			front=queue.remove();
			
			System.out.println(front);
			
			for(int i=0;i<n;i++) {
				if(edges[front][i]==1 && !visited[i]) {
					queue.add(i);
					visited[i]=true;
				}
			}
			
		}
	}
	
	public static void BFS(int edges[][]) {
		boolean visited[]=new boolean[edges.length];
		
		for(int i=0;i<edges.length;i++) {
			if(!visited[i]) {
				printBFShelper(edges,0,visited);
			}
		}
		
	}

}
