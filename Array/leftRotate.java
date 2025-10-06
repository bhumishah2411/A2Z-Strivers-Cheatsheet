import java.util.Scanner;
import java.util.Arrays;

public class leftRotate {
    public static void leftRotateByOne(int[] nums) {
        if (nums.length == 0) return;  
        int first = nums[0];  
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];  
        }
        nums[nums.length - 1] = first;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        leftRotateByOne(nums);
        System.out.println(Arrays.toString(nums));
    }
}