package hexlet.code.games;
import static hexlet.code.Engine.getRand;
import static hexlet.code.Engine.numQwsAns;
import static hexlet.code.Engine.numQws;

public class GCD {
    public static String[] yourQuestion() {
        // создаем массив из 7 строк: с 1 по 3 - вопросы, с 4 по 7 - ответы, нулевая - формулировка вопроса
        String[] quesAndAnsw = new String[numQwsAns()]; // numQwsAns() = 7 в классе Engine
        // кладем название вопроса в 0 ячейку массива:
        quesAndAnsw[0] = "Find the greatest common divisor of given numbers.";
        for (var i = 1; i <= numQws(); i++) { // numQws() = 3 в классе Engine (количество вопросов)
            // задаем два случайных числа от 0 до 100 в массив randNum
            int[] randNum = {getRand("1", "100"), getRand("1", "100")};
            int resultOfGCD = gcd(randNum[0], randNum[1]); // результат вычисления НОД
            // вводим вопросы в 1, 2 и 3 строки массива
            quesAndAnsw[i] = Integer.toString(randNum[0]) + " " + Integer.toString(randNum[1]);
            // вводим ответы в 4, 5 и 6 строки массива
            quesAndAnsw[i + numQws()] = Integer.toString(resultOfGCD);
        }
        return quesAndAnsw;
    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
