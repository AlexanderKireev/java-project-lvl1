package hexlet.code.games;
import static hexlet.code.Engine.NUMBEROFQUESTIONS;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Getrandom.getRand;

public class Even {
    public static void startGame() {
        String question = "Answer 'yes' if number even otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[NUMBEROFQUESTIONS][2];
        final int max = 100;
        for (var qwsAndAns : questionsAndAnswers) {
            int randomNumber = getRand(1, max);
            qwsAndAns[0] = Integer.toString(randomNumber);
            qwsAndAns[1] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        runGame(questionsAndAnswers, question);
    }
}
