import java.util.InputMismatchException;
import java.util.Scanner;
public class Pr9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("Введите число ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число ");
        int b = scanner.nextInt();
            double i = (double) a / b;
            System.out.println("Деление двух числе равняется " + i);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        } finally {
            System.out.println("Программа завершена");
        }
    }
}