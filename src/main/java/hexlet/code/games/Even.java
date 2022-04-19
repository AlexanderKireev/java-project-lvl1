package hexlet.code.games;

public class Even {
    public static String[] yourQuestion() {
        final int numberOfQuecAndAnsw = 7; // всего число вопросов и ответов, включая заголовок вопроса
        // создаем массив из 7 строк: первые три - вопросы, вторые три - ответы, седьмая - название вопроса
        String[] quesAndAnsw = new String[numberOfQuecAndAnsw];
        // кладем название вопроса в 7 ячейку массива:
        final int sevenOfArray = 6;
        quesAndAnsw[sevenOfArray] = "Answer 'yes' if number even otherwise answer 'no'.";
        final int numberOfQuestions = 3; // количество вопросов всегда = 3
        int min = 1; // задаем минимальное значение для рандома
        final int max = 100; // задаем максимальное значение для рандома
        for (var i = 0; i < numberOfQuestions; i++) {
            int randomNumber = min + (int) (Math.random() * max);
            quesAndAnsw[i] = Integer.toString(randomNumber); // вводим вопрсы в 1, 2 и 3 ячейки архива
            // вводим ответы в 4, 5 и 6 ячейки архива:
            quesAndAnsw[i + numberOfQuestions] = (randomNumber % 2 == 0) ? "yes" : "no";
        }
        return quesAndAnsw;
    }
}
