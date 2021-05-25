package Trees;
import java.util.*;
public class TreeUse {
	
	public static void printpostorder(TreeNode<Integer> root) {
		if(root==null) {
			return ;
		}
		
		for(int i=0;i<root.children.size();i++) {
			printpostorder(root.children.get(i));
			System.out.println(root.data);
		}
	}
	public static void printpreorder(TreeNode<Integer> root){
		if(root==null) {
			return ;
		}
		
		System.out.println(root.data);
		
		for(int i=0;i<root.children.size();i++) {
			printpreorder(root.children.get(i));
		}
	}
	
	public static void printAtk(TreeNode<Integer> root,int k) {
		if(k<0) {
			return ;
		}
		
		if(k==0) {
			System.out.println(root.data);
		}
			
	
		
		for(int i=0;i<root.children.size();i++) {
			printAtk(root.children.get(i),k-1);
		}
	}
	
	public static int largestnode(TreeNode<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		
		int ans=root.data;
		for(int i=0;i<root.children.size();i++) {
			int childlargest=largestnode(root.children.get(i));
			
			if(childlargest>ans) {
				ans=childlargest;
			}
		}
		
		return ans;
	}
	
	public static int numNodes(TreeNode<Integer>root) {
		int count=1;
		
		for(int i=0;i<root.children.size();i++) {
			count+=numNodes(root.children.get(i));
		}
		
		return count;
	}
	
	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter root data");
		int rootData=sc.nextInt();
		
		QueueUsingLL<TreeNode<Integer>> pendingNode=new QueueUsingLL<>();
		
		TreeNode<Integer> root=new TreeNode<>(rootData);
		
		pendingNode.enqueue(root);
		
		while(!pendingNode.isEmpty()) {
			try {
				TreeNode<Integer> frontNode=pendingNode.dequeue();
				
				System.out.println("Enter no of children of " +frontNode.data);
				
				int numChildren=sc.nextInt();
				
				for(int i=0;i<numChildren;i++) {
					System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
					
					int child=sc.nextInt();
					
					TreeNode<Integer> childNode=new TreeNode<>(child);
					
					frontNode.children.add(childNode);
					
					pendingNode.enqueue(childNode);
				}
			} catch (QueueFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return root;
		
	}

	public static TreeNode<Integer> takeInput(Scanner sc){
			
			System.out.println("Enter next node data");
			
			int n=sc.nextInt();
			
			TreeNode<Integer> root=new TreeNode<Integer>(n);
			System.out.println("Enter no of childrens for "+n);
			
			int children=sc.nextInt();
			
			for(int i=0;i<children;i++) {
				TreeNode<Integer> child=takeInput(sc);
				
				root.children.add(child);
			}
			
			
			return root;
			
	}
	
	
	public static void print(TreeNode<Integer> root) {
		String s=root.data+":";
		
		for(int i=0;i<root.children.size();i++) {
			s+=root.children.get(i).data;
		}
		
		System.out.println(s);
		
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	
	public static void printLevelWise(TreeNode<Integer> root) {
		if(root==null) {
			return ;
		}
		
		QueueUsingLL<TreeNode<Integer>> q=new QueueUsingLL<>();
		
 	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//TreeNode<Integer> 	root =takeInput(sc);
		TreeNode<Integer> root=takeInputLevelWise();
//		printLevelWise(root);
//		print(root);
//		
//		System.out.println(numNodes(root));
//		
//		System.out.println(largestnode(root));
		
		//printAtk(root,3);
		//printpreorder(root);
		printpostorder(root);
//		TreeNode<Integer> root =new TreeNode<Integer>(4);
//		
//		TreeNode<Integer> node1=new TreeNode<Integer>(2);
//		TreeNode<Integer> node2=new TreeNode<Integer>(1);
//		TreeNode<Integer> node3=new TreeNode<Integer>(3);
//		TreeNode<Integer> node4=new TreeNode<Integer>(5);
//		
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node2.children.add(node4);
		
	}
	

}
