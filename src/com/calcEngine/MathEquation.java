package com.calcEngine;

public class MathEquation {
    public double leftVals;
    public double rightVals;
    public char opCodes;
    public double results;

    public double getLeftVals() { return leftVals; }
    public void setLeftVals(double leftVals) { this.leftVals = leftVals; }
    public double getRightVals() { return rightVals; }
    public void setRightVals(double rightVals) { this.rightVals = rightVals; }
    public char getOpCodes() { return opCodes; }
    public void setOpCodes(char opCodes) { this.opCodes = opCodes; }

    public double getResults() { return results; }

    public void execute() {
        switch (opCodes) {
            case'a':
                results = leftVals + rightVals;
                System.out.println(results);
                break;
            case 's':
                results = leftVals - rightVals;
                System.out.println(results);
                break;
            case 'd':
                results = leftVals != 0.0d ? leftVals / rightVals : 0.0d;
                System.out.println(results);
                results = leftVals * rightVals;
                System.out.println(results);
                break;
            case 'm':
                results = leftVals / rightVals;
                System.out.println(results);
                break;
            case 'p':
                results = leftVals % rightVals;
                System.out.println(results);
                break;
            default:
                System.out.println("Invalid Code");
                results = 0.0d;
        }
    }
}
