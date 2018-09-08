package befaster.solutions.FIZ;


public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringBuilder builder = new StringBuilder();

        String result = String.valueOf(number);
        if ((result.contains("5") || number % 5 == 0) &&
            (result.contains("3") ||number % 3 == 0)) {
                if (number % 2 == 0){
                    wrapper(builder, "fizz buzz deluxe");
                } else {
                    wrapper(builder, "fizz buzz fake deluxe");
                }
        } else if (result.contains("5") || number % 5 == 0) {
                if (number % 2 == 0){
                    wrapper(builder, "buzz deluxe");
                } else {
                    wrapper(builder, "buzz fake deluxe");
                }
        } else if (result.contains("3") ||number % 3 == 0) {
                if (number % 2 == 0){
                    wrapper(builder, "fizz deluxe");
                } else {
                    wrapper(builder, "fizz fake deluxe");
                }
//        } else if (number > 10 && allSame(result)) {
//            if (number % 2 == 0){
//                wrapper(builder, "deluxe");
//            } else {
//                wrapper(builder, "fake deluxe");
//            }
        } else {
            wrapper(builder, String.valueOf(number));
        }

        return builder.toString();
    }

    private void wrapper(StringBuilder builder, String textToAdd) {
        builder.append(textToAdd);
    }

    private boolean allSame(String toCheck) {
        char first = toCheck.charAt(0);
        for (int i = 1; i < toCheck.length(); i++) {
            if (first != toCheck.charAt(i)) {
                return false;
            }
            first = toCheck.charAt(i);
        }
        return true;
    }

}
