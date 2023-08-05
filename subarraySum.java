public class subarraySum {
    public static void maxsubarraySum(int numbers[]) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = start; j < numbers.length; j++) {
                int end = j;
                cursum = 0;
                for (int k = start; k <= end; k++) {
                    cursum += numbers[k];
                }
                System.out.println(cursum);
                if (cursum > maxsum) {
                    maxsum = cursum;
                }
            }
        }
        System.out.println("Max sum = " + maxsum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        maxsubarraySum(numbers);
    }
}
