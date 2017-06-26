package Solution.No40To79;

import java.util.LinkedList;
import java.util.List;

/**
 * V  - CailyPersonal
 * <p>
 * 2017/6/19 - created.
 */

/**
 * @No. 46
 * @Title Permutations
 * @Link https://leetcode.com/problems/permutations/#/description
 */
public class No46 {

    public List<List<Integer>> permute(int[] nums) {

        LinkedList<List<Integer>> list = new LinkedList<>();

        List<Integer> items = new LinkedList<>();
        for (int num : nums) items.add(num);
        search(list,new LinkedList<Integer>(), items);

        return list;
    }

    private void search(List<List<Integer>> list, List<Integer> pre, List<Integer> items){

        if(0 == items.size()){
            List<Integer> condition = new LinkedList<>();
            condition.addAll(pre);
            list.add(pre);
            return;
        }else{
            int count = items.size();
            for(int i = 0;i < count; i++){

                Integer item = items.get(i);

                pre.add(item);
                items.remove(i);

                search(list,pre,items);

                items.add(i,item);
                pre.remove(pre.size() -2);
            }
        }

        return;
    }

}
