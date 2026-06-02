package dayOne;

public class datatype {

    // Static variable
    static boolean hamada; // default value = false

    public static void main(String[] args) {

        // =========================
        // Primitive Data Types
        // =========================

        int myInt = 100;           // 4 bytes
        byte myByte = 10;          // 1 byte
        short myShort = 30000;     // 2 bytes
        long myLong = 100000L;     // 8 bytes

        float myFloat = 1000.0F;   // 4 bytes
        double myDouble = 10000.0; // 8 bytes

        // =========================
        // Printing Numbers
        // =========================

        System.out.println("Integer: " + myInt);
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);

        // =========================
        // Character
        // =========================

        char myChar = 'A'; // 2 bytes
        System.out.println("Char: " + myChar);

        // =========================
        // Boolean
        // =========================

        boolean myBool = true;
        System.out.println("Boolean: " + myBool);

        // Static variable example
        System.out.println("Hamada: " + hamada);

    }
}