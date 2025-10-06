import java.util.Scanner;

public class maxConsecutive {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        for (int num : nums) {
            if (num == 1) count++;
            else count = 0;
            if (count > maxCount) maxCount = count;
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.print(findMaxConsecutiveOnes(nums));
    }
}