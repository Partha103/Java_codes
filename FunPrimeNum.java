import java.util.*;

public class FunPrimeNum {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (is_prime(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }
}
