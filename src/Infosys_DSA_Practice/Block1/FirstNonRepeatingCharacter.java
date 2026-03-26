package Infosys_DSA_Practice.Block1;

import java.util.*;

public class FirstNonRepeatingCharacter {
    public static int firstNonRepeat(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        // 1-add freq count
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        //2- check where freq == 1
        for(int i=0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;

        // Code to print all frequency
//        for(char c : map.keySet()){
//            System.out.println(c + " -> " + map.get(c));
//        }


    }

    public static void main(String[] args) {
        String s = "vishvajit";
        System.out.println(firstNonRepeat(s));



    }
}
