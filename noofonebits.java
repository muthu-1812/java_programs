import java.util.Scanner;  

class noofonebits {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);  
    System.out.println("Enter no");
    int c=0;

    int n = s.nextInt(); 
    s.close();
    if(n<0)
    {
      System.out.println("Enter positve no.");
      return;
    }
    while(n!=0)  
    {

        c++;
        // if((n&1)!=0) c++;
        // n>>=1;
        n=n&(n-1);
        

    }
    System.out.println(c);
 
  }
}