import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stackReverse = new Stack<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            switch(in.nextInt()) {
                case 1:
                    stack.push(in.nextInt());
                break;
                case 2:
                    if(stackReverse.size() == 0) {
                        while(!stack.empty()) {
                            stackReverse.push(stack.pop());
                        }
                        stackReverse.pop();
                    } else {
                        stackReverse.pop();
                    }
                break;
                case 3:
                    if(stackReverse.size() == 0) {
                        while(!stack.empty()) {
                            stackReverse.push(stack.pop());
                        }
                        System.out.println(stackReverse.peek());
                    } else {
                        System.out.println(stackReverse.peek());
                    }
                break;
            }
        }
    }
}
