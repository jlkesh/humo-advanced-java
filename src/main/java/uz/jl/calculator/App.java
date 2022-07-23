package uz.jl.calculator;

import lombok.Builder;
import uz.jl.calculator.exceptions.DivException;
import uz.jl.calculator.exceptions.MulException;
import uz.jl.calculator.exceptions.SubException;

import java.util.Scanner;

public class App {
    static Calculator calculator = new Calculator();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("/,*,-,+");
        String choice = scanner.nextLine();
        try {
            int result = switch (choice) {
                case "/" -> calculator.div(scanner.nextInt(), scanner.nextInt());
                case "*" -> calculator.mul(scanner.nextInt(), scanner.nextInt());
                case "-" -> calculator.sub(scanner.nextInt(), scanner.nextInt());
                case "+" -> calculator.add(scanner.nextInt(), null);
                default -> {
                    System.exit(0);
                }
            };
            System.out.println("result = " + result);
        } catch (RuntimeException e) {
            System.out.println("e.getCause() = " + e.getCause());
        }
        main(args);
    }
}
