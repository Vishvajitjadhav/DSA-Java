public class Function {
    static void greet(){
        System.out.println("Welcome Welcome Welcome");   //Simple function (no input, no output)
    }

    static void PrintName(String name){
        System.out.println("Your name is : " + name);   //Function with input (parameters)
    }

    static int add(int a, int b){
        return a + b;         //Function that returns a value
    }

    static int getNumber(){
        return 100;          // Function with no parameters but returns something
    } 
    
    public static void main(String[] args) {
        greet();
        greet();  // 1

        PrintName("Vishvajit"); 
        PrintName("VJ");  // 2

        int n = add(10, 9);
        System.out.println(n);   // 3

        int x = getNumber();
        System.out.println(x);  // 4


    }
    
}
