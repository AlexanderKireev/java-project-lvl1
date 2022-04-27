package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import hexlet.code.games.Greet;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n"
            + "1 - Greet\n2 - Even\n3 - Calc\n"
            + "4 - GCD\n5 - Progression\n"
            + "6 - Prime\n0 - Exit\n"
            + "Your choice: ");
        String number = sc.nextLine();
        if (number.equals("1")) {
            Greet.yourQuestion();
        } else if (number.equals("2")) {
            Even.yourQuestion();
        } else if (number.equals("3")) {
            Calc.yourQuestion();
        } else if (number.equals("4")) {
            GCD.yourQuestion();
        } else if (number.equals("5")) {
            Progression.yourQuestion();
        } else if (number.equals("6")) {
            Prime.yourQuestion();
        } else {
            return;
        }
    }
}
