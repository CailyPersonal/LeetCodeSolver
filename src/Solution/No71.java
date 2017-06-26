package Solution;

import java.util.*;

/**
 * V  - CailyPersonal
 * <p>
 * 2017/6/25 - created.
 */
public class No71 {

    public String simplifyPath(String path) {

        HashSet<String> skip = new HashSet<>(Arrays.asList("",".",".."));

        Stack<String> stack = new Stack<>();

        for(String str : path.split("/")){
            if(str.equals("..") && !stack.isEmpty()) stack.pop();
            else if(!skip.contains(str)) stack.push(str);
        }

        StringBuilder result = new StringBuilder();
        for(String str : stack) result.append("/" + str);

        String string = result.toString();

        return string.isEmpty()? "/" : string;
    }
}
