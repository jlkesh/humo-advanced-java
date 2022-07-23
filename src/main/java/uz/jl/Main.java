package uz.jl;

public class Main {

    /**
     * String -> immutable
     * StringBuilder -> non thread safe
     * StringBuffer -> thread safe
     *
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("lksgfuiydfsgfiu7re");
        stringBuilder.append("Hello");
        stringBuilder.append("Hello");
        stringBuilder.append("Hello");
        stringBuilder.append("Hello");
        stringBuilder.append("Hello");
        stringBuilder.append("Hello");
        String result = "" + stringBuilder;

        StringBuffer stringBuffer = new StringBuffer("JAVA");
        stringBuffer.append("Hola");


    }
}