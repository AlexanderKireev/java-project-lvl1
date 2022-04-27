package hexlet.code.games;
import static hexlet.code.Engine.getRand;
import static hexlet.code.Engine.testing;

public class Calc {
    public static void yourQuestion() {
        int resultOfCalc; // результат калькуляции
        int randNumber1; // codeclimate требует объединит все в одну строку, а Linter не дает!!!
        int randNumber2;
        int randOper;
        final int q = 3; // всего вопросов в проекте
        String[][] yourArray = new String[q][2];
        String sign; // знак +, - или *
        int index = 0;
        for (var x : yourArray) {
            randNumber1 = getRand("1", "100");
            randNumber2 = getRand("1", "100");
            randOper = getRand("1", "3");
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
