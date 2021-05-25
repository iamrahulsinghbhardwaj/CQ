package BinaryTree;

public class BinaryTree<T> {
	BinaryTree(T data){
		this.data=data;
	}
	public T data;
	public BinaryTree<T> left;
	public BinaryTree<T> right;
}
