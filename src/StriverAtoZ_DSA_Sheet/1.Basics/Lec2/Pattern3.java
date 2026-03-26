import java.util.Scanner;
// Half Pyramid Pattern
public class Pattern3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        //outerloop
        for(int i=1; i<=row; i++) {
            //innerloop
            for(int j=1; j<=i; j++){ // star per row count
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
