import java.util.*;

public class Puzzle {
    public ArrayList<Integer> tens(int arr[]) {
        ArrayList<Integer> ten = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 10) {
                ten.add(arr[i]);
            }
        }
        System.out.print(sum);
        return ten;
    }

    public ArrayList<String> shuffled() {
        ArrayList<String> five = new ArrayList<String>();
        ArrayList<String> under = new ArrayList<String>();

        five.add("Nancy");
        five.add("Jinichi");
        five.add("Fujibayashi");
        five.add("Momochi");
        five.add("Andy");
        Collections.shuffle(five);
        System.out.println(five);
        for (int i = 0; i < five.size(); i++) {
            if (five.get(i).length() < 7) {
                under.add(five.get(i));
            }
        }
        return under;
    }

    public void alpha(ArrayList<Character> arr) {
        System.out.println(arr.get(0));
        Collections.shuffle(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(25));
        if (arr.get(0) == 'a' || arr.get(0) == 'e' || arr.get(0) == 'i' || arr.get(0) == 'o' || arr.get(0) == 'u'
                || arr.get(0) == 'a') {
            System.out.println("You Lose!");
        }
    }

    public ArrayList<Integer> rando() {
        ArrayList<Integer> randomm = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            randomm.add((int) (Math.random() * (46) + 55));
        }
        return randomm;
    }

    public ArrayList<Integer> rando2() {
        ArrayList<Integer> randomm = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            randomm.add((int) (Math.random() * (46) + 55));
        }
        Collections.sort(randomm);

        return randomm;
    }

    public String randStr(String str) {
        String newString = "";
        for (int i = 0; i < 5; i++) {
            int a = ((int) (Math.random() * (str.length())));
            char newChar = (str.charAt(a));
            newString = newString + newChar;

        }
        return newString;
    }

    public ArrayList<String> randWords(String str) {
        ArrayList<String> tenner = new ArrayList<String>();
        for (int j = 0; j < 5; j++) {
            String word = "";
            for (int i = 0; i < 10; i++) {
                int a = ((int) (Math.random() * (str.length())));
                char newChar = (str.charAt(a));
                word = word + newChar;
            }
            tenner.add(word);
        }
        return tenner;
    }
}