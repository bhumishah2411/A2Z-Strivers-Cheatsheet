import java.util.*;

public class findUnion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        for (int i = 0; i < n1; i++) nums1[i] = sc.nextInt();
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for (int i = 0; i < n2; i++) nums2[i] = sc.nextInt();

        TreeSet<Integer> union = new TreeSet<>();
        for (int x : nums1) union.add(x);
        for (int x : nums2) union.add(x);

        System.out.println(union);
    }
}