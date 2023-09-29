package hexlet.code.games;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Getrandom.getRand;

public class Calc {
    static final int MAX = 100; // максимальный диапазон для рандомных операндов
    static final int NUMBOFOPERATORS = 3;
    public static void startGame() {
        String question = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[NUMBEROFQUESTIONS][2];
        for (var qwsAndAns : questionsAndAnswers) {
            int randNumber1 = getRand(1, MAX);
            int randNumber2 = getRand(1, MAX);
            int randOper = getRand(1, NUMBOFOPERATORS);
            String[] resultCalc = randomCalc(randNumber1, randNumber2, randOper);
            qwsAndAns[0] = String.join(" ",
                Integer.toString(randNumber1),
                resultCalc[0],
                Integer.toString(randNumber2));
            qwsAndAns[1] = resultCalc[1];
        }
        runGame(questionsAndAnswers, question);
    }
    public static String[] randomCalc(int firstOperand, int secondOperand, int operator) {
        if (operator == 1) { // если 1, будет умножение
            return new String[]{"*", Integer.toString(firstOperand * secondOperand)};
        } else if (operator == 2) { // если 2, будет вычитание
            return new String[]{"-", Integer.toString(firstOperand - secondOperand)};
        } else if (operator == NUMBOFOPERATORS) { // если 3, будет сложение
            return new String[]{"+", Integer.toString(firstOperand + secondOperand)};
        } else {
            throw new RuntimeException("Sorry, used the wrong operand");
        }
    }
}
