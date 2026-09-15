import java.util.Arrays;
import java.util.Random;
public class Pr15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers;
        numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.print("\n" + max);

        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.print("\n" + min);

        int[][] matrix = new int[3][3];
        for (int i = 0; i <= matrix.length -1; i++) {
            for (int j = 0; j <= matrix.length -1; j++) {
                        if (i == j) {
                            matrix[i][j] = 1;
                            }
            }
        }
        System.out.println("\n" + Arrays.deepToString(matrix));

        int rows = 4;
        int[][] triangle;
        triangle = new int[rows][];
for (int i = 0; i < rows; i++) {
    triangle[i] = new int[i + 1];
    triangle[i][0] = 1;
    triangle[i][i] = 1;
    for (int j = 1; j < i; j++) {
        triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
    }

    }
        System.out.println("\n" + Arrays.deepToString(triangle));
}

    }