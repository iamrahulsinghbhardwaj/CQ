import java.util.Scanner;

public class runner {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		solution.mergeSort(input);
		printArray(input);
	}
}

public class solution {

	public static void mergeSort(int[] input){
        mergeSort(input,0,input.length-1);
	}
    
    public static void mergeSort(int input[],int l,int r){
        if(l>=r){
            return ;
        }
        
        int mid=(l+r)/2;
        mergeSort(input,l,mid);
        mergeSort(input,mid+1,r);
        merge(input,l,r);
    }
    
    public static void merge(int input[],int l,int r){
        int mid=(l+r)/2;
        
        int arr[]=new int[r-l+1];
        
        int i=l;
        int j=mid+1;
        int k=0;
        
        while(i<=mid && j<=r){
            if(input[i]<input[j]){
                arr[k]=input[i];
                i++;
                k++;
            }else{
                arr[k]=input[j];
                j++;
                k++;
            }
        }
        
        while(i<=mid){
            arr[k]=input[i];
            i++;
            k++;
        }
        
         while(j<=r){
            arr[k]=input[j];
            j++;
            k++;
        }
        
        for(int index=0;index<arr.length;index++){
            input[index+l]=arr[index];
        }
        
    }
}
