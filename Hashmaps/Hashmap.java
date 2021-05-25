package Hashmaps;
import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map=new HashMap<>(); 
		
		map.put("Rahul",1);
		map.put("Singh", 2);
		
		if(map.containsKey("Rahul")) {
			System.out.println("Yes Rahul");
		}
		
		System.out.println(map.size());
		
		int v=map.get("Singh");
		
		
		System.out.println(v);
		
		
		Set<String> keys=map.keySet();
		
		for(String str: keys) {
			System.out.print(str+" ");
		}
	}

}
