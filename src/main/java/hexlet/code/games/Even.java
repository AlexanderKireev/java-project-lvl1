package hexlet.code.games;
import static hexlet.code.Getrandom.getRand;
import static hexlet.code.Engine.testing;
import static hexlet.code.Engine.NUMBEROFQUESTIONS;

public class Even {
    public static void yourQuestion() {
        int randomNumber;
        String[][] arrayWithQuestionsAndAnswers = new String[NUMBEROFQUESTIONS][2];
        final int max = 100;
        int index = 0;
        for (var x : arrayWithQuestionsAndAnswers) {
            randomNumber = getRand(1, max);
            arrayWithQuestionsAndAnswers[index][0] = Integer.toString(randomNumber);
            arrayWithQuestionsAndAnswers[index][1] = randomNumber % 2 == 0 ? "yes" : "no";
            index++;
        }
        testing(arrayWithQuestionsAndAnswers, "Answer 'yes' if number even otherwise answer 'no'.");
    }
}
