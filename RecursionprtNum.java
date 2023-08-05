public class RecursionprtNum {
    public static void prtNum(int num) {
        if (num == 1) {
            System.out.println(num + " ");
            return;
        }
        prtNum(num - 1);
        System.out.println(num + "");
    }

    public static void main(String args[]) {
        int num = 10;
        prtNum(num);
    }
}