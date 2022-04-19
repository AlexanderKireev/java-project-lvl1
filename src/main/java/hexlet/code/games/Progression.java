package hexlet.code.games;
import static hexlet.code.Engine.getRand;
import static hexlet.code.Engine.numQwsAns;
import static hexlet.code.Engine.numQws;

public class Progression {
    public static String[] yourQuestion() {
        // создаем массив из 7 строк: с 1 по 3 - вопросы, с 4 по 7 - ответы, нулевая - формулировка вопроса
        String[] quesAndAnsw = new String[numQwsAns()]; // numQwsAns() = 7 в классе Engine
        // кладем название вопроса в 0 ячейку массива:
        quesAndAnsw[0] = "What number is missing in the progression?";
        for (var i = 1; i <= numQws(); i++) { // numQws() = 3 в классе Engine (количество вопросов)
            int lengthProgr = getRand("10", "20"); // пусть длина прогрессии будет от 10 до 20 чисел
            int posRogr = getRand("1", Integer.toString(lengthProgr)); // позиция скрытого элемента: от 1 до lengthProgr
            int intervalProgr = getRand("2", "10"); // интервал прогрессии (шаг): от 2 до 10
            int firstRogr = getRand("2", "50"); // первый элемент прогрессии: от 2 до 50
            // создадим прогрессию длиной от 10 до 20 чисел
            String[] progress = new String[lengthProgr];
            // заполним прогрессию числами от firstRogr до lengthProgr с интервалом intervalProgr
            for (var j = 0; j < lengthProgr; j++) {
                progress[j] = Integer.toString(firstRogr + j * intervalProgr);
            }
            String result = progress[posRogr - 1]; // запомнили и
            progress[posRogr - 1] = ".."; // спрятали элемент под номером posRogr
            // вводим вопрсы в 1, 2 и 3 ячейки массива
            String resultProgr = progress[0];
            for (var x = 1; x < lengthProgr; x++) {
                resultProgr = resultProgr + " " + progress[x];
            }
            quesAndAnsw[i] = resultProgr;
            // вводим ответы в 4, 5 и 6 ячейки массива:
            quesAndAnsw[i + numQws()] = result;
        }
        return quesAndAnsw;
    }
}
