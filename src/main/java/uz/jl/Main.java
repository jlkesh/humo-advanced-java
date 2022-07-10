package uz.jl;

import uz.jl.exceptions.NotFoundException;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

//        try {
//            FileReader fileReader = new FileReader("file.txt");
//        } catch (Exception e) {
//            System.out.println("File not found sorry bro, My bad 😒");
//        }
        try {
            int a = 12;
            int b = 0;
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hello world");
        sum(12D, 34L);
    }

    public static void sum(Number a, Number b) {

    }
}