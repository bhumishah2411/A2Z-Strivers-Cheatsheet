import java.util.Scanner;
import java.util.Arrays;

public class move0ToEnd {
    public static void moveZerosToEnd(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) nums[index++] = num;
        }
        while (index < nums.length) nums[index++] = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        moveZerosToEnd(nums);
        System.out.println(Arrays.toString(nums));
    }
}