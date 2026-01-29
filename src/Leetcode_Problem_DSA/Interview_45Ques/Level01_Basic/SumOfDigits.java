package Leetcode_Problem_DSA.Interview_45Ques.Level01_Basic;

public class SumOfDigits {
    // iterative (optimal)
    public int sumDigits(int n){
        int sum = 0;

        while(n > 0){
            int lastdigit = n % 10 ;
            sum += lastdigit;
            n/=10;
        }
        return sum;
    }

    // Recursive approach
    public static int sumD(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sumD(n/10);
    }

    public static void main(String[] args){
        int n = 1234;
        SumOfDigits s = new SumOfDigits(); // object creation
        System.out.println(s.sumDigits(n)); // method call

        System.out.println(sumD(n));
    }
}

// iterative (optimal)
// TC : O(d)
// SC : O(1)

// Recursive approach
// TC : O(d)
// SC : O(d)