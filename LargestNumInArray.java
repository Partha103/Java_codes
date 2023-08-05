import java.util.*;

public class LargestNumInArray {
    public static int Largest(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5 };
        System.out.println(Largest(number) + " is largest in this array");
    }
}
