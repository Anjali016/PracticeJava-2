package recursion;

public class TowerOfHanoi {
    public static void solve(int disks, char source, char dest, char temp) {
        if(disks > 0) {
            solve(disks - 1 , source, temp, dest);
            System.out.println(source + "->" + dest);
            solve(disks - 1, temp, dest, source);
        }
    }

    public static void main(String[] args){
        solve(2,'A', 'B', 'C');
    }
}
