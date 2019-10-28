public class StringTest {
    public static void main(String[] args) {
        StringManip strA = new StringManip();
        String testA = strA.trimConcat("     hello", "hello         ");
        
        char letter = 'b';
        Integer testB = strA.getIndexNull("hello", letter);
        Integer testC = strA.getIndexNull("hello goodbye", letter);
        Integer testD = strA.getIndexNull("hello and whats up boys", letter);

        String word = "andrew";
        String sub = "drew";
        String subA = "sam";
        Integer testE = strA.getIndexOrNull(word, sub);
        Integer testF = strA.getIndexOrNull(word, subA);

        String subby = strA.concatSub("hello", 1, 2, "whats up");
        System.out.println(testA);
        System.out.println(testB);
        System.out.println(testC);
        System.out.println(testD);
        System.out.println(testE);
        System.out.println(testF);
        System.out.println(subby);

    }
}