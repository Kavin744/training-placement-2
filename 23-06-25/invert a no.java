public class InvertNumber {
    public static void main(String[] args) {
        int num = 12345, inverted = 0;
        while (num != 0) {
            int digit = num % 10;
            inverted = inverted * 10 + digit;
            num /= 10;
        }
        System.out.println("Inverted number: " + inverted);
    }
}
