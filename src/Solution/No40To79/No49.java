package Solution.No40To79;

import java.util.*;

/**
 * Created by Caily on 6/19/2017.
 */
public class No49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String string : strs){
            char[] array = string.toCharArray();
            Arrays.sort(array);

            String str = new String(array);

            if(!map.containsKey(str)){
                List<String> item = new ArrayList<>();
                item.add(string);
                map.put(str,item);
            }else map.get(str).add(string);
        }

        List<List<String>> list = new ArrayList<>();

        for(Map.Entry<String, List<String>> item : map.entrySet()){
            list.add(item.getValue());
        }
        return list;
    }


}
