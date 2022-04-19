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
        System.out.println(yourArray[6]);
        final int numberOfQuestions = 3; // количество вопросов всегда = 3
        for (var i = 0; i < numberOfQuestions; i++) {
            System.out.println("Question: " + yourArray[i]); // выодим 1, 2 и 3 значения массива (вопросы)
            System.out.print("Your answer: ");
            String answer = sc.nextLine(); // присваиваем ответ
            if (answer.equals(yourArray[i + 3])) { // сравниваем ответ с 4, 5 и 6 значениями массива (ответы)
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(."
                    + " Correct answer was '" + yourArray[i + 3] + "'.\n"
                    + "Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
