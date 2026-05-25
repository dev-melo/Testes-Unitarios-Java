package br.com.devmelo.math;

import br.dev.devmelo.math.SimpleMath;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {
    @Test
    void testSum(){
        SimpleMath math = new SimpleMath();
        Double res = math.sum(6.2D, 2D);
        assertEquals(8.2D, res, "6.2 + 2 , not produce 8.2");
    }
}
