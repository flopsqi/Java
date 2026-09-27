package Tr3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Pr2t3 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        System.out.println(numbers);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));
    }
}