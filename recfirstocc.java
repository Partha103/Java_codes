public class recfirstocc {
    public static int firstocc(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstocc(arr, key, i + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 5;
        if (firstocc(arr, key, 0) == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println(key + " is in the index : " + firstocc(arr, key, 0));
        }
    }
}
