import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            int d = Integer.parseInt(br.readLine().trim());
            Solution.rotate(input, d);
            printArray(input);

            t -= 1;
        }
    }
}


public class Solution {  

    public static void rotate(int[] arr, int d) {
        
        while(d>arr.length){
            d-=arr.length;
        }
        
        int k=0;
        
        int a[]=new int[arr.length];
        for(int i=d;i<arr.length;i++){
           a[k++]=arr[i];
        }
        
        for(int i=0;i<d;i++){
           a[k++]=arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i]=a[i];
        }
    }

}
