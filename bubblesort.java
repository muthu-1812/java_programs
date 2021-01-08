import java.util.Scanner;
class bubblesort {
  public static void main(String []args) {
    int n, a, b, temp;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Enter the numbers of the array to be sorted");
    n = in.nextInt();
 
    int array[] = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (a = 0; a< n; a++)
      array[a] = in.nextInt();
   
    for (a = 0; a < ( n - 1 ); a++) {
      for (b = 0; b < n - a - 1; b++) {
        if (array[b] > array[b+1]) 
        {
          temp       = array[b];
          array[b]   = array[b+1];
          array[b+1] = temp;
        }
      }
    }
 
    System.out.println("Sorted list of numbers after applying bubble sort to the numbers:");
 
    for (a = 0; a < n; a++)
      System.out.println(array[a]);
  }
}

