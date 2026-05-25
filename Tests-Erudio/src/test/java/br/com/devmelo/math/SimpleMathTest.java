package br.com.devmelo.math;

import br.dev.devmelo.math.SimpleMath;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math Operations in SimpleMath Class")
public class SimpleMathTest {

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo(){
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
    @DisplayName("Test 6.2 - 2 = 4.2")
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
    @DisplayName("Test 6.2 + 7 = 43.4")
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
    @DisplayName("Test 12.2 + 5 = 2.44")
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
    @DisplayName("Test Division by Zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException(){
        /*SimpleMath math = new SimpleMath();
        double firstNumber = 12.2D;
        double secondNumber = 0D;

        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> math.division(firstNumber, secondNumber));

        assertEquals("", thrown.getMessage());*/
        fail();

    }

    @Test
    @DisplayName("Test (12.2 + 5) / 2 = 30.5")
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
    @DisplayName("Test Square Root of 144 = 12")
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
