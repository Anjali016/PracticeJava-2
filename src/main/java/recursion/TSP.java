package recursion;

import java.util.*;

/*                                               0    1      2
*   A->B  10       a      b        c           0      7      22
*                b   c  a   c    a   b         1 7           7
*                c   b  c   a    b    a        2 22   7
*   A -> B = 3
 *  A -> C = 5
 *  B -> C = 4
 *  B -> A = 3
 *  C -> A = 5
 *  C -> B = 3
 *
 *  Example Trips:
 *  A -> B -> C
 *  B -> A -> C
 *
 *  Input: A B C ~ (A,B) + (B,C)
* */
public class TSP {
    static Map<String, Integer> pathDistanceMap = new HashMap<String, Integer>();
    static int minDistance = Integer.MAX_VALUE;
    public static void solve(String sofar, String rem) {

        if (rem.length() == 0) {
            int  currDis = getDistance(stringToPath(sofar));
            if(minDistance > currDis) minDistance = currDis;

        }else {
            for (int i = 0; i < rem.length(); i++){
                    if(minDistance > getDistance(stringToPath(sofar))) {

                        solve(sofar + rem.charAt(i), rem.substring(0, i) + rem.substring(i + 1));
                    }
                }
            }
        }


    public static void main(String[] args) {

        pathDistanceMap.put("AB",3);
        pathDistanceMap.put("AC",5);
        pathDistanceMap.put("BC",1);
        pathDistanceMap.put("BA",4);
        pathDistanceMap.put("CA",5);
        pathDistanceMap.put("CB",1);

        //boolean[] isVisited = new boolean[numbers.length];
        solve("", "ABC");
        System.out.print(minDistance);
        //stringToPath("ABC");

    }

    private static Vector<String> stringToPath(String s) {
        Vector<String>  paths = new Vector<String>();
        for(int i = 0; i < s.length()-1; i++) {
            paths.add(s.substring(i,i+2));
        }
        return paths;
    }

    public static int getDistance(Vector<String> trips) {
        int total = 0;
        for (String trip : trips) {
            if(trip.length() < 2)
                total += 0;
            else
                total += pathDistanceMap.get(trip);
        }
        return total;
    }


}
