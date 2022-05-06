package hexlet.code.games;
import static hexlet.code.Getrandom.getRand;
import static hexlet.code.Qw.getQw;
import static hexlet.code.Engine.testing;

public class Even {
    public static void yourQuestion() {
        int randomNumber;
        String[][] yourArray = new String[getQw()][2];
        final int max = 100;
        int index = 0;
        for (var x : yourArray) {
            randomNumber = getRand(1, max);
            yourArray[index][0] = Integer.toString(randomNumber);
            yourArray[index][1] = randomNumber % 2 == 0 ? "yes" : "no";
            index++;
        }
        testing(yourArray, "Answer 'yes' if number even otherwise answer 'no'.");
    }
}
