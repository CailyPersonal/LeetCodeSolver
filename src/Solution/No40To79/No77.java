package Solution.No40To79;

import java.util.LinkedList;
import java.util.List;

/**
 * V1.0  - CailyPersonal
 * <p>
 * 2017/6/26 - created.
 */

/**
 * @No. 77
 * @title  Combinations
 * @link https://leetcode.com/problems/combinations/#/description
 * @AC true
 */
public class No77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new LinkedList<>();

        process(list, new LinkedList<Integer>(), 1, n, 1, k);

        return list;
    }

    private void process(List<List<Integer>> list, List<Integer> pre, int start, int n, int deepth, int k){

        if(deepth == k){
            for(int i = start; i <= n; i++){
                List<Integer> item = new LinkedList<>();
                item.addAll(pre);
                item.add(i);
                list.add(item);
            }
        }else{
            for (int i = start; i <= n-(k-deepth); i++) {
                pre.add(i);

                process(list,pre,i+1,n,deepth+1,k);
                pre.remove(pre.size()-1);
            }
        }
    }
}
