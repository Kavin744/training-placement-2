public class PowerCalc {
    public static void main(String[] args) {
        int base = 2, exponent = 5, result = 1;
        for (int i = 0; i < exponent; i++)
            result *= base;
        System.out.println(base + "^" + exponent + " = " + result);
    }
}
