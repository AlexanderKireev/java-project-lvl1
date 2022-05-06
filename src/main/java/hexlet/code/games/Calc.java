package hexlet.code.games;
import static hexlet.code.Getrandom.getRand;
import static hexlet.code.Engine.testing;
import static hexlet.code.Qw.getQw;

public class Calc {
    public static void yourQuestion() {
        int resultOfCalc = 0; // результат калькуляции
        int randNumber1 = 0;
        int randNumber2 = 0;
        int randOper = 0;
        final int max = 100;
        final int q = 3; // количестов операторов (+, - и *)
        String[][] yourArray = new String[getQw()][2];
        String sign; // знак +, - или *
        int index = 0;
        for (var x : yourArray) {
            randNumber1 = getRand(1, max);
            randNumber2 = getRand(1, max);
            randOper = getRand(1, q);
            if (randOper == 1) { // если 1, будет умножение
                sign = "*";
                resultOfCalc = randNumber1 * randNumber2;
            } else if (randOper == 2) { // если 2, будет вычитание
                sign = "-";
                resultOfCalc = randNumber1 - randNumber2;
            } else { // иначе сложение
                sign = "+";
                resultOfCalc = randNumber1 + randNumber2;
            }
            yourArray[index][0] = Integer.toString(randNumber1) + " " + sign + " " + Integer.toString(randNumber2);
            yourArray[index][1] = Integer.toString(resultOfCalc);
            index++;
        }
        testing(yourArray, "What is the result of the expression?");
    }
}
