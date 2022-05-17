package hexlet.code.games;
import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Getrandom.getRand;

public class GCD {
    public static void startGame() {
        String question = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswers = new String[NUMBEROFQUESTIONS][2];
        final int max = 100;
        for (var qwsAndAns : questionsAndAnswers) {
            int randNumber1 = getRand(1, max);
            int randNumber2 = getRand(1, max);
            qwsAndAns[0] = randNumber1 + " " + randNumber2;
            qwsAndAns[1] = Integer.toString(gcd(randNumber1, randNumber2));
        }
        runGame(questionsAndAnswers, question);
    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
