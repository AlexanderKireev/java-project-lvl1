package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static void testing(String[] yourArray) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nWelcome to the Brain Games!\n"
            + "May I have your name? ");
        String name = sc.nextLine(); // присваиваем введенное имя пользователя
        System.out.println("Hello, " + name + "!");
        if ("Great".equals(yourArray[0])) { // если в 0 ячейке массива Great, пользователь ввел 1 игру
            return;
        }
        System.out.println(yourArray[0]); // заголовок вопроса содержится в строке 0 массива
        for (var i = 1; i <= numQws(); i++) { // количество вопросов всегда = 3
            System.out.println("Question: " + yourArray[i]); // выводим 1, 2 и 3 значения массива (вопросы)
            System.out.print("Your answer: ");
            String answer = sc.nextLine(); // присваиваем ответ
            // сравниваем ответ с 4, 5 и 6 значениями массива (ответы):
            if (answer.toLowerCase().equals(yourArray[i + numQws()])) { // можно использовать верхний регистр в ответах
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(."
                    + " Correct answer was '" + yourArray[i + numQws()] + "'.\n"
                    + "Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static int getRand(String min, String max) {
        return Integer.parseInt(min) + (int) (Math.random() * (Integer.parseInt(max) - Integer.parseInt(min) + 1));
    }
    public static int numQwsAns() { // борьба с магическими числами((
        final int numQwsAndAns = 7; // количество вопросов и ответов + формулировка вопроса
        return numQwsAndAns;
    }
    public static int numQws() { // борьба с магическими числами((
        final int numQues = 3; // количество вопросов в проекте (всегда 3)
        return numQues;
    }
}
