import java.util.*;

public class PrimeInRange {
    public static boolean is_prime(int n) {
        boolean is_prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                is_prime = false;
                break;
            }
        }
        return is_prime;
    }

    public static void primeRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (is_prime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        primeRange(a, b);
    }
}
