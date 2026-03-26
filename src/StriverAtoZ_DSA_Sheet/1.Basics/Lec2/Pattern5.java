import java.util.Scanner;
// Inverted Half Pyramid Pattern
public class Pattern5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        //outerloop
        for(int i=1; i<=n; i++) {
            //innerloop
            for(int j=1; j<=(n-i); j++){ // star per row count
                System.out.print(" ");

            }
            //Print star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
