package Solution.No80To89;

/**
 * V  - CailyPersonal
 * <p>
 * 2017/6/26 - created.
 */
public class No80 {

    public int removeDuplicates(int[] nums) {

        int savePos = 0, readPos;

        for(readPos = 1; readPos < nums.length; ){
            if(nums[savePos] == nums[readPos]) {
                while (readPos + 1 < nums.length && nums[readPos] == nums[readPos + 1]) readPos++;
                nums[++savePos] = nums[readPos++];
            }else{
                nums[++savePos] = nums[readPos++];
            }
        }

        return savePos + 1;
    }
}
