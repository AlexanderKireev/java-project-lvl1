package hexlet.code.games;
import static hexlet.code.Getrandom.getRand;
import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.testing;

public class Prime {
    public static void yourQuestion() {
        int randomNumber;
        String[][] arrayWithQuestionsAndAnswers = new String[NUMBEROFQUESTIONS][2];
        int index = 0;
        final int max = 100;
        for (var x : arrayWithQuestionsAndAnswers) {
            randomNumber = getRand(1, max);
            arrayWithQuestionsAndAnswers[index][0] = Integer.toString(randomNumber);
            arrayWithQuestionsAndAnswers[index][1] = isPrime(randomNumber);
            index++;
        }
        testing(arrayWithQuestionsAndAnswers, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
    public static String isPrime(int a) {
        for (var i = 2; i < a; i++) {
            if (a % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
