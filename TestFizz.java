public class TestFizz {
    public static void main(String[] args){
        FizzBuzz test = new FizzBuzz();
        String fob = test.fizzBuzz(5);
        System.out.println(fob);
        for(int i = 1; i <31; i++){
            System.out.println(test.fizzBuzz(i));
        }
    }
}