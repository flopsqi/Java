import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Pr10 {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Иван", "Игорь", "Максим", "Яна");
        try {
            try (FileWriter writer = new FileWriter(FILE_NAME)) {
                for (String student : students) {
                    writer.write(student + "\n");
                }
            }
            List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));
            System.out.println(lines);

        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
    private static final String FILE_NAME = "students.txt";
}