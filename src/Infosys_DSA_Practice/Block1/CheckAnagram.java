package Infosys_DSA_Practice.Block1;

import java.util.HashMap;

public class CheckAnagram {
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // freq count
        for(char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        // reduce freq using s2
        for(char c : s2.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }

            map.put(c,map.get(c) - 1);

            if(map.get(c) < 0){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String s1 = "vishvajit";
        String s2 = "ihsvvjati";
        System.out.println(isAnagram(s1, s2));

    }
}
