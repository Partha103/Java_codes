import java.util.ArrayList;

public class pairSumArraylist {
    public static boolean pairsum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            if (list.get(lp) + list.get(rp) > target) {
                rp--;
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

        boolean hasPairSum = pairsum(list, target);

        if (hasPairSum) {
            System.out.println("There is a pair with the sum " + target + " in the ArrayList.");
        } else {
            System.out.println("No pair with the sum " + target + " found in the ArrayList.");
        }
    }
}
