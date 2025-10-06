import java.util.*;

public class findRepeatingAndMissingNum {
    public static int[] findRepeatingAndMissing(int[] nums) {
        int n = nums.length;
        long sum = 0, sumSq = 0;

        for (int num : nums) {
            sum += num;
            sumSq += (long) num * num;
        }

        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSumSq = (long) n * (n + 1) * (2 * n + 1) / 6;

        long diff = sum - expectedSum;           
        long diffSq = sumSq - expectedSumSq;     

        long sumAB = diffSq / diff;              

        int A = (int) ((diff + sumAB) / 2);
        int B = (int) (sumAB - A);

        return new int[]{A, B};
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 2, 1, 1};
        int[] result = findRepeatingAndMissing(nums);
        System.out.println(Arrays.toString(result));
    }
}
