import java.util.*;

public class PuzzleTest {
    public static void main(String[] args) {
        int[] i = {2,3,-4,10,-45,23,62,7};
        ArrayList<Character> alphaB = new ArrayList<Character>();
        alphaB.add('a');alphaB.add('b');alphaB.add('c');alphaB.add('d');alphaB.add('e');
        alphaB.add('f');alphaB.add('g');alphaB.add('h');alphaB.add('i');
        alphaB.add('j');alphaB.add('k');alphaB.add('l');alphaB.add('m');
        alphaB.add('n');alphaB.add('o');alphaB.add('p');alphaB.add('q');
        alphaB.add('r');alphaB.add('s');alphaB.add('t');alphaB.add('u');
        alphaB.add('v');alphaB.add('w');alphaB.add('x');alphaB.add('y');
        alphaB.add('z');
        String strA = "abcdefghijklmnopqrstuvwxyz";
        Puzzle test = new Puzzle();
        // test.alpha(alphaB);
        // System.out.println(test.shuffled());
        // System.out.println(test.tens(i));
        // System.out.print(test.rando());
        // System.out.print(test.rando2());
        // System.out.println(test.randStr(strA));
        System.out.println(test.randWords(strA));
    }
}