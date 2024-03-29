public class CountingSort {
    public static void countingsort(int arr[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            large = Math.max(large, arr[i]);
        }
        int count[] = new int[large + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        countingsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
