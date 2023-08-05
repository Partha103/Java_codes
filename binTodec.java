import java.util.*;

public class binTodec {
    public static void bintodec(int binnum) {
        int pow = 0;
        int decNum = 0;
        while (binnum > 0) {
            int lastdigit = binnum % 10;
            decNum += (lastdigit * (int) Math.pow(2, pow));
            binnum /= 10;
            pow++;
        }
        System.out.println("decimal of " + binnum + " = " + decNum);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binnum = scan.nextInt();
        bintodec(binnum);
    }
}
