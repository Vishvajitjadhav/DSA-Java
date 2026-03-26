import java.util.*;

public class If_else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a >= 18){
            System.out.println("You are Adult");
        }
        else if(a < 18){
            System.out.println("You are Baccha");
        }
        else if (a > 100){
            System.out.println("You are Amar");
        }
        else{
            System.out.println("Invalid");
        }
    }
    
}
