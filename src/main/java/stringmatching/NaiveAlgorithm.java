package stringmatching;

public class NaiveAlgorithm {

    public static void naive(String text, String pat) {

        int n = text.length();
        int m = pat.length();

        for (int s = 0 ; s <= n - m; s++) {

            int i = 0;
            while (i < m && pat.charAt(i) == text.charAt(s + i))
                i++;
            if (i == m) System.out.println("Found at " + s);
        }
    }

    public static void main(String[] args) {

        String text = "rabhayskhapankajbdhaypankajpankaj";
        String pat = "pankaj";
        naive(text, pat);
    }
}
