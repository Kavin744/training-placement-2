import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Largest: " + max);
    }
}
