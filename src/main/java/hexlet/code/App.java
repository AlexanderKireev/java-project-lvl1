package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numberOfQuecAndAnsw = 7; // всего число вопросов и ответов, включая заголовок вопроса
        String[] yourArray = new String[numberOfQuecAndAnsw];
        System.out.print("Please enter the game number and press Enter.\n"
            + "1 - Greet\n"
            + "2 - Even\n"
            + "3 - Calc\n"
            + "0 - Exit\n"
            + "Your choice: ");
        String number = sc.nextLine();
        if (number.equals("0")) {
            return;
        } else if (number.equals("1")) {
            yourArray[0] = "Great"; // стоп-слово для класса Engine в случае выбора 1 игры
        } else if (number.equals("2")) {
            yourArray = Even.yourQuestion();
        } else if (number.equals("3")) {
            yourArray = Calc.yourQuestion();
        } else {
            return;
        }
        Engine.testing(yourArray);
        //Cli.yourName();
    }
}
