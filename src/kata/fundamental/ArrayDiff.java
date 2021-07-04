package kata.fundamental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {

    public static void main(String[] args) {
        removeDiff(new int[]{1,2,3}, new int[]{1, 2});
        removeDuplicates(new int[]{1,2,3}, new int[]{1, 2});
    }

    /**
     * Naive approach
     * @param a
     * @param b
     * @return
     */
    public static int[] removeDiff(int[] a, int[] b) {

        ArrayList<Integer> temp = new ArrayList<>();

        for (int num1 : a) {
            boolean isDuplicate = false;
            for (int i = 0; i < b.length; i++) {
                if (num1 == b[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) temp.add(num1);
        }

        int[] nonDuplicatedArray = new int[temp.size()];

        for (int i = 0; i < nonDuplicatedArray.length; i++) {
            nonDuplicatedArray[i] = temp.get(i);
        }

        return nonDuplicatedArray;
    }

    /**
     * Improved version of the removeDiff()
     * @param a
     * @param b
     * @return
     */
    public static int[] removeDuplicates(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }
}
