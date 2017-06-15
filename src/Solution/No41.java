package Solution;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * V  - CailyPersonal
 * <p>
 * 2017/6/3 - created.
 */
public class No41 {

    /**
     *
     * @brief only allow use static space and O(n).
     *
     * @param nums
     * @return
     */
    public int firstMissingPositive(int[] nums) {

        // Actually if a num in nums is more than nums.lenth,
        // the missing num will be 1 or in the middle of the nums.


        // Here, I just want to place num in its pos.
        int i = 0, tmp;

        while(i<nums.length){

            // No need to care about the pos.
            if(nums[i] > nums.length || nums[i] < 1 || nums[i] == i + 1) i++;

            else if (nums[i] < i + 1){
                tmp = nums[i];
                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = tmp;

                if(nums[i] < i+1 && tmp < i+1) i++;
            }
            else i++;
        }

        i = 0;

        while(i < nums.length && nums[i] == i+1) i++;

        return i + 1;
    }
}
