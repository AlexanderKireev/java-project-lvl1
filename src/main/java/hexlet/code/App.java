package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numberOfQuecAndAnsw = 7; // всего число вопросов и ответов, включая заголовок вопроса
        String[] yourArray = new String[numberOfQuecAndAnsw];
        System.out.print("Please enter the game number and press Enter.\n"
            + "1 - Greet\n"
            + "2 - Even\n"
            + "0 - Exit\n"
            + "Your choice: ");
        int number = sc.nextInt();
        if (number == 0) {
            return;
        } else if (number == 1) {
            yourArray[0] = "Great"; // стоп-слово для класса Engine
        } else if (number == 2) {
            yourArray = Even.yourQuestion();
        } else {
            return;
        }
        Engine.testing(yourArray);
        //Cli.yourName();
    }
}
