package hexlet.code.games;

public class Even {
    public static String[] yourQuestion() {
        // создаем массив из 7 строк: первые три - вопросы, вторые три - ответы, седьмая - название вопроса
        String[] quesAndAnsw = new String[7];
        // кладем название вопроса в 7 ячейку массива:
        quesAndAnsw[6] = "Answer 'yes' if number even otherwise answer 'no'.";
        final int numberOfQuestions = 3; // количество вопросов всегда = 3
        int min = 1; // задаем минимальное значение для рандома
        final int max = 100; // задаем максимальное значение для рандома
        for (var i = 0; i < numberOfQuestions; i++) {
            int randomNumber = min + (int) (Math.random() * max);
            quesAndAnsw[i] = Integer.toString(randomNumber); // вводим вопрсы в 1, 2 и 3 ячейки архива
            quesAndAnsw[i + 3] = (randomNumber % 2 == 0) ? "yes" : "no"; // вводим ответы в 4, 5 и 6 ячейки архива
        }
            return quesAndAnsw;
    }
}
