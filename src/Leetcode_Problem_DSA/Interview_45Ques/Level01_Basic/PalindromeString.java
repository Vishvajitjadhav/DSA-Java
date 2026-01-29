package Leetcode_Problem_DSA.Interview_45Ques.Level01_Basic;

public class PalindromeString {

    public static Boolean checkPalindrome(String s){
        s = s.replaceAll("[^a-zA-z0-9]", "").toLowerCase();

        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args){
        String s = "madam";
        System.out.println(checkPalindrome(s));

        System.out.println(checkPalindrome("Hello"));
    }

}

// Pattern : Two pointer
// TC : O(n)
// SC : O(1)

