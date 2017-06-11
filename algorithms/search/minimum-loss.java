import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer p[] = new Integer[n];
        for(int i = 0; i < n; i++ ) {
            p[i] = scan.nextInt();
        }
        List<Integer> list = Arrays.asList(p);
        Arrays.sort(p);
        int res = (int) Math.pow(10, 6);
        int pair;
        for(int i = n - 1; i > 0; i--) {
            pair = p[i] - p[i - 1];
            if(pair < res && list.indexOf(p[i]) > list.indexOf(p[i - 1])) {
                res = pair;
            }
        }
        System.out.print(res);
    }
}
