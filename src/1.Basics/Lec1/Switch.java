import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Harrier");
                break;
            case 2:
                System.out.println("Scorpio");
                break;

            case 3:
                System.out.println("Kia Seltos");
                break;

            case 4:
                System.out.println("Hyrider");
                break;

            case 5:
                System.out.println("Victoris");
                break;

            default:
                System.out.println("Public Trasport");
                break;
        }

    
    }
    
}
