package uz.jl;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("in main method");
        div(12, 0);

//        try {
//            div(12, 0);
////            errorDB();
//            callDBOperations();
//            return;
//        } catch (RuntimeException e) {
//            System.out.println("Error occurred");
//        } finally {
//            closeDB();
//        }

    }

    private static void closeDB() {
        System.out.println("Closing database connection");
    }

    private static void callDBOperations() {
        System.out.println("Inserting data to DB");
    }

    private static void errorDB() {
        RuntimeException exception = new RuntimeException("Error");
        throw exception;
    }

    static void div(int a, int b)  throws Exception{
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            throw new Exception("0 ga bolindi");
        }
    }


}
