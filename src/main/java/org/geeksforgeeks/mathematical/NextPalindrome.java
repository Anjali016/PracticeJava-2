package org.geeksforgeeks.mathematical;

import recursion.IncreasingDigits;

/*
*  121
*  1123   1221
*
*
*
*
* */
public class NextPalindrome {

    public static int nextPalindrome(int num) {
String s ="";
        String numStr = String.valueOf(num + 1);
        int len = numStr.length();
        String left = numStr.substring(0, len / 2);
        String right = numStr.substring(len/2);
        if(Integer.valueOf(left) < Integer.valueOf(right)) {
            StringBuilder l = new StringBuilder(String.valueOf(Integer.valueOf(left) + 1));
             s = String.valueOf(Integer.valueOf(left) + 1) + l.reverse();

        }else {
            StringBuilder l = new StringBuilder(String.valueOf(Integer.valueOf(left)));
            s = left +l.reverse();
        }
        System.out.print(s);


        ////
        return 0;
    }

    public static void main(String[] args){
        nextPalindrome(99);
    }
}
