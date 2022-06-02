package com.nitin;

public class FactorialOfNumber {

    static int isFactorial(int number) {
        int result = 1;
//        int temp = number;
        for(int i = number; i>=1; i--) {
            result = result*number;
            number--;
        }
        return result;
    }
    public static void main(String[] args) {
        int n =7;
        System.out.println(isFactorial(n));
    }
}


//Recurssion approach causes a lot of overhead.So the iterative approach (the above approach) is better.

