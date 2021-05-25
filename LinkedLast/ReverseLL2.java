package LinkedLast;

import java.util.Scanner;

public class ReverseLL2 {

	
	public static Node<Integer> reverseLL(Node<Integer> head) {
		if(head.next==null || head==null) {
			return head;
		}
		
		Node<Integer> reverseTail=head.next;
		Node<Integer> smallhead=reverseLL(head.next);
		
		reverseTail.next=head;
		head.next=null;
		
		return smallhead;
	}
	
	public static Node<Integer> takeInput(){
		Node<Integer> head=null,tail=null;
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		
		while(data!=-1) {
			Node<Integer> newNode=new Node<Integer>(data);
			
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;  // 1 2 3 node of 3 should point to 4 so tail.next=newNode
				tail=newNode;       // now 4 is out last index so node must be 4
			}
			
			data=sc.nextInt();
		}
		
		return head;
	}
	
	public static void print(Node<Integer> head){
		while(head!=null) {
			System.out.println(head.data+" ");
			head=head.next;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		Node<Integer> ans=reverseLL(head);
		print(ans);
	}

}
