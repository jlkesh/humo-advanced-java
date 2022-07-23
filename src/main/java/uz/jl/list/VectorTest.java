package uz.jl.list;

import java.util.Vector;
import java.util.function.Predicate;

public class VectorTest {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(12);
        vector.add(92);
        vector.add(92);
        vector.add(92);
        vector.add(92);
        vector.add(92);
        vector.add(92);
        System.out.println("vector = " + vector);
        vector.add(0, 456);
        System.out.println("vector = " + vector);
        vector.set(0, 7457547);
        System.out.println("vector = " + vector);
        Integer o = 92;

        Predicate<Integer> integerPredicate = i -> i % 2 == 0;

        vector.removeIf(integerPredicate);
        System.out.println("vector = " + vector);
    }
}
