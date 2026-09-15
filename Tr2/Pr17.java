import java.util.HashMap;
import java.util.Map;

public class Pr17 {
    public static void main(String[] args) {
        Map<String, Integer> studentsRating = new HashMap<>();

        studentsRating.put("Иван", 85);
        studentsRating.put("Максим", 75);
        studentsRating.put("Яна", 90);
        studentsRating.put("Игорь", 80);
        studentsRating.put("Олег", 65);

        System.out.println(studentsRating.get("Яна"));



        if (studentsRating.containsKey("Иван"))
            System.out.println("Такой студент есть в списке");
        else
            System.out.println("Такого студента в списке нет");

        studentsRating.remove("Максим");

        System.out.println(studentsRating);
    }
}