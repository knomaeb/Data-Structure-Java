package datastructurealgo.stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
  -> Open brackets must be closed by the same type of brackets.
  -> Open brackets must be closed in the correct order.
  -> Every close bracket has a corresponding open bracket of the same type.
 */

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        boolean result = isValid(s);
        System.out.println(result);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
