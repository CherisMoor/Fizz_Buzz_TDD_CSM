package Day1.FizzBuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBussTest {
    @Test
    public void shouldExecute() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1", fizzbuzz.execute(new int[] { 1 }));
        assertEquals("1, 2, Fizz, Buzz, Fizz, Buzz, Fizz Buzz, Fizz Buzz",
                fizzbuzz.execute(new int[] { 1, 2, 3, 5, 6, 10, 15, 30 }));
    }

    @Test
    public void shouldProcessInput() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1", fizzbuzz.processNumber(1));
        assertEquals("2", fizzbuzz.processNumber(2));
        assertEquals("Fizz", fizzbuzz.processNumber(3));
        assertEquals("Buzz", fizzbuzz.processNumber(5));
        assertEquals("Fizz", fizzbuzz.processNumber(6));
        assertEquals("Buzz", fizzbuzz.processNumber(10));
        assertEquals("Fizz Buzz", fizzbuzz.processNumber(15));
    }
}