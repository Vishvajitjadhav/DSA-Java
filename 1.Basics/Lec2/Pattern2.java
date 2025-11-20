import java.util.Scanner;
// Hollow Rectangle Pattern
public class Pattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //outerloop
        for(int i=1; i<=a; i++) {
            //innerloop
            for(int j=1; j<=b; j++){
                //spacing
                if(i==1 || i==b || j==1 || j==b){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}
