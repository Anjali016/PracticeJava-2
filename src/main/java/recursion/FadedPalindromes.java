package recursion;

import java.util.Scanner;

public class FadedPalindromes {

    public static StringBuilder fadedPalindrome(StringBuilder str, int l, int r) {

        if(l > r) return str;
        else if(str.charAt(l) == '.' && str.charAt(r) == '.') {
              str.setCharAt(l, 'a');
              str.setCharAt(r, 'a');
        }
       else if(str.charAt(l) == '.' || str.charAt(r) == '.'){
            if (str.charAt(l) == '.')
               str.setCharAt(l, str.charAt(r));
            else
                str.setCharAt(r, str.charAt(l));
        }
        else if(str.charAt(l) != str.charAt(r)) return new StringBuilder("-1");

         return fadedPalindrome(str, l + 1, r - 1);

    }

    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0 ; i< testCases; i++) {
            String str = in.next();
            System.out.println(fadedPalindrome(new StringBuilder(str), 0, str.length() - 1));
        }
    }

}
