package arrays;

public class PeakFinder2D {

    public static class Point {
        int x, y;
      /*  public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }*/
    }
    public static Point globalMax(int[][] arr, int row, int col) {
        int max = Integer.MIN_VALUE;
        Point point = new Point();
        for (int i = 0; i < row; i++)
            if (max < arr[i][col]) {
                max = arr[i][col];
                point.x = i;
                point.y = col;
            }

        return point;
    }
    public static Point peakFinder(int[][] arr, int l, int r) {

        if(l == r) {
            return globalMax(arr, arr.length, r);
        }

        int mid = (r + l) / 2;
        Point point = globalMax(arr, arr.length, mid);
        int i = point.x;
        int j = point.y;
        if(arr[i][j] < arr[i][j - 1]) return peakFinder(arr, l, mid - 1);
        else if (arr[i][j] < arr[i][j + 1]) return peakFinder(arr, mid + 1, r);
        else return point;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{2,8,5},{11,9,10}};
        Point p = peakFinder(arr, 0, arr[0].length - 1);
        System.out.print(p.x + "" +  p.y);
    }
}
