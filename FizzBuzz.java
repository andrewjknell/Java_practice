public class FizzBuzz {
    public String fizzBuzz(int num) {
        String fizz = "fizz";
        String buzz = "buzz";
        String fizzbuzz = "fizzbuzz";
        if(num % 15 == 0){
            return fizzbuzz;
        }
        else if(num % 3 == 0) {
            return fizz;
        }
        else if(num % 5 == 0){
            return buzz;
        }
        else{
            return Integer.toString(num);
        }
    }
}
