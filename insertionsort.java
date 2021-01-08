import java.util.Scanner;

class insertionsort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size");
        int n = s.nextInt();
        

        int ar[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();

        }
        s.close();
        for(int i=0;i<n;i++)
        {
            
            int tmp = ar[i];
            int j = i - 1;
            while(j >= 0 && ar[j] > tmp){
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = tmp;
        }

        for(int x:ar)
        {
            System.out.print(x+" ");
        }
        
    }
}