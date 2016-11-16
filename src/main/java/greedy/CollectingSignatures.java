package greedy;

import java.util.*;

public class CollectingSignatures {
    public static class Segment {
        public int start, end;
        public Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
        
    }
    
    public static Set<Integer> collectingSign(PriorityQueue<Segment> tenants) {
        Set<Integer> result = new LinkedHashSet<Integer>();
        int prev = tenants.peek().end;
        result.add(tenants.poll().end);
        while (!tenants.isEmpty()) {
            if (tenants.peek().start > prev) {
                prev = tenants.poll().end;
                result.add(prev);
            }
            else
                tenants.poll();
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PriorityQueue<Segment> tenants = new PriorityQueue<Segment>(new Comparator<Segment>() {
            public int compare(Segment s1, Segment s2) {
                return s1.end  - s2.end;
            }
        });
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            Segment segment  = new Segment(start, end);
            tenants.add(segment);
        }
        Set<Integer> set = collectingSign(tenants);
        System.out.println(set.size());
        for (int s: set) System.out.print(s +" ");
    }

}
