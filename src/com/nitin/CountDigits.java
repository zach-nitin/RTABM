package com.nitin;

import java.io.*;
import java.util.*;
import static java.lang.System.out;

class CountDigits
{
     static int countDigits(int x)
    {
        int res = 0;
        while(x> 0)
        {
            x = x /10;
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int number = 123445;
        System.out.println(countDigits(number));
    }
}
