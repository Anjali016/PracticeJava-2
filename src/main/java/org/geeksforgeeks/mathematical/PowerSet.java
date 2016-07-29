package org.geeksforgeeks.mathematical;

import java.util.ArrayList;

public class PowerSet {

    public  ArrayList<String > printPowerSet(String str){
        ArrayList<String> result = new ArrayList<String>();
        int len = (int) Math.pow(2,str.length());
        for (int i = 0; i < len; i++){
            String set = "";
            for (int j = 0 ; j < str.length(); j++){

                if(((i>>j)&1) == 1) { set+=str.charAt(j);

                }
            }
            result.add(set);

        }
        return result;
    }



}
