import java.util.Scanner;
class Prime 
{ 
 
	 static boolean isPrime(int n) 
	 {	 
 
		 if (n <= 1) { 
			 return false;
		 }

 
		 for (int i = 2; i < n; i++) { 
			 if (n % i == 0) { 
				 return false;
			 }
		 }

		 return true; 
	 } 

 
	 static void printPrime(int n) 
	 { 
		 for (int i = 2; i <= n; i++) 
		 { 
			 if (isPrime(i)) 
				 System.out.print(i + " "); 
		 } 
	 } 

	 public static void main(String[] args) 
	 { 
		 int n;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of n:");
		 n = sc.nextInt();
		 Prime p = new Prime();
		 p.printPrime(n);
	 } 
} 
