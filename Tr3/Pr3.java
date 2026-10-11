package Tr3;

public class Pr3 {
    public static void main(String[] args) {

        Thread thread = new Thread(new NumberTask());
        thread.start();

        Thread thread2 = new Thread(new LetterTask());
        thread2.start();


        int[][] arr = new int[4][4];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[0][2] = 3;
        arr[0][3] = 4;

        arr[1][0] = 1;
        arr[1][1] = 2;
        arr[1][2] = 0;
        arr[1][3] = 4;

        arr[2][0] = 1;
        arr[2][1] = 2;
        arr[2][2] = 3;
        arr[2][3] = 0;

        arr[3][0] = 0;
        arr[3][1] = 2;
        arr[3][2] = 3;
        arr[3][3] = 4;

        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    zero++;
                }
            }
        }
        System.out.println("\n" + "Количество элементов равных нулю: " + zero);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("\n" + "Сумма элементов главной диагонали: " + sum);
        }

    static class LetterTask implements Runnable {
        public void run() {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println(c);
            }
        }
    }
    static class NumberTask implements Runnable {
        public void run() {
            for (int i = 1; i <= 26; i++) {
                System.out.println(i);
                }
            }
        }

}