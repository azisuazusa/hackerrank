import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getHighest(int[] array) {
        if(array == null || array.length == 0) return -1;
        int highest = 0;
        for(int i = 1; i < array.length; i++) {
            if (array[i] > array[highest]) highest = i;
        }
        return highest;
    }

    static int migratoryBirds(int n, int[] ar) {
        int[] b = {1, 2, 3, 4, 5};
        int[] counts = {0, 0, 0, 0, 0};
        for(int i = 0; i < b.length; i++) {
            for(int valAr : ar) {
                if(b[i] == valAr) {
                    counts[i]++;
                }
            }
        }
        return b[getHighest(counts)];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}

