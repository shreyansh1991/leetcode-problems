package problems.easy;

//1544. Make The String Great

import java.util.Stack;
import java.util.stream.Collectors;

public class LeetCode_1544 {
    public static void main(String[] args) {
        String s = "leEeetcode";
        Stack<Character> stack = new Stack<>();
        for (char current : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(current);
            } else {
                if (Character.toUpperCase(current) == Character.toUpperCase(stack.peek())) {
                    if (Character.isUpperCase(current) == Character.isLowerCase(stack.peek()) ||
                            Character.isUpperCase(stack.peek()) == Character.isLowerCase(current)) {
                        stack.pop();
                    } else {
                        stack.push(current);
                    }
                } else {
                    stack.push(current);
                }
            }
        }
        String collect = stack.stream().map(Object::toString).collect(Collectors.joining(""));
        System.out.println(collect);
    }
}
