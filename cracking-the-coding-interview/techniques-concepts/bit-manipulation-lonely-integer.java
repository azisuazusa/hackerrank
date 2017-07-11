import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int lonelyInteger(int[] a) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == 1) {
                return i;
            }
        }
        return 0;
   }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int all[] = new int[100];
        for(int a_i=0; a_i < n; a_i++){
            all[in.nextInt()]++;
        }
        System.out.println(lonelyInteger(all));
    }
}
