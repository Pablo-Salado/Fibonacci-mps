package org.pablo.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    /**
     * Test cases:
     *  fibonacci 0 -> 0
     *  fibonacci 1 -> 1
     *  fibonacci 2 -> 1
     *  fibonacci 3 -> 2
     *  fibonacci 8 -> 21
     *  fibonacci negative number -> exception
     */
    @Test
    public void shouldComputeReturnZeroIfTheNumberIsZero() {
        Fibonacci fibonacci = new Fibonacci();
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsOne() {
        Fibonacci fibonacci = new Fibonacci();
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsTwo() {
        Fibonacci fibonacci = new Fibonacci();
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnTwoIfTheNumberIsThree() {
        Fibonacci fibonacci = new Fibonacci();
        int expectedValue = 2;
        int obtainedValue = fibonacci.compute(3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturn21IfTheNumberIs8() {
        Fibonacci fibonacci = new Fibonacci();
        int expectedValue = 21;
        int obtainedValue = fibonacci.compute(8);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeOfANegativeNumber() {
        Fibonacci fibonacci = new Fibonacci();
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }

}
