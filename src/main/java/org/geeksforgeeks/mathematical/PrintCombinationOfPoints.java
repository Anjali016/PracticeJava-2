package org.geeksforgeeks.mathematical;

import java.util.ArrayList;

//http://www.geeksforgeeks.org/print-all-combinations-of-points-that-can-compose-a-given-number/
public class PrintCombinationOfPoints {
    ArrayList<String> result = new ArrayList<String>();
    public  ArrayList<String> findCombinationOfpoints(int n){
        findCombinationOfpoint("",n,0);
        return result;
    }

    public  void findCombinationOfpoint(String sofar, int n, int sum ){
        if(n<sum) return;
        if(sum == n) {
          //  System.out.println(sofar);
            result.add(sofar);
        }
        else {
            for (int i = 1; i <= n ; i++){
                findCombinationOfpoint(sofar+i,n,sum+i);
            }
        }
    }

    public static void main(String[] args){
       //findCombinationOfpoints(3);
    }
}
