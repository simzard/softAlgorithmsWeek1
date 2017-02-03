/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softalgorithmsweek1;

/**
 *
 * @author simon
 */
public class Task1_1_18_Mystery {
    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }
    
    // the mystery method where return 0 is replaced with return 1
    //AND all the plusses replaced with asterisks
    public static int mysteryReplaced(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mysteryReplaced(a*a, b/2);
        return mysteryReplaced(a*a, b/2) * a;
    }
    
    public static void main(String[] args) {
        // What are the values of mystery(2, 25) and mystery(3, 11)?
        System.out.println("mystery(2,25) = " + mystery(2,25)); // 50
        System.out.println("mystery(3,11) = " + mystery(3,11)); // 33
        // (it seems that it multiplies a with b
        // i.e.: mystery(a, b) => a * b
        System.out.println("mysteryReplaced(2,25) = " + mysteryReplaced(2,25)); // 50
        System.out.println("mysteryReplaced(3,11) = " + mysteryReplaced(3,11)); // 33
        
        System.out.println("mysteryReplaced(1,1) = " + mysteryReplaced(1,1)); // 33
        
        System.out.println();
        
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.println("mysteryReplaced(" + j + "," + i + ") = " + mysteryReplaced(j,i)); 
            }
        }        
        
        // it seems that the new mystery method computes a ^ b
        // i.e. mysteryReplaced(a,b) = a ^ b
    }
}
