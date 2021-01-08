import java.util.Scanner;
public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
         for(int ctr = 1; ctr <= 10; ctr++){
            int multiples = N * ctr;
            System.out.print(N + " x " + ctr + " = " + multiples + "\n"); 
         }
        scanner.close();
    }
}
