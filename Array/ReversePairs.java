import java.util.*;

public class ReversePairs {
    public static int mergeAndCount(int[] nums, int l, int m, int r) {
        int count = 0;
        int j = m + 1;

        for (int i = l; i <= m; i++) {
            while (j <= r && (long) nums[i] > 2L * nums[j]) j++;
            count += j - (m + 1);
        }

        int[] temp = new int[r - l + 1];
        int i = l, k = 0;
        j = m + 1;
        while (i <= m && j <= r) {
            if (nums[i] <= nums[j]) temp[k++] = nums[i++];
            else temp[k++] = nums[j++];
        }
        while (i <= m) temp[k++] = nums[i++];
        while (j <= r) temp[k++] = nums[j++];
        System.arraycopy(temp, 0, nums, l, temp.length);

        return count;
    }

    public static int reversePairs(int[] nums, int l, int r) {
        int count = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            count += reversePairs(nums, l, m);
            count += reversePairs(nums, m + 1, r);
            count += mergeAndCount(nums, l, m, r);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {6, 4, 1, 2, 7};
        System.out.println(reversePairs(nums, 0, nums.length - 1));
    }
}
