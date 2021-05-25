package Practice;
import java.util.*;
import java.math.*;
public class Multiply {

	public static void main(String[] args) {
			BigInteger num=new BigInteger("1");
			
			for(int i=365;i>=326;i--) {
				num=num.multiply(BigInteger.valueOf(i));
			}
			
			System.out.println(num);
	}

}
