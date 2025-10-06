import java.util.*;
public class maxSubarraySumK {
    public int longestSubarraySumK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) maxLen = i + 1;
            if (!map.containsKey(sum)) map.put(sum, i);
            if (map.containsKey(sum - k)) maxLen = Math.max(maxLen, i - map.get(sum - k));
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(new maxSubarraySumK().longestSubarraySumK(nums, k));
    }
}