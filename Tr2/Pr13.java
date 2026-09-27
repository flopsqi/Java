import java.util.*;

public class Pr13 {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>(Arrays.asList("Иван", "Игорь", "Максим", "Максим", "Яна"));
        System.out.println(studentNames);

        Set<String> students = new HashSet<>(studentNames);
        System.out.println(students);

        Map<String,Integer> studentsRating = new HashMap<>();
        studentsRating.put("Иван", 85);
        studentsRating.put("Максим", 75);
        studentsRating.put("Яна", 90);
        studentsRating.put("Игорь", 80);
        System.out.println(studentsRating);
    }
}
