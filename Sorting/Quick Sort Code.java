import java.util.Scanner;

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		Solution.quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}


public class Solution {
	
	public static void quickSort(int[] arr) {
      quickSort(arr,0,arr.length-1);
	}
    
    public static void quickSort(int arr[],int l,int r){
        if(l>=r){
            return ;
        }
        
        int pv=partition(arr,l,r);
        quickSort(arr,l,pv-1);
        quickSort(arr,pv+1,r);
    }
    
    public static int partition(int arr[],int l,int r){
        int pivot=arr[l];
        
        int count=0;
        
        for(int i=l+1;i<=r;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        
        int pivotindex=l+count;
        
        arr[l]=arr[pivotindex];
        arr[pivotindex]=pivot;
        
        int i=l,j=r;
        
        while(i<=j){
            
            while(i<=r && arr[i]<=pivot){
                i++;
            }
            
            while(arr[j]>pivot){
                j--;
            }
            
            if(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return pivotindex;
    }
}
