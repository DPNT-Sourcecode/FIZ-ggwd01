package befaster.solutions.FIZ;


public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder builder = new StringBuilder();

        String result = String.valueOf(number);
        if (number > 10 && result.matches("^[1-9]+$")) {
            wrapper(builder, "deluxe");
        } else if ((result.contains("5") || number % 5 == 0) &&
            (result.contains("3") ||number % 3 == 0)) {
            wrapper(builder, "fizz buzz");
        } else if (result.contains("5") || number % 5 == 0) {
            wrapper(builder, "buzz");
        } else if (result.contains("3") ||number % 3 == 0) {
            wrapper(builder, "fizz");
        } else {
            wrapper(builder, String.valueOf(number));
        }

        return builder.toString();
    }

    private void wrapper(StringBuilder builder, String textToAdd) {
        builder.append(textToAdd);
    }

}
