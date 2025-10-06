import java.util.*;

public class MaxProduct {
    public static int maxProduct(int[] nums) {
        int maxProd = nums[0], currMax = nums[0], currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num < 0) { 
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(num, currMax * num);
            currMin = Math.min(num, currMin * num);
            maxProd = Math.max(maxProd, currMax);
        }

        return maxProd;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxProduct(nums)); 
    }
}
