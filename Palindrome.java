import java.util.Scanner;
public class Palindrome {
	
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();
		
		int original = num;
		int rev = 0;
		int remainder;
		
		while(num!=0) {
			remainder = num%10;
			rev = rev*10+remainder;
			num = num/10;
		}
		
		if(original==rev) {
			System.out.println("Yes, it is a palindrome number");
		}
		else {
			System.out.println("Not a palindrome number");
		}
	}
}
