package hexlet.code.games;
import static hexlet.code.Engine.getRand;
import static hexlet.code.Engine.numQwsAns;
import static hexlet.code.Engine.numQws;

public class Prime {
    public static String[] yourQuestion() {
        // создаем массив из 7 строк: с 1 по 3 - вопросы, с 4 по 7 - ответы, нулевая - формулировка вопроса
        String[] quesAndAnsw = new String[numQwsAns()]; // numQwsAns() = 7 в классе Engine
        // кладем название вопроса в 0 ячейку массива:
        quesAndAnsw[0] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int numberOfQuestions = 3; // количество вопросов всегда = 3
        for (var i = 1; i <= numQws(); i++) { // numQws() = 3 в классе Engine (количество вопросов)
            int randNum = getRand("1", "100"); // генератор случайных чисел лежит в калссе Engine
            quesAndAnsw[i] = Integer.toString(randNum); // вводим вопрсы в 1, 2 и 3 ячейки массива
            // вводим ответы в 4, 5 и 6 ячейки массива:
            quesAndAnsw[i + numQws()] = isPrime(randNum);
        }
        return quesAndAnsw;
    }
    public static String isPrime(int a) {
        for (var i = 2; i < a; i++) {
            if (a % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
