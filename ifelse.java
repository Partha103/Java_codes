import java.util.*;

public class ifelse {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("adult!\nYou can vote!");
        } else {
            System.out.println("Not an adult!");
        }
    }
}