package LinkedLast;

import java.util.Scanner;

public class PalidromeLL {

	public static void main(String[] args) {
		Node<Integer> head=takeInput();
	
		
	}
	

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
        
        if(head==null || head.next==null){
            return true;
        }
        
         LinkedListNode<Integer> curr=head;
        LinkedListNode<Integer> prev=null;
        LinkedListNode<Integer> temp;
        
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        
        while(head!=null && prev!=null){
            if(head.data==prev.data){
                head=head.next;
                prev=prev.next;
            }else{
                return false;
            }
        }
        
        return false;
        
        
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
	class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    
	    public LinkedListNode(T data) {
	        this.data = data;
	    }
	}
}
