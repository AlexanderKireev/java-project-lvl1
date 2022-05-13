package hexlet.code.games;
import static hexlet.code.Getrandom.getRand;
import static hexlet.code.Engine.testing;
import static hexlet.code.Engine.NUMBEROFQUESTIONS;

public class Calc {
    static final int MAX = 100; // максимальный диапазон для рандомных операндов
    static final int NUMBOFOPERATORS = 3;
    public static void yourQuestion() {
        String[][] arrayWithQuestionsAndAnswers = new String[NUMBEROFQUESTIONS][2];
        int index = 0;
        for (var x : arrayWithQuestionsAndAnswers) {
            int randNumber1 = getRand(1, MAX);
            int randNumber2 = getRand(1, MAX);
            int randOper = getRand(1, NUMBOFOPERATORS);
            String[] resultCalc = randomCalc(randNumber1, randNumber2, randOper);
            arrayWithQuestionsAndAnswers[index][0] = String.join(" ",
                Integer.toString(randNumber1),
                resultCalc[0],
                Integer.toString(randNumber2));
            arrayWithQuestionsAndAnswers[index][1] = resultCalc[1];
            index++;
        }
        testing(arrayWithQuestionsAndAnswers, "What is the result of the expression?");
    }
    public static String[] randomCalc(int firstOperand, int secondOperand, int operator) {
        if (operator == 1) { // если 1, будет умножение
            String[] result = {"*", Integer.toString(firstOperand * secondOperand)};
            return result;
        } else if (operator == 2) { // если 2, будет вычитание
            String[] result = {"-", Integer.toString(firstOperand - secondOperand)};
            return result;
        } else if (operator == NUMBOFOPERATORS) { // если 3, будет сложение
            String[] result = {"+", Integer.toString(firstOperand + secondOperand)};
            return result;
        } else {
            throw new RuntimeException("Sorry, used the wrong operand");
        }
    }
}
