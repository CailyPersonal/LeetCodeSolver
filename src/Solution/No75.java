package Solution;

/**
 * Created by caily on 6/26/17.
 */

/**
 * @No. 75
 * @title Sort Colors
 * @link https://leetcode.com/problems/sort-colors/#/description
 */
public class No75 {

    public void sortColors(int[] nums) {

        int leftPos = 0, rightPos = nums.length - 1;

        for (int left = 0, right = nums.length - 1; left < right; ) {
            if (0 == nums[left]) swap(leftPos++, left++, nums);
            if (2 == nums[right]) swap(rightPos--, right--, nums);
            if (nums[left] > nums[right]) swap(left,right,nums);
            else right--;
        }

    }

    private void swap(int i, int j, int[] nums){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
