public class Datatypes {
    public static void main(String[] args) {
        
        // ========== INTEGER TYPES ==========
        
        // byte: 8 bits, Range: -128 to 127
        byte age = 25;
        byte temperature = -10;
        byte maxByte = 127;
        System.out.println("byte age: " + age);
        
        // short: 16 bits, Range: -32,768 to 32,767
        short year = 2024;
        short population = 5000;
        short maxShort = 32767;
        System.out.println("short year: " + year);
        
        // int: 32 bits, Range: -2,147,483,648 to 2,147,483,647 (-2^31 to 2^31-1)
        int cityPopulation = 8000000;
        int maxInt = 2147483647;
        System.out.println("int cityPopulation: " + cityPopulation);
        
        // long: 64 bits, Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (-2^63 to 2^63-1)
        // Note: Use 'L' suffix for long literals
        long distance = 9460730472580800L;
        long worldPopulation = 8000000000L;
        long maxLong = 9223372036854775807L;
        System.out.println("long distance: " + distance);
        
        
        // ========== FLOATING-POINT TYPES ==========
        
        // float: 32 bits, Precision: ~6-7 decimal digits
        // Note: Use 'f' suffix for float literals
        float price = 19.99f;
        float temperature2 = 98.6f;
        float pi = 3.14f;
        System.out.println("float price: " + price);
        
        // double: 64 bits, Precision: ~15 decimal digits
        // Default type for decimal numbers
        double piPrecise = 3.141592653589793;
        double salary = 75000.50;
        double scientificNotation = 1.23e5; // 123000.0
        System.out.println("double piPrecise: " + piPrecise);
        
        
        // ========== CHARACTER TYPE ==========
        
        // char: 16 bits, Range: 0 to 65,535 (Unicode characters)
        // Use single quotes for char literals
        char grade = 'A';
        char symbol = '@';
        char digit = '5';
        char unicode = '\u0041'; // Unicode for 'A'
        char newline = '\n';     // Escape character for newline
        char tab = '\t';         // Escape character for tab
        System.out.println("char grade: " + grade);
        System.out.println("char unicode: " + unicode);
        
        
        // ========== BOOLEAN TYPE ==========
        
        // boolean: Only two values - true or false
        // Used for logical conditions
        boolean isActive = true;
        boolean hasAccess = false;
        boolean isJavaFun = true;
        System.out.println("boolean isActive: " + isActive);
        System.out.println("boolean hasAccess: " + hasAccess);
        
        
        // ========== SIZE INFORMATION ==========
        System.out.println("\n--- Size Information ---");
        System.out.println("byte size: 8 bits (1 byte)");
        System.out.println("short size: 16 bits (2 bytes)");
        System.out.println("int size: 32 bits (4 bytes)");
        System.out.println("long size: 64 bits (8 bytes)");
        System.out.println("float size: 32 bits (4 bytes)");
        System.out.println("double size: 64 bits (8 bytes)");
        System.out.println("char size: 16 bits (2 bytes)");
        System.out.println("boolean size: Not precisely defined (JVM dependent)");
    }
}
