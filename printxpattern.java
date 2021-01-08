

import java.util.Scanner;

public class printxpattern {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number : ");
    try{
    int size = s.nextInt();
    s.close();
    printXPattern(size*2);
    }
    catch (Exception e) {
      System.out.println("Enter valid input");
    }
    
  }

  private static void printXPattern(int size) {
    for (int i = 0; i < size ; i++) {
      for (int j = 0; j < size ; j++) {
        if (i == j || i + j == size - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
     
    }
  }
}