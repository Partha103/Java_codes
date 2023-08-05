public class bubbleShort {
    public static void bubbleshort(int arr[]) {
        for (int tern = 0; tern < arr.length - 1; tern++) {
            for (int j = 0; j < arr.length - 1 - tern; j++) {
                if (arr[j] == arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void prtarray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        bubbleshort(arr);
        prtarray(arr);
    }
}
