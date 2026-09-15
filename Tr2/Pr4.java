public class Pr4 {
    public static void main(String[] args) {
        task1();
        task2();
    }
    static void task1() {
        int[] scores = {10,25,7,42,18};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + " ");
        }
    }
    static void task2() {
        int[] scores = {10,25,7,42,18};
        int i = 0;
        int sum = 0;
        while (i < scores.length) {
            sum += scores[i];
            i = i+1;
        }
        System.out.println(sum);
    }
}
