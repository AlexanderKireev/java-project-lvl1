package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void yourName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String s = sc.nextLine();
        System.out.println("Hello, " + s);
    }
}
