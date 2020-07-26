import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(ArrayList<Integer> list) {
		for (int i : list) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		Intersection.intersection(arr1, arr2);
	}
}

//First sort both the arrays and make two indexes both staring from 0 index of arrays incase match found increment both if not found increment smallest element

import java.util.Arrays;
public class Intersection{
	
	public static void intersection(int[] arr1, int[] arr2){
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int l=0;
        int r=0;
        
        while(l<arr1.length && r<arr2.length){
			if(arr1[l]==arr2[r]){
                System.out.println(arr1[l]);
                l++;
                r++;
            }
            
            else if(arr1[l]<arr2[r]){
                l++;
            }
            
            else{
                r++;
            }
            
        }
	}
}
