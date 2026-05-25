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
}
