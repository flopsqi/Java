package Tr3;

import java.util.*;

public class Pr2 {
    public void main(String[] args){
        List<String> names = Arrays.asList("Максим", "Игорь", "Яна", "Полина", "Игорь", "Яна");

        System.out.println(names);

        Set<String> students = new HashSet<>(names);

        System.out.println(students);

    }
}