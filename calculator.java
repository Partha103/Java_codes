import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two operands : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter the operater(+,-,x,/,%) : ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case 'x':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            case '%':
                System.out.println(x % y);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
