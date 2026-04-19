import java.util.*;

class L4_MEDIAN_OF_TWO_SORTED_ARRAYS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums1 = new int[size];
        for (int i = 0; i < size; i++) {
            nums1[i] = sc.nextInt();
        }
        size = sc.nextInt();
        int[] nums2 = new int[size];
        for (int i = 0; i < size; i++) {
            nums2[i] = sc.nextInt();
        }
        sc.close();

        // brute force approach
        System.out.println(findMedianSortedArrays(nums1, nums2) + "");
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;

        return median;
    }
}