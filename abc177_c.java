import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws IOException {
    var br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    long r = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j <= n; j++) {
        if (j == n) {
          continue;
        }
        r += a[i] * a[j];
      }
    }
    System.out.println(r);
  }
}
