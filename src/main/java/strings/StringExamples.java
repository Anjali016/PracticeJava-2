package strings;

public class StringExamples {

  /*
  * 1. Number of flips to make binary string alternate.
  * Given a binary string, that is it contains only 0s and 1s.
  * We need to make this string a sequence of alternate characters by flipping some of the bits,
  * our goal is to minimize the number of bits to be flipped.
  * */

    public static char flip(char ch) {
        return (ch == '0') ? '1':'0';
    }

    public static int countFlips(String str, char curr) {
        int count = 0;
        for (Character ch : str.toCharArray()) {
            if (ch != curr) count++;
            curr = flip(curr);
        }
        return count;
    }
    public static int minFlips(String str) {
      return  Math.min(countFlips(str,'0'), countFlips(str, '1'));
    }

    public static void main(String[] args) {
        System.out.print(minFlips("0001010111"));
    }
}
