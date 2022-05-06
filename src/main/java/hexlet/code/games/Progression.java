package hexlet.code.games;
import static hexlet.code.Getrandom.getRand;
import static hexlet.code.Qw.getQw;
import static hexlet.code.Engine.testing;

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

    public static void yourQuestion() {
        String[][] yourArray = new String[getQw()][2]; // массив с вопросами и ответами
        int index = 0;
        for (var x : yourArray) {
            // создадим прогрессию (строку) со случайной длиной (от LENGTH1 до LENGTH2 чисел)
            String progress = generateProgr();
            // сгенерируем пропущенную позицию в прогрессии от 1 до длины прогрессии (число пробелов + 1)
            int posProgr = getRand(1, (progress.length() - progress.replace(" ", "").length() + 1));
            // сохраним это значение
            String result = saveElemProgr(progress, posProgr);
            // запустим метод, заменяющий число в случайной позиции posProgr на '..'
            progress = hideElemProgr(progress, result);
            // запишем резульататы в массив
            yourArray[index][0] = progress;
            yourArray[index][1] = result;
            index++;
        }
        testing(yourArray, "What number is missing in the progression?");
    }

    public static String generateProgr() {
        int intervalProgr = getRand(INTERVAL1, INTERVAL2);
        int firstProgr = getRand(FIRST1, FIRST2);
        int lengthProgr = getRand(LENGTH1, LENGTH2);
        // заполним прогрессию числами от firstProgr до lengthProgr с интервалом intervalProgr
        var progress = new StringBuilder(Integer.toString(firstProgr));
        for (var i = 1; i < lengthProgr; i++) {
            progress.append(" ");
            progress.append(Integer.toString(firstProgr + i * intervalProgr));
        }
        return progress.toString();
    }

    public static String hideElemProgr(String s, String x) {
        return s.replace(x, "..");
    }

    public static String saveElemProgr(String s, int x) {
        String[] numbers = s.split(" ");
        return numbers[x - 1];
    }
}
