package Tr3;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Pr1t3 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Иван", "Максим", "Яна", "Игорь", "Дмитрий"));
        try {
            try (FileWriter writer = new FileWriter(FILE_NAME)) {
                for (String student : students) {
                    writer.write(student + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));
            System.out.println(lines);
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
        String studentName;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя ");
            try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
                studentName = scanner.nextLine();
                writer.write(studentName + "\n");
                scanner.close();
                }
            List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));
            System.out.println(lines);

            } catch (IOException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }

    }
    private static final String FILE_NAME = "students.txt";
}