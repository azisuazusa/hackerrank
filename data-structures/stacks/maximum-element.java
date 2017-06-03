import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Stack<StackNode> stack = new Stack<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        for(int i = 0; i < n; i++) {
            switch(in.nextInt()) {
                case 1:
                    int val = in.nextInt();
                    max = Math.max(val, max);
                    stack.add(new StackNode(val, max));
                break;
                case 2:
                    if(!stack.empty()) {
                        stack.pop();
                    }
                    if(stack.empty()) {
                        max = 0;
                    } else {
                        max = stack.peek().max;
                    }
                break;
                case 3:
                    if(!stack.empty()) {
                        System.out.println(stack.peek().max);
                    }
                break;
            }
        }
    }

    private static class StackNode {
        int val;
        int max;
        public StackNode(int val, int max) {
            this.val = val;
            this.max = max;
        }
    }
}
