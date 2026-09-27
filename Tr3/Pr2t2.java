package Tr3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr2t2 {
    public static void main(String[] args){

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Car", "Машина");
        dictionary.put("Pencil", "Ручка");
        dictionary.put("Book", "Книга");
        dictionary.put("Student", "Студент");
        dictionary.put("Term", "Семестр");

        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.println("Введите слова для перевода: ");
        word = scanner.nextLine();
        String translation = dictionary.get(word);
        if (translation == null) {
            System.out.println("Такого слова в словаре нет");
        } else {
            System.out.println(translation);
        }
    }
}
