import java.lang.Math;

public class Pythag {
    public double calculateHypot(int legA, int legB) {
        double legC = Math.sqrt((legA * legA) + (legB * legB));
        return legC;
    }
}
