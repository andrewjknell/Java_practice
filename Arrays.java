import java.util.*;

public class Arrays {
    public void printSome(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i += 2) {
            System.out.print(i);
            sum += i;
            System.out.println("number: " + i + " Sum: " + sum);
        }
    }

    public void printEach(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public void getMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public void getAvg(int arr[]) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        System.out.println(avg);
    }

    public ArrayList<Integer> oddArr(int num) {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for (int i = 1; i <= num; i += 2) {
            odds.add(i);
        }
        return odds;
    }

    public void moreThan(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count += 1;
            }
        }
        System.out.println(count);
    }

    public void doubleA(int arr[]) {
        ArrayList<Integer> mult = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            mult.add(arr[i] * arr[i]);
        }
        System.out.println(mult);
    }

    public void noNegs(int arr[]) {
        ArrayList<Integer> negs = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                negs.add(arr[i]);
            }
        }
        System.out.println(negs);
    }

    public ArrayList<Double> mathStuff(int arr[]) {
        ArrayList<Double> maths = new ArrayList<Double>();
        double max = arr[0];
        double min = arr[0];
        double sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        double avg = (sum / arr.length);
        maths.add(max);
        maths.add(min);
        maths.add(avg);
        return maths;
    }

    public ArrayList<Integer> rev(int arr[]) {
        ArrayList<Integer> neww = new ArrayList<Integer>();
        for (int i = 0; i < arr.length - 1; i++) {
            neww.add(arr[i + 1]);
        }
        neww.add(0);
        return neww;
    }

}