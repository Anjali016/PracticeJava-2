package greedy;

public class GasFillingProblem {

    public static int minGasStation(int[] stations, int source, int destation, int capacity) {

        int saveMove = 0;
        int lastRefill = 0;
        int count = 0;
        for (int station : stations) {

            if(saveMove < station && (station - source) <= capacity) {
                saveMove = station;
            }else {
                count++;
                source += saveMove;
                lastRefill = saveMove;
                saveMove = station;
                if(destation <= source) break;
            }
        }

        if (saveMove != lastRefill) {
            source += saveMove;
            count++;
        }
        if(source < destation) return -1;
        return count;
    }

    public static int minGasStation(int[] stations,int n, int capacity) {
        int minStation = 0, currentStation = 0;
        while (currentStation < n) {
            int lastRefill = currentStation;
            while (currentStation < n && stations[currentStation + 1] - stations[lastRefill] <= capacity) currentStation++;
            if(currentStation == lastRefill) return -1;
            if(currentStation <= n) minStation++;
        }
        return minStation;
    }

    public static int minSegment(int[] points, int segmentLength) {
        int minNoSegment = 0, currentPoint = 0;

        while (currentPoint < points.length) {
            int prev = currentPoint;
            while (currentPoint < points.length && points[currentPoint] - points[prev] <= segmentLength) {
                currentPoint++;
            }

            minNoSegment++;
        }

        /*for (int i = 1; i < points.length - 1; i++ ) {
            if(points[i] - points[prevPoint] <= segmentLength) {
                prevPoint = i;
            }else {
                minNoSegment++;
                prevPoint = i;
            }
        }
        if(prevPoint != currentPoint) minNoSegment++;
        return minNoSegment;*/
        return minNoSegment;
    }

    public static int minSeg(int[] points, int left, int right, int segmentLength) {

        if(left > right) return 0;
        int currentPoint = left;
        int prev = currentPoint;
        while (currentPoint <= right && points[currentPoint] - points[prev] <= segmentLength) {
            currentPoint++;
        }

        return 1 + minSeg(points, currentPoint, right, segmentLength);
    }

    public static void main(String[] args) {
        int[] stations = {1, 4, 5, 7, 8};
       // System.out.print(minSegment(stations, 1));
       System.out.print(minSeg(stations, 0, stations.length - 1, 1));
    }
}
