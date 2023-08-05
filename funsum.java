import java.util.*;

public class funsum {
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(calculateSum(num1, num2));
    }

}
