package hexlet.code.games;
import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Getrandom.getRand;

public class Prime {
    public static void startGame() {
        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[NUMBEROFQUESTIONS][2];
        final int min = -100;
        final int max = 100;
        for (var qwsAndAns : questionsAndAnswers) {
            int randomNumber = getRand(min, max);
            qwsAndAns[0] = Integer.toString(randomNumber);
            qwsAndAns[1] = isEvenOrLessTwo(randomNumber);
        }
        runGame(questionsAndAnswers, question);
    }
    public static String isEvenOrLessTwo(int a) {
        if (a == 2) {
            return "yes";
        }
        if (a % 2 == 0 || a < 2) {
            return "no";
        }
        return isPrime(a);
    }
    public static String isPrime(int a) {
        final int num3 = 3;
        for (var i = num3; i * i <= a; i += 2) {
            if (a % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
