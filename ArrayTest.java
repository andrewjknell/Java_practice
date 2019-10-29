public class ArrayTest{
    public static void main(String[] args){
        Arrays test = new Arrays();
        test.printSome(255);
        int[] i = {2,3,-4,10,-45,2,6,7};
        test.printEach(i);
        test.getMax(i);
        test.getAvg(i);
        test.moreThan(i, 5);
        test.doubleA(i);
        test.noNegs(i);
        System.out.print(test.oddArr(255));
        System.out.print(test.mathStuff(i));
        System.out.print(test.rev(i));
    }
}