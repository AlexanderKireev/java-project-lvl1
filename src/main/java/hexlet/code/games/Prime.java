package hexlet.code.games;
import static hexlet.code.Engine.getRand;
import static hexlet.code.Engine.testing;

public class Prime {
    public static void yourQuestion() {
        int randomNumber;
        final int q = 3; // всего вопросов в проекте
        String[][] yourArray = new String[q][2];
        int index = 0;
        for (var x : yourArray) {
            randomNumber = getRand("1", "100");
            yourArray[index][0] = Integer.toString(randomNumber);
            yourArray[index][1] = isPrime(randomNumber);
            index++;
        }
        testing(yourArray, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
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
