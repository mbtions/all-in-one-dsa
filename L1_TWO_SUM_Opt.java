import java.util.*;

class L1_TWO_SUM_Opt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // array size

        // allocating memory to array
        int[] arr = new int[size];

        // intializing array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // getting target sum
        int target = sc.nextInt();

        int[] indices = twoSum(arr, target);

        if (indices[0] != -1) {
            System.out.println(indices[0] + " " + indices[1]);
        }

        sc.close();
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            // x has been found, now calculate its complement i.e. target-x
            int complement = target - nums[i]; // x is nums[i]

            // if hashmap has the complement, then target sum is found with
            // x at index i and complement at index stored as value of its key
            // in the hashmap.
            if (hmap.containsKey(complement)) {
                return new int[] { hmap.get(complement), i };

            }

            // if target sum not found, add the current element x to the hashmap.
            hmap.put(nums[i], i);
        }

        // target sum not found the entire array, therefore indices are -1 and -1.
        return new int[] { -1, -1 };
    }
}