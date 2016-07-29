package org.geeksforgeeks.mathematical;

public class ParenthesisCombination {

    public static void printParenthesisCombination(String sofar, int n,int open, int close){
        if(n == close) {
            System.out.println(sofar);
        }
        else {
            if(n>open){
                printParenthesisCombination(sofar+"{",n, open+1, close);
            }
            if(open > close){
                printParenthesisCombination(sofar+"}",n, open, close+1);
            }
      }
    }

    public static void main(String[] args){
        printParenthesisCombination("",3,0,0);
    }
}
