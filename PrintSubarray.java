public class PrintSubarray {
    public static void subarray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                System.out.print(numbers[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        subarray(numbers);
    }
}
