package org.example;

import java.util.Scanner;

/**
 * TODO: Build jenkins Job with build trigger on push
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        int mode = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calculatorApp(mode, a, b));
    }

    static int calculatorApp(int mode, int a, int b) {
        if (mode == 1) {
            return add(a, b);
        } else if (mode == 2) {
            return multiply(a, b);
        } else if (mode == 3) {
            return divide(a, b);
        } else {
            return 0;
        }
    }
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
