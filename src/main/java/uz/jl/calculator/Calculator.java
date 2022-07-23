package uz.jl.calculator;

import uz.jl.calculator.exceptions.DivException;
import uz.jl.calculator.exceptions.SumException;

import java.util.Objects;

public class Calculator {
    public int div(Integer a, Integer b) {
        try {
            return a / b;
        } catch (ArithmeticException ex) {
            String errorMessage = "%s can not be divided by %s".formatted(a, b);
            throw new DivException(errorMessage);
        }
    }

    public int add(Integer a, Integer b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            String errorMessage = "can not perform addition on inputs [%s,%s]".formatted(a, b);
            throw new SumException(errorMessage);
        }
        return a + b;
    }

    public int mul(Integer a, Integer b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            String errorMessage = "can not perform multiplication on inputs [%s,%s]".formatted(a, b);
            throw new SumException(errorMessage);
        }
        return a + b;
    }

    public int sub(Integer a, Integer b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            String errorMessage = "can not perform subtraction on inputs [%s,%s]".formatted(a, b);
            throw new SumException(errorMessage);
        }
        return a + b;
    }

}
