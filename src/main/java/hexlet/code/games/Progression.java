package hexlet.code.games;
import static hexlet.code.Engine.getRand;
import static hexlet.code.Engine.testing;

public class Progression {
    public static void yourQuestion() {
        final int q = 3; // всего вопросов в проекте
        String[][] yourArray = new String[q][2];
        int index = 0;
        for (var x : yourArray) {
            int lengthProgr = getRand("10", "20"); // пусть длина прогрессии будет от 10 до 20 чисел
            int posProgr = getRand("1", Integer.toString(lengthProgr)); //позиция скрытого элемента: от 1 до lengthProgr
            int intervalProgr = getRand("2", "10"); // интервал прогрессии (шаг): от 2 до 10
            int firstProgr = getRand("2", "50"); // первый элемент прогрессии: от 2 до 50
            // создадим прогрессию длиной от 10 до 20 чисел
            String[] progress = new String[lengthProgr];
            // заполним прогрессию числами от firstProgr до lengthProgr с интервалом intervalProgr
            for (var i = 0; i < lengthProgr; i++) {
                progress[i] = Integer.toString(firstProgr + i * intervalProgr);
            }
            String result = progress[posProgr - 1]; // запомнили и
            progress[posProgr - 1] = ".."; // спрятали элемент под номером posProgr
            yourArray[index][0] = String.join(" ", progress);
            yourArray[index][1] = result;
            index++;
        }
        testing(yourArray, "What number is missing in the progression?");
    }
}
