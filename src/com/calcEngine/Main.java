package com.calcEngine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        calc();

    }

    /**
     * public static void calc() {
     * Scanner scan = new Scanner(System.in);
     * double val1 = scan.nextDouble();
     * double val2 = scan.nextDouble();
     * double result = scan.nextDouble();
     * char opCode = scan.next().charAt(0);
     * /*char opCode = scan.findInLine(".").charAt(0);
     * char opCode = scan.next(".").charAt(0);
     * <p>
     * if (opCode == 'a')
     * result = val1 + val2;
     * else if (opCode == 's')
     * result = val1 - val2;
     * else if (opCode == 'd')
     * result = val1 * val2;
     * else if (opCode == 'm')
     * result = val1 / val2;
     * else if (opCode == 'p')
     * result = val1 % val2;
     * else
     * System.out.println("Invalid Code");
     * result = 0.0d;
     * System.out.println(result);
     * <p>
     * }
     */
    public static void calc() {
        double val1 = 100.0d, val2 = 0.0d, result;
        char opCode = 'd';

        if (opCode == 'a') {
            result = val1 + val2;
            System.out.println(result);
        } else if (opCode == 's') {
            result = val1 - val2;
            System.out.println(result);
        } else if (opCode == 'd') {

            result = val1 != 0.0d ? val1 / val2 : 0.0d;
            System.out.println(result);
            result = val1 * val2;
            System.out.println(result);
        } else if (opCode == 'm') {
            result = val1 / val2;
            System.out.println(result);
        } else if (opCode == 'p') {
            result = val1 % val2;
            System.out.println(result);
        } else {
            System.out.println("Invalid Code");
            result = 0.0d;
            System.out.println(result);
        }
    }
}