package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import static hexlet.code.Engine.numQwsAns;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // создадим массив с числом строк 7: три вопроса, три ответа, и формулировка вопроса
        String[] yourArray = new String[numQwsAns()]; // numQwsAns() = 7 в классе Engine
        System.out.print("Please enter the game number and press Enter.\n"
            + "1 - Greet\n"
            + "2 - Even\n"
            + "3 - Calc\n"
            + "4 - GCD\n"
            + "5 - Progression\n"
            + "6 - Prime\n"
            + "0 - Exit\n"
            + "Your choice: ");
        String number = sc.nextLine();
        if (number.equals("1")) {
            yourArray[0] = "Great"; // стоп-слово для класса Engine в случае выбора 1 игры
        } else if (number.equals("2")) {
            yourArray = Even.yourQuestion();
        } else if (number.equals("3")) {
            yourArray = Calc.yourQuestion();
        } else if (number.equals("4")) {
            yourArray = GCD.yourQuestion();
        } else if (number.equals("5")) {
            yourArray = Progression.yourQuestion();
        } else if (number.equals("6")) {
            yourArray = Prime.yourQuestion();
        } else {
            return;
        }
        Engine.testing(yourArray);
        //Cli.yourName();
    }
}
