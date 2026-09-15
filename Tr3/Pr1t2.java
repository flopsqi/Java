
package Tr3;

import java.util.Arrays;
import java.util.Random;

public class Pr1t2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("\n" + max);

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("\n" + min);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            }
        System.out.println("\n" + sum);
        }
    }

