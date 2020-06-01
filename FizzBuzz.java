package Day1.FizzBuzz;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {
    public String execute(int[] numbers) {
        // creating a sequence from each member of our array, passing it as a parameter
        // of our processNumber() and the collect the output and joining them together
        // separated by a comma
        return Arrays.stream(numbers).mapToObj(this::processNumber).collect(Collectors.joining(", "));
    }

    public String processNumber(int number) {
        if (isMultipleOf3(number) && isMultipleOf5(number)) {
            return "Fizz Buzz";
        } else if (isMultipleOf3(number)) {
            return "Fizz";
        } else if (isMultipleOf5(number)) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }
}