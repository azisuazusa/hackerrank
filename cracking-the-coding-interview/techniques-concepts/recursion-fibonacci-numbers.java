import java.util.*;

public class Solution {
  
    public static int fibonacci(int n) {
      int f1 = 0, f2 = 1, f3 = 0;
      if(n == 0) {
          return 0;
      }
      if(n == 1) {
          return 1;
      }
      for(int i = 2; i <= n; i++) {
          f3 = f1 + f2;
          if(i == n) {
            return f3;
          }
          f1 = f2;
          f2 = f3;
      }
      return 0;
   }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
