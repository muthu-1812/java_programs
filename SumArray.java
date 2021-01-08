/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.*;

/**
 *
 * @author mbashish
 */
public class SumArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        try {
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = s.nextInt();
        }
        
        int sum=0;
        for(int a:arr) {
            if(sum > Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE%10 && a > 7)) {
                System.out.println("To big");
            }
            sum+=a;
            
        }
        System.out.println("sum "+sum);
        } catch(Exception e) {
            System.out.println(e);
        }
// TODO code application logic here
    }
    
}
