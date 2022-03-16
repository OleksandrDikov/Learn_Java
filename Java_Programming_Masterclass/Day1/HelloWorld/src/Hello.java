public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        byte byteNumber = 100;
        short shortNumber = 10000;
        int intNumber = 1000000000;

        long longNumber = 50000 + 10L * (byteNumber + shortNumber + intNumber);
        System.out.println(longNumber);
    }
}
