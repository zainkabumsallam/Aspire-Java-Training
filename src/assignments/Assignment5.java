package assignments;

import java.util.Stack;

public class Assignment5 {

    public static boolean validate(String str) {
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else if (x == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String example1 = "(())()(()())";
        System.out.println(example1 + " is " + (validate(example1) ? "valid" : "not valid"));

        String example2 = "()((()(";
        System.out.println(example2 + " is " + (validate(example2) ? "valid" : "not valid"));

    }
}
