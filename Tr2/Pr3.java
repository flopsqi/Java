import java.util.Scanner;
public class Pr3 {
    public static void main(String[] args) {
        task1();
        task2();
    }
    static void task1() {
        for (int i = 1;i <= 10;i++) {
            System.out.println(i);
        }
    }
    static void task2() {
        int i = 0;
        int sum = 0;
        while (i < 100) {
            i = i+1;
            sum += i;
        }
        System.out.println(sum);
    }
}
