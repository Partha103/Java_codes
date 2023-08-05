import java.util.*;

public class decTobin {
    public static void dectobin(int n) {
        int num = n;
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int rem = n % 2;
            bin += (rem * Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        System.out.println("binary form of " + num + " = " + bin);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        dectobin(n);
    }
}
