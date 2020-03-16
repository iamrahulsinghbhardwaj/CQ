
import java.util.*;
class TestClass {
    public static void main(String args[] ){
     Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        while(cases!=0){
            int len=sc.nextInt();
            char[] a = sc.next().toCharArray();
            int z=find(a);
            System.out.println(z);
            cases--;
        }
    }
    static int find(char a[]){
        int c=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                c++;
            }
        }
        return c;
    	}
}
