import java.util.Scanner;
import java.util.Arrays;

class printarrayelements {
public static void main(String args[])
 {
     Scanner sc = new Scanner(System.in);
 
         int i,n;
 
 System.out.println("Enter the number of elements of the array:") ;
 n = sc.nextInt();
 int[] array = new int[n];
 sc.close();
 
     System.out.println("Enter the elements");


     for(i=0;i<n;i++)
        array[i] = sc.nextInt();
     
     System.out.println("The elements of the array are:");
  
        for (int element: array) 
            System.out.println(element);

    }
}


