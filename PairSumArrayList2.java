import java.util.ArrayList;

public class PairSumArrayList2 {
    public static boolean pairsum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;
        int rp = bp;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (rp + n - 1) % n;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        boolean hasPairSum = pairsum2(list, target);

        if (hasPairSum) {
            System.out.println("There is a pair with the sum " + target + " in the ArrayList.");
        } else {
            System.out.println("No pair with the sum " + target + " found in the ArrayList.");
        }
    }
}
