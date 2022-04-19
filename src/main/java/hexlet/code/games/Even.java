package hexlet.code.games;
import static hexlet.code.Engine.getRand;
import static hexlet.code.Engine.numQwsAns;
import static hexlet.code.Engine.numQws;

public class Even {
    public static String[] yourQuestion() {
        // создаем массив из 7 строк: с 1 по 3 - вопросы, с 4 по 7 - ответы, нулевая - формулировка вопроса
        String[] quesAndAnsw = new String[numQwsAns()]; // numQwsAns() = 7 в классе Engine
        // кладем название вопроса в 0 ячейку массива:
        quesAndAnsw[0] = "Answer 'yes' if number even otherwise answer 'no'.";
        for (int i = 1; i <= numQws(); i++) { // numQws() = 3 в классе Engine (количество вопросов)
            int randomNumber = getRand("1", "100"); // генератор случайных чисел (от 1 до 100) лежит в калссе Engine
            quesAndAnsw[i] = Integer.toString(randomNumber); // вводим вопрсы в 1, 2 и 3 ячейки массива
            // вводим ответы в 4, 5 и 6 ячейки массива:
            quesAndAnsw[i + numQws()] = (randomNumber % 2 == 0) ? "yes" : "no";
        }
        return quesAndAnsw;
    }
}
