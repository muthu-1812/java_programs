import java.util.Scanner;



public class rotatearray {




    public static void reversea(int[] nums,int start,int end){
        while(start<end)
        {
            int t=nums[start];
            nums[start]=nums[end];
            nums[end]=t;
            start++;
            end--;
        }

    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size");
        int n = s.nextInt();
        System.out.println("Enter postions to be rotated");
        int k=s.nextInt();

        int ar[]=new int[n];

        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }

        k=k%n;
        reversea(ar,0,n-1);
        reversea(ar,0,k-1);
        reversea(ar,k,n-1);
        s.close();

        for(int x:ar)
        {
            System.out.print(x+" ");
        }


    }
    
}
