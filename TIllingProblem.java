public class TIllingProblem {
    public static int counttilling(int n) {
        if (n == 0 || n == 1)
            return 1;
        int fnm1 = counttilling(n - 1);
        int fnm2 = counttilling(n - 2);
        int totalWay = fnm1 + fnm2;
        return totalWay;
    }

    public static void main(String args[]) {
        System.out.println(counttilling(6));
    }
}
