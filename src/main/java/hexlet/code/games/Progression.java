package hexlet.code.games;
import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Getrandom.getRand;

public class Progression {
    // пусть длина прогрессии будет от 10 до 20 чисел
    static final int LENGTH1 = 10;
    static final int LENGTH2 = 20;
    // интервал прогрессии (шаг): от 2 до 10
    static final int INTERVAL1 = 2;
    static final int INTERVAL2 = 10;
    // первый элемент прогрессии: от 2 до 50
    static final int FIRST1 = 2;
    static final int FIRST2 = 50;

    public static void startGame() {
        String question = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[NUMBEROFQUESTIONS][2];
        for (var qwsAndAns : questionsAndAnswers) {
            // создадим прогрессию (массив строк) со случайной длиной (от LENGTH1 до LENGTH2 чисел)
            int intervalProgr = getRand(INTERVAL1, INTERVAL2);
            int firstProgr = getRand(FIRST1, FIRST2);
            int lengthProgr = getRand(LENGTH1, LENGTH2);
            String[] progress = generateProgr(intervalProgr, firstProgr, lengthProgr);
            // сгенерируем пропущенную позицию в прогрессии от 1 до длины прогрессии
            int posProgr = getRand(1, lengthProgr);
            String result = progress[posProgr];
            progress[posProgr] = "..";
            // запишем резульататы в массив
            qwsAndAns[0] = String.join(" ", progress);
            qwsAndAns[1] = result;
        }
        runGame(questionsAndAnswers, question);
    }
    public static String[] generateProgr(int intervalProgr, int firstProgr, int lengthProgr) {
        // заполним прогрессию числами от firstProgr до lengthProgr с интервалом intervalProgr
        String[] progress = new String[lengthProgr];
        for (var i = 0; i < lengthProgr; i++) {
            progress[i] = Integer.toString(firstProgr + i * intervalProgr);
        }
        return progress;
    }
}
