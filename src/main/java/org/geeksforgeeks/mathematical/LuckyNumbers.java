package org.geeksforgeeks.mathematical;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LuckyNumbers {

    public boolean isLucky(ArrayList<Integer> set, int num) {

        ArrayList<Integer> s = deleteNumbers(set,2);
        return s.contains(num);
    }

    public ArrayList deleteNumbers(ArrayList<Integer> set, int i) {
        if(set.size() <= i) return set;
        else {
            ArrayList<Integer> newList = new ArrayList<Integer>();
            for (int j = 0; j < set.size(); j += i) {
                newList.add(set.get(j));
            }
            return deleteNumbers(newList,i+1);
        }

    }
}
