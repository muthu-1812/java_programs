import java.util.Scanner;


class armstrongno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int sum=0;
        while(temp!=0)
        {   int r=temp%10;
            sum+=Math.pow(r,3);
            temp/=10;

        }

        if(sum==n)
            System.out.println("True");
        else
            System.out.println("False");    
        s.close();    
    
    }
}