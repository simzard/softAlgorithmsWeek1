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

// 1. Make an algorithm calculating the Fibonacci numbers F n using recursion
public class Ex1 {
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n-2) + fib(n-1);
        }
    }
    
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("fib of " + i + " = " + fib(i));
        }
    }
}
