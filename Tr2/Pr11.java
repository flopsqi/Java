import java.util.*;
import java.util.stream.Collectors;
public class Pr11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, -2, 3, -4, 5));
        System.out.println(numbers);
        List<Integer> result = numbers.stream()
                .filter(n -> n > 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}