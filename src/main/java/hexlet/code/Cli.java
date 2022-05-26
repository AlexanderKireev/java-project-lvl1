package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void runGreeting() {
        Scanner sc = new Scanner(System.in);
        System.out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
