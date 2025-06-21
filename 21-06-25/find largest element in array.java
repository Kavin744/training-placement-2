public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 5, 6};
        int max = arr[0];
        for (int num : arr)
            if (num > max)
                max = num;

        System.out.println("Largest element is: " + max);
    }
}
