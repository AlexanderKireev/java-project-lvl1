package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int NUMBEROFQUESTIONS = 3;
    public static void testing(String[][] arrayWithQuestionsAndAnswers, String question) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nWelcome to the Brain Games!\n"
            + "May I have your name? ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        if (arrayWithQuestionsAndAnswers.length == 0) {
            return;
        }
        System.out.println(question);
        for (var qwsAndAns : arrayWithQuestionsAndAnswers) {
            System.out.println("Question: " + qwsAndAns[0]);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (answer.toLowerCase().equals(qwsAndAns[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(."
                    + " Correct answer was '" + qwsAndAns[1] + "'.\n"
                    + "Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
