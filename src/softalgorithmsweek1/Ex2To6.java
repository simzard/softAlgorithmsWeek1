/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softalgorithmsweek1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author simon
 */
// 2. Make an algorithm calculating the Fibonacci numbers F(n) using an array
public class Ex2To6 {

    public static int fib(int n) {
        // every time a number is computed,
        // it will be stored in the list
        // so that every number will only be computed

        if (n == 1 || n == 2) {
            return 1;
        }

        List<Integer> numbers = new ArrayList<Integer>() {{
                add(1);
                add(1);
        }};

        int result = -1;
        for (int i = 3; i <= n; i++) {
            result = numbers.get(i - 3) + numbers.get(i - 2);
            numbers.add(result);
            System.out.print("[");
            for (int a = 0; a < numbers.size(); a++) {
                System.out.print(numbers.get(a) + ",");
            }
            System.out.println("");
        }

        return result;
    }
    
    public static double fibRatio(int n) {
        return ((double)fib(n+1) / fib(n));
    }
    
    public static double repeatedInverse(double n) {
        if (n == 1) return 1;
        return 1 + 1.0 / repeatedInverse(n - 1);
    }

    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 48; i++) {
            System.out.println("fib of " + i + " = " + fib(i));
        }
        */
        
        // exercise 3
        // Compare the time of calculation for 1 and 2
        // ANSWER: calculation 1 takes O(2^n) and calculation 2 takes O(n)
        
        // exercise 4 
        for (int i = 1; i <= 100; i++) {
            System.out.println("fibRatio of " + i + " = " + fibRatio(i));
        }
        
        // exercise 5
        for (int i = 1; i <= 100; i++) {
            System.out.println("repeatedInverse of " + i + " = " + repeatedInverse(i));
        }
        
        // exercise 6
        // it seems that f(n) = 1 +  1 / f(n) = fib(n+1) / fib(n) and the maximum value is 1.618033988749895
    }

}
