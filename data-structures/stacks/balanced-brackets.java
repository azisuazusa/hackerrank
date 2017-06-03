import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            System.out.println(process(s));
        }
    }

    private static String process(String s) {
        Stack stack = new Stack();
        for(int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(s.charAt(i));
                break;
                case ')':
                    if(stack.empty() || stack.peek() != '(') {
                        return "NO";
                    }
                    stack.pop();
                break;
                case ']':
                    if(stack.empty() || stack.peek() != '[') {
                        return "NO";
                    }
                    stack.pop();
                break;
                case '}':
                    if(stack.empty() || stack.peek() != '{') {
                        return "NO";
                    }
                    stack.pop();
                break;
            }
        }
        return stack.empty() ? "YES" : "NO";
    }
}
