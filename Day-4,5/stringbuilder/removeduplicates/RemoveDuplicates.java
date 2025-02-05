package stringbuilder.removeduplicates;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String str){
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for(char ch : str.toCharArray()){
            if(!seen.contains(ch)){
              sb.append(ch);
              seen.add(ch);
            }
        }
        return sb.toString();


    }
}
