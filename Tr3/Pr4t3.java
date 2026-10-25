package Tr3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pr4t3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату вашего рождения (гггг-мм-дд): ");
        String birthDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

        LocalDate today = LocalDate.now();
        Period age = Period.between(LocalDate.parse(birthDate), today);
        System.out.println("Ваш возраст: " + age.getYears() + " лет");
    }
}
