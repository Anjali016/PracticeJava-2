package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BracketCheck {

    static class Bracket {
        int position;
        char type;
        Bracket(int pos, char ch) {
            this.position = pos;
            this.type = ch;
        }
    }
    public static int bracketCheck(String str) {

        String closingBracket = "})]";
        String openingBracket = "{([";
        Stack<Bracket> stack = new Stack<Bracket>();
        int positon = 1;
        for (Character ch : str.toCharArray()) {

            if(closingBracket.contains(String.valueOf(ch)) && stack.isEmpty()) return positon;
            else if(openingBracket.contains(String.valueOf(ch))) stack.push(new Bracket(positon, ch));
            else {
                if (closingBracket.contains(String.valueOf(ch))) {
                    Bracket bracket = stack.pop();

                switch (ch) {

                    case '}':

                        if (bracket.type != '{') return positon;
                        break;
                    case ')':
                        if (bracket.type != '(') return positon;
                        break;
                    case ']':
                        if (bracket.type != '[') return positon;
                }
            }
            }
            positon++;
        }

        if (!stack.isEmpty()) return stack.pop().position;
        return -1;
    }

    public static void check(String str) {
        int result = bracketCheck(str);
        if (result == -1) System.out.println("Success");
        else System.out.print(result);
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();
        check(text);

    }
}
