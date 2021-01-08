import java.util.Scanner;


class secondLargest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size");
        int n = s.nextInt();
        

        int ar[]=new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }

        int max1=0,max2=0;

        for(int x:ar)
        {
            if(x>max1)
            {
                max2=max1;
                max1=x;
            }
            else if(x>max2)
            {
                max2=x;
            }
        }
        System.out.println(max2);
        s.close();

    }
}
