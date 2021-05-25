package BinaryTree;

public class BinarySearchTree {
		private BinaryTree<Integer> root;
		
		private  void print(BinaryTree<Integer> root){
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
		
		
		
		public BinaryTree<Integer> insertData(int data,BinaryTree<Integer> root) {
			if(root==null) {
				BinaryTree<Integer> newnode=new BinaryTree<Integer>(data);
				return newnode;
			}
			
			if(root.data>data) {
				root.left=insertData(data,root.left);
			}
			
			if(root.data<data) {
				root.right=insertData(data,root.right);
			}
			
			return root;
		}
		
		public BinaryTree<Integer> deleteData(int data,BinaryTree<Integer> root){
			
			if(root==null) {
				return null;
			}
			if(root.data>data) {
				root.left=deleteData(data,root.left);
				return root;
			}else if(root.data<data) {
				root.right=deleteData(data,root.right);
				return root;
			}
			
			else {
				if(root.left==null && root.right==null) {
					return null;
				}
				
				else if(root.left==null) {
					return root.right;
				}
				else if(root.right==null) {
					return root.left;
				}
				
				else {
					BinaryTree<Integer> minNode=root.right;
					while(root.left!=null) {
						minNode=minNode.left;
					}
					root.data=minNode.data;
					root.right=deleteData(minNode.data,root.right);
					return root;
				}
				
				
			}
			
		}
		public void insertData(int data) {
			root=insertData(data,root);
		}
		
		public void deleteData(int data) {
			root=deleteData(data,root);
		}
		
		public boolean hasData(int data) {
			return hasDataHelper(data,root);
		}
		
		private boolean hasDataHelper(int data,BinaryTree<Integer> root) {
			if(root==null) {
				return false;
			}
			
			else if(data>root.data) {
				hasDataHelper(data,root.right);
			}
			else {
				hasDataHelper(data,root.right);
			}
			
			return false;
		}

		public void print() {
			
			print(root);
		}



		

		
}
