import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial of:");
        int N = input.nextInt();
        
        BigInteger res = new BigInteger("1");
        if(N==0 || N==1) {
        	System.out.println(1);
        	return;
        }
        for(int i = 2; i <= N; i++)
        {
            BigInteger multiplier = new BigInteger(String.valueOf(i));
            res = res.multiply(multiplier);
        }
        
        System.out.println(res);
    }
}