import java.util.*;

class Duplicates {
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

        Set<Integer> seen = new HashSet<Integer>();
        for (int num : ar) {
            if (seen.contains(num)) {
                System.out.println(num);
            }
            seen.add(num);
        }
    }
}