package PriorityQueues;
import java.util.*;
public class PriorityQueueUse {
	private ArrayList<Integer> heap;
	
	PriorityQueueUse(){
		heap=new ArrayList<>();
	}
	
	boolean isEmpty(){
		return heap.size()==0;
	}
	
	int size() {
		return heap.size();
	}
	
	int getMin() throws PriorityQueueException {
		if(isEmpty()) {
			throw new PriorityQueueException();
		}
		
		return heap.get(0);
	}
	
	void insert(int element) {
		heap.add(element);
		
		int childrenindex=heap.size()-1;
		int parentindex=(childrenindex-1)/2;
		
		while(childrenindex>0) {
			if(heap.get(childrenindex)<heap.get(parentindex)) {
				int temp=heap.get(childrenindex);
				heap.set(childrenindex,parentindex);
				heap.set(parentindex,temp);
				
				childrenindex=parentindex;
				parentindex=(childrenindex-1)/2;
			}else {
				return;
			}
		}
		
		
	}
}
