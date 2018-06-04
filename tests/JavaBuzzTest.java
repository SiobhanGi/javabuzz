import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;



class JavaBuzzTest {

    private FizzBuzzConverter fizzbuzz;

    @BeforeEach
    void init() {
        fizzbuzz = new FizzBuzzConverter();
    }

    @Test
    void converterLeavesNormalNumbersAlone() {
        assertEquals("1", fizzbuzz.convert(1));
        assertEquals("11", fizzbuzz.convert(11));
    }

    @Test
    void numbersDivisibleBy3And5EqualFizzBuzz() {
        assertEquals("FizzBuzz", fizzbuzz.convert( 15));
        assertEquals("FizzBuzz", fizzbuzz.convert( 30));
    }

    @Test
    void numbersDivisibleBy3EqualFizz() {
        assertEquals("Fizz", fizzbuzz.convert(3));
        assertEquals("Fizz", fizzbuzz.convert(6));
    }

    @Test
    void numbersDivisableBy5EqualBuzz() {
        assertEquals("Buzz", fizzbuzz.convert(10));
        assertEquals("Buzz", fizzbuzz.convert(20));
    }

}

