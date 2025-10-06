import java.util.*;

public class leadersInArray {
    public static List<Integer> findLeaders(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                leaders.add(nums[i]);
                maxFromRight = nums[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] nums = {16, 17, 4, 3, 5, 2};
        List<Integer> result = findLeaders(nums);
        System.out.println(result);
    }
}