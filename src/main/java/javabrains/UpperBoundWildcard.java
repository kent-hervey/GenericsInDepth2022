package javabrains;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        printNumbers(numbers);
    }

    private static void printNumbers(List<?> numbers) {
        numbers.forEach(System.out::println);
    }


}
