public class Pr4t3 {
    public static void main(String[] args) {
        task3();
        task4();
    }
    static void task3() {
        int[] scores = {10, 25, 7, 42, 18};
        int i = 0;
        while (i < scores.length) {
            if (scores[i] == 42) {
                System.out.print("В массиве есть число 42!");
                break; }
            else
                i = i+1;
        }
    }
    static void task4() {
        int[] scores = {10, 25, 7, 42,18};
        int max = scores[0];
        for(int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.print("\n" + max);
    }
}