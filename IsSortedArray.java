public class IsSortedArray {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i + 1] < arr[i]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 6, 5, 7, 8 };
        if (isSorted(arr, 0) == true) {
            System.out.println("Shorted array");
        } else {
            System.out.println("Not sorted array");
        }
    }
}
