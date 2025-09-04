package module;

@FunctionalInterface
interface Checker<T> {
    boolean test(T t);
}

public class FuncInterface {
    public static void main(String[] args) {
        Checker<Integer> isEven = n -> n % 2 == 0;

        var nums = java.util.List.of(3, 4, 5, 6);
        var evens = nums.stream().filter(isEven::test).toList(); // method reference

        System.out.println("Evens: " + evens);
    }
}
