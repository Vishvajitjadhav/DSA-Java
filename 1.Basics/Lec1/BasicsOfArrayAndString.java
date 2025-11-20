import java.util.*;

public class BasicsOfArrayAndString {
    public static void main(String[] args) {
        //Arrray
        // Index - 0 1 2 3 4 5
        int arr[] = {2, 3, 4, 5, 6};
        for(int i = 0; i<5; i++){
            System.out.println(arr[i]);
        }

        //String
        String name = "Vishvajit";

        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Char At" + name.charAt(0));

    }
}
