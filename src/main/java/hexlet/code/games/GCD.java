package hexlet.code.games;
import static hexlet.code.Engine.getRand;
import static hexlet.code.Engine.testing;

public class GCD {
    public static void yourQuestion() {
        int randNumber1;
        int randNumber2;
        final int q = 3; // всего вопросов в проекте
        String[][] yourArray = new String[q][2];
        int index = 0;
        for (var x : yourArray) {
            randNumber1 = getRand("1", "100");
            randNumber2 = getRand("1", "100");
            yourArray[index][0] = Integer.toString(randNumber1) + " " + Integer.toString(randNumber2);
            yourArray[index][1] = Integer.toString(gcd(randNumber1, randNumber2));
            index++;
        }
        testing(yourArray, "Find the greatest common divisor of given numbers.");
    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
