import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        System.out.println("Digits: " + count);
    }
}
