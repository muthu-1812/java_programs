import java.util.Scanner;
import java.util.Arrays;
class deleteanelement
{
public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 
         int i,n,pos;
 
 System.out.println("Enter the number of elements of the array:") ;
 n = sc.nextInt();
 int[] a = new int[n];
 
     System.out.println("Enter the elements") ;
     for(i=0;i<n;i++)
     {
         a[i] = sc.nextInt();
     }
 
     
 System.out.println("Enter the position of the number which is to be deleted");
 pos = sc.nextInt();
 if(pos>=n)
     { System.out.println("Invalid position entered, operation not possible");
	return;
     }
 
 for(i=pos;i<n-1;i++)
   {
     	
         a[i]=a[i+1];
   }
     n=n-1;
    
System.out.println("\n The array after deletion is: \n");
 
    for(i=0;i<n;i++) 
     {      
            System.out.print(a[i]+" ");
     
     }
     sc.close();
}
}

