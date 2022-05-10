package hexlet.code.games;
import static hexlet.code.Getrandom.getRand;
import static hexlet.code.Engine.testing;
import static hexlet.code.Qw.getQw;

public class Calc {
    public static void yourQuestion() {
        int resultOfCalc = 0; // результат калькуляции
        final int max = 100; // максимальный диапазон для рандомных операндов
        final int q = 3; // количество операторов (+, - и *)
        String[][] yourArray = new String[getQw()][2]; // создадим массив вопросов и ответов
        String sign; // знак +, - или *
        int index = 0;
        for (var x : yourArray) {
            int randNumber1 = getRand(1, max);
            int randNumber2 = getRand(1, max);
            int randOper = getRand(1, q);
            String[] resultCalc = randomCalc(randNumber1, randNumber2, randOper);
            yourArray[index][0] = String.join(" ",
                Integer.toString(randNumber1),
                resultCalc[0],
                Integer.toString(randNumber2));
            yourArray[index][1] = resultCalc[1];
            index++;
        }
        testing(yourArray, "What is the result of the expression?");
    }
    public static String[] randomCalc(int a, int b, int c) {
        if (c == 1) { // если 1, будет умножение
            String[] result = {"*", Integer.toString(a * b)};
            return result;
        } else if (c == 2) { // если 2, будет вычитание
            String[] result = {"-", Integer.toString(a - b)};
            return result;
        } else { // иначе сложение
            String[] result = {"+", Integer.toString(a + b)};
            return result;
        }
    }
}
