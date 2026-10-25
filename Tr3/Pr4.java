package Tr3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите число ");
            int a = scanner.nextInt();
            System.out.println("Введите второе число ");
            int b = scanner.nextInt();
            int i = a / b;
            System.out.println("Деление двух чисел равняется " + i);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }


        LocalDate today = LocalDate.now();
        System.out.println("\n" + today);

        today = today.plusDays(14);
        System.out.println("\n" + "Дата возврата книги в библиотеку: " + today);
    }
}