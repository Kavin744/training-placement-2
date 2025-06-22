public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {{1, 2}, {4, 5}};
        int[][] B = {{1, 1}, {1, 1}};
        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    result[i][j] += A[i][k] * B[k][j];

        for (int[] row : result) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
