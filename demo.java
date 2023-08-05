public class demo {
    public static boolean is_power(int n) {
        if (n < 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]) {
        int n = 5;
        if (is_power(n) == true) {
            System.out.println(n + " is a power of 2");
        } else {
            System.out.println(n + " is not a power of 2");
        }
    }
}
