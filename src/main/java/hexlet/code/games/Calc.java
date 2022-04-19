package hexlet.code.games;
import static hexlet.code.Engine.getRand;
import static hexlet.code.Engine.numQwsAns;
import static hexlet.code.Engine.numQws;

public class Calc {
    public static String[] yourQuestion() {
        // создаем массив из 7 строк: с 1 по 3 - вопросы, с 4 по 7 - ответы, нулевая - формулировка вопроса
        String[] quesAndAnsw = new String[numQwsAns()]; // numQwsAns() = 7 в классе Engine
        // кладем название вопроса в 0 ячейку массива:
        quesAndAnsw[0] = "What is the result of the expression?";
        int resultOfCalc; // результат калькуляции
        String sign; // знак +, - или *
        //final int randSign = 33; // третья часть от 100 для генерации знака оператора (один из трех: +, - или *)
        for (var i = 1; i <= numQws(); i++) { // numQws() = 3 в классе Engine (количество вопросов)
            // задаем три случайных числа в массив randNum
            // первое - для генерации оператора, вторые два - для генерации операндов:
            int[] randNum = {getRand("1", "3"), getRand("1", "100"), getRand("1", "100")};
            if (randNum[0] == 1) { // если 1, будет умножение
                sign = "*";
                resultOfCalc = randNum[1] * randNum[2];
            } else if (randNum[0] == 2) { // если 2, будет вычитание
                sign = "-";
                resultOfCalc = randNum[1] - randNum[2];
            } else { // иначе сложение
                sign = "+";
                resultOfCalc = randNum[1] + randNum[2];
            }
            // вводим вопросы в 1, 2 и 3 строки массива
            quesAndAnsw[i] = Integer.toString(randNum[1]) + " " + sign + " " + Integer.toString(randNum[2]);
            // вводим ответы в 4, 5 и 6 строки массива
            quesAndAnsw[i + numQws()] = Integer.toString(resultOfCalc);
        }
        return quesAndAnsw;
    }
}
