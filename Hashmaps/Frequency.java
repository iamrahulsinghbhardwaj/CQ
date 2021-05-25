package Hashmaps;
import java.util.*;
public class Frequency {
	
	public static ArrayList<Integer> deleteduplicate(int a[]){
		ArrayList<Integer> output=new ArrayList<>();
		
		HashMap<Integer,Boolean> map=new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				continue;
			}
			
			output.add(a[i]);
			map.put(a[i],true);
		}
		
		return output;
	}

	public static void main(String[] args) {
		
		int a[]= {1,2,2,3,4,5,5,6,77,8,9};
		
		ArrayList<Integer> output=deleteduplicate(a);
		
		for(Integer x:output) {
			System.out.print(x+" ");
		}
	}

}
