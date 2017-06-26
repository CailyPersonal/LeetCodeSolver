package Solution.No40To79;

import java.util.List;
import java.util.LinkedList;

/**
 * V1.0  - CailyPersonal
 * <p>
 * 2017/6/26 - created.
 */
public class No78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();

        for(int i = 0; i <= nums.length; i++){
            process(list,new LinkedList<Integer>(), nums, 0, 1, i);
        }

        return list;
    }

    /**
     * @brief Core method to realize the function.
     * @param list A list to hold result to return.
     * @param pre A list to hold previous part.
     * @param nums An array of nums.
     * @param start Start index of nums, inclusive.
     * @param depth Backtrack depth.
     * @param k Target depth.
     */
    private void process(List<List<Integer>> list, List<Integer> pre, int[] nums, int start, int depth, int k) {

        // No length support.
        if (k == 0) list.add(new LinkedList<Integer>());
            // Have reached the depth of the target.
        else if (depth == k) {

            for (int i = start; i < nums.length; i++) {
                List<Integer> item = new LinkedList<>(pre);
                item.add(nums[i]);
                list.add(item);
            }
        }
        // Have not reach the target depth.
        else {
            for (int i = start; i < nums.length - k + depth; i++) {
                pre.add(nums[i]);
                process(list, pre, nums, i + 1, depth + 1, k);
                pre.remove(pre.size() - 1);
            }
        }
    }
}
