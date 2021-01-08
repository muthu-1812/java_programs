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
public class RevInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive Integer");
        int x = sc.nextInt();
        if(x < 0) x = -1*x;
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)){
                System.out.println("Integer too big"); 
                break;
            } 
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                System.out.println("Integer too small");
                break;
            } 
            rev = rev * 10 + pop;
        }
        
        System.out.println("Reverse "+rev);
        // TODO code application logic here
    }
    
}
