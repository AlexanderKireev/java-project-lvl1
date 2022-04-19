package hexlet.code.games;

public class Calc {
    public static String[] yourQuestion() {
        final int numberOfQuecAndAnsw = 7; // всего число вопросов и ответов, включая формулировку вопроса
        // создаем массив из 7 строк: с 1 по 3 - вопросы, с 4 по 7 - ответы, нулевая - формулировка вопроса
        String[] quesAndAnsw = new String[numberOfQuecAndAnsw];
        // кладем название вопроса в 0 ячейку массива:
        quesAndAnsw[0] = "What is the result of the expression?";
        final int numberOfQuestions = 3; // количество вопросов всегда = 3
        int resultOfCalc; // результат вычисления
        String sign; // знак +, - или *
        final int randSign = 33; // третья часть от 100 для генерации знака оператора (один из трех: +, - или *)
        for (var i = 1; i <= numberOfQuestions; i++) {
            // задаем три случайных числа от 0 до 100 в массив randNum
            // первое - для генерации оператора, еще два - для генерации операндов:
            int[] randNum = {Calc.getRandom(), Calc.getRandom(), Calc.getRandom()};
            if (randNum[0] > 2 * randSign) { // если первое рандомное число > 66, будет умножение
                sign = "*";
                resultOfCalc = randNum[1] * randNum[2];
            } else if (randNum[0] > randSign) { // если первое рандомное число > 33 и <= 66, будет вычитание
                sign = "-";
                resultOfCalc = randNum[1] - randNum[2];
            } else { // если первое рандомное число <= 33, будет сложение
                sign = "+";
                resultOfCalc = randNum[1] + randNum[2];
            }
            // вводим вопросы в 1, 2 и 3 строки массива
            quesAndAnsw[i] = Integer.toString(randNum[1]) + " " + sign + " " + Integer.toString(randNum[2]);
            // вводим ответы в 4, 5 и 6 строки массива
            quesAndAnsw[i + numberOfQuestions] = Integer.toString(resultOfCalc);
        }
        return quesAndAnsw;
    }
    public static int getRandom() {
        int min = 1; // задаем минимальное значение для рандома
        final int max = 100; // задаем максимальное значение для рандома
        return min + (int) (Math.random() * max);
    }
}
