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
public class Task1_1_24_gcd {
    
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
    
    public static void main(String[] args) {
        System.out.println("Greatest common divis");
    }
    
    
}
