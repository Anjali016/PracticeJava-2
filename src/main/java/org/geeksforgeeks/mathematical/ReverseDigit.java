package org.geeksforgeeks.mathematical;

public class ReverseDigit {

    public int reverseDigit(int num){
        int res = 0;
        while (num != 0) {
            res = res * 10 + num % 10;
            num /= 10;
        }
        return res;
    }

    public int rev(int num){

        return reverseDigitRec(num,0);
    }
    public int reverseDigitRec(int num, int acc) {

        if(num == 0) return acc;
        return reverseDigitRec(num/10,acc*10+num%10);
    }
}
