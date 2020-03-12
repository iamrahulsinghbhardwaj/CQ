//one case is not working in progress!!!
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int arrSize = scan.nextInt();
		int arr[] = new int[arrSize];
		int rounds = scan.nextInt();
    		for(int i=0;i<arrSize;i++){
          arr[i]=scan.nextInt();
        }
int b[]=new int[arrSize];
int k=0;
if(rounds>arrSize){ //if rounds are greater then
  while(rounds>arrSize){
    rounds=rounds-arrSize;
  }
  
}
//System.out.println(rounds);
  for(int i=rounds-1;i<arrSize;i++){ //start from round index fill it in first index of other aray
    b[k++]=arr[i];
  }
  for(int i=0;i<(rounds-1);i++){
    b[k++]=arr[i];
  }
  for(int i=0;i<arrSize;i++){
    System.out.print(b[i]+" ");
  }
System.out.println();
for(int i=0;i<arrSize;i++){
    System.out.print(b[i]+48+" ");
  }
 }
}
