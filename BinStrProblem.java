public class BinStrProblem {
    public static void prtbinStr(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        if (lastplace == 0) {
            prtbinStr(n - 1, 0, str + "0");
            prtbinStr(n - 1, 1, str + "1");
        } else {
            prtbinStr(n - 1, 0, str + "0");
        }
    }

    public static void main(String args[]) {
        prtbinStr(3, 0, "");
    }
}
