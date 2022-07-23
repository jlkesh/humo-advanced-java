package uz.jl.list;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        /* LIFO */
        Stack<Integer> stack = new Stack<>();
//        System.out.println("stack.peek() = " + stack.peek());
//        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.empty() = " + stack.empty());
        stack.push(12);
        stack.add(47);
        stack.push(34);
        stack.add(0, 45);
        System.out.println("stack.empty() = " + stack.empty());
        System.out.println("stack = " + stack);
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack = " + stack);
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);
        int search = stack.search(47);
        System.out.println("search = " + search);

    }
}
