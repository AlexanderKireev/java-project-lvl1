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
        System.out.print(String.join("\n",
            "Please enter the game number and press Enter.",
            "1 - Greet",
            "2 - Even",
            "3 - Calc",
            "4 - GCD",
            "5 - Progression",
            "6 - Prime",
            "0 - Exit",
            "Your choice: "));
        String number = sc.nextLine();
        switch (number) {
            case "1":
                Greet.yourQuestion();
                break;
            case "2":
                Even.yourQuestion();
                break;
            case "3":
                Calc.yourQuestion();
                break;
            case "4":
                GCD.yourQuestion();
                break;
            case "5":
                Progression.yourQuestion();
                break;
            case "6":
                Prime.yourQuestion();
                break;
            default:
                break;
        }
    }
}
