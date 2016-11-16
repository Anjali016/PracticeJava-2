package recursion;

public class FindHiddenWord {

    AnagramFinder anagramFinder = new AnagramFinder();

    public void findHidden(String line) {

         subSet("", line);
    }

    public boolean subSet(String sofar, String rem) {
        if(anagramFinder.isAnagram("", sofar)) return true;
        if (rem.length() == 0) {
            return false ;
        }else {
            if (subSet(sofar + rem.charAt(0), rem.substring(1))) return true;
            if (subSet(sofar, rem.substring(1))) return true;
        }
        return false;
    }


}
