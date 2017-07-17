import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class MyQueue<Integer> {
        Stack<Integer> stackNewestOnTop = new Stack<Integer>();
        Stack<Integer> stackOldestOnTop = new Stack<Integer>();

        public void enqueue(Integer value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        public Integer peek() {
            if(stackOldestOnTop.size() == 0) {
                while(!stackNewestOnTop.empty()) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
                return stackOldestOnTop.peek();
            } else {
                return stackOldestOnTop.peek();
            }
        }

        public void dequeue() {
            if(stackOldestOnTop.size() == 0) {
                while(!stackNewestOnTop.empty()) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
                stackOldestOnTop.pop();
            } else {
                stackOldestOnTop.pop();
            }
        }
    }


    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
