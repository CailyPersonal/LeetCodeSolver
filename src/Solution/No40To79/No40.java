package Solution.No40To79;

import javax.xml.ws.Action;
import java.util.*;

/**
 * V1.0  - CailyPersonal
 *
 * 2017/6/3 - created.
 */

/**
 * @NO. 40
 * @title Combination Sum II
 * @link https://leetcode.com/problems/combination-sum-ii/#/description
 */
public class No40 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> list = new LinkedList<>();

        Map<Integer, Integer> map = new HashMap<>();

        // We save the last index of the candidate.
        for (int i = 0; i < candidates.length; i++) map.put(candidates[i],i);

        // Search paris using backtracking aglorithm.
        search(list, new LinkedList<Integer>(), candidates, target, 0, map);

        return list;
    }

    private boolean search(List<List<Integer>> list, List<Integer> pre, int[] candidates, int target, int start, Map<Integer,Integer> map){

        // Impossible to find an element in array or seperate again, so return false here.
        if(start == candidates.length || target < candidates[start]) return false;

        List<Integer> thisPair = new LinkedList<>();
        thisPair.addAll(pre);

        boolean canContinue = true;

        for(int i = start; canContinue && i< candidates.length; i++) {

            // Exclude repeat element.
            if (i != start && candidates[i] == candidates[i - 1]) continue;

            // Use backtracking here.
            thisPair.add(candidates[i]);
            canContinue = search(list,thisPair,candidates,target - candidates[i],i+1, map);
            thisPair.remove(thisPair.size()-1);

            // If false equals canContinue, this means no seperate is possible.
            // So check if there is a valid candidate in candidates.
            if(false ==canContinue && map.containsKey(target)&&map.get(target)>=start) {
                thisPair.add(target);
                list.add(thisPair);
            }
        }

        return true;
    }
}
