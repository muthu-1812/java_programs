import java.util.Scanner;
class HalfPyramid {

  public static void main(String[] args) {
    int rows;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size or number of rows:");
    rows = sc.nextInt();

    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}