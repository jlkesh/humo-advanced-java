package uz.jl.exceptions;

public class NotFoundException extends RuntimeException {
    private int statusCode;

    public NotFoundException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }
}
