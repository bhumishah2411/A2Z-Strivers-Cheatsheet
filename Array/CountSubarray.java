import java.util.*;

public class CountSubarray {
    public static int countSubarraysWithXor(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int xor = 0, count = 0;
        map.put(0, 1); 

        for (int num : nums) {
            xor ^= num; 
            int needed = xor ^ k; 
            count += map.getOrDefault(needed, 0);
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(countSubarraysWithXor(nums, k));
    }
}
