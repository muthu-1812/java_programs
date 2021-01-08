import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of fibonacci numbers to display:");
		n = sc.nextInt();
		
		int p1=0,p2=1;
		if(n==1)
		{
			System.out.println(p1);
			return;
		}
		else
		{
			System.out.print(p1+" "+p2+" ");
		}
		
			for(int i=0;i<n-2;i++)
			{
				int curr = p1+p2;
				System.out.print(curr+" ");
				p1 = p2;
				p2 = curr;
			}
		

		}

}
