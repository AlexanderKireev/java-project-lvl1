package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        String number = sc.nextLine();
        choice(number);
    }
    public static void choice(String number) {
        switch (number) {
            case "1" -> greeting();
            case "2" -> Even.startGame();
            case "3" -> Calc.startGame();
            case "4" -> GCD.startGame();
            case "5" -> Progression.startGame();
            case "6" -> Prime.startGame();
            default -> {
            }
        }
    }
    public static String greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        // вернул имя, чтобы использовать его в Engine
        return name;
    }
}
