import java.util.*;

public class MajElem2 {
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums)
            count.put(num, count.getOrDefault(num, 0) + 1);

        for (int key : count.keySet())
            if (count.get(key) > n / 3)
                result.add(key);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3, 2, 2};
        System.out.println(majorityElement(nums));
    }
}
