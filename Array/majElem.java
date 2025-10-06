import java.util.*;
public class majElem {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(new majElem().majorityElement(nums));
    }
}