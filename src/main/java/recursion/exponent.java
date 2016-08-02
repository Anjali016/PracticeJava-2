package recursion;

public class Exponent {
    public int raise(int base, int exp) {
        if(exp == 0) return 1;
        else {
            return base * raise(base, exp-1);
        }
    }

    //More efficient
    public int raiseEff(int base, int exp) {
        if(exp == 0) return 1;
        else {
            int half = base * raiseEff(base, exp/2);
            if( exp % 2 == 0)
                return half * half;
            else
                return half * half * base;
        }
    }
}
