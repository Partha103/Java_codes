import java.util.*;

public class Terminater10X {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println(n);
                break;
            }

        } while (true);
    }
}
