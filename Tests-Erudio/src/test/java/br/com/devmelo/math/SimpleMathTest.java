package br.com.devmelo.math;

import br.dev.devmelo.math.SimpleMath;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {
    @Test
    void testSum(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.sum(firstNumber, secondNumber);
        double expected = 8.2D;

        assertEquals(expected, actual,
                () -> firstNumber + " + " + secondNumber + " , not produce " + expected); // com lambda só roda se ocorrer a falha.
        assertNotEquals(9.2D, actual); // testando se não é igual
        assertNotNull(actual); // testando se existe o objeto
    }

    @Test
    void testSubtraction() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.subtraction(firstNumber, secondNumber);
        var expected = 4.2D;

        assertEquals(expected, actual,
                () -> firstNumber + " - " + secondNumber + " , not produce " + expected);

        assertNotEquals(10.5D, actual);
        assertNotNull(actual);

    }

    @Test
    void testMultiplication() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 7D;

        Double actual = math.multiplication(firstNumber, secondNumber);
        var expected = 43.4D;

        assertEquals(expected, actual, () -> firstNumber + " * " + secondNumber + ", not produce " + actual);
        assertNotNull(actual);
        assertNotEquals(1D, actual);

    }

    @Test
    void testDivision() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 12.2D;
        double secondNumber = 5D;

        Double actual = math.division(firstNumber, secondNumber);
        var expected = 2.44D;

        assertEquals(expected, actual, () -> firstNumber + " * " + secondNumber + ", not produce " + actual);
        assertNotNull(actual);
        assertNotEquals(12D, actual);
    }

    @Test
    void testMean() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 12.2D;
        double secondNumber = 5D;

        Double actual = math.mean(firstNumber, secondNumber);
        var expected = 30.5D;

        assertEquals(expected, actual, () -> "(" + firstNumber + " * " + secondNumber +")/2" + ", not produce " + actual);
        assertNotNull(actual);
        assertNotEquals(13D, actual);

    }

    @Test
    void testSquareRoot() {
        SimpleMath math = new SimpleMath();
        double number = 144D;

        Double actual = math.squareRoot(number);
        var expected = 12D;

        assertEquals(expected, actual, () -> "The square root of " + number + ", not produce " + actual);
        assertNotNull(actual);
        assertNotEquals(13D, actual);

    }
}
