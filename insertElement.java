import java.util.Scanner;
import java.util.Arrays;

class insertElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size");
        int n = s.nextInt();
        

        int ar[]=new int[n+1];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();

        }
       
        System.out.println("Enter element to be inserted");
        int k=s.nextInt();
        int j=n-2; //since array size is bigger
        Arrays.sort(ar,0,n);
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
        while(k<ar[j])
        {
            ar[j+1]=ar[j];
            j--;
        }
        ar[j+1]=k;
       
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
        s.close();
    }
}