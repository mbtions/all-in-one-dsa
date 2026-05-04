import java.util.*;

class L11_CONTAINER_WITH_MOST_WATER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] height = new int[size];
        for (int i = 0; i < size; i++) {
            height[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        // only one line is there
        if (height.length <= 1) return 0;
        // one two lines are there
        if (height.length == 2) 
            return Math.min(height[0], height[1]);
        
        int i=0, j=height.length-1, ar=0, maxAr=0;

        while (i<j) {
            // calculate area
            ar = Math.min(height[i], height[j])*(j-i);
            // update max area if there is any
            if (ar > maxAr) maxAr = ar;

            // when left line is smaller, move ahead
            if (height[i]<height[j]) 
                i++;
            // otherwise move right line to left since its smaller
            else 
                j--;
        }
        return maxAr;
    }
}
