public class LinearSearch {
    public static int linearsearch(int number[], int key) {
        int index = -1;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int number[] = { 2, 3, 10, 1, 7, 5, };
        int key = 10;
        int index = linearsearch(number, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found in index: " + index);
        }
    }
}
