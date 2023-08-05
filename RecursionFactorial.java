public class RecursionFactorial {
    public static int fact(int num) {
        if (num == 0) {
            return 1;
        }
        int fact = num * fact(num - 1);
        return fact;
    }

    public static void main(String args[]) {
        int num = 0;
        System.out.println(fact(num));
    }
}
