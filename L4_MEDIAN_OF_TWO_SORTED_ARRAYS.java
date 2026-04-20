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
        System.out.println(findMedianSortedArraysBFA(nums1, nums2) + "");

        // optimized approach
        System.out.println(findMedianSortedArraysOPT(nums1, nums2) + "");
    }

    public static double findMedianSortedArraysBFA(int[] nums1, int[] nums2) {
        double median = 0;
        int[] nums3 = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (k != (nums1.length + nums2.length)) {
            if (i != nums1.length && j != nums2.length) {
                if (nums1[i] < nums2[j])
                    nums3[k] = nums1[i++];
                else
                    nums3[k] = nums2[j++];
            } else if (i != nums1.length) {
                nums3[k] = nums1[i++];
            } else if (j != nums2.length) {
                nums3[k] = nums2[j++];
            }
            System.out.print(nums3[k] + " ");
            k++;
        }

        if (k % 2 == 0) // numbers, n is even
            median = (double) (nums3[k / 2 - 1] + nums3[k / 2]) / 2.0;
        else
            median = nums3[k / 2]; // n is odd
        return median;
    }

    public static double findMedianSortedArraysOPT(int[] nums1, int[] nums2) {
        double median = 0;
        if (nums1.length == 0 && nums2.length == 1)
            return nums2[0];
        if (nums1.length == 1 && nums2.length == 0)
            return nums1[0];
        if (nums1.length == 0 && nums2.length == 0)
            return 0;

        int[] nums3 = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        int p = nums1.length + nums2.length;

        while (k != p) {
            if (i != nums1.length && j != nums2.length) {
                if (nums1[i] < nums2[j])
                    nums3[k] = nums1[i++];
                else
                    nums3[k] = nums2[j++];
            } else if (i != nums1.length) {
                nums3[k] = nums1[i++];
            } else if (j != nums2.length) {
                nums3[k] = nums2[j++];
            }
            if (k == p / 2) {
                if (p % 2 != 0) {
                    median = nums3[k];
                    break;
                } else {
                    median = (double) ((nums3[k] + nums3[k - 1]) / 2.0);
                    break;
                }
            }
            k++;
        }
        return median;
    }
}