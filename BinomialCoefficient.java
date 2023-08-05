import java.util.*;

public class BinomialCoefficient {
    public static int fact(int n) {
        if (n == 0 && n == 1) {
            return 1;
        } else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static int bincoeff(int n, int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_min = fact(n - r);
        int binco = fact_n / (fact_r * fact_min);
        return binco;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(bincoeff(n, r));
    }
}
