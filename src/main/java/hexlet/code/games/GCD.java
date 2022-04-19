package hexlet.code.games;
import static hexlet.code.games.Calc.getRandom;

public class GCD {
    public static String[] yourQuestion() {
        final int numberOfQuecAndAnsw = 7; // всего число вопросов и ответов, включая формулировку вопроса
        // создаем массив из 7 строк: с 1 по 3 - вопросы, с 4 по 7 - ответы, нулевая - формулировка вопроса
        String[] quesAndAnsw = new String[numberOfQuecAndAnsw];
        // кладем название вопроса в 0 ячейку массива:
        quesAndAnsw[0] = "Find the greatest common divisor of given numbers.";
        final int numberOfQuestions = 3; // количество вопросов всегда = 3
        int resultOfGCD; // результат вычисления
        for (var i = 1; i <= numberOfQuestions; i++) {
            // задаем два случайных числа от 0 до 100 в массив randNum
            int[] randNum = {getRandom(), getRandom()};
            resultOfGCD = gcd(randNum[0], randNum[1]);
            // вводим вопросы в 1, 2 и 3 строки массива
            quesAndAnsw[i] = Integer.toString(randNum[0]) + " " + Integer.toString(randNum[1]);
            // вводим ответы в 4, 5 и 6 строки массива
            quesAndAnsw[i + numberOfQuestions] = Integer.toString(resultOfGCD);
        }
        return quesAndAnsw;
    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
