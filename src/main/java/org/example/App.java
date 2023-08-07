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
        switch(mode) {
            case 1:
                return add(a, b);
            case 2:
                return multiply(a, b);
            case 3:
                return divide(a, b);
            default:
                return 0;
        }
    }
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
