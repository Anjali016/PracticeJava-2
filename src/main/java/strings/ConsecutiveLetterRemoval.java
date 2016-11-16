package strings;

/*
*        aa
*        abab
*        abaa
*        kf###fp
* */
public class ConsecutiveLetterRemoval {

    public static String removal(char[] word) {
        int leftEnd = 0;
        int rightEnd = 1 ;
        while (rightEnd < word.length) {

            if(leftEnd == -1) {
                leftEnd = rightEnd;
                rightEnd++;
            }

            if(word[leftEnd] == word[rightEnd]) {
                int i = leftEnd;
                char letter = word[rightEnd];

                while (i < word.length && word[i] == letter) {
                    while (word[i] == '#') i++;
                    word[i] = '#';
                    i++;
                }

                leftEnd--;
                rightEnd = i - 1;

            }else {
                leftEnd++;
                while (word[leftEnd] == '#') leftEnd++;
            }

            rightEnd++;
        }

        for (char ch : word) {
            if (ch != '#')  System.out.print(ch);
        }

        return null;
    }

    public static void main(String[] args) {
        removal("aabaafeaas".toCharArray());
    }
}
