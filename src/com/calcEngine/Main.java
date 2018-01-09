package com.calcEngine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
       // calc();
        //public double leftVals;
        //public double rightVals;
        //public char opCodes;
        //public double results;

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(101.0d, 51.0d, 'a');
        equations[2] = create(102.0d, 52.0d, 's');
        equations[3] = create(103.0d, 53.0d, 'm');

        for(MathEquation equation : equations) {
            System.out.println("result = ");
            System.out.println(equation.getResults());
        }
    }

    public static MathEquation create(double leftVals, double rightVals, char opCodes) {
        MathEquation equation = new MathEquation();
        equation.setLeftVals(leftVals);
        equation.setRightVals(rightVals);
        equation.setOpCodes(opCodes);
        return equation;
    }
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

