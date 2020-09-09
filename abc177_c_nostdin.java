class Main {
  public static void main(String[] args) {
    int n = 5;
    int a[] = {7, 3, 5, 8, 2};
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
