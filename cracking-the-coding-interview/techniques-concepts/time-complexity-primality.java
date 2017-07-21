import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }
    }

    public static boolean isPrime(int number) {
        if(number == 1) {
            return false;
        }
        if(number <= 3) {
            return true;
        }
        if(number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        int i = 5;
        while(i * i <= number) {
            if(number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
}
