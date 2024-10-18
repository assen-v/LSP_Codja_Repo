package org.howard.edu.lsp.midterm.question2;

public class Calculator {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
}

class CalculatorDriver {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(5, 10)); 
        System.out.println(Calculator.sum(3.5, 7.8)); 
        System.out.println(Calculator.sum(new int[]{1, 2, 3, 4, 5})); 
    }
}