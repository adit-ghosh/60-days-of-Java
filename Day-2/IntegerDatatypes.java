public class IntegerDatatypes {
    public static void main(String[] args) {
        // byte, short, int, long

        // byte -> 8 bits
        // byte age = 128// This will cause an error because byte can only hold values from -128 to 127 (-2^8 to 2^8-1 [Due to 0])
        // byte age = -128; // This is valid
        byte age = 127; // This is valid [Great to store something like a human age]
        System.out.println(age);

        // short -> 16 bits
        // short year = 327670; // This will cause an error because short can only hold values from -32768 to 32767 (-2^16 to 2^16-1[Due to 0])
        short year = 32767;// This is valid [Great to store something like a year]
        System.out.println(year);

        // int -> 32 bits
        // int population = 10147483647; // This will cause an error because int can only hold values from -2147483648 to 2147483647 (-2^32 to 2^32-1 [Due to 0])
        int population = 2_147_483_647; // This is valid [Great to store something like a population]
        System.out.println(population);

        // long -> 64 bits
        long populationWorld = 8_000_000_000L; // This is valid [Great to store something like a world population] 
        // Note: The 'L' at the end indicates that this is a long literal else it will be treated as an int by default.
        System.out.println(populationWorld);
    }
    
}
