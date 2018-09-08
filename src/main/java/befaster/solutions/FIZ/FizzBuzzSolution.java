package befaster.solutions.FIZ;


public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder builder = new StringBuilder();
      //  for (int i = 1; i <= number; i++) {
            if (number % 15 == 0) {
                wrapper(builder, "fizzbuzz");
            } else if (number % 5 == 0) {
                wrapper(builder, "buzz");
            } else if (number % 3 == 0) {
                wrapper(builder, "fizz");
            } else {
                wrapper(builder, String.valueOf(number));
            }

     //   }
        return builder.toString();
    }

    private void wrapper(StringBuilder builder, String textToAdd) {
        builder.append(textToAdd);
    }

}
