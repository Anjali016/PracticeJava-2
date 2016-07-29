package org.geeksforgeeks.mathematical;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ProductNumber {

    public static void main(String args[] ) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        line = br.readLine();
        String[] input = line.split("\\s+");
        long res = 1;
        long mod = (long) Math.pow(10,9)+7;
        for (String in : input) res = (res % mod * Long.parseLong(in) % mod) % mod ;

        System.out.print(res);




    }

}
