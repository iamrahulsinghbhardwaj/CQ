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
		System.out.print(DuplicateInArray.duplicate(arr));
	}
}

// sum of (n) or n-... given to the ques and sum of array the diff would be duplicate
public class DuplicateInArray{	

	public static int duplicate(int[] arr){  
        int sumarr=0;
        for(int i=0;i<arr.length;i++){
			sumarr+=arr[i];
        }
        
        int sum=((arr.length-1)*(arr.length-2))/2;
        return (sumarr-sum);
	}
}
