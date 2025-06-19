public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {12, 5, 30, 7};
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        System.out.println("Max: " + max);
    }
}
