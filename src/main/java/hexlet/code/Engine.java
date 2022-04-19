package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static void testing(String[] yourArray) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nWelcome to the Brain Games!\n"
            + "May I have your name? ");
        String name = sc.nextLine(); // присваиваем введенное имя пользователя
        System.out.println("Hello, " + name + "!");
        if ("Great".equals(yourArray[0])) {
            return;
        }
        final int quesTitle = 6; // заголовок вопроса содержится в строке 7 массива
        System.out.println(yourArray[quesTitle]);
        final int numberOfQuestions = 3; // количество вопросов всегда = 3
        for (var i = 0; i < numberOfQuestions; i++) {
            System.out.println("Question: " + yourArray[i]); // выодим 1, 2 и 3 значения массива (вопросы)
            System.out.print("Your answer: ");
            String answer = sc.nextLine(); // присваиваем ответ
            // сравниваем ответ с 4, 5 и 6 значениями массива (ответы):
            if (answer.equals(yourArray[i + numberOfQuestions])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(."
                    + " Correct answer was '" + yourArray[i + numberOfQuestions] + "'.\n"
                    + "Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}