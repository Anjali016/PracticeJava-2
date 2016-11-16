package recursion;

import java.util.HashSet;
import java.util.Set;

public class AnagramFinder {

    static Set<String> dictionary = new HashSet<String>();

    public static boolean isAnagram(String sofar, String rem) {
        if (rem.length() == 0 && dictionary.contains(sofar)) {
            System.out.print(sofar);
            return true;
        } else {
            for (int i = 0; i < rem.length(); i++) {
                if (isAnagram(sofar + rem.charAt(i), rem.substring(0, i) + rem.substring(i + 1))); //return true; ;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("crimanal");
        FindHiddenWord  findHiddenWord = new FindHiddenWord();
        findHiddenWord.findHidden("crimanal");
    }
}
