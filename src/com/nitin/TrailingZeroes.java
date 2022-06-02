package com.nitin;

//trailing zeroes in factorial
public class TrailingZeroes {
    static int countTrailingZeroes(int number) {
        int result=0;
        for(int i =5; i <=number; i=i*5) {
            result = result + (number / i);
        }
        return result;
    }
    public static void main(String[]args){
        int n = 10;
        System.out.println(countTrailingZeroes(n));
    }
}
