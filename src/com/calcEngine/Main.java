package com.calcEngine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
       // calc();
        calcWithArrayLoop();
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

    public static void calcWithArrayLoop() {
        double[] leftVals = {100.0d, 200.0d, 50.0d, 25.0d};
        double[] rightVals = {100.0d, 200.0d, 50.0d, 25.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] results = new double[opCodes.length];

        for (int i = 0; i <opCodes.length; i++){
            switch (opCodes[i]) {
                case'a':
                    results[i] = leftVals[i] + rightVals[i];
                    System.out.println(results);
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    System.out.println(results);
                    break;
                case 'd':
                    results[i] = leftVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
                    System.out.println(results);
                    results[i] = leftVals[i] * rightVals[i];
                    System.out.println(results);
                    break;
                case 'm':
                    results[i] = leftVals[i] / rightVals[i];
                    System.out.println(results);
                    break;
                case 'p':
                    results[i] = leftVals[i] % rightVals[i];
                    System.out.println(results);
                    break;
                default:
                    System.out.println("Invalid Code");
                    results[i] = 0.0d;
                }
            }
        }
        for(double theResult: results) {
            System.out.println("result = ");
            System.out.println(theResult);

    }
    }
    }
