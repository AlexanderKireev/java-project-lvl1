package hexlet.code.games;
import static hexlet.code.games.Calc.getRandom;

public class Even {
    public static String[] yourQuestion() {
        final int numberOfQuecAndAnsw = 7; // всего число вопросов и ответов, включая формулировку вопроса
        // создаем массив из 7 строк: с 1 по 3 - вопросы, с 4 по 7 - ответы, нулевая - формулировка вопроса
        String[] quesAndAnsw = new String[numberOfQuecAndAnsw];
        // кладем название вопроса в 0 ячейку массива:
        quesAndAnsw[0] = "Answer 'yes' if number even otherwise answer 'no'.";
        final int numberOfQuestions = 3; // количество вопросов всегда = 3
        for (var i = 1; i <= numberOfQuestions; i++) {
            int randomNumber = getRandom(); // генератор случайных чисел лежит в калссе Calc
            quesAndAnsw[i] = Integer.toString(randomNumber); // вводим вопрсы в 1, 2 и 3 ячейки массива
            // вводим ответы в 4, 5 и 6 ячейки массива:
            quesAndAnsw[i + numberOfQuestions] = (randomNumber % 2 == 0) ? "yes" : "no";
        }
        return quesAndAnsw;
    }
}
