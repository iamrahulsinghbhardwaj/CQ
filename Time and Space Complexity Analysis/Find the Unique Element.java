import java.util.Scanner;

public class Main {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(FindUnique.findUnique(arr));
	}
}

//xor is associative it means we can write array of 1 2 3 1 3 as 1 1 3 3 1 and xor with itself is 0 
public class FindUnique{	

	public static int findUnique(int[] arr){
        int c=0;
        
        for(int i=0;i<arr.length;i++){
            c^=arr[i];
        }
        
        return c;
	}
}
