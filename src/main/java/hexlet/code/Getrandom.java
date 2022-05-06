package hexlet.code;

public class Getrandom {
    public static int getRand(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
}
