package hexlet.code.games;
import static hexlet.code.Engine.getRand;
import static hexlet.code.Engine.testing;

public class Even {
    public static void yourQuestion() {
        int randomNumber;
        final int q = 3; // всего вопросов в проекте
        String[][] yourArray = new String[q][2]; // массив три попытки[3], в каждой вопрос и ответ[2]
        int index = 0;
        for (var x : yourArray) {
            randomNumber = getRand("1", "100");
            yourArray[index][0] = Integer.toString(randomNumber);
            yourArray[index][1] = randomNumber % 2 == 0 ? "yes" : "no";
            index++;
        }
        testing(yourArray, "Answer 'yes' if number even otherwise answer 'no'.");
    }
}
