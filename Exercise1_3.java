import java.util.Locale;

public class Exercise1_3 {
    public static void main(String[] args) {
        String greeting = "Hello World!";

        System.out.println(greeting.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.replace("World" , "Codersbay"));

        for (int i = 0; i < 15; i++) {
            System.out.println(greeting);
        }
    }
}
