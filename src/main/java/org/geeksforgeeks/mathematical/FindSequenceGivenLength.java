package org.geeksforgeeks.mathematical;

import java.util.ArrayList;

public class FindSequenceGivenLength {
    ArrayList<String> result = new ArrayList<String>();

    public  void findSeq(String sofar, int n, int k){
        if(k == 0) result.add(sofar);//System.out.println(sofar);
        else {
            for (int i = 1; i <= n; i++){
                findSeq(sofar+i,n,k-1);
            }
        }
    }


}
