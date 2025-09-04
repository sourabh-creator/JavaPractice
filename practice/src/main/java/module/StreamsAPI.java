package module;

import java.util.*;

public class StreamsAPI {
    public static void main(String[] args) {
        var nums = List.of(1, 2, 3, 4, 5, 6);

        var evens = nums.stream()
                .filter(n -> n % 2 == 0)   // Lambda
                .map(n -> n * n)           // square each
                .toList();                 // collect

        System.out.println("Even squares: " + evens);
    }
}
