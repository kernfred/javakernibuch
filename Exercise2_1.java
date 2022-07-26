import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int luckyNumber = 12;

        if (a % 10 == 0) {
            System.out.println("Es handelt sich um eine Runde Zahl!");
            System.out.println("Es handelt sich um eine gerade Zahl!");
            System.out.println("Es handelt sich um eine zweistellige Zahl!");
            if (a == luckyNumber) {
                System.out.println("Die Zahl ist die Glückszahl!");
            }
        }
        else if(a % 2 == 0) {
            System.out.println("Es handelt sich um eine gerade Zahl!");
            if (a > 9 && a < 100) {
                System.out.println("Es handelt sich um eine zweistellige Zahl!");
            }
            if (a == luckyNumber) {
                System.out.println("Die Zahl ist die Glückszahl!");
            }
        }
        else if (a == luckyNumber) {
            System.out.println("Die Zahl ist die Glückszahl!");
        }
        else {
            System.out.println("Die Zahl ist uncool!");
            if (a > 9 && a < 100) {
                System.out.println("Es handelt sich um eine zweistellige Zahl!");
            }
        }

    }
}
