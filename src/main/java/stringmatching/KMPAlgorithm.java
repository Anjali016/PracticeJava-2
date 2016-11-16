package stringmatching;

public class KMPAlgorithm {

    public static void KMPMatcher(String text, String pat) {
        int n = text.length();
        int m = pat.length();
        int[] pi = prefixCompute(pat);
        int q = 0;
        for (int i = 0; i < n; i++) {
            while (q > 0 && text.charAt(i) != pat.charAt(q))
                q = pi[q - 1];
            if (text.charAt(i) == pat.charAt(q))
                q++;
            if (q == m){
                System.out.println("Found at " + (i - m));
                q = pi[q - 1];
            }

        }
    }

    public static int[] prefixCompute(String pat) {
        int m = pat.length();
        int[] pi = new int[m];
        pi[0] = 0;
        int k = 0;
        for (int i = 1; i < m; i++) {

            while (k > 0 && pat.charAt(k) != pat.charAt(i))
                k = pi[k - 1];

            if (pat.charAt(k) == pat.charAt(i))
                k++;

            pi[i] = k;
        }

        for (int n : pi) System.out.print(n);
        return pi;
    }
    public static void main(String[] args) {

        String text = "abhaysinghabhay";
        String pat = "cbabc";
        KMPMatcher(text, pat);



    }

}
