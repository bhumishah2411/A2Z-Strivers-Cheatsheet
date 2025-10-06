import java.util.Scanner;

public class missingNum {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : nums) arraySum += num;
        return sum - arraySum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.print(findMissingNumber(nums));
    }
}