package problems.easy;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "(){}}[]";
        System.out.println(checkValidP(s));
    }

    public static boolean checkValidP(String s) {
        Stack<Character> characters = new Stack<>();
        System.out.println("##############"+characters);

        for (int i = 0; i < s.length(); i++) {
            System.out.println("@@@@@@@@@@@@@ "+characters);
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                System.out.println(" 1 " +characters);
                characters.push(s.charAt(i));
                System.out.println("2 " +characters);
            }
            else if (characters.empty()) {
                return false;
            }
            else if ((s.charAt(i) == ')' && characters.peek() == '(' && characters.size()>0) || (s.charAt(i) == '}' && characters.peek() == '{' && characters.size()>0) || (s.charAt(i) == ']' && characters.peek() == '[' && characters.size()>0)) {
                System.out.println(" 3 " +characters);
                characters.pop();
                System.out.println("4 "+ characters);

            }
        }
        System.out.println(characters);
          return characters.isEmpty();
    }
}
