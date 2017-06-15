package Solution;

/**
 * Created by caily on 6/15/17.
 */

/**
 * @No. 42.
 * @Title Trapping Rain Water
 * @link https://leetcode.com/problems/trapping-rain-water/#/description
 */
public class No42 {

    public int trap(int[] height) {

        // If length of height is less than 3, it is meaningless.
        if (height.length < 3) return 0;

        int leftIndex = 0, rightIndex = height.length - 1;

        int trap = 0;

        int leftMax = 0, rightMax = 0;

        while(leftIndex < rightIndex){

            /**
             * This is the process to find the top of all heights, so if the left
             * is less than right, it can move to right and try to find a height
             * which is heigher than the last heightest. The right part is with
             * the same thinking.
             */

            if(height[leftIndex] <=height[rightIndex]){
                if(height[leftIndex] > leftMax) leftMax = height[leftIndex];
                else trap += leftMax - height[leftIndex];
                leftIndex++;
            }else{
                if(height[rightIndex] > rightMax) rightMax = height[rightIndex];
                else trap += rightMax - height[rightIndex];
                rightIndex--;
            }

        }

        return trap;
    }

}
