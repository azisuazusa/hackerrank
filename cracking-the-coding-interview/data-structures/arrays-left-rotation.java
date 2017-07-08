import java.util.*;
public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int a[] = new int[n];
    for(int a_i=0; a_i < n; a_i++){
      a[a_i] = in.nextInt();
    }
    process(a, n, k);
  }

  public static void process(int[] a, int n, int k) {
    for (int i = 0; i < n; i++) {
      if (i + k < n) {
        System.out.print(a[i + k]);
      } else {
        System.out.print(a[i + k - n]);
      }
      System.out.print(" ");
    }
  }
}
