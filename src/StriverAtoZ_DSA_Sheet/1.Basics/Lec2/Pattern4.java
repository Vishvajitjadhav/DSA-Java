import java.util.Scanner;
// Reverse Half Pyramid Pattern
public class Pattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        //outerloop
        for(int i=row; i>=1; i--) {
            //innerloop
            for(int j=1; j<=i; j++){ // star per row count
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
