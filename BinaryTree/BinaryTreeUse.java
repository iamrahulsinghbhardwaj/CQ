package BinaryTree;
import java.util.*;
public class BinaryTreeUse {

	public static void print(BinaryTree<Integer> root){
		if(root==null) {
			return ;
		}
		String toprint=root.data+" ";
		
		if(root.left!=null) {
			toprint+="L"+root.left.data+" ";
		}
		
		if(root.right!=null) {
			toprint+="R"+root.right.data+" ";
		}
		
		System.out.println(toprint);
		
		print(root.left);
		print(root.right);
	}
	public static BinaryTree<Integer> takeinput(Scanner s) {
		
		System.out.println("Enter root data");
		int rootdata=s.nextInt();
		
		if(rootdata==-1) {
			return null;
		}
		
		BinaryTree<Integer> root=new BinaryTree<Integer>(rootdata);
		
		root.left=takeinput(s);
		root.right=takeinput(s);
		
		return root;
	}
	
	
	public static BinaryTree<Integer> takeInputlevelwise() throws QueueFullException {
		Scanner s = new Scanner(System.in);
		QueueUsingLL<BinaryTree<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);
		pendingNodes.enqueue(root);
		
		while (!pendingNodes.isEmpty()) {
			BinaryTree<Integer> front;
			front = pendingNodes.dequeue();
			System.out.println("Enter left child of " + front.data);
			int leftChild = s.nextInt();
			if (leftChild != -1) {
				BinaryTree<Integer> child = new BinaryTree<Integer>(leftChild);
				pendingNodes.enqueue(child);
				front.left = child;
			}
			
			System.out.println("Enter right child of " + front.data);
			int rightChild = s.nextInt();
			if (rightChild != -1) {
				BinaryTree<Integer> child = new BinaryTree<Integer>(rightChild);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}
		return root;
	}
	
	public static int countnodes(BinaryTree<Integer> root) {
		if(root==null) {
			return 0;
		}
		int a=1;
		a+=countnodes(root.left);
		a+=countnodes(root.right);
		
		return a;
	}
	
	public static int diameter(BinaryTree<Integer> root) {
		if(root==null) {
			return 0;
		}
		int option1=height(root.left)+height(root.right);
		
		int option2=diameter(root.left);
		int option3=diameter(root.right);
		
		return Math.max(option1,Math.max(option2, option3));
	}
	public static int height(BinaryTree<Integer> root) {
		if(root==null) {
			return 0;
		}
		
		return 1+ Math.max(height(root.left),height(root.right));
	}
	
	public static Pair<Integer,Integer> heightDiameter(BinaryTree<Integer> root){
		if(root==null) {
			Pair<Integer,Integer> output=new Pair<>();
			
			output.first=0;
			output.second=0;
			
			return output;
		}
		
		Pair<Integer,Integer> lo=heightDiameter(root.left);
		Pair<Integer,Integer> ro=heightDiameter(root.right);
		
		int height=1+Math.max(lo.first,ro.first);
		
		int option1=lo.first+ro.first;
		int option2=lo.second;
		int option3=ro.second;
		
		int diameter=Math.max(option1, Math.max(option2, option3));
		
		
		Pair<Integer,Integer> output=new Pair<>();
		
		output.first=height;
		output.second=diameter;
		
		return output;	
	}
	
	public static void inorder(BinaryTree<Integer> root) {
		if(root==null) {
			return ;
		}
		
		inorder(root.left);
		System.out.println(root.data+" ");
		inorder(root.right);
	}
	public static int minimum1(BinaryTree<Integer> root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		
		return Math.min(root.data, Math.min(minimum1(root.left),minimum1(root.left)));
	}
	
	public static int maximum(BinaryTree<Integer> root) {
		
		
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		
		return Math.max(root.data,Math.max(maximum(root.left), maximum(root.right)));
		
	}
	public static boolean isBST(BinaryTree<Integer> root) {
		if(root==null) {
			return true;
		}
		
		int leftmax=maximum(root.left);
		int rightmax=minimum1(root.right);
		
		if(root.data<=leftmax) {
			return false;
		}
		
		if(root.data>=rightmax) {
			return false;
		}
		
		boolean isleftBST=isBST(root.left);
		boolean isrightBST=isBST(root.right);
		
		if(isleftBST && isrightBST) {
			return true;
		}else {
			return false;
		}
	}
	
	public static ArrayList<Integer> getRootToNodepath(BinaryTree<Integer> root,int data){
		if(root==null) {
			return null;
		}
		
		if(root.data==data) {
			ArrayList<Integer> output=new ArrayList<>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> leftoutput=getRootToNodepath(root.left,data);
		if(leftoutput!=null) {
			leftoutput.add(root.data);
			return leftoutput;
		}
		
		ArrayList<Integer> rightoutput=getRootToNodepath(root.right,data);
		if(rightoutput!=null) {
			rightoutput.add(root.data);
			return rightoutput;
		}else {
			return null;
		}
		
	}
	
	public static void main(String[] args) throws QueueFullException {
//		
//		Scanner sc=new Scanner(System.in);
//		BinaryTree<Integer> root=takeInputlevelwise();
//		print(root);
//		System.out.println(countnodes(root));
//		System.out.println(diameter(root));
//		
//		System.out.println("diameter"+heightDiameter(root).second);
//		System.out.println("height"+heightDiameter(root).first);
		
	//	System.out.print(isBST(root));
//	BinaryTree<Integer>  root=new BinaryTree<>(2);
//	BinaryTree<Integer> node1=new BinaryTree<>(10);
//	
//	root.left=node1;
//	
//	BinaryTree<Integer> node2=new BinaryTree<>(20);
//	
//	root.right=node2;
		
		BinarySearchTree bst=new BinarySearchTree();
		bst.insertData(10);
		bst.insertData(20);
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(3);
		bst.insertData(7);
		bst.print();
	}

}
