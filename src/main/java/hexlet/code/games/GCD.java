package hexlet.code.games;
import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Getrandom.getRand;
import static hexlet.code.Engine.testing;

public class GCD {
    public static void yourQuestion() {
        int randNumber1 = 0;
        int randNumber2 = 0;
        String[][] arrayWithQuestionsAndAnswers = new String[NUMBEROFQUESTIONS][2];
        int index = 0;
        final int max = 100;
        for (var x : arrayWithQuestionsAndAnswers) {
            randNumber1 = getRand(1, max);
            randNumber2 = getRand(1, max);
            arrayWithQuestionsAndAnswers[index][0] = Integer.toString(randNumber1)
                + " " + Integer.toString(randNumber2);
            arrayWithQuestionsAndAnswers[index][1] = Integer.toString(gcd(randNumber1, randNumber2));
            index++;
        }
        testing(arrayWithQuestionsAndAnswers, "Find the greatest common divisor of given numbers.");
    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
